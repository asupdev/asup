/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf.impl;

import org.asup.co.osgi.ecf.QECFClientContainerConfig;
import org.asup.co.osgi.ecf.QECFConnectorOSGIPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECF Client Container Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.co.osgi.ecf.impl.ECFClientContainerConfigImpl#getClientContainerType <em>Client Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECFClientContainerConfigImpl extends ECFContainerConfigImpl implements QECFClientContainerConfig {

	/**
	 * The default value of the '{@link #getClientContainerType() <em>Client Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientContainerType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CONTAINER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientContainerType() <em>Client Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientContainerType()
	 * @generated
	 * @ordered
	 */
	protected String clientContainerType = CLIENT_CONTAINER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECFClientContainerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QECFConnectorOSGIPackage.Literals.ECF_CLIENT_CONTAINER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientContainerType() {
		return clientContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientContainerType(String newClientContainerType) {
		String oldClientContainerType = clientContainerType;
		clientContainerType = newClientContainerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QECFConnectorOSGIPackage.ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE, oldClientContainerType, clientContainerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QECFConnectorOSGIPackage.ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE:
				return getClientContainerType();
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
			case QECFConnectorOSGIPackage.ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE:
				setClientContainerType((String)newValue);
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
			case QECFConnectorOSGIPackage.ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE:
				setClientContainerType(CLIENT_CONTAINER_TYPE_EDEFAULT);
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
			case QECFConnectorOSGIPackage.ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE:
				return CLIENT_CONTAINER_TYPE_EDEFAULT == null ? clientContainerType != null : !CLIENT_CONTAINER_TYPE_EDEFAULT.equals(clientContainerType);
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
		result.append(" (clientContainerType: ");
		result.append(clientContainerType);
		result.append(')');
		return result.toString();
	}

} //ECFClientContainerConfigImpl
