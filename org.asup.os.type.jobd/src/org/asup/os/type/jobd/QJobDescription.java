/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.jobd;

import java.util.List;

import org.asup.os.type.QTypedObject;
import org.asup.os.type.QTypedReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.jobd.QJobDescription#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.QJobDescription#getJobQueue <em>Job Queue</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.QJobDescription#getOutQueue <em>Out Queue</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.QJobDescription#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription()
 * @model
 * @generated
 */
public interface QJobDescription extends QTypedObject {
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
	 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_Libraries()
	 * @model
	 * @generated
	 */
	List<String> getLibraries();

	/**
	 * Returns the value of the '<em><b>Job Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Queue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Queue</em>' containment reference.
	 * @see #setJobQueue(QTypedReference)
	 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_JobQueue()
	 * @model containment="true"
	 * @generated
	 */
	QTypedReference<?> getJobQueue();

	/**
	 * Sets the value of the '{@link org.asup.os.type.jobd.QJobDescription#getJobQueue <em>Job Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Queue</em>' containment reference.
	 * @see #getJobQueue()
	 * @generated
	 */
	void setJobQueue(QTypedReference<?> value);

	/**
	 * Returns the value of the '<em><b>Out Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Queue</em>' containment reference.
	 * @see #setOutQueue(QTypedReference)
	 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_OutQueue()
	 * @model containment="true"
	 * @generated
	 */
	QTypedReference<?> getOutQueue();

	/**
	 * Sets the value of the '{@link org.asup.os.type.jobd.QJobDescription#getOutQueue <em>Out Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Queue</em>' containment reference.
	 * @see #getOutQueue()
	 * @generated
	 */
	void setOutQueue(QTypedReference<?> value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.asup.os.type.jobd.QJobDescription#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // QJobDescription
