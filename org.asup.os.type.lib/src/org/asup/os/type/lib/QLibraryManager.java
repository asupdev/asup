/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.lib;

import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.QTypedManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLibrary Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.lib.QOperatingSystemLibraryPackage#getLibraryManager()
 * @model abstract="true"
 * @generated
 */
public interface QLibraryManager extends QTypedManager<QLibrary> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2014 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	QResourceReader<QLibrary> getLibraryReader(QJob job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	QResourceWriter<QLibrary> getLibraryWriter(QJob job);
} // QLibraryManager
