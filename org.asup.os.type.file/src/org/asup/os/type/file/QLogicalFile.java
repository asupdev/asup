/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import java.util.List;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLogical File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QLogicalFile#getCreationStatement <em>Creation Statement</em>}</li>
 *   <li>{@link org.asup.os.type.file.QLogicalFile#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile()
 * @model
 * @generated
 */
public interface QLogicalFile extends QDatabaseFile {

	/**
	 * Returns the value of the '<em><b>Creation Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Statement</em>' attribute.
	 * @see #setCreationStatement(String)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile_CreationStatement()
	 * @model
	 * @generated
	 */
	String getCreationStatement();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QLogicalFile#getCreationStatement <em>Creation Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Statement</em>' attribute.
	 * @see #getCreationStatement()
	 * @generated
	 */
	void setCreationStatement(String value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' attribute list.
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getLogicalFile_Tables()
	 * @model required="true"
	 * @generated
	 */
	List<String> getTables();

} // QLogicalFile
