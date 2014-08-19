/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.jobs;

import org.asup.os.omac.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.core.jobs.QJobLogEntry#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.asup.os.core.jobs.QJobLogEntry#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLogEntry()
 * @model
 * @generated
 */
public interface QJobLogEntry extends QObject {
	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute.
	 * @see #setGravity(int)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLogEntry_Gravity()
	 * @model required="true"
	 * @generated
	 */
	int getGravity();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJobLogEntry#getGravity <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' attribute.
	 * @see #getGravity()
	 * @generated
	 */
	void setGravity(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.asup.os.core.jobs.QOperatingSystemJobsPackage#getJobLogEntry_Message()
	 * @model required="true"
	 *        annotation="il-data length='100'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.asup.os.core.jobs.QJobLogEntry#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // QJobLogEntry
