/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.isam.QDataSetTerm#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.asup.il.isam.QDataSetTerm#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link org.asup.il.isam.QDataSetTerm#isKeyedAccess <em>Keyed Access</em>}</li>
 *   <li>{@link org.asup.il.isam.QDataSetTerm#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getDataSetTerm()
 * @model
 * @generated
 */
public interface QDataSetTerm extends QFileTerm {

	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
	 * The default value is <code>"I"</code>.
	 * The literals are from the enumeration {@link org.asup.il.isam.AccessMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imposta il tipo di accesso al data set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute.
	 * @see org.asup.il.isam.AccessMode
	 * @see #setAccessMode(AccessMode)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getDataSetTerm_AccessMode()
	 * @model default="I" required="true"
	 * @generated
	 */
	AccessMode getAccessMode();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QDataSetTerm#getAccessMode <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Mode</em>' attribute.
	 * @see org.asup.il.isam.AccessMode
	 * @see #getAccessMode()
	 * @generated
	 */
	void setAccessMode(AccessMode value);

	/**
	 * Returns the value of the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Name</em>' attribute.
	 * @see #setFormatName(String)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getDataSetTerm_FormatName()
	 * @model
	 * @generated
	 */
	String getFormatName();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QDataSetTerm#getFormatName <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Name</em>' attribute.
	 * @see #getFormatName()
	 * @generated
	 */
	void setFormatName(String value);

	/**
	 * Returns the value of the '<em><b>Keyed Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imposta il tipo di accesso al data set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyed Access</em>' attribute.
	 * @see #setKeyedAccess(boolean)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getDataSetTerm_KeyedAccess()
	 * @model required="true"
	 * @generated
	 */
	boolean isKeyedAccess();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QDataSetTerm#isKeyedAccess <em>Keyed Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyed Access</em>' attribute.
	 * @see #isKeyedAccess()
	 * @generated
	 */
	void setKeyedAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getDataSetTerm_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QDataSetTerm#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);
} // QDataSetTerm
