/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.cdo.impl;

import org.asup.db.core.QConnectionCredentials;
import org.asup.fw.core.impl.ServiceConfigImpl;

import org.asup.os.core.cdo.CDOStoreConfig;
import org.asup.os.core.cdo.CDOSystemCorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDO Store Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.core.cdo.impl.CDOStoreConfigImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link org.asup.os.core.cdo.impl.CDOStoreConfigImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.asup.os.core.cdo.impl.CDOStoreConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.asup.os.core.cdo.impl.CDOStoreConfigImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDOStoreConfigImpl extends ServiceConfigImpl implements CDOStoreConfig {
	/**
	 * The default value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected String adapter = ADAPTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected QConnectionCredentials credentials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDOStoreConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOSystemCorePackage.Literals.CDO_STORE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdapter() {
		return adapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapter(String newAdapter) {
		String oldAdapter = adapter;
		adapter = newAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER, oldAdapter, adapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionCredentials getCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentials(QConnectionCredentials newCredentials, NotificationChain msgs) {
		QConnectionCredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, oldCredentials, newCredentials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentials(QConnectionCredentials newCredentials) {
		if (newCredentials != credentials) {
			NotificationChain msgs = null;
			if (credentials != null)
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				return basicSetCredentials(null, msgs);
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				return getAdapter();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				return getDriver();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				return getUrl();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				return getCredentials();
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				setAdapter((String)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				setDriver((String)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				setCredentials((QConnectionCredentials)newValue);
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				setAdapter(ADAPTER_EDEFAULT);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				setCredentials((QConnectionCredentials)null);
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				return ADAPTER_EDEFAULT == null ? adapter != null : !ADAPTER_EDEFAULT.equals(adapter);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				return credentials != null;
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
		result.append(" (adapter: ");
		result.append(adapter);
		result.append(", driver: ");
		result.append(driver);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //CDOStoreConfigImpl
