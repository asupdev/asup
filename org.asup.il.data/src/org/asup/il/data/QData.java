/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.io.Serializable;
import java.lang.Enum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getData()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface QData extends Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QDataVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EBounds="org.asup.fw.java.Enum"
	 * @generated
	 */
	<E extends Enum<E>> void eval(E value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEmpty();

} // QData
