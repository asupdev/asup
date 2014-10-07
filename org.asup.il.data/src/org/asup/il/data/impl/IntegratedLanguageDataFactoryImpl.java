/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.data.BinaryType;
import org.asup.il.data.DataType;
import org.asup.il.data.DateFormat;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.DecimalType;
import org.asup.il.data.FloatingType;
import org.asup.il.data.QAdapterDef;
import org.asup.il.data.QArray;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QBufferDef;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QDataDictionary;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QEnum;
import org.asup.il.data.QFloatingDef;
import org.asup.il.data.QHexadecimalDef;
import org.asup.il.data.QIndicatorDef;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QList;
import org.asup.il.data.QListDef;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QNumericDef;
import org.asup.il.data.QPointerDef;
import org.asup.il.data.QScroller;
import org.asup.il.data.QScrollerDef;
import org.asup.il.data.QStringDef;
import org.asup.il.data.QStroller;
import org.asup.il.data.QStrollerDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.TimeFormat;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataFactoryImpl extends EFactoryImpl implements QIntegratedLanguageDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageDataFactory init() {
		try {
			QIntegratedLanguageDataFactory theIntegratedLanguageDataFactory = (QIntegratedLanguageDataFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageDataPackage.eNS_URI);
			if (theIntegratedLanguageDataFactory != null) {
				return theIntegratedLanguageDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageDataPackage.ADAPTER_DEF: return (EObject)createAdapterDef();
			case QIntegratedLanguageDataPackage.ARRAY_DEF: return (EObject)createArrayDef();
			case QIntegratedLanguageDataPackage.BINARY_DEF: return (EObject)createBinaryDef();
			case QIntegratedLanguageDataPackage.BUFFER_DEF: return (EObject)createBufferDef();
			case QIntegratedLanguageDataPackage.CHARACTER_DEF: return (EObject)createCharacterDef();
			case QIntegratedLanguageDataPackage.DATA_DICTIONARY: return (EObject)createDataDictionary();
			case QIntegratedLanguageDataPackage.DATA_STRUCT_DEF: return (EObject)createDataStructDef();
			case QIntegratedLanguageDataPackage.DATETIME_DEF: return (EObject)createDatetimeDef();
			case QIntegratedLanguageDataPackage.DECIMAL_DEF: return (EObject)createDecimalDef();
			case QIntegratedLanguageDataPackage.ENUM: return (EObject)createEnum();
			case QIntegratedLanguageDataPackage.FLOATING_DEF: return (EObject)createFloatingDef();
			case QIntegratedLanguageDataPackage.HEXADECIMAL_DEF: return (EObject)createHexadecimalDef();
			case QIntegratedLanguageDataPackage.INDICATOR_DEF: return (EObject)createIndicatorDef();
			case QIntegratedLanguageDataPackage.LIST_DEF: return (EObject)createListDef();
			case QIntegratedLanguageDataPackage.MULTIPLE_ATOMIC_DATA_TERM: return (EObject)createMultipleAtomicDataTerm();
			case QIntegratedLanguageDataPackage.MULTIPLE_COMPOUND_DATA_TERM: return (EObject)createMultipleCompoundDataTerm();
			case QIntegratedLanguageDataPackage.NUMERIC_DEF: return (EObject)createNumericDef();
			case QIntegratedLanguageDataPackage.POINTER_DEF: return (EObject)createPointerDef();
			case QIntegratedLanguageDataPackage.SCROLLER_DEF: return (EObject)createScrollerDef();
			case QIntegratedLanguageDataPackage.STRING_DEF: return (EObject)createStringDef();
			case QIntegratedLanguageDataPackage.STROLLER_DEF: return (EObject)createStrollerDef();
			case QIntegratedLanguageDataPackage.UNARY_ATOMIC_DATA_TERM: return (EObject)createUnaryAtomicDataTerm();
			case QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_TERM: return (EObject)createUnaryCompoundDataTerm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageDataPackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATETIME_TYPE:
				return createDatetimeTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATE_FORMAT:
				return createDateFormatFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DECIMAL_TYPE:
				return createDecimalTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.FLOATING_TYPE:
				return createFloatingTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.TIME_FORMAT:
				return createTimeFormatFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATA_ARRAY:
				return createDataArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageDataPackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATETIME_TYPE:
				return convertDatetimeTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATE_FORMAT:
				return convertDateFormatToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DECIMAL_TYPE:
				return convertDecimalTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.FLOATING_TYPE:
				return convertFloatingTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.TIME_FORMAT:
				return convertTimeFormatToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATA_ARRAY:
				return convertDataArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAdapterDef createAdapterDef() {
		AdapterDefImpl adapterDef = new AdapterDefImpl();
		return adapterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <D extends QArray<?>> QArrayDef<D> createArrayDef() {
		ArrayDefImpl<D> arrayDef = new ArrayDefImpl<D>();
		return arrayDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBinaryDef createBinaryDef() {
		BinaryDefImpl binaryDef = new BinaryDefImpl();
		return binaryDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBufferDef createBufferDef() {
		BufferDefImpl bufferDef = new BufferDefImpl();
		return bufferDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCharacterDef createCharacterDef() {
		CharacterDefImpl characterDef = new CharacterDefImpl();
		return characterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataDictionary createDataDictionary() {
		DataDictionaryImpl dataDictionary = new DataDictionaryImpl();
		return dataDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataStructDef createDataStructDef() {
		DataStructDefImpl dataStructDef = new DataStructDefImpl();
		return dataStructDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatetimeDef createDatetimeDef() {
		DatetimeDefImpl datetimeDef = new DatetimeDefImpl();
		return datetimeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDecimalDef createDecimalDef() {
		DecimalDefImpl decimalDef = new DecimalDefImpl();
		return decimalDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <E extends Enum<E>, D extends QBufferedData> QEnum<E, D> createEnum() {
		EnumImpl<E, D> enum_ = new EnumImpl<E, D>();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFloatingDef createFloatingDef() {
		FloatingDefImpl floatingDef = new FloatingDefImpl();
		return floatingDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QHexadecimalDef createHexadecimalDef() {
		HexadecimalDefImpl hexadecimalDef = new HexadecimalDefImpl();
		return hexadecimalDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIndicatorDef createIndicatorDef() {
		IndicatorDefImpl indicatorDef = new IndicatorDefImpl();
		return indicatorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <D extends QList<?>> QListDef<D> createListDef() {
		ListDefImpl<D> listDef = new ListDefImpl<D>();
		return listDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <DD extends QMultipleAtomicDataDef<?>> QMultipleAtomicDataTerm<DD> createMultipleAtomicDataTerm() {
		MultipleAtomicDataTermImpl<DD> multipleAtomicDataTerm = new MultipleAtomicDataTermImpl<DD>();
		return multipleAtomicDataTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <DD extends QMultipleCompoundDataDef<?>> QMultipleCompoundDataTerm<DD> createMultipleCompoundDataTerm() {
		MultipleCompoundDataTermImpl<DD> multipleCompoundDataTerm = new MultipleCompoundDataTermImpl<DD>();
		return multipleCompoundDataTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNumericDef createNumericDef() {
		NumericDefImpl numericDef = new NumericDefImpl();
		return numericDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPointerDef createPointerDef() {
		PointerDefImpl pointerDef = new PointerDefImpl();
		return pointerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <D extends QScroller<QBufferedData>> QScrollerDef<D> createScrollerDef() {
		ScrollerDefImpl<D> scrollerDef = new ScrollerDefImpl<D>();
		return scrollerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QStringDef createStringDef() {
		StringDefImpl stringDef = new StringDefImpl();
		return stringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <D extends QStroller<?>> QStrollerDef<D> createStrollerDef() {
		StrollerDefImpl<D> strollerDef = new StrollerDefImpl<D>();
		return strollerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <DD extends QUnaryAtomicDataDef<?>> QUnaryAtomicDataTerm<DD> createUnaryAtomicDataTerm() {
		UnaryAtomicDataTermImpl<DD> unaryAtomicDataTerm = new UnaryAtomicDataTermImpl<DD>();
		return unaryAtomicDataTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <DD extends QUnaryCompoundDataDef<?>> QUnaryCompoundDataTerm<DD> createUnaryCompoundDataTerm() {
		UnaryCompoundDataTermImpl<DD> unaryCompoundDataTerm = new UnaryCompoundDataTermImpl<DD>();
		return unaryCompoundDataTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryTypeFromString(EDataType eDataType, String initialValue) {
		BinaryType result = BinaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeType createDatetimeTypeFromString(EDataType eDataType, String initialValue) {
		DatetimeType result = DatetimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat createDateFormatFromString(EDataType eDataType, String initialValue) {
		DateFormat result = DateFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalType createDecimalTypeFromString(EDataType eDataType, String initialValue) {
		DecimalType result = DecimalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingType createFloatingTypeFromString(EDataType eDataType, String initialValue) {
		FloatingType result = FloatingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormat createTimeFormatFromString(EDataType eDataType, String initialValue) {
		TimeFormat result = TimeFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCharacter createCharacterFromString(EDataType eDataType, String initialValue) {
		return (QCharacter)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createDataArrayFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageDataPackage getIntegratedLanguageDataPackage() {
		return (QIntegratedLanguageDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageDataPackage getPackage() {
		return QIntegratedLanguageDataPackage.eINSTANCE;
	}

} //IntegratedLanguageDataFactoryImpl
