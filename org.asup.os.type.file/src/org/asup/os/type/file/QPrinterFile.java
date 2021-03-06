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
 * A representation of the model object '<em><b>QPrinter File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.file.QPrinterFile#getPrinterFormats <em>Printer Formats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPrinterFile()
 * @model
 * @generated
 */
public interface QPrinterFile extends QFile {

	/**
	 * Returns the value of the '<em><b>Printer Formats</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.os.type.file.QPrinterFileFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printer Formats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printer Formats</em>' containment reference list.
	 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getPrinterFile_PrinterFormats()
	 * @model containment="true"
	 * @generated
	 */
	List<QPrinterFileFormat> getPrinterFormats();
} // QPrinterFile
