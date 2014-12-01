/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import org.asup.fw.core.QServiceConfig;

import org.eclipse.datatools.modelbase.sql.schema.Catalog;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QCatalogContainer#getDefaultConfig <em>Default Config</em>}</li>
 *   <li>{@link org.asup.db.core.QCatalogContainer#getCatalog <em>Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer()
 * @model
 * @generated
 */
public interface QCatalogContainer extends QServiceConfig {
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
	 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer_DefaultConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QConnectionConfig getDefaultConfig();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QCatalogContainer#getDefaultConfig <em>Default Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Config</em>' containment reference.
	 * @see #getDefaultConfig()
	 * @generated
	 */
	void setDefaultConfig(QConnectionConfig value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(Catalog)
	 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer_Catalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Catalog getCatalog();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QCatalogContainer#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog value);

} // QCatalogContainer
