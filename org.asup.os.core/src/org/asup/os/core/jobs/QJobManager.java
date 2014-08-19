/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs;

import java.util.List;

import org.asup.fw.core.QContextID;
import org.asup.fw.core.QService;
import org.asup.os.core.OperatingSystemException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobManager()
 * @model abstract="true"
 * @generated
 */
public interface QJobManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" jobRequired="true" statusRequired="true"
	 * @generated
	 */
	void updateStatus(QJob job, JobStatus status) throws OperatingSystemException, OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException" userRequired="true" passwordRequired="true"
	 * @generated
	 */
	QContextID create(String user, String password) throws OperatingSystemException, OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException" credentialRequired="true"
	 * @generated
	 */
	QJob create(QJob credential) throws OperatingSystemException, OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<QJob> getActiveJobs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	QJob lookup(QContextID contextID, String name, String user, int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true"
	 * @generated
	 */
	QJob lookup(QContextID contextID);

} // QJobManager
