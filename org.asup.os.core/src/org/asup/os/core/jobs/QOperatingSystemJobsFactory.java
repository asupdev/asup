/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage
 * @generated
 */
public interface QOperatingSystemJobsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemJobsFactory eINSTANCE = org.asup.os.core.jobs.impl.OperatingSystemJobsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
	QJob createJob();

	/**
	 * Returns a new object of class '<em>Job Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Log</em>'.
	 * @generated
	 */
	QJobLog createJobLog();

	/**
	 * Returns a new object of class '<em>Job Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Log Entry</em>'.
	 * @generated
	 */
	QJobLogEntry createJobLogEntry();

	/**
	 * Returns a new object of class '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log</em>'.
	 * @generated
	 */
	QLog createLog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemJobsPackage getOperatingSystemJobsPackage();

} //OSCoreJobsFactory
