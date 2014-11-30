/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.util.List;

import org.asup.fw.core.QServiceConfig;

import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getDefaultConfig <em>Default Config</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer()
 * @model
 * @generated
 */
public interface QDatabaseContainer extends QServiceConfig {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_Database()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.datatools.modelbase.sql.schema.Catalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_Catalogs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<Catalog> getCatalogs();

	/**
	 * Returns the value of the '<em><b>Default Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Config</em>' containment reference.
	 * @see #setDefaultConfig(QConnectionConfig)
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_DefaultConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QConnectionConfig getDefaultConfig();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getDefaultConfig <em>Default Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Config</em>' containment reference.
	 * @see #getDefaultConfig()
	 * @generated
	 */
	void setDefaultConfig(QConnectionConfig value);

} // QDatabaseContainer
