/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac.impl;

import java.util.Date;

import org.asup.os.omac.QCreationInfo;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QCreation Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.omac.impl.CreationInfoImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.asup.os.omac.impl.CreationInfoImpl#getCreationUser <em>Creation User</em>}</li>
 *   <li>{@link org.asup.os.omac.impl.CreationInfoImpl#getCreationSystem <em>Creation System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreationInfoImpl extends ObjectImpl implements QCreationInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationUser() <em>Creation User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationUser()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationUser() <em>Creation User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationUser()
	 * @generated
	 * @ordered
	 */
	protected String creationUser = CREATION_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationSystem() <em>Creation System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationSystem() <em>Creation System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationSystem()
	 * @generated
	 * @ordered
	 */
	protected String creationSystem = CREATION_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemOmacPackage.Literals.CREATION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemOmacPackage.CREATION_INFO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationUser() {
		return creationUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationUser(String newCreationUser) {
		String oldCreationUser = creationUser;
		creationUser = newCreationUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemOmacPackage.CREATION_INFO__CREATION_USER, oldCreationUser, creationUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationSystem() {
		return creationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationSystem(String newCreationSystem) {
		String oldCreationSystem = creationSystem;
		creationSystem = newCreationSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemOmacPackage.CREATION_INFO__CREATION_SYSTEM, oldCreationSystem, creationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_DATE:
				return getCreationDate();
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_USER:
				return getCreationUser();
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_SYSTEM:
				return getCreationSystem();
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
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_USER:
				setCreationUser((String)newValue);
				return;
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_SYSTEM:
				setCreationSystem((String)newValue);
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
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_USER:
				setCreationUser(CREATION_USER_EDEFAULT);
				return;
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_SYSTEM:
				setCreationSystem(CREATION_SYSTEM_EDEFAULT);
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
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_USER:
				return CREATION_USER_EDEFAULT == null ? creationUser != null : !CREATION_USER_EDEFAULT.equals(creationUser);
			case QOperatingSystemOmacPackage.CREATION_INFO__CREATION_SYSTEM:
				return CREATION_SYSTEM_EDEFAULT == null ? creationSystem != null : !CREATION_SYSTEM_EDEFAULT.equals(creationSystem);
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", creationUser: ");
		result.append(creationUser);
		result.append(", creationSystem: ");
		result.append(creationSystem);
		result.append(')');
		return result.toString();
	}

} //QCreationInfoImpl
