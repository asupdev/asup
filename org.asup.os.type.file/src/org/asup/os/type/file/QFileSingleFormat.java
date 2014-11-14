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
 * A representation of the model object '<em><b>File Single Format</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFileSingleFormat()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFileSingleFormat<FF extends QFileFormat<?>> extends QFile {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	FF getFileFormat();
} // QFileSingleFormat
