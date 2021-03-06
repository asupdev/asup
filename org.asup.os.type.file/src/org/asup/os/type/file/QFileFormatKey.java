/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Format Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QFileFormatKey#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.os.type.file.QFileFormatKey#isDescend <em>Descend</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFileFormatKey()
 * @model
 * @generated
 */
public interface QFileFormatKey {
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
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFileFormatKey_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QFileFormatKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descend</em>' attribute.
	 * @see #setDescend(boolean)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFileFormatKey_Descend()
	 * @model
	 * @generated
	 */
	boolean isDescend();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QFileFormatKey#isDescend <em>Descend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descend</em>' attribute.
	 * @see #isDescend()
	 * @generated
	 */
	void setDescend(boolean value);

} // QFileFormatKey
