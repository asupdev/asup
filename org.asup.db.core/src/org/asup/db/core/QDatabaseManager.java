/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.sql.SQLException;
import org.asup.fw.core.QService;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getDatabaseManager()
 * @model abstract="true"
 * @generated
 */
public interface QDatabaseManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" tableRequired="true" nameRequired="true" indexRequired="true"
	 * @generated
	 */
	void createIndex(QConnection connection, Table table, String name, QIndexDef index) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" nameRequired="true"
	 * @generated
	 */
	void createSchema(QConnection connection, String name, QSchemaDef schema) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	void createTable(QConnection connection, Schema schema, String name, QTableDef table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	void createView(QConnection connection, Schema schema, String name, QViewDef view) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" schemaRequired="true"
	 * @generated
	 */
	void deleteData(QConnection connection, Schema schema) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" tableRequired="true"
	 * @generated
	 */
	void deleteData(QConnection connection, Table table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" indexRequired="true"
	 * @generated
	 */
	void dropIndex(QConnection connection, Index index) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" schemaRequired="true"
	 * @generated
	 */
	void dropSchema(QConnection connection, Schema schema) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" tableRequired="true"
	 * @generated
	 */
	void dropTable(QConnection connection, Table table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" viewRequired="true"
	 * @generated
	 */
	void dropView(QConnection connection, ViewTable view) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model schemaRequired="true" indexRequired="true"
	 * @generated
	 */
	Index getIndex(QConnection connection, String schema, String index);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Ritorna uno schema del database se presente fra gli schemi memorizzati da
	 * precedenti richieste, altrimenti tramite accesso ai metadati; lo schema
	 * caricato verra' poi memorizzato nella cache per soddisfare nuove
	 * richieste. <!-- end-model-doc -->
	 * 
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Schema getSchema(QConnection connection, String schema);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true"
	 * @generated
	 */
	Table getTable(QConnection connection, String schema, String table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true"
	 * @generated
	 */
	ViewTable getView(QConnection connection, String schema, String table);

} // DatabaseManager
