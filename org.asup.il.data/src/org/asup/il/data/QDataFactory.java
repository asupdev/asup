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
	 * @model required="true" argumentRequired="true" dimensionRequired="true"
	 * @generated
	 */
	<D extends QBufferedData> QArray<D> createArray(QUnaryAtomicDataDef<D> argument, int dimension);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" unsignedRequired="true"
	 * @generated
	 */
	QBinary createBinary(BinaryType type, boolean unsigned);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true"
	 * @generated
	 */
	QCharacter createCharacter(int length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" varyingRequired="true"
	 * @generated
	 */
	QCharacter createCharacter(int length, boolean varying);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDefRequired="true"
	 * @generated
	 */
	<D extends QData> D createData(QDataDef<D> dataDef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataTermRequired="true"
	 * @generated
	 */
	QData createData(QDataTerm<?> dataTerm);

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
	 * @model required="true" dataDelegateRequired="true" occurrencesRequired="true"
	 * @generated
	 */
	<D extends QStruct> QStroller<D> createStroller(D dataDelegate, int occurrences);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementsMany="true" lengthRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(Class<D> classDelegator, List<QDataTerm<?>> elements, int length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" formatRequired="true"
	 * @generated
	 */
	QDatetime createDate(DatetimeType type, String format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" precisionRequired="true"
	 * @generated
	 */
	QDecimal createDecimal(int precision);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" precisionRequired="true" scaleRequired="true"
	 * @generated
	 */
	QDecimal createDecimal(int precision, int scale);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" precisionRequired="true" scaleRequired="true" typeRequired="true"
	 * @generated
	 */
	QDecimal createDecimal(int precision, int scale, DecimalType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDelegateRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>, D extends QBufferedData> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true"
	 * @generated
	 */
	QFloating createFloating(FloatingType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true"
	 * @generated
	 */
	QHexadecimal createHexadecimal(int length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QIndicator createIndicator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QHexadecimal createPointer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDelegateRequired="true" occurrencesRequired="true"
	 * @generated
	 */
	<D extends QBufferedData> QScroller<D> createScroller(D dataDelegate, int occurrences);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QDatetime createTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QDatetime createTimestamp();

} // QDataFactory
