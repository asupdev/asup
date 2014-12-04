/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QServiceConfig;
import org.asup.fw.core.QServiceReference;
import org.asup.fw.core.ServiceStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.fw.core.impl.ServiceReferenceImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.asup.fw.core.impl.ServiceReferenceImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.asup.fw.core.impl.ServiceReferenceImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.asup.fw.core.impl.ServiceReferenceImpl#isRemoteExport <em>Remote Export</em>}</li>
 *   <li>{@link org.asup.fw.core.impl.ServiceReferenceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceReferenceImpl extends MinimalEObjectImpl.Container implements QServiceReference {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected QServiceConfig config;

	/**
	 * The default value of the '{@link #isRemoteExport() <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EXPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteExport() <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteExport()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteExport = REMOTE_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStatus STATUS_EDEFAULT = ServiceStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ServiceStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFrameworkCorePackage.Literals.SERVICE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(QServiceConfig newConfig, NotificationChain msgs) {
		QServiceConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(QServiceConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteExport() {
		return remoteExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteExport(boolean newRemoteExport) {
		boolean oldRemoteExport = remoteExport;
		remoteExport = newRemoteExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_REFERENCE__REMOTE_EXPORT, oldRemoteExport, remoteExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ServiceStatus newStatus) {
		ServiceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_REFERENCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG:
				return basicSetConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_REFERENCE__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceName(String newInterfaceName) {
		String oldInterfaceName = interfaceName;
		interfaceName = newInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_REFERENCE__INTERFACE_NAME, oldInterfaceName, interfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QFrameworkCorePackage.SERVICE_REFERENCE__CLASS_NAME:
				return getClassName();
			case QFrameworkCorePackage.SERVICE_REFERENCE__INTERFACE_NAME:
				return getInterfaceName();
			case QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG:
				return getConfig();
			case QFrameworkCorePackage.SERVICE_REFERENCE__REMOTE_EXPORT:
				return isRemoteExport();
			case QFrameworkCorePackage.SERVICE_REFERENCE__STATUS:
				return getStatus();
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
			case QFrameworkCorePackage.SERVICE_REFERENCE__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__INTERFACE_NAME:
				setInterfaceName((String)newValue);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG:
				setConfig((QServiceConfig)newValue);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__REMOTE_EXPORT:
				setRemoteExport((Boolean)newValue);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__STATUS:
				setStatus((ServiceStatus)newValue);
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
			case QFrameworkCorePackage.SERVICE_REFERENCE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG:
				setConfig((QServiceConfig)null);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__REMOTE_EXPORT:
				setRemoteExport(REMOTE_EXPORT_EDEFAULT);
				return;
			case QFrameworkCorePackage.SERVICE_REFERENCE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case QFrameworkCorePackage.SERVICE_REFERENCE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case QFrameworkCorePackage.SERVICE_REFERENCE__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
			case QFrameworkCorePackage.SERVICE_REFERENCE__CONFIG:
				return config != null;
			case QFrameworkCorePackage.SERVICE_REFERENCE__REMOTE_EXPORT:
				return remoteExport != REMOTE_EXPORT_EDEFAULT;
			case QFrameworkCorePackage.SERVICE_REFERENCE__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (className: ");
		result.append(className);
		result.append(", interfaceName: ");
		result.append(interfaceName);
		result.append(", remoteExport: ");
		result.append(remoteExport);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ServiceReferenceImpl
