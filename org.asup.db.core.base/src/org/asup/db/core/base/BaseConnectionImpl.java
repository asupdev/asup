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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QCatalogMetaData;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.syntax.QQueryParser;
import org.asup.fw.core.FrameworkCoreUnexpectedConditionException;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class BaseConnectionImpl implements QConnection, Connection {

	private QConnectionContext connectionContext;
	private QDatabaseContainer databaseContainer;

	private QQueryParser queryParser;
	
	private String virtualCatalog;
	private BaseCatalogConnection currentCatalogConnection;
	private List<BaseCatalogConnection> catalogConnections;

	public BaseConnectionImpl(QDatabaseContainer databaseContainer, QConnectionContext connectionContext) {

		this.connectionContext = connectionContext;
		this.databaseContainer = databaseContainer;
		this.queryParser = connectionContext.get(QQueryParser.class);
		
		this.catalogConnections = new ArrayList<BaseCatalogConnection>();
	}

	public BasePreparedStatementImpl prepareStatement(String sql) throws SQLException {
		return prepareStatement(sql, false);
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql, boolean native_) throws SQLException {
		BasePreparedStatementImpl basePreparedStatement = new BasePreparedStatementImpl(this, getRawConnection().prepareStatement(sql));

		return basePreparedStatement;

	}

	@Override
	public BaseStatementImpl createStatement() throws SQLException {
		return createStatement(false);
	}

	@Override
	public BaseStatementImpl createStatement(boolean native_) throws SQLException {

		BaseCatalogConnection catalogConnection = getCatalogConnection();
		BaseStatementImpl statement = null;
		if (native_)
			statement = new BaseNativeStatementImpl(this, catalogConnection.getRawConnection().createStatement());
		else
			statement = new BaseStatementImpl(this, catalogConnection.getRawConnection().createStatement());
		
		return statement;
	}

	private BaseCatalogConnection getCatalogConnection() throws SQLException {

		if(currentCatalogConnection != null)
			return currentCatalogConnection;
				
		if(getCatalog() == null) {
			QCatalogContainer catalogContainer = this.databaseContainer.getDefaultCatalogContainer();
			
			currentCatalogConnection = new BaseCatalogConnection(catalogContainer);			
			catalogConnections.add(currentCatalogConnection);
		}
		else {
			for(QCatalogContainer catalogContainer: this.databaseContainer.getCatalogContainers()) {
				if(getCatalog().equals(catalogContainer.getName())) {
						
					currentCatalogConnection = new BaseCatalogConnection(catalogContainer);					
					catalogConnections.add(currentCatalogConnection);
					
					break;
				}
			}
		}
		
		return currentCatalogConnection;
	}
	
	private Connection getRawConnection() throws SQLException {
		return getCatalogConnection().getRawConnection();
	}

	@Override
	public void commit() throws SQLException {
		Connection connection = getRawConnection();
		connection.commit();
	}

	@Override
	public void rollback() throws SQLException {
		Connection connection = getRawConnection();
		connection.rollback();
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
		
		for(BaseCatalogConnection catalogConnection: catalogConnections) {
			catalogConnection.close();			
		}
		
		this.catalogConnections.clear();
		this.currentCatalogConnection = null;
		this.virtualCatalog = null;
		
		getConnectionContext().close();
	}

	@Override
	public QCatalogMetaData getCatalogMetaData() {
		try {
			return getCatalogConnection().getCatalogMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void setCatalog(String catalog) throws SQLException {

		if(catalog != null && catalog.equals(virtualCatalog))
			return;
		
		virtualCatalog = catalog;
		currentCatalogConnection = null;
	
		getRawConnection();
		
	}

	@Override
	public String getCatalog() throws SQLException {
		return virtualCatalog;
	}

	@Override
	public boolean isClosed() throws SQLException {

		try {
			if (getRawConnection() == null)
				return true;
		} catch (FrameworkCoreUnexpectedConditionException e) {
			return true;
		}

		return false;
	}
	
	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		try {
			getRawConnection().setClientInfo(properties);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		try {
			getRawConnection().setClientInfo(name, value);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getID() {
		return connectionContext.getID().getID();
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
		return getRawConnection().getMetaData();
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

	@Override
	public String translate(String sql) throws SQLException {

		try {
			SQLQueryParseResult query = queryParser.parseQuery(sql);
			BaseCatalogConnection connection = getCatalogConnection();
			
			sql = connection.getQueryWriter().writeQuery(query.getQueryStatement());
		} catch (Exception e) {
			throw new SQLException(e);
		}

		return sql;
	}
}