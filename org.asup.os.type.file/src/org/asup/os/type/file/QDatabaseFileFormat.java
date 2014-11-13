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
 * A representation of the model object '<em><b>Database File Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QDatabaseFileFormat#getFormatKeys <em>Format Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getDatabaseFileFormat()
 * @model
 * @generated
 */
public interface QDatabaseFileFormat extends QFileFormat<QDatabaseFileField> {

	/**
	 * Returns the value of the '<em><b>Format Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.os.type.file.QFileFormatKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Keys</em>' containment reference list.
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getDatabaseFileFormat_FormatKeys()
	 * @model containment="true"
	 * @generated
	 */
	List<QFileFormatKey> getFormatKeys();
} // QDatabaseFileFormat
