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

import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QList;
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

public class BaseCallableInjector {


	private QDataManager dataManager;
	private QIsamManager isamManager;
	
	private QDataEvaluator evaluator = QIntegratedLanguageDataFactory.eINSTANCE.createDataEvaluator();
	
	@Inject
	public BaseCallableInjector(QDataManager dataManager, QIsamManager isamManager) {
		this.dataManager = dataManager;		
		this.isamManager = isamManager;
	}

	public <C> C makeCallable(QJob job, QActivationGroup activationGroup, Class<C> klass) {
				

		QDataFactory dataFactory = dataManager.createFactory(job);
		
		C callable = null;
		
		try {
			Map<String, Object> sharedModules = new HashMap<>();			
			callable = injectData(klass, dataFactory, job, activationGroup, sharedModules);			
		} 
		catch (InstantiationException | IllegalAccessException e) {
			throw new OperatingSystemRuntimeException(e);
		}
		
		
		return callable;
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
			QData data = dataFactory.createData(dataType, false);

			entry[entryIndex] = data;
			entryIndex++;
		}
		
		return entry;
	}
	
	private <C> C injectData(Class<C> klass, QDataFactory dataFactory,
				 			QJob job, QActivationGroup activationGroup,
							Map<String, Object> sharedModules) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		
		C callable = klass.newInstance();
		QContext context = job.getJobContext();
		for(Field field: klass.getDeclaredFields()) {

			field.setAccessible(true);
			
//			System.out.println(field);
			
			// TODO
			if(field.getName().startsWith("$SWITCH_TABLE"))
				continue;
			
			Type type = field.getGenericType();
			
			Class<?> fieldKlass = null;
			
			if(type instanceof ParameterizedType) {
				fieldKlass = (Class<?>) ((ParameterizedType)type).getRawType();
			}
			else 
				fieldKlass = (Class<?>)type;
			
			if(field.getAnnotation(ModuleDef.class) != null) {
				ModuleDef moduleDef = field.getAnnotation(ModuleDef.class); 
				Object callableModule = sharedModules.get(moduleDef.name());
				if(callableModule == null) {
					callableModule = injectData(fieldKlass, dataFactory, job, activationGroup, sharedModules);
					sharedModules.put(moduleDef.name(), callableModule);
				}
				field.set(callable, callableModule);
			}
			else if(QDataFactory.class.isAssignableFrom(fieldKlass)) {					
				field.set(callable, dataFactory);
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
					
					field.set(callable, dataSet);
				}
			}
			else if(QData.class.isAssignableFrom(fieldKlass)) {
				
				QDataDef<?> dataType = dataFactory.createDataDef(type, Arrays.asList(field.getAnnotations()));
				QData data = dataFactory.createData(dataType, true);
				
				if(field.getAnnotation(DataDef.class) != null) {
					DataDef dataDef = field.getAnnotation(DataDef.class);
				
					if(data instanceof QList<?>) {
						QList<?> array = (QList<?>)data;
						int i=1;
						for(String value: dataDef.values()) {
							array.get(i).accept(evaluator.set(value));
							i++;
						}
					}
					else {
						if(!dataDef.value().isEmpty())
							data.accept(evaluator.set(dataDef.value()));
					}

				}
				
				field.set(callable, data);
			}
			else if(field.getAnnotation(Inject.class) != null){
				Object object = context.get(fieldKlass); 
				if(object == null) {
					field.setAccessible(false);
					throw new OperatingSystemRuntimeException("Unknown field type: "+type);
				}
				else
					field.set(callable, object);				
			}			
				
			field.setAccessible(false);
		}

		return callable;
	}
}
