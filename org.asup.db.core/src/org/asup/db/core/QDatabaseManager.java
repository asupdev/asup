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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Manager</b></em>'.
 * <!-- end-user-doc -->
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
	 * @model exceptions="org.asup.db.core.JDBCException" indexRequired="true"
	 * @generated
	 */
	void createIndex(QConnection connection, QIndex index) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException"
	 * @generated
	 */
	void createSchema(QConnection connection, QSchema schema, boolean deepCreation) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" tableRequired="true"
	 * @generated
	 */
	void createTable(QConnection connection, QTable table, boolean deepCreation) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException"
	 * @generated
	 */
	void createView(QConnection connection, QView view) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" schemaRequired="true"
	 * @generated
	 */
	void deleteData(QConnection connection, QSchema schema) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" tableRequired="true"
	 * @generated
	 */
	void deleteData(QConnection connection, QTable table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" indexRequired="true"
	 * @generated
	 */
	void dropIndex(QConnection connection, QIndex index) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" schemaRequired="true"
	 * @generated
	 */
	void dropSchema(QConnection connection, QSchema schema) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" tableRequired="true"
	 * @generated
	 */
	void dropTable(QConnection connection, QTable table) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.JDBCException" viewRequired="true"
	 * @generated
	 */
	void dropView(QConnection connection, QView view) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ritorna uno schema del database se presente fra gli schemi memorizzati da precedenti richieste, altrimenti tramite accesso ai metadati; lo schema caricato verra' poi memorizzato nella cache per soddisfare nuove richieste.
	 * <!-- end-model-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QSchema getSchema(QConnection connection, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true"
	 * @generated
	 */
	QTable getTable(QConnection connection, String schema, String table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true" indexRequired="true"
	 * @generated
	 */
	QIndex getIndex(QConnection connection, String schema, String table, String index);

} // DatabaseManager
