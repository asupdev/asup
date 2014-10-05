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
 * A representation of the model object '<em><b>Binary Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QBinaryDef#getType <em>Type</em>}</li>
 *   <li>{@link org.asup.il.data.QBinaryDef#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getBinaryDef()
 * @model
 * @generated
 */
public interface QBinaryDef extends QUnaryAtomicBufferedDataDef<QBinary> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.il.data.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.asup.il.data.BinaryType
	 * @see #setType(BinaryType)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getBinaryDef_Type()
	 * @model required="true"
	 * @generated
	 */
	BinaryType getType();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QBinaryDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.asup.il.data.BinaryType
	 * @see #getType()
	 * @generated
	 */
	void setType(BinaryType value);

	/**
	 * Returns the value of the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned</em>' attribute.
	 * @see #setUnsigned(boolean)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getBinaryDef_Unsigned()
	 * @model
	 * @generated
	 */
	boolean isUnsigned();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QBinaryDef#isUnsigned <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned</em>' attribute.
	 * @see #isUnsigned()
	 * @generated
	 */
	void setUnsigned(boolean value);

} // QBinaryDef
