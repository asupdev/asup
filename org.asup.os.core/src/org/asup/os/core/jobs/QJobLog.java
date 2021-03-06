/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs;

import java.util.List;

import org.asup.os.omac.QObjectNameable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.core.jobs.QJobLog#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJobLog#getJobID <em>Job ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLog()
 * @model
 * @generated
 */
public interface QJobLog extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.os.core.jobs.QJobLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLog_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<QJobLogEntry> getEntries();

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
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLog_JobID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getJobID();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJobLog#getJobID <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job ID</em>' attribute.
	 * @see #getJobID()
	 * @generated
	 */
	void setJobID(String value);

} // QJobLog
