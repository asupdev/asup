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

import org.asup.os.type.QTypedReference;
import org.asup.os.type.impl.TypedObjectImpl;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.asup.os.type.jobd.impl.JobDescriptionImpl#getJobQueue <em>Job Queue</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.impl.JobDescriptionImpl#getOutQueue <em>Out Queue</em>}</li>
 *   <li>{@link org.asup.os.type.jobd.impl.JobDescriptionImpl#getUser <em>User</em>}</li>
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
	 * The cached value of the '{@link #getJobQueue() <em>Job Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobQueue()
	 * @generated
	 * @ordered
	 */
	protected QTypedReference<?> jobQueue;

	/**
	 * The cached value of the '{@link #getOutQueue() <em>Out Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutQueue()
	 * @generated
	 * @ordered
	 */
	protected QTypedReference<?> outQueue;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

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
	public QTypedReference<?> getJobQueue() {
		return jobQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobQueue(QTypedReference<?> newJobQueue, NotificationChain msgs) {
		QTypedReference<?> oldJobQueue = jobQueue;
		jobQueue = newJobQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE, oldJobQueue, newJobQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobQueue(QTypedReference<?> newJobQueue) {
		if (newJobQueue != jobQueue) {
			NotificationChain msgs = null;
			if (jobQueue != null)
				msgs = ((InternalEObject)jobQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE, null, msgs);
			if (newJobQueue != null)
				msgs = ((InternalEObject)newJobQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE, null, msgs);
			msgs = basicSetJobQueue(newJobQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE, newJobQueue, newJobQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTypedReference<?> getOutQueue() {
		return outQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutQueue(QTypedReference<?> newOutQueue, NotificationChain msgs) {
		QTypedReference<?> oldOutQueue = outQueue;
		outQueue = newOutQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE, oldOutQueue, newOutQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutQueue(QTypedReference<?> newOutQueue) {
		if (newOutQueue != outQueue) {
			NotificationChain msgs = null;
			if (outQueue != null)
				msgs = ((InternalEObject)outQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE, null, msgs);
			if (newOutQueue != null)
				msgs = ((InternalEObject)newOutQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE, null, msgs);
			msgs = basicSetOutQueue(newOutQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE, newOutQueue, newOutQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE:
				return basicSetJobQueue(null, msgs);
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE:
				return basicSetOutQueue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE:
				return getJobQueue();
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE:
				return getOutQueue();
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__USER:
				return getUser();
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
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE:
				setJobQueue((QTypedReference<?>)newValue);
				return;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE:
				setOutQueue((QTypedReference<?>)newValue);
				return;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__USER:
				setUser((String)newValue);
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
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE:
				setJobQueue((QTypedReference<?>)null);
				return;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE:
				setOutQueue((QTypedReference<?>)null);
				return;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__USER:
				setUser(USER_EDEFAULT);
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
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__JOB_QUEUE:
				return jobQueue != null;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__OUT_QUEUE:
				return outQueue != null;
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //QJobDescriptionImpl
