/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.Enum;
import java.lang.String;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QBufferedData> QArray<D> createArray(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" unsignedRequired="true" initializeRequired="true"
	 * @generated
	 */
	QBinary createBinary(BinaryType type, boolean unsigned, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" varyingRequired="true" initializeRequired="true"
	 * @generated
	 */
	QCharacter createCharacter(int length, boolean varying, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDefRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QData> D createData(QDataDef<D> dataDef, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataTermRequired="true" initializeRequired="true"
	 * @generated
	 */
	QData createData(QDataTerm<?> dataTerm, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeDataType="org.asup.fw.java.JavaType" typeRequired="true" annotationsDataType="org.asup.fw.java.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QDataDef<?> createDataDef(Type type, List<Annotation> annotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementsMany="true" lengthRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(List<QDataTerm<?>> elements, int length, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(Class<D> wrapper, int length, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" formatRequired="true" initializeRequired="true"
	 * @generated
	 */
	QDatetime createDate(DatetimeType type, String format, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" precisionRequired="true" scaleRequired="true" typeRequired="true" initializeRequired="true"
	 * @generated
	 */
	QDecimal createDecimal(int precision, int scale, DecimalType type, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDelegateRequired="true" initializeRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>, D extends QBufferedData> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" initializeRequired="true"
	 * @generated
	 */
	QFloating createFloating(FloatingType type, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" initializeRequired="true"
	 * @generated
	 */
	QHexadecimal createHexadecimal(int length, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	QIndicator createIndicator(boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QData> QList<D> createList(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true" initializeRequired="true"
	 * @generated
	 */
	QPointer createPointer(QBufferedData target, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QBufferedData> QScroller<D> createScroller(QAtomicDataDef<D> argument, int dimension, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> QStroller<D> createStroller(QCompoundDataDef<?> argument, int dimension, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	QDatetime createTime(boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	QDatetime createTimestamp(boolean initialize);

} // QDataFactory
