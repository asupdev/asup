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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import org.asup.il.data.QArray;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QBufferedDataDef;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QCompoundDataPart;
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
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.annotation.DataType;
import org.asup.il.data.impl.DataTermImpl;
import org.asup.il.data.impl.EnumDefImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.framework.FrameworkUtil;

public class NIODataFactoryImpl implements QDataFactory {

	private QContext context;
	private QContextID contextID;
	
	protected NIOBufferReference parent;
	
	protected NIODataFactoryImpl(QContext context, QContextID contextID) {
		this.context = context;
		this.contextID = contextID;
	}
	
	protected NIODataFactoryImpl(QContext context, QContextID contextID, NIOBufferReference parent) {
		this(context, contextID);
		this.parent = parent; 
	}


	@Override
	public QData createData(QDataTerm<?> dataTerm) {
		return createData((QDataDef<?>) dataTerm.getDefinition());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <D extends QData> D createData(QDataDef<D> dataDef) {

		D data = null;

		// dataStroller
		if(dataDef instanceof QStrollerDef<?>) {
			QStrollerDef<?> strollerDef = (QStrollerDef<?>)dataDef;
			
			Class<? extends QDataStruct> delegator = null;
			if(strollerDef.getClassDelegator() != null)
				delegator = (Class<? extends QDataStruct>) context.loadClass(contextID, strollerDef.getClassDelegator());
			
			QDataStruct bufferedData = createDataStruct(delegator, strollerDef.getElements(), strollerDef.getLength());
			
			data = (D) createStroller(bufferedData, Integer.parseInt(strollerDef.getOccurrences()));
		}
		// scroller
		else if(dataDef instanceof QScrollerDef<?>) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>)dataDef;
			QBufferedData bufferedData = (QBufferedData) createData(scrollerDef.getArgument()); 
			data = (D) createScroller(bufferedData, Integer.parseInt(scrollerDef.getOccurrences()));
		}
		// array
		else if (dataDef instanceof QArrayDef) {
			QArrayDef<?> arrayDef = (QArrayDef<?>) dataDef;
			QUnaryAtomicDataDef<QBufferedData> argument = (QUnaryAtomicDataDef<QBufferedData>) arrayDef.getArgument();
			
	
			int dimension = 0;
			if(arrayDef.getDimension().equalsIgnoreCase("%elem(£JAXSWK)"))
				dimension = 300;
			else {
				dimension = Integer.parseInt(arrayDef.getDimension());
			}
			
			QBufferedData bufferedData = createArray(argument, dimension);
			data = (D) bufferedData;
		} 
		// dataStruct
		else if (dataDef instanceof QDataStructDef) {
			QDataStructDef dataStructDef = (QDataStructDef) dataDef;
			
			Class<? extends QDataStruct> delegator = null;
			if(dataStructDef.getClassDelegator() != null) 
				delegator = (Class<? extends QDataStruct>) context.loadClass(contextID, dataStructDef.getClassDelegator());

			QDataStruct bufferedData = createDataStruct(delegator, dataStructDef.getElements(), dataStructDef.getLength()); 
			data = (D) bufferedData;
		}
		// base
		else if (dataDef instanceof QBinaryDef) {
			QBinaryDef binaryType = (QBinaryDef) dataDef;
			data = (D) createBinary(binaryType.getType(), binaryType.isUnsigned());
		}
		else if (dataDef instanceof QCharacterDef) {
			QCharacterDef characterType = (QCharacterDef) dataDef;
			data = (D) createCharacter(characterType.getLength(),characterType.isVarying());
		}
		else if (dataDef instanceof QDatetimeDef) {
			QDatetimeDef datetimeType = (QDatetimeDef) dataDef;
			data = (D) createDate(datetimeType.getType(), datetimeType.getFormat());
		}
		else if (dataDef instanceof QDecimalDef) {
			QDecimalDef decimalType = (QDecimalDef) dataDef;
			data = (D) createDecimal(decimalType.getPrecision(),decimalType.getScale(), decimalType.getType());
		}
		else if(dataDef instanceof QEnumDef<?, ?>) {
			data = (D) _createData(dataDef);
		}
		else if (dataDef instanceof QFloatingDef) {
			QFloatingDef floatingType = (QFloatingDef) dataDef;
			data = (D) createFloating(floatingType.getType());
		}
		else if (dataDef instanceof QHexadecimalDef) {
			QHexadecimalDef hexadecimalDef = (QHexadecimalDef)dataDef;
			data = (D) createHexadecimal(hexadecimalDef.getLength());
		}
		else if (dataDef instanceof QIndicatorDef) {
			data = (D) createIndicator();
		}
		else if(dataDef instanceof QPointerDef) {
//			QPointerDef pointerDef = (QPointerDef)dataDef;
			data = (D) createPointer();
		}
		else {
			// TODO external dataDef
			throw new FrameworkCoreRuntimeException("Unknown dataType: "+ dataDef);
		}
		return data;
	}

	@SuppressWarnings("unchecked")
	private <E extends Enum<E>, BD extends QBufferedData, D extends QData> D _createData(QDataDef<D> dataDef) {
		
		QEnumDef<E, BD> enumDef = (QEnumDef<E, BD>)dataDef;
		return (D) createEnum(enumDef.getKlass(), createData(enumDef.getDelegate()));
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
			String address = getAddress(klass);
			dataStructDef.setClassDelegator(address);

			completeStructPart(dataStructDef, klass);

			dataDef = dataStructDef;
		}
		// array
		else if (QArray.class.isAssignableFrom(klass)) {
			
			QArrayDef<?> arrayDef = QIntegratedLanguageDataFactory.eINSTANCE.createArrayDef();
			
			// argument
			QUnaryAtomicDataDef<?> argument = (QUnaryAtomicDataDef<?>) createDataDef(arguments.get(0), annotations);
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
			QUnaryAtomicDataDef<?> argument = (QUnaryAtomicDataDef<?>) createDataDef(arguments.get(0), annotations);
			scrollerDef.setArgument(argument);
			
			dataDef = scrollerDef;
		}
		// enum
		else if(QEnum.class.isAssignableFrom(klass)) {
			
			class MyDef<E extends Enum<E>> extends EnumDefImpl<E, QBufferedData> {
				private static final long serialVersionUID = 1L;

				public MyDef(Class<E> klass, List<Annotation> annotations, Class<?> delegate) {
					
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
			dataDef = new MyDef((Class<?>) arguments.get(0), annotations, (Class<?>)arguments.get(1));			
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

	private void completeStructPart(QCompoundDataPart structPart, Class<? extends QData> klass) {
		// fields introspection
		for (Field field : klass.getFields()) {

			// annotations field
			List<Annotation> annotationsField = new ArrayList<Annotation>();
			for (Annotation annotation : field.getAnnotations()) {
				annotationsField.add(annotation);
			}

			QDataDef<?> elementDef = createDataDef(field.getGenericType(), annotationsField);
			QDataTerm<?> elementTerm = createDataTermByDef(elementDef);
			elementTerm.setName(field.getName());

			structPart.getElements().add(elementTerm);
		}
	}
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <DD extends QDataDef<?>> QDataTerm<DD> createDataTermByDef(DD elementDef) {
		
		QDataTerm<DD> elementTerm = null;
		
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
		elementTerm.setDefinition(elementDef);
		
		return elementTerm;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <D extends QBufferedData> QArray<D> createArray(QUnaryAtomicDataDef<D> argument, int dimension) {

		boolean initialize = (parent == null ? true : false);

		D[] elements = (D[]) new QBufferedData[dimension];
		
		NIOArrayImpl<D> array = null;
		NIODataFactoryImpl arrayDataFactory = this;

		if(initialize) {
			ByteBuffer buffer = ByteBuffer.allocate(((QBufferedDataDef<D>)argument).getLength()*dimension);
			array = new NIOArrayImpl(elements, buffer);			
			arrayDataFactory = new NIODataFactoryImpl(context, contextID, array);
		}
		else {
			array = new NIOArrayImpl(elements, parent.getBuffer());
		}
		
		int position = 1;
		for(int i=1; i<=dimension; i++) {
			elements[i-1] = arrayDataFactory.createData(argument);
			array.slice(elements[i-1], position);
			position = position+elements[i-1].length();
		}
		
		return array;

	}

	@SuppressWarnings({ "unchecked"})
	@Override
	public <D extends QDataStruct> D createDataStruct(Class<D> classDelegator, List<QDataTerm<?>> dataTerms, int length) {

		boolean initialize = (parent == null ? true : false);

		// data structure
		D dataStructure = null;
		
		if(classDelegator != null) { 
			
			try {
				dataStructure = (D) classDelegator.newInstance();

				NIODataStructureWrapperImpl dataStructureDelegate = new NIODataStructureWrapperImpl(length, (QDataStructDelegator) dataStructure, false);
				
				QDataFactory dataStructureFactory = this;				
				if (initialize) 
					dataStructureFactory = new NIODataFactoryImpl(context, contextID, (NIOBufferReference) dataStructureDelegate);
				else
					throw new RuntimeException("Unexpcted condition p4jo8765sfd087thtwmuj90");

				// fields introspection
				List<QBufferedData> fields = new ArrayList<>();
				for (Field field : classDelegator.getFields()) {

					// annotations field
					List<Annotation> annotationsField = new ArrayList<Annotation>();
					for (Annotation annotation : field.getAnnotations()) {
						annotationsField.add(annotation);
					}

					// build
					Type type = field.getGenericType();
					QDataDef<QBufferedData> dataDef = (QDataDef<QBufferedData>) dataStructureFactory.createDataDef(type, annotationsField);
					QBufferedData dataElement = dataStructureFactory.createData(dataDef);

					dataStructureDelegate.addElement(field.getName(), dataElement);
					
					fields.add(dataElement);
				}

				// slice
				if (initialize) {
					dataStructureDelegate.init();
					initializeElements(dataStructureDelegate, fields);
				}
				
				((QDataStructDelegator)dataStructure).setDelegate(dataStructureDelegate);
				
			} catch (InstantiationException | IllegalAccessException | SecurityException e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			
			NIODataStructureImpl dataStructureDelegate = new NIODataStructureImpl(length, new LinkedHashMap<String, QBufferedData>(), false);

			// build
			QDataFactory dataStructureFactory = new NIODataFactoryImpl(context, contextID, (NIOBufferReference) dataStructureDelegate);
			for (QDataTerm<?> dataTerm : dataTerms) {
				QBufferedData element = dataStructureFactory.createData((QDataDef<D>) dataTerm.getDefinition());
				dataStructureDelegate.addElement(dataTerm.getName(), element);
			}
			
			// slice
			if (initialize) {
				dataStructureDelegate.init();
				initializeTerms(dataStructureDelegate, dataTerms);
			}
			
			dataStructure = (D) dataStructureDelegate;			
		}

		return dataStructure;
	}

	@Override
	public <E extends Enum<E>, D extends QBufferedData> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate) {		
		return new NIOEnumImpl<E, D>(classEnumerator, dataDelegate);
	}

	@Override
	public QCharacter createCharacter(int length, boolean varying) {

		boolean initialize = (parent == null ? true : false);
		//boolean initialize = true;

		QCharacter character = null;
		if (varying)
			character = new NIOCharacterVaryingImpl(length, null, initialize);
		else
			character = new NIOCharacterImpl(length, null, initialize);

		return character;
	}

	private void initializeTerms(QDataStruct dataStructure, List<QDataTerm<?>> terms) {

		int p = 1;
		int i = 1;
		for (QDataTerm<?> element : terms) {

			QOverlay overlay = element.getFacet(QOverlay.class);

			String position = null;
			if (overlay != null)
				position = overlay.getPosition();

			if (position != null) {
				if (position.equals("*NEXT")) {

				} else {
					p = Integer.parseInt(position);
				}
			}

			QBufferedData data = dataStructure.getElement(i);
			if (data instanceof NIOBufferReference)
				((NIOBufferReference) dataStructure).slice(data, p);
			else if (data instanceof NIOBufferDelegator)
				((NIOBufferReference) dataStructure).slice(((NIOBufferDelegator)data).getDelegate(), p);
			else
				throw new FrameworkCoreRuntimeException("Error 92d74c234n");

			p += data.size();
			i++;
		}

	}
	
	private void initializeElements(QDataStruct dataStructure, List<QBufferedData> elements) {

		int p = 1;
		for (QBufferedData data : elements) {

			if (data instanceof NIOBufferReference)
				((NIOBufferReference) dataStructure).slice(data, p);
			else if (data instanceof NIOBufferDelegator)
				((NIOBufferReference) dataStructure).slice(((NIOBufferDelegator)data).getDelegate(), p);
			else
				throw new FrameworkCoreRuntimeException("Error 92d7fd7834n");

			if(data instanceof NIOArrayImpl) {
				NIOArrayImpl<?> nioArray = (NIOArrayImpl<?>)data;

				int position = 1;
				for(int i=1; i<=nioArray.capacity(); i++) {
					QBufferedData arrayElement = nioArray.get(i); 
					nioArray.slice(arrayElement, position);
					position = position+arrayElement.length();
				}

			}
			p += data.size();
		}

	}

	@Override
	public QBinary createBinary(BinaryType type, boolean unsigned) {

		boolean initialize = (parent == null ? true : false);
		QBinary binary = null;

		switch (type) {
			case BYTE:
				binary = new NIOBinaryImpl(1, null, initialize);
				break;	
			case SHORT:
				binary = new NIOBinaryImpl(3, null, initialize);
				break;
			case INTEGER:
				binary = new NIOBinaryImpl(5, null, initialize);
				break;
			case LONG:
				binary = new NIOBinaryImpl(10, null, initialize);
				break;
			default:
				throw new FrameworkCoreRuntimeException("Unknown data type " + type);
		}
		return binary;
	}

	@Override
	public QCharacter createCharacter(int length) {
		return createCharacter(length, false);
	}


	@Override
	public QDecimal createDecimal(int precision) {
		return createDecimal(precision, 0);
	}
	
	@Override
	public QDecimal createDecimal(int precision, int scale) {
		return createDecimal(precision, scale, DecimalType.ZONED);
	}

	@Override
	public QDecimal createDecimal(int precision, int scale, DecimalType type) {

		boolean initialize = (parent == null ? true : false);

		QDecimal decimal = null;

		switch (type) {
			case ZONED:
				decimal = new NIODecimalImpl(precision, scale, null, initialize);
				break;
			case PACKED:
				break;
		}

		return decimal;
	}

	@Override
	public QIndicator createIndicator() {
		return new NIOIndicatorImpl(true);
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
							eObject.eSet(eFeature, object);
						}
							
					} catch (Exception e) {
						throw new FrameworkCoreRuntimeException(e);
					}
				}
			}
		}

	}

	@Override
	public <D extends QStruct> QStroller<D> createStroller(D dataDelegate, int occurrences) {
		return new NIOStrollerImpl<D>(dataDelegate, occurrences, true);
	}

	@Override
	public QDatetime createDate(DatetimeType type, String format) {

		boolean initialize = (parent == null ? true : false);

		NIODatetimeImpl datetime = new NIODatetimeImpl(type, format, null, initialize);
		
		return datetime;
	}

	@Override
	public QFloating createFloating(FloatingType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QHexadecimal createHexadecimal(int length) {
		boolean initialize = (parent == null ? true : false);
		
		return new NIOHexadecimalImpl(length, null, initialize);
	}

	@Override
	public QHexadecimal createPointer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <D extends QBufferedData> QScroller<D> createScroller(D dataDelegate, int occurrences) {
		return new NIOScrollerImpl<D>(dataDelegate, occurrences, true);
	}

	@Override
	public QDatetime createTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QDatetime createTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String getAddress(Class<?> klass) {

		String address = "asup:/omac/"+FrameworkUtil.getBundle(klass).getSymbolicName() + "/" + klass.getName();
		
		return address;
	}
	
}