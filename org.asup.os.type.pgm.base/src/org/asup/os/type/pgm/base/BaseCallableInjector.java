/**
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.pgm.base;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.QContextProvider;
import org.asup.fw.core.QService;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataWriter;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QList;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.asup.il.isam.QKSDataSet;
import org.asup.il.isam.QRecord;
import org.asup.il.isam.annotation.DataSetDef;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QFileManager;
import org.asup.os.type.pgm.QActivationGroup;

public class BaseCallableInjector {

	@Inject
	private QDataManager dataManager;
	@Inject
	private QIsamManager isamManager;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QJob job;

	private QResourceReader<QFile> fileReader;

	@PostConstruct
	public void init() {
		this.fileReader = fileManager.getResourceReader(job, Scope.LIBRARY_LIST);
	}

	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	public <C> C makeCallable(QJob job, QActivationGroup activationGroup, Class<C> klass) {

		QDataFactory dataFactory = dataManager.createFactory(job);

		C callable = null;

		try {
			Map<String, Object> sharedModules = new HashMap<>();
			callable = injectData(klass, dataFactory, job, activationGroup, sharedModules);
		} catch (InstantiationException | IllegalAccessException e) {
			throw new OperatingSystemRuntimeException(e);
		}

		return callable;
	}

	public QData[] buildEntry(QContextProvider contextProvider, Method method) {

		QDataFactory dataFactory = dataManager.createFactory(contextProvider);

		Type[] types = method.getGenericParameterTypes();
		Annotation[][] annotationss = method.getParameterAnnotations();

		// build entry
		QData[] entry = new QData[types.length];
		int entryIndex = 0;

		for (Type type : types) {

			Annotation[] annotations = annotationss[entryIndex];

			// annotations
			List<Annotation> annotationsList = new ArrayList<Annotation>();
			for (Annotation annotation : annotations)
				annotationsList.add(annotation);

			QDataDef<?> dataType = dataFactory.createDataDef(type, annotationsList);
			QData data = dataFactory.createData(dataType, false);

			entry[entryIndex] = data;
			entryIndex++;
		}

		return entry;
	}

	@SuppressWarnings("unchecked")
	private <C> C injectData(Class<C> klass, QDataFactory dataFactory, QJob job, QActivationGroup activationGroup, Map<String, Object> sharedModules) throws IllegalArgumentException,
			IllegalAccessException, InstantiationException {

		C callable = klass.newInstance();
		QContext jobContext = job.getContext();
		for (Field field : klass.getDeclaredFields()) {

			field.setAccessible(true);

			// System.out.println(field);

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			Type type = field.getGenericType();

			Class<?> fieldKlass = null;

			if (type instanceof ParameterizedType) {
				fieldKlass = (Class<?>) ((ParameterizedType) type).getRawType();
			} else
				fieldKlass = (Class<?>) type;

			if (QDataFactory.class.isAssignableFrom(fieldKlass)) {
				field.set(callable, dataFactory);
			}
			// Module
			/*
			 * else if (field.getAnnotation(ModuleDef.class) != null) {
			 * ModuleDef moduleDef = field.getAnnotation(ModuleDef.class);
			 * Object callableModule = sharedModules.get(moduleDef.name()); if
			 * (callableModule == null) { callableModule =
			 * injectData(fieldKlass, dataFactory, job, activationGroup,
			 * sharedModules); sharedModules.put(moduleDef.name(),
			 * callableModule); } field.set(callable, callableModule); }
			 */
			// DataSet
			else if (QDataSet.class.isAssignableFrom(fieldKlass)) {

				ParameterizedType pType = (ParameterizedType) type;
				if (!(pType.getActualTypeArguments()[0] instanceof WildcardType))
					injectDataSet(job, dataFactory, callable, (Class<QDataSet<QRecord>>) fieldKlass, (Class<QRecord>) pType.getActualTypeArguments()[0], field);
			}
			// Data
			else if (QData.class.isAssignableFrom(fieldKlass)) {

				QDataDef<?> dataType = dataFactory.createDataDef(type, Arrays.asList(field.getAnnotations()));
				QData data = dataFactory.createData(dataType, true);

				if (field.getAnnotation(DataDef.class) != null) {
					DataDef dataDef = field.getAnnotation(DataDef.class);

					// default
					if (data instanceof QList<?>) {
						QList<?> array = (QList<?>) data;
						int i = 1;
						for (String value : dataDef.values()) {
							array.get(i).accept(dataWriter.set(value));
							i++;
						}
					} else {
						if (!dataDef.value().isEmpty())
							data.accept(dataWriter.set(dataDef.value()));
					}

				}

				field.set(callable, data);
			}
			// @Injection
			else if (field.getAnnotation(Inject.class) != null) {

				Object object = null;

				if (QService.class.isAssignableFrom(fieldKlass)) {
					object = jobContext.get(fieldKlass);
				} else if (QJob.class.isAssignableFrom(fieldKlass)) {
					object = job;
				} else if (QContextID.class.isAssignableFrom(fieldKlass)) {
					object = job;
				} else {
					object = sharedModules.get(fieldKlass.getSimpleName());
					if (object == null) {
						object = injectData(fieldKlass, dataFactory, job, activationGroup, sharedModules);
						sharedModules.put(fieldKlass.getSimpleName(), object);
					}
				}

				if (object == null) {
					field.setAccessible(false);
					throw new OperatingSystemRuntimeException("Unknown field type: " + type);
				} else
					field.set(callable, object);
			}

			field.setAccessible(false);
		}

		jobContext.invoke(callable, PostConstruct.class);

		return callable;
	}

	private void injectDataSet(QJob job, QDataFactory dataFactory, Object callable, Class<QDataSet<QRecord>> fieldKlass, Class<QRecord> recordKlass, Field field) throws IllegalArgumentException,
			IllegalAccessException {

		QIsamFactory isamFactory = job.getContext().get(QIsamFactory.class);
		if (isamFactory == null) {
			isamFactory = isamManager.createFactory(job);
			job.getContext().set(QIsamFactory.class, isamFactory);
		}

		DataSetDef fileDef = field.getAnnotation(DataSetDef.class);
		if (fileDef != null) {

			QDataSet<QRecord> dataSet = null;

			QFile file = fileManager.getOverriddenFile(job, fileDef.name());
			if (file == null)
				file = fileReader.lookup(fileDef.name());

			if (file == null) {
				System.err.println("File not found: " + fileDef.name());
				return;
			}

			if (QKSDataSet.class.isAssignableFrom(fieldKlass)) {
				dataSet = isamFactory.createKeySequencedDataSet(file.getLibrary(), recordKlass);
			} else {
				dataSet = isamFactory.createRelativeRecordDataSet(file.getLibrary(), recordKlass);
			}

			field.set(callable, dataSet);
		}

	}
}
