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
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getEnum()
 * @model interface="true" abstract="true" EBounds="org.asup.fw.java.JavaEnum"
 * @generated
 */
public interface QEnum<E extends Enum<E>, D extends QBufferedData> extends QBufferedData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	D asData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	E asEnum();

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
	 * @model kind="operation"
	 * @generated
	 */
	String getSpecialName();

} // QEnum
