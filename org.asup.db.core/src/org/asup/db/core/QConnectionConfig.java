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
 * A representation of the model object '<em><b>Database Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getPassword <em>Password</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#isUseCatalog <em>Use Catalog</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#isUsePool <em>Use Pool</em>}</li>
 *   <li>{@link org.asup.db.core.QConnectionConfig#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig()
 * @model
 * @generated
 */
public interface QConnectionConfig extends QServiceConfig {
	/**
	 * Returns the value of the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Name</em>' attribute.
	 * @see #setPluginName(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_PluginName()
	 * @model required="true"
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getPluginName <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Name</em>' attribute.
	 * @see #getPluginName()
	 * @generated
	 */
	void setPluginName(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_DatabaseName()
	 * @model required="true"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_Driver()
	 * @model
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

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
	 * @model
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Use Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Catalog</em>' attribute.
	 * @see #setUseCatalog(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_UseCatalog()
	 * @model
	 * @generated
	 */
	boolean isUseCatalog();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#isUseCatalog <em>Use Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Catalog</em>' attribute.
	 * @see #isUseCatalog()
	 * @generated
	 */
	void setUseCatalog(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Pool</em>' attribute.
	 * @see #setUsePool(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionConfig_UsePool()
	 * @model
	 * @generated
	 */
	boolean isUsePool();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnectionConfig#isUsePool <em>Use Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Pool</em>' attribute.
	 * @see #isUsePool()
	 * @generated
	 */
	void setUsePool(boolean value);

} // DatabaseConfig
