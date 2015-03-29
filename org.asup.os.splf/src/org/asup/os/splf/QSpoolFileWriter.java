/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.splf;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spool File Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.splf.QOperatingSystemSpoolfilePackage#getSpoolFileWriter()
 * @model abstract="true"
 * @generated
 */
public interface QSpoolFileWriter extends QService {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" spoolFileRequired="true"
	 * @generated
	 */
	void writeSpoolFile(QContextID contextID, QSpoolFile spoolFile);
} // QSpoolFileWriter
