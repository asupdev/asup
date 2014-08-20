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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.il.data.QArray;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.FileDef;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.pgm.QActivationGroup;
import org.asup.os.type.pgm.QCallableProgram;
import org.asup.os.type.pgm.QProgramManager;

public class BaseProgramInjector {

	private QProgramManager programManager;
	private QDataManager dataManager;
	private QIsamManager isamManager;
	
	@Inject
	public BaseProgramInjector(QDataManager dataManager, QIsamManager isamManager, QProgramManager programManager) {
		this.dataManager = dataManager;		
		this.isamManager = isamManager;
		this.programManager = programManager;
	}

	public QCallableProgram makeCallableProgram(QJob job, QActivationGroup activationGroup, Class<QCallableProgram> klass) {
				

		QDataFactory dataFactory = dataManager.createFactory(job);
		
		QCallableProgram callableProgram = null;
		
		try {
			Map<String, QCallableProgram> sharedModules = new HashMap<>();			
			callableProgram = injectData(klass, dataFactory, job, activationGroup, sharedModules);			
		} 
		catch (InstantiationException | IllegalAccessException e) {
			throw new OperatingSystemRuntimeException(e);
		}
		
		
		return callableProgram;
	}
	
	public QData[] buildEntry(QContextID contextID, Method method) {
		
		QDataFactory dataFactory = dataManager.createFactory(contextID);
		
		Type[] types = method.getGenericParameterTypes();					
		Annotation[][] annotationss = method.getParameterAnnotations();
		
		// build entry
		QData[] entry = new QData[types.length];
		int entryIndex=0;					
		
		for(Type type: types) {

			Annotation[] annotations = annotationss[entryIndex];
				
			// annotations
			List<Annotation> annotationsList = new ArrayList<Annotation>();
			for(Annotation annotation: annotations) 
				annotationsList.add(annotation);
			
			QDataDef<?> dataType = dataFactory.createDataDef(type, annotationsList);
			QData data = dataFactory.createData(dataType);

			entry[entryIndex] = data;
			entryIndex++;
		}
		
		return entry;
	}
	
	@SuppressWarnings("unchecked")
	private QCallableProgram injectData(Class<QCallableProgram> klass, QDataFactory dataFactory,
							QJob job, QActivationGroup activationGroup,
							Map<String, QCallableProgram> sharedModules) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		QCallableProgram callableProgram = klass.newInstance();
		
		for(Field field: klass.getDeclaredFields()) {
			
			Type type = field.getGenericType();
			
			Class<?> fieldKlass = null;
			
			if(type instanceof ParameterizedType) {
				fieldKlass = (Class<?>) ((ParameterizedType)type).getRawType();
			}
			else 
				fieldKlass = (Class<?>)type;
			
			if(field.getAnnotation(ModuleDef.class) != null) {
				ModuleDef moduleDef = field.getAnnotation(ModuleDef.class); 
				QCallableProgram callableModule = (QCallableProgram) sharedModules.get(moduleDef.name());
				if(callableModule == null) {
					callableModule = injectData((Class<QCallableProgram>) fieldKlass, dataFactory, job, activationGroup, sharedModules);
					sharedModules.put(moduleDef.name(), callableModule);
				}
				field.set(callableProgram, callableModule);
			}
			else if(QDataFactory.class.isAssignableFrom(fieldKlass)) {					
				field.set(callableProgram, dataFactory);
			}
			else if(QProgramManager.class.isAssignableFrom(fieldKlass)) {					
				field.set(callableProgram, programManager);
			}
			else if(QContextID.class.isAssignableFrom(fieldKlass)) {
				field.set(callableProgram, job);
			}
			else if(QData.class.isAssignableFrom(fieldKlass)) {
				
				QDataDef<?> dataType = dataFactory.createDataDef(type, Arrays.asList(field.getAnnotations()));
				QData data = dataFactory.createData(dataType);
				
				if(field.getAnnotation(DataDef.class) != null) {
					DataDef dataDef = field.getAnnotation(DataDef.class);
					
					if(data instanceof QArray) {
						QArray<?> array = (QArray<?>)data;
						int i=1;
						for(String value: dataDef.values()) {
							array.get(i).eval(value);
							i++;
						}
					}
					else {
						if(!dataDef.value().isEmpty())
							data.eval(dataDef.value());
					}

				}
				
				field.set(callableProgram, data);
			}
			else if(QDataSet.class.isAssignableFrom(fieldKlass)) {
				
				QIsamFactory isamFactory = job.getJobContext().get(QIsamFactory.class);
				if(isamFactory == null) {
					isamFactory = isamManager.createFactory(job);
					job.getJobContext().set(QIsamFactory.class, isamFactory);
				}
				
				FileDef fileDef = field.getAnnotation(FileDef.class);
				if(fileDef != null) {
					List<Annotation> annotations = new ArrayList<>();
					annotations.add(fileDef);
					QDataSetTerm dataSetTerm = isamFactory.createDataSetTerm(type, annotations);
					QDataSet<?> dataSet = isamFactory.createDataSet(dataSetTerm);
					
					field.set(callableProgram, dataSet);
				}
			}
			else if(Enum.class.isAssignableFrom(fieldKlass)) {
			}
			else
				throw new OperatingSystemRuntimeException("Unknown field type: "+type);
		}

		return callableProgram;
	}
}
