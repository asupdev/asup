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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#isUseCatalog <em>Use Catalog</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#isUsePool <em>Use Pool</em>}</li>
 *   <li>{@link org.asup.db.core.impl.ConnectionConfigImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionConfigImpl extends ServiceConfigImpl implements QConnectionConfig {

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected String pluginName = PLUGIN_NAME_EDEFAULT;

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
	 * The default value of the '{@link #isUseCatalog() <em>Use Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CATALOG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseCatalog() <em>Use Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCatalog()
	 * @generated
	 * @ordered
	 */
	protected boolean useCatalog = USE_CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsePool() <em>Use Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePool()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_POOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsePool() <em>Use Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePool()
	 * @generated
	 * @ordered
	 */
	protected boolean usePool = USE_POOL_EDEFAULT;

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
	protected ConnectionConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginName(String newPluginName) {
		String oldPluginName = pluginName;
		pluginName = newPluginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__PLUGIN_NAME, oldPluginName, pluginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__DATABASE_NAME, oldDatabaseName, databaseName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER, oldDriver, driver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCatalog() {
		return useCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCatalog(boolean newUseCatalog) {
		boolean oldUseCatalog = useCatalog;
		useCatalog = newUseCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__USE_CATALOG, oldUseCatalog, useCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsePool() {
		return usePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsePool(boolean newUsePool) {
		boolean oldUsePool = usePool;
		usePool = newUsePool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__USE_POOL, oldUsePool, usePool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION_CONFIG__DATABASE_NAME:
				return getDatabaseName();
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER:
				return getDriver();
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				return getPassword();
			case QDatabaseCorePackage.CONNECTION_CONFIG__PLUGIN_NAME:
				return getPluginName();
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				return getUrl();
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_CATALOG:
				return isUseCatalog();
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_POOL:
				return isUsePool();
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
				return getUser();
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER:
				setDriver((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				setPassword((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PLUGIN_NAME:
				setPluginName((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_CATALOG:
				setUseCatalog((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_POOL:
				setUsePool((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PLUGIN_NAME:
				setPluginName(PLUGIN_NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_CATALOG:
				setUseCatalog(USE_CATALOG_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_POOL:
				setUsePool(USE_POOL_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case QDatabaseCorePackage.CONNECTION_CONFIG__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case QDatabaseCorePackage.CONNECTION_CONFIG__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case QDatabaseCorePackage.CONNECTION_CONFIG__PLUGIN_NAME:
				return PLUGIN_NAME_EDEFAULT == null ? pluginName != null : !PLUGIN_NAME_EDEFAULT.equals(pluginName);
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_CATALOG:
				return useCatalog != USE_CATALOG_EDEFAULT;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USE_POOL:
				return usePool != USE_POOL_EDEFAULT;
			case QDatabaseCorePackage.CONNECTION_CONFIG__USER:
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
		result.append(" (databaseName: ");
		result.append(databaseName);
		result.append(", driver: ");
		result.append(driver);
		result.append(", password: ");
		result.append(password);
		result.append(", pluginName: ");
		result.append(pluginName);
		result.append(", url: ");
		result.append(url);
		result.append(", useCatalog: ");
		result.append(useCatalog);
		result.append(", usePool: ");
		result.append(usePool);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //DatabaseConfigImpl
