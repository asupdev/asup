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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
import org.asup.il.data.QString;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.impl.DataWriterImpl.Specials;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.asup.il.isam.QKSDataSet;
import org.asup.il.isam.QRecord;
import org.asup.il.isam.QSMDataSet;
import org.asup.il.isam.annotation.FileDef;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.pgm.QActivationGroup;

public class BaseCallableInjector {

	@Inject
	private QDataManager dataManager;
	@Inject
	private QIsamManager isamManager;
	@Inject
	private QJob job;

	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	public <C> C makeCallable(QContext context, QActivationGroup activationGroup, Class<C> klass) {

		QDataFactory dataFactory = dataManager.createFactory(job);

		C callable = null;

		try {
			Map<String, Object> sharedModules = new HashMap<>();
			try {
				callable = injectData(klass, dataFactory, context, activationGroup, sharedModules);
			} catch (IllegalArgumentException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

	private <C> C injectData(Class<C> klass, QDataFactory dataFactory, QContext context, QActivationGroup activationGroup, Map<String, Object> sharedModules) throws IllegalArgumentException,
			IllegalAccessException, InstantiationException {

//		if (klass.getAnnotation(Program.class) != null)
//			System.out.println(klass);

		C callable = klass.newInstance();

		injectFieldsData(klass, callable, dataFactory, context, activationGroup, sharedModules);

		try {
			Field £mubField = callable.getClass().getDeclaredField("£mub");
			if (£mubField != null) {
				try {
					£mubField.setAccessible(true);

					Object £mub = £mubField.get(callable);
					Object £mu_£pds_1 = £mub.getClass().getField("£mu_£pds_1").get(£mub);

					// program name
					Object £pdsnp = £mu_£pds_1.getClass().getField("£pdsnp").get(£mu_£pds_1);
					String programName = callable.getClass().getSimpleName();
					Program program = callable.getClass().getAnnotation(Program.class);
					if (program != null)
						programName = program.name();
					£pdsnp.getClass().getMethod("eval", String.class).invoke(£pdsnp, new Object[] { programName });

					// user name
					Object £pdsnu = £mu_£pds_1.getClass().getField("£pdsnu").get(£mu_£pds_1);
					£pdsnu.getClass().getMethod("eval", String.class).invoke(£pdsnu, new Object[] { job.getJobUser() });
					
					// job number
					Object £pdsjz = £mu_£pds_1.getClass().getField("£pdsjz").get(£mu_£pds_1);
					£pdsjz.getClass().getMethod("eval", Integer.TYPE).invoke(£pdsjz, new Object[] { job.getJobNumber() });
					
				} catch (NoSuchFieldException | InvocationTargetException | NoSuchMethodException e) {
					e.printStackTrace();
				} finally {
					£mubField.setAccessible(false);
				}
			}

		} catch (NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}

		if (callable.getClass().getAnnotation(Program.class) == null)
			return callable;

		context.invoke(callable, PostConstruct.class);

		return callable;
	}

	@SuppressWarnings("unchecked")
	private void injectFieldsData(Class<?> klass, Object callable, QDataFactory dataFactory, QContext context, QActivationGroup activationGroup, Map<String, Object> sharedModules)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		if(klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFieldsData(klass.getSuperclass(), callable, dataFactory, context, activationGroup, sharedModules);
			

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (Modifier.isStatic(field.getModifiers())) {
				if (Modifier.isFinal(field.getModifiers()))
					continue;
				if (field.get(callable) != null)
					continue;
			}

			field.setAccessible(true);

//			System.out.println("\t\t"+field);

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

				
				if(field.getName().equalsIgnoreCase("£mu_b£oav0_1"))
					fieldKlass.toString();
				
				QDataDef<?> dataType = dataFactory.createDataDef(type, Arrays.asList(field.getAnnotations()));
				QData data = dataFactory.createData(dataType, true);

				DataDef dataDef = field.getAnnotation(DataDef.class);

				if (dataDef != null) {

					// default
					if (data instanceof QList<?>) {
						QList<?> array = (QList<?>) data;
						int i = 1;
						for (String value : dataDef.values()) {
							array.get(i).accept(dataWriter.set(value));
							i++;
						}
					} else {
						if (!dataDef.value().isEmpty()) {
							if (data instanceof QString) {

								String value = dataDef.value();
								if (value.startsWith("'") && value.endsWith("'")) {
									value = value.substring(1).substring(0, value.lastIndexOf("'") - 1);

									data.accept(dataWriter.set(value));
								} else if (value.startsWith("*")) {
									try {
										Specials special = Specials.valueOf(value.substring(1));
										data.accept(dataWriter.set(special));
									} catch (Exception e) {
										data.accept(dataWriter.set(value));
									}
								} else
									data.accept(dataWriter.set(value));
							} else {
								data.accept(dataWriter.set(dataDef.value()));
							}
						}
					}

				}

				field.set(callable, data);
			}
			// @Injection
			else if (field.getAnnotation(Inject.class) != null) {

				Object object = null;

				if (QService.class.isAssignableFrom(fieldKlass)) {
					object = context.get(fieldKlass);
				} else if (QJob.class.isAssignableFrom(fieldKlass)) {
					object = job;
				} else if (QContextID.class.isAssignableFrom(fieldKlass)) {
					object = job;
				} 
				else {
					object = sharedModules.get(fieldKlass.getSimpleName());
					if (object == null) {
						object = context.get(fieldKlass);
					}
					if (object == null) {
//						System.out.println("\t" + fieldKlass);
						object = injectData(fieldKlass, dataFactory, context, activationGroup, sharedModules);
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

	}

	private void injectDataSet(QJob job, QDataFactory dataFactory, Object callable, Class<QDataSet<QRecord>> fieldKlass, Class<QRecord> recordKlass, Field field) throws IllegalArgumentException,
			IllegalAccessException {

		QIsamFactory isamFactory = job.getContext().get(QIsamFactory.class);
		if (isamFactory == null) {
			isamFactory = isamManager.createFactory(job);
			job.getContext().set(QIsamFactory.class, isamFactory);
		}

		FileDef fileDef = field.getAnnotation(FileDef.class);
		if (fileDef != null) {

			QDataSet<QRecord> dataSet = null;

			if (QKSDataSet.class.isAssignableFrom(fieldKlass)) {
				dataSet = isamFactory.createKeySequencedDataSet(recordKlass, AccessMode.UPDATE, fileDef.userOpen());
			} else if (QSMDataSet.class.isAssignableFrom(fieldKlass)) {
				dataSet = null;
			} else {
				dataSet = isamFactory.createRelativeRecordDataSet(recordKlass, AccessMode.UPDATE, fileDef.userOpen());
			}

			field.set(callable, dataSet);
		}

	}
}