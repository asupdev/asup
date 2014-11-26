package org.asup.db.core.base;

import java.sql.*;

import org.asup.db.core.*;
import org.asup.db.syntax.*;
import org.eclipse.datatools.connectivity.*;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;

public class BaseConnectionImpl implements QConnection {

	private QConnectionContext connectionContext;
	private IConnection iConnection;
	private QConnectionConfig connectionConfig;
	private QQueryParser queryParser;
	private QQueryWriter queryConverter;

	
	public BaseConnectionImpl(QConnectionContext connectionContext, QConnectionConfig connectionConfig, QQueryParser queryParser, QQueryWriter queryConverter) {
		this.connectionContext = connectionContext;
		this.connectionConfig = connectionConfig;
		this.queryParser = queryParser;
		this.queryConverter = queryConverter;
	}
	
	@Override
	public DatabaseDefinition getDatabaseDefinition() {
		return getConnectionContext().getAdapter(this, ConnectionInfo.class).getDatabaseDefinition();
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
		
		Connection connection = getConnectionContext().getAdapter(this, Connection.class);
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
		Connection connection = getConnectionContext().getAdapter(this, Connection.class);
		connection.commit();
		connection.setAutoCommit(getConnectionConfig().isAutoCommit());
	}

	@Override
	public void rollback() throws SQLException {
		Connection connection = getConnectionContext().getAdapter(this, Connection.class);
		connection.rollback();		
		connection.setAutoCommit(getConnectionConfig().isAutoCommit());
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		Connection connection = getConnectionContext().getAdapter(this, Connection.class);
		connection.setAutoCommit(autoCommit);		
	}

	@Override
	public String getID() {
		return getConnectionConfig().getDatabaseDefinitionID();
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
}