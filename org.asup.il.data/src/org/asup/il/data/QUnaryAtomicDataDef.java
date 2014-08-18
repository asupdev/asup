/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Atomic Data Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QUnaryAtomicDataDef#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getUnaryAtomicDataDef()
 * @model abstract="true"
 * @generated
 */
public interface QUnaryAtomicDataDef<D extends QData> extends QUnaryDataDef<D>, QAtomicDataDef<D> {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(byte[])
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getUnaryAtomicDataDef_Default()
	 * @model
	 * @generated
	 */
	byte[] getDefault();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QUnaryAtomicDataDef#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(byte[] value);

} // QUnaryAtomicDataDef
