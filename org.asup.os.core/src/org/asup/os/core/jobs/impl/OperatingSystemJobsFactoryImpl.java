/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs.impl;

import org.asup.os.core.jobs.JobStatus;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLog;
import org.asup.os.core.jobs.QJobLogEntry;
import org.asup.os.core.jobs.QLog;
import org.asup.os.core.jobs.QOperatingSystemJobsFactory;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemJobsFactoryImpl extends EFactoryImpl implements QOperatingSystemJobsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemJobsFactory init() {
		try {
			QOperatingSystemJobsFactory theOperatingSystemJobsFactory = (QOperatingSystemJobsFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemJobsPackage.eNS_URI);
			if (theOperatingSystemJobsFactory != null) {
				return theOperatingSystemJobsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemJobsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemJobsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemJobsPackage.JOB: return (EObject)createJob();
			case QOperatingSystemJobsPackage.JOB_LOG: return (EObject)createJobLog();
			case QOperatingSystemJobsPackage.JOB_LOG_ENTRY: return (EObject)createJobLogEntry();
			case QOperatingSystemJobsPackage.LOG: return (EObject)createLog();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemJobsPackage.JOB_STATUS:
				return createJobStatusFromString(eDataType, initialValue);
			case QOperatingSystemJobsPackage.JOB_TYPE:
				return createJobTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemJobsPackage.JOB_STATUS:
				return convertJobStatusToString(eDataType, instanceValue);
			case QOperatingSystemJobsPackage.JOB_TYPE:
				return convertJobTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJob createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJobLog createJobLog() {
		JobLogImpl jobLog = new JobLogImpl();
		return jobLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJobLogEntry createJobLogEntry() {
		JobLogEntryImpl jobLogEntry = new JobLogEntryImpl();
		return jobLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLog createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobStatus createJobStatusFromString(EDataType eDataType, String initialValue) {
		JobStatus result = JobStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobType createJobTypeFromString(EDataType eDataType, String initialValue) {
		JobType result = JobType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemJobsPackage getOperatingSystemJobsPackage() {
		return (QOperatingSystemJobsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemJobsPackage getPackage() {
		return QOperatingSystemJobsPackage.eINSTANCE;
	}

} //OSCoreJobsFactoryImpl
