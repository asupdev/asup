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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getCatalogContainers <em>Catalog Containers</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabaseContainer#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer()
 * @model
 * @generated
 */
public interface QDatabaseContainer extends QServiceConfig {
	/**
	 * Returns the value of the '<em><b>Catalog Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QCatalogContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Containers</em>' containment reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_CatalogContainers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<QCatalogContainer> getCatalogContainers();

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
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_Vendor()
	 * @model required="true"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Default Catalog Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Catalog Container</em>' reference.
	 * @see #setDefaultCatalogContainer(QCatalogContainer)
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseContainer_DefaultCatalogContainer()
	 * @model required="true"
	 * @generated
	 */
	QCatalogContainer getDefaultCatalogContainer();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Catalog Container</em>' reference.
	 * @see #getDefaultCatalogContainer()
	 * @generated
	 */
	void setDefaultCatalogContainer(QCatalogContainer value);

} // QDatabaseContainer
