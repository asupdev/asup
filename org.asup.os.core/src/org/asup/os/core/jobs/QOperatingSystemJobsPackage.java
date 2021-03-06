/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.os.core.jobs.QOperatingSystemJobsFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemJobsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/core/jobs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-jobs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemJobsPackage eINSTANCE = org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.impl.JobImpl
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTEXT = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_ID = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_NAME = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_NUMBER = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_STATUS = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Job Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_TYPE = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_USER = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LIBRARIES = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__MESSAGES = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SYSTEM = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CREATION_INFO = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.impl.JobLogImpl <em>Job Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.impl.JobLogImpl
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLog()
	 * @generated
	 */
	int JOB_LOG = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG__ENTRIES = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG__JOB_ID = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.impl.JobLogEntryImpl <em>Job Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.impl.JobLogEntryImpl
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogEntry()
	 * @generated
	 */
	int JOB_LOG_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__GRAVITY = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__MESSAGE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__CREATION_DATE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.impl.JobLogManagerImpl <em>Job Log Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.impl.JobLogManagerImpl
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogManager()
	 * @generated
	 */
	int JOB_LOG_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Job Log Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.impl.JobManagerImpl <em>Job Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.impl.JobManagerImpl
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobManager()
	 * @generated
	 */
	int JOB_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Job Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.impl.LogImpl
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 5;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.JobStatus
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 6;

	/**
	 * The meta object id for the '{@link org.asup.os.core.jobs.JobType <em>Job Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.jobs.JobType
	 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobType()
	 * @generated
	 */
	int JOB_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.asup.os.core.jobs.QJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see org.asup.os.core.jobs.QJob
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJob#getJobID <em>Job ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job ID</em>'.
	 * @see org.asup.os.core.jobs.QJob#getJobID()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobID();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJob#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see org.asup.os.core.jobs.QJob#getJobName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJob#getJobNumber <em>Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Number</em>'.
	 * @see org.asup.os.core.jobs.QJob#getJobNumber()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJob#getJobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Status</em>'.
	 * @see org.asup.os.core.jobs.QJob#getJobStatus()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJob#getJobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Type</em>'.
	 * @see org.asup.os.core.jobs.QJob#getJobType()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJob#getJobUser <em>Job User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job User</em>'.
	 * @see org.asup.os.core.jobs.QJob#getJobUser()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobUser();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.os.core.jobs.QJob#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Libraries</em>'.
	 * @see org.asup.os.core.jobs.QJob#getLibraries()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Libraries();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.os.core.jobs.QJob#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Messages</em>'.
	 * @see org.asup.os.core.jobs.QJob#getMessages()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Messages();

	/**
	 * Returns the meta object for the reference '{@link org.asup.os.core.jobs.QJob#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.asup.os.core.jobs.QJob#getSystem()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.jobs.QJob#getCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Info</em>'.
	 * @see org.asup.os.core.jobs.QJob#getCreationInfo()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_CreationInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.jobs.QJob#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.asup.os.core.jobs.QJob#getContext()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Context();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.jobs.QJobLog <em>Job Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log</em>'.
	 * @see org.asup.os.core.jobs.QJobLog
	 * @generated
	 */
	EClass getJobLog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.core.jobs.QJobLog#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.asup.os.core.jobs.QJobLog#getEntries()
	 * @see #getJobLog()
	 * @generated
	 */
	EReference getJobLog_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJobLog#getJobID <em>Job ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job ID</em>'.
	 * @see org.asup.os.core.jobs.QJobLog#getJobID()
	 * @see #getJobLog()
	 * @generated
	 */
	EAttribute getJobLog_JobID();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.jobs.QJobLogEntry <em>Job Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log Entry</em>'.
	 * @see org.asup.os.core.jobs.QJobLogEntry
	 * @generated
	 */
	EClass getJobLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJobLogEntry#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.asup.os.core.jobs.QJobLogEntry#getGravity()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_Gravity();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJobLogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.asup.os.core.jobs.QJobLogEntry#getMessage()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.core.jobs.QJobLogEntry#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.asup.os.core.jobs.QJobLogEntry#getCreationDate()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_CreationDate();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.jobs.QJobLogManager <em>Job Log Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log Manager</em>'.
	 * @see org.asup.os.core.jobs.QJobLogManager
	 * @generated
	 */
	EClass getJobLogManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.jobs.QJobManager <em>Job Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Manager</em>'.
	 * @see org.asup.os.core.jobs.QJobManager
	 * @generated
	 */
	EClass getJobManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.jobs.QLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see org.asup.os.core.jobs.QLog
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.core.jobs.JobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Status</em>'.
	 * @see org.asup.os.core.jobs.JobStatus
	 * @generated
	 */
	EEnum getJobStatus();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.core.jobs.JobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Type</em>'.
	 * @see org.asup.os.core.jobs.JobType
	 * @generated
	 */
	EEnum getJobType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemJobsFactory getOperatingSystemJobsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.impl.JobImpl
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Job ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_ID = eINSTANCE.getJob_JobID();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_NAME = eINSTANCE.getJob_JobName();

		/**
		 * The meta object literal for the '<em><b>Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_NUMBER = eINSTANCE.getJob_JobNumber();

		/**
		 * The meta object literal for the '<em><b>Job Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_STATUS = eINSTANCE.getJob_JobStatus();

		/**
		 * The meta object literal for the '<em><b>Job Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_TYPE = eINSTANCE.getJob_JobType();

		/**
		 * The meta object literal for the '<em><b>Job User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_USER = eINSTANCE.getJob_JobUser();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__LIBRARIES = eINSTANCE.getJob_Libraries();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__MESSAGES = eINSTANCE.getJob_Messages();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SYSTEM = eINSTANCE.getJob_System();

		/**
		 * The meta object literal for the '<em><b>Creation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CREATION_INFO = eINSTANCE.getJob_CreationInfo();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTEXT = eINSTANCE.getJob_Context();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.impl.JobLogImpl <em>Job Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.impl.JobLogImpl
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLog()
		 * @generated
		 */
		EClass JOB_LOG = eINSTANCE.getJobLog();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_LOG__ENTRIES = eINSTANCE.getJobLog_Entries();

		/**
		 * The meta object literal for the '<em><b>Job ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG__JOB_ID = eINSTANCE.getJobLog_JobID();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.impl.JobLogEntryImpl <em>Job Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.impl.JobLogEntryImpl
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogEntry()
		 * @generated
		 */
		EClass JOB_LOG_ENTRY = eINSTANCE.getJobLogEntry();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__GRAVITY = eINSTANCE.getJobLogEntry_Gravity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__MESSAGE = eINSTANCE.getJobLogEntry_Message();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__CREATION_DATE = eINSTANCE.getJobLogEntry_CreationDate();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.impl.JobLogManagerImpl <em>Job Log Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.impl.JobLogManagerImpl
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogManager()
		 * @generated
		 */
		EClass JOB_LOG_MANAGER = eINSTANCE.getJobLogManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.impl.JobManagerImpl <em>Job Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.impl.JobManagerImpl
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobManager()
		 * @generated
		 */
		EClass JOB_MANAGER = eINSTANCE.getJobManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.impl.LogImpl
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.JobStatus <em>Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.JobStatus
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobStatus()
		 * @generated
		 */
		EEnum JOB_STATUS = eINSTANCE.getJobStatus();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.jobs.JobType <em>Job Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.jobs.JobType
		 * @see org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobType()
		 * @generated
		 */
		EEnum JOB_TYPE = eINSTANCE.getJobType();

	}

} //OSCoreJobsPackage
