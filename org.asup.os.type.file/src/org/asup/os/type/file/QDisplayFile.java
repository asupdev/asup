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
 * A representation of the model object '<em><b>QDisplay File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QDisplayFile#getFileFormats <em>File Formats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getDisplayFile()
 * @model
 * @generated
 */
public interface QDisplayFile extends QFile {

	/**
	 * Returns the value of the '<em><b>File Formats</b></em>' reference list.
	 * The list contents are of type {@link org.asup.os.type.file.QDisplayFileFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Formats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Formats</em>' reference list.
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getDisplayFile_FileFormats()
	 * @model
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	List<QDisplayFileFormat> getFileFormats();

} // QDisplayFile
