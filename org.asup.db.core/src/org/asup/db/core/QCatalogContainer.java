/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.sql.SQLException;

import org.asup.fw.core.QContext;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;





/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QCatalogContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.QCatalogContainer#isSupportsRelativeRecordNumber <em>Supports Relative Record Number</em>}</li>
 *   <li>{@link org.asup.db.core.QCatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}</li>
 *   <li>{@link org.asup.db.core.QCatalogContainer#getConnectionConfig <em>Connection Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer()
 * @model
 * @generated
 */
public interface QCatalogContainer {
	
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QCatalogContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static final String TEMPLATE_SUFFIX = "asup.driverTemplate";
	
	/**
	 * Returns the value of the '<em><b>Connection Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Config</em>' containment reference.
	 * @see #setConnectionConfig(QConnectionConfig)
	 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer_ConnectionConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QConnectionConfig getConnectionConfig();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QCatalogContainer#getConnectionConfig <em>Connection Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Config</em>' containment reference.
	 * @see #getConnectionConfig()
	 * @generated
	 */
	void setConnectionConfig(QConnectionConfig value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" factoryRequired="true"
	 * @generated
	 */
	<C> C createConnection(Class<C> factory) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" factoryRequired="true"
	 * @generated
	 */
	<C> C createConnection(Class<C> factory, String user, String password) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QCatalogMetaData getMetaData();

	/**
	 * Returns the value of the '<em><b>Supports Relative Record Number</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Relative Record Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Relative Record Number</em>' attribute.
	 * @see #setSupportsRelativeRecordNumber(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer_SupportsRelativeRecordNumber()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSupportsRelativeRecordNumber();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QCatalogContainer#isSupportsRelativeRecordNumber <em>Supports Relative Record Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Relative Record Number</em>' attribute.
	 * @see #isSupportsRelativeRecordNumber()
	 * @generated
	 */
	void setSupportsRelativeRecordNumber(boolean value);

	/**
	 * Returns the value of the '<em><b>Supports Guest Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Guest Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Guest Access</em>' attribute.
	 * @see #setSupportsGuestAccess(boolean)
	 * @see org.asup.db.core.QDatabaseCorePackage#getCatalogContainer_SupportsGuestAccess()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSupportsGuestAccess();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QCatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Guest Access</em>' attribute.
	 * @see #isSupportsGuestAccess()
	 * @generated
	 */
	void setSupportsGuestAccess(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QContext getCatalogContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" nameRequired="true"
	 * @generated
	 */
	Index loadIndex(Table table, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Schema loadSchema(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	Table loadTable(Schema schema, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	ViewTable loadView(Schema schema, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexRequired="true"
	 * @generated
	 */
	void removeIndex(Index index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model schemaRequired="true"
	 * @generated
	 */
	void removeSchema(Schema schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tableRequired="true"
	 * @generated
	 */
	void removeTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model viewRequired="true"
	 * @generated
	 */
	void removeView(ViewTable view);

} // QCatalogContainer
