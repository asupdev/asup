/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.il.data.nio;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.core.QOverlay;
import org.asup.il.core.annotation.Overlay;
import org.asup.il.data.BinaryType;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.DecimalType;
import org.asup.il.data.FloatingType;
import org.asup.il.data.QAdapterDef;
import org.asup.il.data.QArray;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QAtomicDataDef;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QBufferedDataDef;
import org.asup.il.data.QBufferedDataDelegator;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QEnum;
import org.asup.il.data.QEnumDef;
import org.asup.il.data.QFloating;
import org.asup.il.data.QFloatingDef;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QHexadecimalDef;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIndicatorDef;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QList;
import org.asup.il.data.QListDef;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QPointerDef;
import org.asup.il.data.QScroller;
import org.asup.il.data.QScrollerDef;
import org.asup.il.data.QStroller;
import org.asup.il.data.QStrollerDef;
import org.asup.il.data.QStruct;
import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.annotation.DataType;
import org.asup.il.data.impl.DataTermImpl;
import org.asup.il.data.impl.EnumDefImpl;
import org.asup.il.data.impl.ListDefImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.framework.FrameworkUtil;

public class NIODataFactoryImpl implements QDataFactory {

	private QContext context;
	private QContextID contextID;
	
	protected NIODataFactoryImpl(QContext context, QContextID contextID) {
		this.context = context;
		this.contextID = contextID;
	}
	
	protected QContext getContext() {
		return context;
	}

	protected QContextID getContextID() {
		return contextID;
	}
	
	@Override	
	public QData createData(QDataTerm<?> dataTerm, boolean initialize) {
		return createData((QDataDef<?>) dataTerm.getDefinition(), initialize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <D extends QData> D createData(QDataDef<D> dataDef, boolean initialize) {

		D data = null;

		// array
		if (dataDef instanceof QArrayDef) {
			QArrayDef<?> arrayDef = (QArrayDef<?>) dataDef;
			QUnaryAtomicDataDef<QBufferedData> argument = (QUnaryAtomicDataDef<QBufferedData>) arrayDef.getArgument();			
			
			QBufferedData bufferedData = createArray(argument, arrayDef.getDimension(), initialize);
			data = (D) bufferedData;
		} 
		// scroller
		else if(dataDef instanceof QScrollerDef<?>) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>)dataDef; 
			QUnaryAtomicDataDef<QStruct> argument = (QUnaryAtomicDataDef<QStruct>) scrollerDef.getArgument();
			
			data = (D) createScroller(argument, scrollerDef.getDimension(), initialize);
		}
		// dataStroller
		else if(dataDef instanceof QStrollerDef<?>) {
			QStrollerDef<?> strollerDef = (QStrollerDef<?>)dataDef;
			
			data = (D) createStroller(strollerDef, strollerDef.getDimension(), initialize);			
		}
		// list
		else if(dataDef instanceof QListDef<?>) {
			QListDef<?> listDef = (QListDef<?>)dataDef;

			
			NIODataImpl model = (NIODataImpl) createData(listDef.getArgument(), false);
			
			data = (D) new NIOListImpl<>(model, listDef.getInitialCapacity());
		}
		// dataStruct
		else if (dataDef instanceof QDataStructDef) {
			QDataStructDef dataStructDef = (QDataStructDef) dataDef;
			
			Class<? extends QDataStruct> delegator = null;
			if(dataStructDef.getClassDelegator() != null) { 

				if(!dataStructDef.getElements().isEmpty())
					throw new FrameworkCoreRuntimeException("Error sdf9dfg7574c2dn");
				
				delegator = (Class<? extends QDataStruct>) context.loadClass(contextID, dataStructDef.getClassDelegator());
				
				QDataStruct bufferedData = createDataStruct(delegator, dataStructDef.getLength(), initialize); 
				data = (D) bufferedData;
			}
			else {

				QDataStruct bufferedData = createDataStruct(dataStructDef.getElements(), dataStructDef.getLength(), initialize); 
				data = (D) bufferedData;				
			}
		}		
		// base
		else if (dataDef instanceof QAdapterDef) {
//			QAdapterDef adapterDef = (QAdapterDef)dataDef;
			data = (D) new NIOAdapterImpl();
		}
		else if (dataDef instanceof QBinaryDef) {
			QBinaryDef binaryType = (QBinaryDef) dataDef;
			data = (D) createBinary(binaryType.getType(), binaryType.isUnsigned(), initialize);
		}
		else if (dataDef instanceof QCharacterDef) {
			QCharacterDef characterType = (QCharacterDef) dataDef;
			data = (D) createCharacter(characterType.getLength(),characterType.isVarying(), initialize);
		}
		else if (dataDef instanceof QDatetimeDef) {
			QDatetimeDef datetimeType = (QDatetimeDef) dataDef;
			data = (D) createDate(datetimeType.getType(), datetimeType.getFormat(), initialize);
		}
		else if (dataDef instanceof QDecimalDef) {
			QDecimalDef decimalType = (QDecimalDef) dataDef;
			data = (D) createDecimal(decimalType.getPrecision(),decimalType.getScale(), decimalType.getType(), initialize);
		}
		else if(dataDef instanceof QEnumDef<?, ?>) {
			data = (D) _createData(dataDef, initialize);
		}
		else if (dataDef instanceof QFloatingDef) {
			QFloatingDef floatingType = (QFloatingDef) dataDef;
			data = (D) createFloating(floatingType.getType(), initialize);
		}
		else if (dataDef instanceof QHexadecimalDef) {
			QHexadecimalDef hexadecimalDef = (QHexadecimalDef)dataDef;
			data = (D) createHexadecimal(hexadecimalDef.getLength(), initialize);
		}
		else if (dataDef instanceof QIndicatorDef) {
			data = (D) createIndicator(initialize);
		}
		else if(dataDef instanceof QPointerDef) {
//			QPointerDef pointerDef = (QPointerDef)dataDef;
			data = (D) createPointer(initialize);
		}
		else {
			throw new FrameworkCoreRuntimeException("Unknown dataType: "+ dataDef);
		}
		
		return data;
	}
	
	@SuppressWarnings("unchecked")
	private <E extends Enum<E>, BD extends QBufferedData, D extends QData> D _createData(QDataDef<D> dataDef, boolean initialize) {
		
		QEnumDef<E, BD> enumDef = (QEnumDef<E, BD>)dataDef;
		return (D) createEnum(enumDef.getKlass(), createData(enumDef.getDelegate(), false), initialize);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public QDataDef<?> createDataDef(Type type, List<Annotation> annotations) {

		// annotations
		if (annotations == null)
			annotations = new ArrayList<Annotation>();

		// arguments
		List<Type> arguments = new ArrayList<Type>();
		
		// complete
		Class<? extends QData> klass = completeMetadata(type, arguments, annotations);

		QDataDef<?> dataDef = null;

		// dataStructureDelegator
		if (QDataStructDelegator.class.isAssignableFrom(klass)) {
			QDataStructDef dataStructDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
			
			// delegator			
			String address = "asup:/omac/"+FrameworkUtil.getBundle(klass).getSymbolicName() + "/" + klass.getName();
			dataStructDef.setClassDelegator(address);

			// fields introspection
/*			for (Field field : klass.getFields()) {
				QDataTerm<?> elementTerm = createDataTerm(field);
				dataStructDef.getElements().add(elementTerm);
			}*/

			dataDef = dataStructDef;
		}
		// array
		else if (QArray.class.isAssignableFrom(klass)) {
			
			QArrayDef<?> arrayDef = QIntegratedLanguageDataFactory.eINSTANCE.createArrayDef();
			
			// argument
			QUnaryAtomicBufferedDataDef<?> argument = (QUnaryAtomicBufferedDataDef<?>) createDataDef(arguments.get(0), annotations);
			arrayDef.setArgument(argument);

			dataDef = arrayDef;
		}
		// stroller
		else if(QStroller.class.isAssignableFrom(klass)) {
			QStrollerDef<?> strollerDef = QIntegratedLanguageDataFactory.eINSTANCE.createStrollerDef();
			
			// argument
			QUnaryCompoundDataDef<?> argument = (QUnaryCompoundDataDef<?>) createDataDef(arguments.get(0), annotations);
			strollerDef.setClassDelegator(argument.getClassDelegator());
			strollerDef.setPrefix(argument.getPrefix());
			strollerDef.setQualified(argument.isQualified());
			strollerDef.getElements().addAll(argument.getElements());
			
			dataDef = strollerDef;
		}
		// scroller
		else if(QScroller.class.isAssignableFrom(klass)) {
			QScrollerDef<?> scrollerDef = QIntegratedLanguageDataFactory.eINSTANCE.createScrollerDef();
			
			// argument
			QUnaryAtomicBufferedDataDef<?> argument = (QUnaryAtomicBufferedDataDef<?>) createDataDef(arguments.get(0), annotations);
			scrollerDef.setArgument(argument);
			
			dataDef = scrollerDef;
		}
		// list
		else if(QList.class.isAssignableFrom(klass)) {
			
			class MyDef<D extends QData> extends ListDefImpl<QList<D>> {
				private static final long serialVersionUID = 1L;
				
			}
			
			QListDef<?> listDef = new MyDef();
			QUnaryAtomicDataDef<?> argument = (QUnaryAtomicDataDef<?>) createDataDef(arguments.get(0), annotations);
			listDef.setArgument(argument);
			
			dataDef = listDef;
		}
		// enum
		else if(QEnum.class.isAssignableFrom(klass)) {
			
			class MyDef<E extends Enum<E>> extends EnumDefImpl<E, QBufferedData> {
				private static final long serialVersionUID = 1L;

				public MyDef(Class<E> klass, List<Annotation> annotations, Type delegate) {
					
					setDelegate((QBufferedDataDef<QBufferedData>) createDataDef(delegate, annotations));
					setKlass(klass);
				}

				@Override
				public Class<?> getJavaClass() {
					return getKlass();
				}

				@Override
				public Class<?> getDataClass() {
					return QEnum.class;
				}
			}			
			dataDef = new MyDef((Class<?>) arguments.get(0), annotations, arguments.get(1));			
		}

		// other
		else {
			// EMF reflection
			EClassifier eClassifier = QIntegratedLanguageDataPackage.eINSTANCE.getEClassifier(klass.getSimpleName().substring(1) + "Def");
			if (eClassifier != null)
				dataDef = (QDataDef<?>) QIntegratedLanguageDataFactory.eINSTANCE.create((EClass) eClassifier);
		}

		if (dataDef == null)
			throw new FrameworkCoreRuntimeException("Unknown class: " + klass);

		injectAnnotations(annotations, dataDef);		
		
		return dataDef;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <D extends QBufferedData> QArray<D> createArray(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize) {

		NIOBufferedDataImpl model = (NIOBufferedDataImpl) createData(argument, false);		
		
		QArray<D> array = new NIOArrayImpl(model, dimension);
		
		if(initialize)
			initialize(array);
		
		return array;
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QStruct> QScroller<D> createScroller(QAtomicDataDef<D> argument, int dimension, boolean initialize) {
		
		QBufferedData model = (QBufferedData) createData(argument, false);
		
		QScroller<D> scroller = new NIOScrollerImpl(model, dimension);
	
		if(initialize)
			initialize(scroller);
		
		return scroller;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QStruct> QStroller<D> createStroller(QCompoundDataDef<D> argument, int dimension, boolean initialize) {
		
		QStruct model = null;
		
		Class<? extends QDataStruct> delegator = null;
		if(argument.getClassDelegator() != null) { 

			if(!argument.getElements().isEmpty())
				throw new FrameworkCoreRuntimeException("Error sdf9dfg7574c2dn");
			
			delegator = (Class<? extends QDataStruct>) context.loadClass(contextID, argument.getClassDelegator());
			
			QDataStruct bufferedData = createDataStruct(delegator, 0, false); 
			model = (D) bufferedData;
		}
		else {

			QDataStruct bufferedData = createDataStruct(argument.getElements(), 0, false); 
			model = (D) bufferedData;				
		}
				
		QStroller<D> stroller = new NIOStrollerImpl(model, dimension);
				
		if(initialize)
			initialize(stroller);
		
		return stroller;
	}

	@Override
	public <D extends QDataStruct> D createDataStruct(Class<D> classDelegator, int length, boolean initialize) {

		// data structure
		D dataStructure = null;
		
		try {
			dataStructure = (D) classDelegator.newInstance();
		} catch (InstantiationException | IllegalAccessException | SecurityException e) {
			e.printStackTrace();
			return null;
		}

		NIODataStructWrapperImpl dataStructureDelegate = new NIODataStructWrapperImpl(length, (QDataStructDelegator) dataStructure);		
		
		int p = 1;
		for (Field field : classDelegator.getFields()) {

			QDataTerm<?> dataTerm = createDataTerm(field);
			QBufferedData dataElement = (QBufferedData) createData(dataTerm, false);

			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			String position = null;
			if (overlay != null)
				position = overlay.getPosition();

			if (position != null) {
				if (position.equals("*NEXT")) {

				} else {
					p = Integer.parseInt(position);
				}
			}
			dataStructureDelegate.addElement(field.getName(), dataElement, p-1);			
			dataStructureDelegate.slice(dataElement, p-1);
			
			p += dataElement.size();
		}		
				
		((QDataStructDelegator)dataStructure).setDelegate(dataStructureDelegate);

		if(initialize)
			initialize(dataStructure);
		
		return dataStructure;
	}

	@SuppressWarnings({ "unchecked"})
	@Override
	public <D extends QDataStruct> D createDataStruct(List<QDataTerm<?>> dataTerms, int length, boolean initialize) {

		NIODataStructImpl dataStructureDelegate = new NIODataStructImpl(length);
		
		int p = 1;
		for (QDataTerm<?> dataTerm : dataTerms) {

			QBufferedData dataElement = (QBufferedData)createData(dataTerm, false);
			
			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			String position = null;
			if (overlay != null)
				position = overlay.getPosition();

			if (position != null) {
				if (position.equals("*NEXT")) {

				} else {
					p = Integer.parseInt(position);
				}
			}

			dataStructureDelegate.addElement(dataTerm.getName(), dataElement, p-1);
			dataStructureDelegate.slice(dataElement, p-1);
			
			p += dataElement.size();

		}
			
		if(initialize)
			initialize(dataStructureDelegate);
		
		return (D) dataStructureDelegate;			
	}
	
	@Override
	public <E extends Enum<E>, D extends QBufferedData> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate, boolean initialize) {
		return new NIOEnumImpl<E, D>(classEnumerator, dataDelegate);
	}

	@Override
	public QCharacter createCharacter(int length, boolean varying, boolean initialize) {

		QCharacter character = null;
		if (varying)
			character = new NIOCharacterVaryingImpl(length);
		else
			character = new NIOCharacterImpl(length);
		
		if(initialize)
			initialize(character);
		
		return character;
	}

	@Override
	public QBinary createBinary(BinaryType type, boolean unsigned, boolean initialize) {

		QBinary binary = new NIOBinaryImpl(type, unsigned);
		
		if(initialize)
			initialize(binary);
		
		return binary;
	}

	@Override
	public QDecimal createDecimal(int precision, int scale, DecimalType type, boolean initialize) {

		QDecimal decimal = null;

		switch (type) {
			case ZONED:
				decimal = new NIODecimalImpl(precision, scale);
				break;
			case PACKED:
				break;
		}

		if(initialize)
			initialize(decimal);
		
		return decimal;
	}

	@Override
	public QIndicator createIndicator(boolean initialize) {

		QIndicator indicator = new NIOIndicatorImpl();
				
		if(initialize)
			initialize(indicator);
		
		return indicator;
	}

	@Override
	public QDatetime createDate(DatetimeType type, String format, boolean initialize) {

		NIODatetimeImpl datetime = new NIODatetimeImpl(type, format);
				
		if(initialize)
			initialize(datetime);
		
		return datetime;
	}

	@Override
	public QFloating createFloating(FloatingType type, boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QHexadecimal createHexadecimal(int length, boolean initialize) {
		
		QHexadecimal hexadecimal = new NIOHexadecimalImpl(length);
				
		if(initialize)
			initialize(hexadecimal);
		
		return hexadecimal;
	}

	@Override
	public QHexadecimal createPointer(boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QDatetime createTime(boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QDatetime createTimestamp(boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	private void initialize(QData data) {
		
		NIOBufferedDataImpl nioBufferedData = null;
		if(data instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl)data;
		else if(data instanceof QBufferedDataDelegator)
			nioBufferedData = (NIOBufferedDataImpl) ((QBufferedDataDelegator)data).getDelegate();
		else
			throw new FrameworkCoreRuntimeException("Error khsd87sd74c2dn");
		nioBufferedData.allocate();
	}
	@SuppressWarnings("unchecked")
	private Class<? extends QData> completeMetadata(Type type, List<Type> arguments, List<Annotation> annotations) {

		// klass	
		Class<? extends QData> klass = null;		
		if(type instanceof ParameterizedType) {
			ParameterizedType pType = (ParameterizedType)type;
			klass = (Class<? extends QData>) pType.getRawType();
			for(Type argument: pType.getActualTypeArguments())
				arguments.add(argument);
		}
		else
			klass = (Class<? extends QData>) type;
		
		
		// append class annotation
		for (Annotation annotation : klass.getAnnotations()) {
			// dataType filter
			if (!annotation.annotationType().isAnnotationPresent(DataType.class))
				continue;
			annotations.add(annotation);
		}		
		
		return klass;
	}
	
	private void injectAnnotations(List<Annotation> annotations, Object target) {
		
		EObject eObject = (EObject) target;
		EClass eClass = eObject.eClass();

		// merge annotations by reflection
		for (Annotation annotation : annotations) {

			for (Method method : annotation.getClass().getDeclaredMethods()) {

				// EMF reflection
				// TODO Java reflection
				EStructuralFeature eFeature = null;

				// if default field (value) use annotation name
//				if (method.getName().equals("value"))
//					eFeature = eClass.getEStructuralFeature(annotation.annotationType().getSimpleName().toLowerCase());
//				else
				eFeature = eClass.getEStructuralFeature(method.getName());

				if(eFeature == null) {
					if(eClass.getName().replaceAll("Def", "").equalsIgnoreCase(method.getName().replace("Type", ""))) {
						eFeature = eClass.getEStructuralFeature("type");
					}
					else if(eClass.getName().replaceAll("Def", "").equalsIgnoreCase(method.getName().replace("Format", ""))) {
						eFeature = eClass.getEStructuralFeature("format");
					}
				}
				
				if (eFeature != null) {
					try {
						Object object = method.invoke(annotation, new Object[] {});
						if(object instanceof Overlay) {
							Overlay overlay = (Overlay)object;
							QOverlay qOverlay = QIntegratedLanguageCoreFactory.eINSTANCE.createOverlay();
							qOverlay.setName(overlay.name());
							qOverlay.setPosition(overlay.position());
							object = qOverlay;
						}						
						
						if(!(object instanceof Class<?>)) {
							if(object != null && object.getClass().isArray()) {
								List<Object> objects = new ArrayList<>();
								for(Object element: (Object[])object) 
									objects.add(element);	
								eObject.eSet(eFeature, objects);
							}
							else
								eObject.eSet(eFeature, object);
						}
							
					} catch (Exception e) {
						throw new FrameworkCoreRuntimeException(e);
					}
				}
			}
		}

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <DD extends QDataDef<?>> QDataTerm<DD> createDataTerm(Field field) {

		// annotations field
		List<Annotation> annotations = new ArrayList<Annotation>();
		for (Annotation annotation : field.getAnnotations()) {
			annotations.add(annotation);
		}

		QDataTerm<DD> elementTerm = null;
		DD elementDef = (DD) createDataDef(field.getGenericType(), annotations);
		
		if (elementDef instanceof QMultipleCompoundDataDef) {
			QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleCompoundDataTerm();
			elementTerm = (QDataTerm<DD>) multipleCompoundDataTerm;
		}
		else if(elementDef instanceof QMultipleAtomicDataDef) {
			QMultipleAtomicDataTerm<?> multipleAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleAtomicDataTerm();
			elementTerm = (QDataTerm<DD>) multipleAtomicDataTerm;
		}
		else if(elementDef instanceof QUnaryCompoundDataDef) {
			QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
			elementTerm = (QDataTerm<DD>) unaryCompoundDataTerm;
		}
		else if(elementDef instanceof QUnaryAtomicDataDef) {
			QUnaryAtomicDataTerm<?> unaryAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryAtomicDataTerm(); 
			elementTerm = (QDataTerm<DD>) unaryAtomicDataTerm;
		}
		else if(elementDef instanceof QEnumDef) {

			class MyTerm<ED extends QEnumDef<?, ?>> extends DataTermImpl<ED> {

				private static final long serialVersionUID = 1L;
				
			}
			
			elementTerm = new MyTerm();
		}
		else {
			throw new RuntimeException("Unknown dataDef: "+elementDef);
		}			
		elementTerm.setName(field.getName());
		elementTerm.setDefinition(elementDef);
		
		// facets
		for (Annotation annotation : field.getAnnotations()) {
			if(annotation instanceof Overlay) {
				Overlay overlay = (Overlay)annotation;
				
				QOverlay qOverlay = QIntegratedLanguageCoreFactory.eINSTANCE.createOverlay();
				qOverlay.setName(overlay.name());
				qOverlay.setPosition(overlay.position());
				elementTerm.getFacets().add(qOverlay);
			}
		}
		
		return elementTerm;
	}
}