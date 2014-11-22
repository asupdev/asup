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
import org.asup.os.core.QSystem;
import org.asup.os.omac.QCreationInfo;
import org.asup.os.omac.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobUser <em>Job User</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getSystem <em>System</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJob#getJobContext <em>Job Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob()
 * @model
 * @generated
 */
public interface QJob extends QObjectNameable, QContextID {
	/**
	 * Returns the value of the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job ID</em>' attribute.
	 * @see #setJobID(String)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getJobID();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobID <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job ID</em>' attribute.
	 * @see #getJobID()
	 * @generated
	 */
	void setJobID(String value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' attribute.
	 * @see #setJobName(String)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobName()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getJobName();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobName <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' attribute.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(String value);

	/**
	 * Returns the value of the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Number</em>' attribute.
	 * @see #setJobNumber(int)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobNumber()
	 * @model annotation="il-data precision='6'"
	 * @generated
	 */
	int getJobNumber();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobNumber <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Number</em>' attribute.
	 * @see #getJobNumber()
	 * @generated
	 */
	void setJobNumber(int value);

	/**
	 * Returns the value of the '<em><b>Job Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.os.core.jobs.JobStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Status</em>' attribute.
	 * @see org.asup.os.core.jobs.JobStatus
	 * @see #setJobStatus(JobStatus)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobStatus()
	 * @model required="true"
	 * @generated
	 */
	JobStatus getJobStatus();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobStatus <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Status</em>' attribute.
	 * @see org.asup.os.core.jobs.JobStatus
	 * @see #getJobStatus()
	 * @generated
	 */
	void setJobStatus(JobStatus value);

	/**
	 * Returns the value of the '<em><b>Job Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.os.core.jobs.JobType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Type</em>' attribute.
	 * @see org.asup.os.core.jobs.JobType
	 * @see #setJobType(JobType)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobType()
	 * @model
	 * @generated
	 */
	JobType getJobType();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobType <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Type</em>' attribute.
	 * @see org.asup.os.core.jobs.JobType
	 * @see #getJobType()
	 * @generated
	 */
	void setJobType(JobType value);

	/**
	 * Returns the value of the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job User</em>' attribute.
	 * @see #setJobUser(String)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobUser()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getJobUser();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobUser <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job User</em>' attribute.
	 * @see #getJobUser()
	 * @generated
	 */
	void setJobUser(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' attribute list.
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_Libraries()
	 * @model
	 * @generated
	 */
	List<String> getLibraries();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' attribute list.
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_Messages()
	 * @model
	 * @generated
	 */
	List<String> getMessages();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(QSystem)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_System()
	 * @model required="true" transient="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	QSystem getSystem();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(QSystem value);

	/**
	 * Returns the value of the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Info</em>' containment reference.
	 * @see #setCreationInfo(QCreationInfo)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_CreationInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QCreationInfo getCreationInfo();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getCreationInfo <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Info</em>' containment reference.
	 * @see #getCreationInfo()
	 * @generated
	 */
	void setCreationInfo(QCreationInfo value);

	/**
	 * Returns the value of the '<em><b>Job Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Context</em>' containment reference.
	 * @see #setJobContext(QJobContext)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobContext()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	QJobContext getJobContext();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJob#getJobContext <em>Job Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Context</em>' containment reference.
	 * @see #getJobContext()
	 * @generated
	 */
	void setJobContext(QJobContext value);

} // QJob
