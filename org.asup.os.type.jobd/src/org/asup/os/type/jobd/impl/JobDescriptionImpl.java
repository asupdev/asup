/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.jobd.impl;

import java.util.Collection;
import java.util.List;

import org.asup.os.type.impl.TypedObjectImpl;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QJob Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.jobd.impl.JobDescriptionImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.impl.JobDescriptionImpl#getMessageQueue <em>Message Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobDescriptionImpl extends TypedObjectImpl implements QJobDescription {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<String> libraries;

	/**
	 * The default value of the '{@link #getMessageQueue() <em>Message Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageQueue() <em>Message Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueue()
	 * @generated
	 * @ordered
	 */
	protected String messageQueue = MESSAGE_QUEUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemJobDescriptionPackage.Literals.JOB_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getLibraries() {
		if (libraries == null) {
			libraries = new EDataTypeUniqueEList<String>(String.class, this, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageQueue() {
		return messageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageQueue(String newMessageQueue) {
		String oldMessageQueue = messageQueue;
		messageQueue = newMessageQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__MESSAGE_QUEUE, oldMessageQueue, messageQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__LIBRARIES:
				return getLibraries();
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__MESSAGE_QUEUE:
				return getMessageQueue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends String>)newValue);
				return;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__MESSAGE_QUEUE:
				setMessageQueue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__LIBRARIES:
				getLibraries().clear();
				return;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__MESSAGE_QUEUE:
				setMessageQueue(MESSAGE_QUEUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__MESSAGE_QUEUE:
				return MESSAGE_QUEUE_EDEFAULT == null ? messageQueue != null : !MESSAGE_QUEUE_EDEFAULT.equals(messageQueue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (libraries: ");
		result.append(libraries);
		result.append(", messageQueue: ");
		result.append(messageQueue);
		result.append(')');
		return result.toString();
	}

} //QJobDescriptionImpl
