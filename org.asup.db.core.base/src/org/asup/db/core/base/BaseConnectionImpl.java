package org.asup.db.core.base;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QPreparedStatement;
import org.asup.db.core.QStatement;
import org.asup.db.syntax.QQueryConverter;
import org.asup.db.syntax.QQueryParser;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactoryProvider;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;

public class BaseConnectionImpl implements QConnection {

	private QConnectionContext connectionContext;
	private IConnection iConnection;
	private QConnectionConfig connectionConfig;
	private QQueryParser queryParser;
	private QQueryConverter queryConverter;

	
	public BaseConnectionImpl(QConnectionContext connectionContext, QConnectionConfig connectionConfig, QQueryParser queryParser, QQueryConverter queryConverter) {
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

	@SuppressWarnings("unchecked")
	@Override
	public Catalog getDefaultCatalog() {
		
		for(Catalog catalog: (List<Catalog>)getConnectionInfo().getSharedDatabase().getCatalogs()) {
			if(connectionConfig.getUrl().contains(catalog.getName()))
				return catalog;
		}
		
		return null;
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