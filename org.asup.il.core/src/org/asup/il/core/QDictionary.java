/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QDictionary#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.il.core.QDictionary#getText <em>Text</em>}</li>
 *   <li>{@link org.asup.il.core.QDictionary#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.asup.il.core.QDictionary#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getDictionary()
 * @model abstract="true"
 * @generated
 */
public interface QDictionary<T extends QTerm> extends QTermContainer<T> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getDictionary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QDictionary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getDictionary_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QDictionary#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getDictionary_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QDictionary#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URI)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getDictionary_Uri()
	 * @model dataType="org.asup.fw.java.JavaURI"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QDictionary#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

} // QDictionary
