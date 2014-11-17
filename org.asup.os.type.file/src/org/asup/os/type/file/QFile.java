/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.il.core.QNamedNode;
import org.asup.os.type.QTypedObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QFile#getDictionary <em>Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile()
 * @model abstract="true"
 * @generated
 */
public interface QFile extends QTypedObject, QNamedNode {

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' attribute.
	 * @see #setDictionary(String)
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile_Dictionary()
	 * @model
	 * @generated
	 */
	String getDictionary();

	/**
	 * Sets the value of the '{@link org.asup.os.type.file.QFile#getDictionary <em>Dictionary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' attribute.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(String value);

} // QFile
