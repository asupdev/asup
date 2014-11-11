/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import java.util.List;
import org.asup.os.type.QTypedObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFile</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile()
 * @model abstract="true"
 * @generated
 */
public interface QFile extends QTypedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Formats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	<FF extends QFileFormat> List<QFileFormat> getFileFormats();

} // QFile
