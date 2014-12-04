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
 * A representation of the model object '<em><b>Hexadecimal Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QHexadecimalDef#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getHexadecimalDef()
 * @model
 * @generated
 */
public interface QHexadecimalDef extends QUnaryAtomicBufferedDataDef<QHexadecimal> {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getHexadecimalDef_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QHexadecimalDef#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // QHexadecimalDef
