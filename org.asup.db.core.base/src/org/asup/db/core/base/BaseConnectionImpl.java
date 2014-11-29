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

import java.sql.Connection;
import java.sql.SQLException;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QDatabaseDefinition;
import org.asup.db.core.QPreparedStatement;
import org.asup.db.core.QStatement;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryWriter;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactoryProvider;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.core.SQMServices;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;

public class BaseConnectionImpl implements QConnection {

	private QConnectionContext connectionContext;
	private IConnection iConnection;
	private QConnectionConfig connectionConfig;
	private QQueryParser queryParser;
	private QQueryWriter queryConverter;
	
	private QDatabaseDefinition databaseDefinition;
	
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
	public QPreparedStatement prepareStatement(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPreparedStatement prepareStatement(String sql, boolean native_) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QStatement createStatement() throws SQLException {
		return createStatement(false);
	}

	@Override
	public QStatement createStatement(boolean native_) throws SQLException {
		
		Connection connection = getConnectionInfo().getSharedConnection();
		QStatement statement = null;
		if(native_)
			statement = new BaseNativeStatementImpl(connection.createStatement());			
		else
			statement = new BaseStatementImpl(connection.createStatement(), queryParser, queryConverter);

		return statement;
	}

	protected synchronized ConnectionInfo getConnectionInfo() {
		
		if(iConnection == null) {
			IConnectionProfile profile = getConnectionContext().getAdapter(getConnectionConfig(), IConnectionProfile.class);
			IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory(ConnectionInfo.class.getName());
			iConnection = connectionFactoryProvider.createConnection(profile);
		}
		
		return (ConnectionInfo) iConnection.getRawConnection();
	}

	@Override
	public void commit() throws SQLException {
		Connection connection = getConnectionInfo().getSharedConnection();
		connection.commit();
		connection.setAutoCommit(getConnectionConfig().isAutoCommit());
	}

	@Override
	public void rollback() throws SQLException {
		Connection connection = getConnectionInfo().getSharedConnection();
		connection.rollback();		
		connection.setAutoCommit(getConnectionConfig().isAutoCommit());
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		Connection connection = getConnectionInfo().getSharedConnection();
		connection.setAutoCommit(autoCommit);		
	}

	@Override
	public QConnectionContext getConnectionContext() {
		return connectionContext;
	}
	
	@Override
	public void close() throws SQLException {
		if(iConnection != null)
			iConnection.close();
		getConnectionContext().close();
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QDatabaseDefinition getDatabaseDefinition() {

		if(this.databaseDefinition == null) {
			DatabaseDefinition dtpDatabaseDefinition = SQMServices.getDatabaseDefinitionRegistry().getDefinition(getConnectionConfig().getVendor(), getConnectionConfig().getVersion());
			this.databaseDefinition = new BaseDatabaseDefinitionImpl(dtpDatabaseDefinition);
		}
		
		return this.databaseDefinition;
	}
}