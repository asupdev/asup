/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.core.base;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QDatabaseDefinition;
import org.asup.db.core.QPreparedStatement;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryWriter;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactoryProvider;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.core.SQMServices;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;

public class BaseConnectionImpl implements QConnection, Connection {

	private QConnectionContext	connectionContext;
	private Connection			rawConnection;
	private QConnectionConfig	connectionConfig;
	private QQueryParser		queryParser;
	private QQueryWriter		queryConverter;

	private QDatabaseDefinition	databaseDefinition;

	public BaseConnectionImpl(QConnectionContext connectionContext, QConnectionConfig connectionConfig, QQueryParser queryParser, QQueryWriter queryConverter) {
		this.connectionContext = connectionContext;
		this.connectionConfig = connectionConfig;
		this.queryParser = queryParser;
		this.queryConverter = queryConverter;
	}

	@Override
	public QConnectionConfig getConnectionConfig() {
		return connectionConfig;
	}

	@Override
	public QPreparedStatement prepareStatement(String sql, boolean native_) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseStatementImpl createStatement() throws SQLException {
		return createStatement(false);
	}

	@Override
	public BaseStatementImpl createStatement(boolean native_) throws SQLException {

		Connection connection = getRawConnection();
		BaseStatementImpl statement = null;
		if (native_)
			statement = new BaseNativeStatementImpl(connection.createStatement());
		else
			statement = new BaseStatementImpl(connection.createStatement(), queryParser, queryConverter);

		return statement;
	}

	public BasePreparedStatementImpl prepareStatement(String sql) throws SQLException {

		BasePreparedStatementImpl basePreparedStatement = new BasePreparedStatementImpl(rawConnection.prepareStatement(sql));
		
		return basePreparedStatement;
	}

	protected synchronized Connection getRawConnection() {

		if (rawConnection == null) {
			IConnectionProfile profile = getConnectionContext().getAdapter(getConnectionConfig(), IConnectionProfile.class);
			IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory(Connection.class.getName());
			IConnection iConnection = connectionFactoryProvider.createConnection(profile);
			this.rawConnection = (Connection) iConnection.getRawConnection();
		}

		return rawConnection;
	}

	@Override
	public void commit() throws SQLException {
		Connection connection = getRawConnection();
		connection.commit();
		connection.setAutoCommit(getConnectionConfig().isAutoCommit());
	}

	@Override
	public void rollback() throws SQLException {
		Connection connection = getRawConnection();
		connection.rollback();
		connection.setAutoCommit(getConnectionConfig().isAutoCommit());
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		Connection connection = getRawConnection();
		connection.setAutoCommit(autoCommit);
	}

	@Override
	public QConnectionContext getConnectionContext() {
		return connectionContext;
	}

	@Override
	public void close() throws SQLException {
		getConnectionContext().close();

		if (this.rawConnection != null)
			this.rawConnection.close();
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QDatabaseDefinition getDatabaseDefinition() {

		if (this.databaseDefinition == null) {
			DatabaseDefinition dtpDatabaseDefinition = SQMServices.getDatabaseDefinitionRegistry().getDefinition(getConnectionConfig().getVendor(), getConnectionConfig().getVersion());
			this.databaseDefinition = new BaseDatabaseDefinitionImpl(dtpDatabaseDefinition);
		}

		return this.databaseDefinition;
	}

	@Override
	public String getCurrentCatalog() {
		return "LOCAL";
	}

	public void abort(Executor executor) throws SQLException {
		getRawConnection().abort(executor);
	}

	public void clearWarnings() throws SQLException {
		getRawConnection().clearWarnings();
	}

	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		return getRawConnection().createArrayOf(typeName, elements);
	}

	public Blob createBlob() throws SQLException {
		return getRawConnection().createBlob();
	}

	public Clob createClob() throws SQLException {
		return getRawConnection().createClob();
	}

	public NClob createNClob() throws SQLException {
		return getRawConnection().createNClob();
	}

	public SQLXML createSQLXML() throws SQLException {
		return getRawConnection().createSQLXML();
	}

	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return getRawConnection().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		return getRawConnection().createStatement(resultSetType, resultSetConcurrency);
	}

	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		return getRawConnection().createStruct(typeName, attributes);
	}

	public boolean getAutoCommit() throws SQLException {
		return getRawConnection().getAutoCommit();
	}

	public String getCatalog() throws SQLException {
		return getRawConnection().getCatalog();
	}

	public Properties getClientInfo() throws SQLException {
		return getRawConnection().getClientInfo();
	}

	public String getClientInfo(String name) throws SQLException {
		return getRawConnection().getClientInfo(name);
	}

	public int getHoldability() throws SQLException {
		return getRawConnection().getHoldability();
	}

	public DatabaseMetaData getMetaData() throws SQLException {
		return null;
	}

	public int getNetworkTimeout() throws SQLException {
		return getRawConnection().getNetworkTimeout();
	}

	public String getSchema() throws SQLException {
		return getRawConnection().getSchema();
	}

	public int getTransactionIsolation() throws SQLException {
		return getRawConnection().getTransactionIsolation();
	}

	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return getRawConnection().getTypeMap();
	}

	public SQLWarning getWarnings() throws SQLException {
		return getRawConnection().getWarnings();
	}

	public boolean isClosed() throws SQLException {
		
		// TODO
		return false;
	}

	public boolean isReadOnly() throws SQLException {
		return getRawConnection().isReadOnly();
	}

	public boolean isValid(int timeout) throws SQLException {
		return getRawConnection().isValid(timeout);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return getRawConnection().isWrapperFor(iface);
	}

	public String nativeSQL(String sql) throws SQLException {
		return getRawConnection().nativeSQL(sql);
	}

	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return getRawConnection().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return getRawConnection().prepareCall(sql, resultSetType, resultSetConcurrency);
	}

	public CallableStatement prepareCall(String sql) throws SQLException {
		return getRawConnection().prepareCall(sql);
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return getRawConnection().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return getRawConnection().prepareStatement(sql, resultSetType, resultSetConcurrency);
	}

	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		return getRawConnection().prepareStatement(sql, autoGeneratedKeys);
	}

	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		return getRawConnection().prepareStatement(sql, columnIndexes);
	}

	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		return getRawConnection().prepareStatement(sql, columnNames);
	}

	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		getRawConnection().releaseSavepoint(savepoint);
	}

	public void rollback(Savepoint savepoint) throws SQLException {
		getRawConnection().rollback(savepoint);
	}

	public void setCatalog(String catalog) throws SQLException {
		getRawConnection().setCatalog(catalog);
	}

	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		getRawConnection().setClientInfo(properties);
	}

	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		getRawConnection().setClientInfo(name, value);
	}

	public void setHoldability(int holdability) throws SQLException {
		getRawConnection().setHoldability(holdability);
	}

	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		getRawConnection().setNetworkTimeout(executor, milliseconds);
	}

	public void setReadOnly(boolean readOnly) throws SQLException {
		getRawConnection().setReadOnly(readOnly);
	}

	public Savepoint setSavepoint() throws SQLException {
		return getRawConnection().setSavepoint();
	}

	public Savepoint setSavepoint(String name) throws SQLException {
		return getRawConnection().setSavepoint(name);
	}

	public void setSchema(String schema) throws SQLException {
		getRawConnection().setSchema(schema);
	}

	public void setTransactionIsolation(int level) throws SQLException {
		getRawConnection().setTransactionIsolation(level);
	}

	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		getRawConnection().setTypeMap(map);
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return getRawConnection().unwrap(iface);
	}
}