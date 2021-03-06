/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.usrprf.impl;

import org.asup.os.type.usrprf.QOperatingSystemUserProfilePackage;
import org.asup.os.type.usrprf.QUserProfile;
import org.asup.os.type.impl.TypedObjectImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QUser Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.usrprf.impl.UserProfileImpl#getJobDescription <em>Job Description</em>}</li>
 *   <li>{@link org.asup.os.type.usrprf.impl.UserProfileImpl#getInitialProgram <em>Initial Program</em>}</li>
 *   <li>{@link org.asup.os.type.usrprf.impl.UserProfileImpl#getMessageQueue <em>Message Queue</em>}</li>
 *   <li>{@link org.asup.os.type.usrprf.impl.UserProfileImpl#getOutQueue <em>Out Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserProfileImpl extends TypedObjectImpl implements QUserProfile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getJobDescription() <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobDescription() <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDescription()
	 * @generated
	 * @ordered
	 */
	protected String jobDescription = JOB_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialProgram() <em>Initial Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialProgram()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_PROGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialProgram() <em>Initial Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialProgram()
	 * @generated
	 * @ordered
	 */
	protected String initialProgram = INITIAL_PROGRAM_EDEFAULT;

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
	 * The default value of the '{@link #getOutQueue() <em>Out Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutQueue() <em>Out Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutQueue()
	 * @generated
	 * @ordered
	 */
	protected String outQueue = OUT_QUEUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemUserProfilePackage.Literals.USER_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobDescription(String newJobDescription) {
		String oldJobDescription = jobDescription;
		jobDescription = newJobDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserProfilePackage.USER_PROFILE__JOB_DESCRIPTION, oldJobDescription, jobDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialProgram() {
		return initialProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialProgram(String newInitialProgram) {
		String oldInitialProgram = initialProgram;
		initialProgram = newInitialProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserProfilePackage.USER_PROFILE__INITIAL_PROGRAM, oldInitialProgram, initialProgram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserProfilePackage.USER_PROFILE__MESSAGE_QUEUE, oldMessageQueue, messageQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutQueue() {
		return outQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutQueue(String newOutQueue) {
		String oldOutQueue = outQueue;
		outQueue = newOutQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemUserProfilePackage.USER_PROFILE__OUT_QUEUE, oldOutQueue, outQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemUserProfilePackage.USER_PROFILE__JOB_DESCRIPTION:
				return getJobDescription();
			case QOperatingSystemUserProfilePackage.USER_PROFILE__INITIAL_PROGRAM:
				return getInitialProgram();
			case QOperatingSystemUserProfilePackage.USER_PROFILE__MESSAGE_QUEUE:
				return getMessageQueue();
			case QOperatingSystemUserProfilePackage.USER_PROFILE__OUT_QUEUE:
				return getOutQueue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemUserProfilePackage.USER_PROFILE__JOB_DESCRIPTION:
				setJobDescription((String)newValue);
				return;
			case QOperatingSystemUserProfilePackage.USER_PROFILE__INITIAL_PROGRAM:
				setInitialProgram((String)newValue);
				return;
			case QOperatingSystemUserProfilePackage.USER_PROFILE__MESSAGE_QUEUE:
				setMessageQueue((String)newValue);
				return;
			case QOperatingSystemUserProfilePackage.USER_PROFILE__OUT_QUEUE:
				setOutQueue((String)newValue);
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
			case QOperatingSystemUserProfilePackage.USER_PROFILE__JOB_DESCRIPTION:
				setJobDescription(JOB_DESCRIPTION_EDEFAULT);
				return;
			case QOperatingSystemUserProfilePackage.USER_PROFILE__INITIAL_PROGRAM:
				setInitialProgram(INITIAL_PROGRAM_EDEFAULT);
				return;
			case QOperatingSystemUserProfilePackage.USER_PROFILE__MESSAGE_QUEUE:
				setMessageQueue(MESSAGE_QUEUE_EDEFAULT);
				return;
			case QOperatingSystemUserProfilePackage.USER_PROFILE__OUT_QUEUE:
				setOutQueue(OUT_QUEUE_EDEFAULT);
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
			case QOperatingSystemUserProfilePackage.USER_PROFILE__JOB_DESCRIPTION:
				return JOB_DESCRIPTION_EDEFAULT == null ? jobDescription != null : !JOB_DESCRIPTION_EDEFAULT.equals(jobDescription);
			case QOperatingSystemUserProfilePackage.USER_PROFILE__INITIAL_PROGRAM:
				return INITIAL_PROGRAM_EDEFAULT == null ? initialProgram != null : !INITIAL_PROGRAM_EDEFAULT.equals(initialProgram);
			case QOperatingSystemUserProfilePackage.USER_PROFILE__MESSAGE_QUEUE:
				return MESSAGE_QUEUE_EDEFAULT == null ? messageQueue != null : !MESSAGE_QUEUE_EDEFAULT.equals(messageQueue);
			case QOperatingSystemUserProfilePackage.USER_PROFILE__OUT_QUEUE:
				return OUT_QUEUE_EDEFAULT == null ? outQueue != null : !OUT_QUEUE_EDEFAULT.equals(outQueue);
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
		result.append(" (jobDescription: ");
		result.append(jobDescription);
		result.append(", initialProgram: ");
		result.append(initialProgram);
		result.append(", messageQueue: ");
		result.append(messageQueue);
		result.append(", outQueue: ");
		result.append(outQueue);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}
} //QUserProfileImpl
