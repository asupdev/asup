/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.asup.db.core.QConnection;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.QTypedManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFile Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFileManager()
 * @model abstract="true"
 * @generated
 */
public interface QFileManager extends QTypedManager<QFile> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true"
	 * @generated
	 */
	QConnection getDatabaseConnection(QJob job) throws OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true" fileNameRequired="true"
	 * @generated
	 */
	QFile getOverriddenFile(QJob job, String fileName) throws OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" jobRequired="true" fileFromRequired="true" fileToRequired="true"
	 * @generated
	 */
	void overrideFile(QJob job, String fileFrom, QFile fileTo) throws OperatingSystemRuntimeException;
} // QFileManager
