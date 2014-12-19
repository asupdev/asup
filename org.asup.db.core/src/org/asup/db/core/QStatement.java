/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getStatement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException"
	 * @generated
	 */
	void close() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	boolean execute(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.core.DatabaseResultSet" required="true" exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	ResultSet executeQuery(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	int executeUpdate(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	void addBatch(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException"
	 * @generated
	 */
	void clearBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.core.StatementBatchResult" required="true" exceptions="org.asup.db.core.DatabaseException"
	 * @generated
	 */
	int[] executeBatch() throws SQLException;

} // QStatement
