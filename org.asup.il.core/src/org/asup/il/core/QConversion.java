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
 * A representation of the model object '<em><b>Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QConversion#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getConversion()
 * @model
 * @generated
 */
public interface QConversion extends QFacet {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.il.core.ConversionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.asup.il.core.ConversionStatus
	 * @see #setStatus(ConversionStatus)
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getConversion_Status()
	 * @model required="true"
	 * @generated
	 */
	ConversionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.asup.il.core.QConversion#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.asup.il.core.ConversionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConversionStatus value);

} // QConversion
