package org.asup.db.core.base;

import java.sql.Connection;
import java.sql.SQLException;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QDatabaseCatalog;
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
			DatabaseDefinition dtpDatabaseDefinition = SQMServices.getDatabaseDefinitionRegistry().getDefinition(getConnectionConfig().getProduct(), getConnectionConfig().getVersion());
			this.databaseDefinition = new BaseDatabaseDefinitionImpl(dtpDatabaseDefinition);
		}
		
		return this.databaseDefinition;
	}

	@Override
	public QDatabaseCatalog getDefaultCatalog() {
		// TODO Auto-generated method stub
		return null;
	}
}