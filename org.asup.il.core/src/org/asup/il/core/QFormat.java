/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QFormat#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.asup.il.core.QFormat#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getFormat()
 * @model
 * @generated
 */
public interface QFormat extends QFacet {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.il.core.FormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.asup.il.core.FormatType
	 * @see #setType(FormatType)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getFormat_Type()
	 * @model required="true"
	 * @generated
	 */
	FormatType getType();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.asup.il.core.FormatType
	 * @see #getType()
	 * @generated
	 */
	void setType(FormatType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getFormat_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QFormat#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // QFormat
