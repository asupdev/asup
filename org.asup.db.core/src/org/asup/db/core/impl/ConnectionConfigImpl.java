/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.fw.core.impl.ServiceConfigImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Profile</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#isAutoCommit <em>Auto Commit</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getDefaultCatalog <em>Default Catalog</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getDriverName <em>Driver Name</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionConfigImpl extends ServiceConfigImpl implements QConnectionConfig {
	/**
	 * The default value of the '{@link #isAutoCommit() <em>Auto Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCommit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_COMMIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoCommit() <em>Auto Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCommit()
	 * @generated
	 * @ordered
	 */
	protected boolean autoCommit = AUTO_COMMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCatalog() <em>Default Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCatalog() <em>Default Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCatalog()
	 * @generated
	 * @ordered
	 */
	protected String defaultCatalog = DEFAULT_CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverName() <em>Driver Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDriverName()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriverName() <em>Driver Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDriverName()
	 * @generated
	 * @ordered
	 */
	protected String driverName = DRIVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.CONNECTION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoCommit() {
		return autoCommit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCommit(boolean newAutoCommit) {
		boolean oldAutoCommit = autoCommit;
		autoCommit = newAutoCommit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__AUTO_COMMIT, oldAutoCommit, autoCommit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCatalog() {
		return defaultCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCatalog(String newDefaultCatalog) {
		String oldDefaultCatalog = defaultCatalog;
		defaultCatalog = newDefaultCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__DEFAULT_CATALOG, oldDefaultCatalog, defaultCatalog));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverName(String newDriverName) {
		String oldDriverName = driverName;
		driverName = newDriverName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER_NAME, oldDriverName, driverName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION_CONFIG__AUTO_COMMIT:
				return isAutoCommit();
			case QDatabaseCorePackage.CONNECTION_CONFIG__DEFAULT_CATALOG:
				return getDefaultCatalog();
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER_NAME:
				return getDriverName();
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				return getPassword();
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				return getUrl();
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
				return getUser();
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				return getVendor();
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION_CONFIG__AUTO_COMMIT:
				setAutoCommit((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DEFAULT_CATALOG:
				setDefaultCatalog((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER_NAME:
				setDriverName((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				setPassword((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
				setUser((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				setVendor((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION_CONFIG__AUTO_COMMIT:
				setAutoCommit(AUTO_COMMIT_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DEFAULT_CATALOG:
				setDefaultCatalog(DEFAULT_CATALOG_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER_NAME:
				setDriverName(DRIVER_NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
				setUser(USER_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION_CONFIG__AUTO_COMMIT:
				return autoCommit != AUTO_COMMIT_EDEFAULT;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DEFAULT_CATALOG:
				return DEFAULT_CATALOG_EDEFAULT == null ? defaultCatalog != null : !DEFAULT_CATALOG_EDEFAULT.equals(defaultCatalog);
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER_NAME:
				return DRIVER_NAME_EDEFAULT == null ? driverName != null : !DRIVER_NAME_EDEFAULT.equals(driverName);
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (autoCommit: ");
		result.append(autoCommit);
		result.append(", defaultCatalog: ");
		result.append(defaultCatalog);
		result.append(", driverName: ");
		result.append(driverName);
		result.append(", password: ");
		result.append(password);
		result.append(", url: ");
		result.append(url);
		result.append(", user: ");
		result.append(user);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} // ConnectionConfigImpl
