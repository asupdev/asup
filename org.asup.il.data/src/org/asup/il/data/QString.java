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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getString()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QString extends QBufferedData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceType="org.asup.fw.java.JavaNumber" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, Number space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceType="org.asup.fw.java.JavaNumber" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, Number space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(String factor1, String factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true"
	 * @generated
	 */
	void cat(String factor1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true"
	 * @generated
	 */
	void cat(QString factor1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QString value);

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
	void eval(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QString value);

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
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(QString value);

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
	 * @model
	 * @generated
	 */
	void in();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QString value);

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
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(QString value);

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
	 * @model
	 * @generated
	 */
	void move(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QString value);

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
	 * @model
	 * @generated
	 */
	void out();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String trim();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String trimL();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String trimR();
} // QString