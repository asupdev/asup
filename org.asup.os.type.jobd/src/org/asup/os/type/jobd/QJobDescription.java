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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QJob Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.jobd.QJobDescription#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.QJobDescription#getMessageQueue <em>Message Queue</em>}</li>
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
	 * Returns the value of the '<em><b>Message Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue</em>' attribute.
	 * @see #setMessageQueue(String)
	 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#getJobDescription_MessageQueue()
	 * @model
	 * @generated
	 */
	String getMessageQueue();

	/**
	 * Sets the value of the '{@link org.asup.os.type.jobd.QJobDescription#getMessageQueue <em>Message Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Queue</em>' attribute.
	 * @see #getMessageQueue()
	 * @generated
	 */
	void setMessageQueue(String value);

} // QJobDescription
