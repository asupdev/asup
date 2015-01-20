/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import org.asup.il.data.QUnaryCompoundDataDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.isam.QRecordDef#getExternalName <em>External Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getRecordDef()
 * @model
 * @generated
 */
public interface QRecordDef extends QUnaryCompoundDataDef<QRecord> {

	/**
	 * Returns the value of the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Name</em>' attribute.
	 * @see #setExternalName(String)
	 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getRecordDef_ExternalName()
	 * @model
	 * @generated
	 */
	String getExternalName();

	/**
	 * Sets the value of the '{@link org.asup.il.isam.QRecordDef#getExternalName <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Name</em>' attribute.
	 * @see #getExternalName()
	 * @generated
	 */
	void setExternalName(String value);
} // QRecordDef
