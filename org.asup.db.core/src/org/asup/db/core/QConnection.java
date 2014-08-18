/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QConnection#getConnectionConfig <em>Connection Config</em>}</li>
 *   <li>{@link org.asup.db.core.QConnection#getCurrentSchema <em>Current Schema</em>}</li>
 *   <li>{@link org.asup.db.core.QConnection#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.QConnection#getConnectionFactory <em>Connection Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnection()
 * @model
 * @generated
 */
public interface QConnection {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(QDatabase)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnection_Database()
	 * @model required="true"
	 * @generated
	 */
	QDatabase getDatabase();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnection#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(QDatabase value);

	/**
	 * Returns the value of the '<em><b>Connection Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Factory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Factory</em>' reference.
	 * @see #setConnectionFactory(QConnectionFactory)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnection_ConnectionFactory()
	 * @model required="true"
	 * @generated
	 */
	QConnectionFactory getConnectionFactory();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnection#getConnectionFactory <em>Connection Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Factory</em>' reference.
	 * @see #getConnectionFactory()
	 * @generated
	 */
	void setConnectionFactory(QConnectionFactory value);

	/**
	 * Returns the value of the '<em><b>Current Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Schema</em>' reference.
	 * @see #setCurrentSchema(QSchema)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnection_CurrentSchema()
	 * @model
	 * @generated
	 */
	QSchema getCurrentSchema();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnection#getCurrentSchema <em>Current Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Schema</em>' reference.
	 * @see #getCurrentSchema()
	 * @generated
	 */
	void setCurrentSchema(QSchema value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.asup.db.core.JDBCConnection" required="true" exceptions="org.asup.db.core.JDBCException"
	 * @generated
	 */
	Connection getConnection() throws SQLException;

	/**
	 * Returns the value of the '<em><b>Connection Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Config</em>' reference.
	 * @see #setConnectionConfig(QConnectionConfig)
	 * @see org.asup.db.core.QDatabaseCorePackage#getConnection_ConnectionConfig()
	 * @model required="true"
	 * @generated
	 */
	QConnectionConfig getConnectionConfig();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QConnection#getConnectionConfig <em>Connection Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Config</em>' reference.
	 * @see #getConnectionConfig()
	 * @generated
	 */
	void setConnectionConfig(QConnectionConfig value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.core.JDBCStatement" required="true" exceptions="org.asup.db.core.JDBCException"
	 * @generated
	 */
	Statement createStatement() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.core.JDBCStatement" required="true" exceptions="org.asup.db.core.JDBCException"
	 * @generated
	 */
	Statement createStatement(boolean update) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.core.PreparedStatement" required="true" exceptions="org.asup.db.core.JDBCException" sqlCommandRequired="true"
	 * @generated
	 */
	PreparedStatement prepareStatement(String sqlCommand) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean close();

} // DatabaseConnection
