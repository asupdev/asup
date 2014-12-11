/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.sql.SQLException;
import org.asup.fw.core.QContextID;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database Connection</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QConnection extends QContextID {

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
	QPreparedStatement prepareStatement(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.db.core.DatabaseException" sqlRequired="true" nativeRequired="true"
	 * @generated
	 */
	QPreparedStatement prepareStatement(String sql, boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException"
	 * @generated
	 */
	void setCatalog(String catalog) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	String translate(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.db.core.DatabaseException"
	 * @generated
	 */
	QStatement createStatement() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.db.core.DatabaseException" nativeRequired="true"
	 * @generated
	 */
	QStatement createStatement(boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	QConnectionContext getConnectionContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.asup.db.core.DatabaseException"
	 * @generated
	 */
	String getCatalog() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QCatalogMetaData getCatalogMetaData();

} // DatabaseConnection
