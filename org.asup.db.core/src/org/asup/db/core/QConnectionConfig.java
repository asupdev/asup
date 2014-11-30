/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import org.asup.fw.core.QServiceConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QConnectionConfig#isAutoCommit <em>Auto Commit</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getDefaultCatalog <em>Default Catalog</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getDriverName <em>Driver Name</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getPassword <em>Password</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getUser <em>User</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig()
 * @model
 * @generated
 */
public interface QConnectionConfig extends QServiceConfig {
	/**
	 * Returns the value of the '<em><b>Auto Commit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Commit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Commit</em>' attribute.
	 * @see #setAutoCommit(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_AutoCommit()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAutoCommit();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#isAutoCommit <em>Auto Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Commit</em>' attribute.
	 * @see #isAutoCommit()
	 * @generated
	 */
	void setAutoCommit(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_Persistent()
	 * @model required="true"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Catalog</em>' attribute.
	 * @see #setDefaultCatalog(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_DefaultCatalog()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultCatalog();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getDefaultCatalog <em>Default Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Catalog</em>' attribute.
	 * @see #getDefaultCatalog()
	 * @generated
	 */
	void setDefaultCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Driver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Name</em>' attribute.
	 * @see #setDriverName(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_DriverName()
	 * @model required="true"
	 * @generated
	 */
	String getDriverName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getDriverName <em>Driver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Name</em>' attribute.
	 * @see #getDriverName()
	 * @generated
	 */
	void setDriverName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_Vendor()
	 * @model required="true"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // QConnectionConfig
