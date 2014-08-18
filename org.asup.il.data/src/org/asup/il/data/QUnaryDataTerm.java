/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Data Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QUnaryDataTerm#getDefault <em>Default</em>}</li>
 *   <li>{@link org.asup.il.data.QUnaryDataTerm#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getUnaryDataTerm()
 * @model abstract="true"
 * @generated
 */
public interface QUnaryDataTerm<DD extends QUnaryDataDef<?>> extends QDataTerm<DD> {

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getUnaryDataTerm_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QUnaryDataTerm#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getUnaryDataTerm_Mandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QUnaryDataTerm#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

} // QUnaryDataTerm
