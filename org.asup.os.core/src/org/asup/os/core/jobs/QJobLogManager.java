/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob Log Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLogManager()
 * @model abstract="true"
 * @generated
 */
public interface QJobLogManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void info(QJob job, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void warning(QJob job, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	void error(QJob job, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	QJobLog lookup(QJob job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	QJobLog lookup(QContextID contextID, String name, String user, int number);

} // QJobLogManager
