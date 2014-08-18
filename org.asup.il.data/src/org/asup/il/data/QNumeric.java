/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.Enum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getNumeric()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QNumeric extends QBufferedData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int asInteger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	short asShort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	long asLong();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.asup.fw.java.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean eq(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean eq(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.asup.fw.java.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean ge(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean ge(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.asup.fw.java.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean gt(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean gt(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.asup.fw.java.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean le(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean le(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.asup.fw.java.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean lt(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean lt(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.asup.fw.java.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean ne(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> boolean ne(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void power(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void power(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void power(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void power(QNumeric value);

} // QNumeric
