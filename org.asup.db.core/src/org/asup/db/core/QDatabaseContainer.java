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
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getConnectionProfile <em>Connection Profile</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getDefaultCatalog <em>Default Catalog</em>}</li>
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
	 * The list contents are of type {@link org.asup.db.core.QCatalogContainer}.
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
	List<QCatalogContainer> getCatalogs();

	/**
	 * Returns the value of the '<em><b>Default Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Catalog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Catalog</em>' reference.
	 * @see #setDefaultCatalog(Catalog)
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_DefaultCatalog()
	 * @model required="true"
	 * @generated
	 */
	Catalog getDefaultCatalog();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getDefaultCatalog <em>Default Catalog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Catalog</em>' reference.
	 * @see #getDefaultCatalog()
	 * @generated
	 */
	void setDefaultCatalog(Catalog value);

	/**
	 * Returns the value of the '<em><b>Connection Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Profile</em>' containment reference.
	 * @see #setConnectionProfile(QConnectionProfile)
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_ConnectionProfile()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	QConnectionProfile getConnectionProfile();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getConnectionProfile <em>Connection Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Profile</em>' containment reference.
	 * @see #getConnectionProfile()
	 * @generated
	 */
	void setConnectionProfile(QConnectionProfile value);

} // QDatabaseContainer
