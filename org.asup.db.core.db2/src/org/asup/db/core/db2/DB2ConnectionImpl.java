package org.asup.db.core.db2;

import java.lang.annotation.Annotation;
import java.sql.Connection;
import java.sql.SQLException;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QPreparedStatement;
import org.asup.db.core.QStatement;
import org.asup.db.syntax.QQueryConverter;
import org.asup.db.syntax.QQueryParser;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactoryProvider;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;

public class DB2ConnectionImpl implements QConnection {

	private QContext context;
	private QConnectionConfig connectionConfig;
	private QQueryParser queryParser;
	private QQueryConverter queryConverter;
	private IConnection iConnection;
	
	protected DB2ConnectionImpl(QContext context, QConnectionConfig connectionConfig, QQueryParser queryParser, QQueryConverter queryConverter) {
		this.context = context;
		this.connectionConfig = connectionConfig;
		this.queryParser = queryParser;
		this.queryConverter = queryConverter;
	}
	
	@Override
	public void close() throws FrameworkCoreRuntimeException {
		
		if(iConnection != null) 
			iConnection.close();
		
		context.close();
	}

	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {
		return context.createChild();
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return context.get(clazz);
	}

	@Override
	public void inject(Object object) throws FrameworkCoreRuntimeException {
		context.inject(object);
	}

	@Override
	public Class<?> loadClass(QContextID contextID, String address) {
		return context.loadClass(contextID, address);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
		context.invoke(object, qualifier);
	}

	@Override
	public <T> T make(Class<T> klass) throws FrameworkCoreRuntimeException {
		return context.make(klass);
	}

	@Override
	public <T> void set(Class<T> klass, T object) throws FrameworkCoreRuntimeException {
		context.set(klass, object);
	}

	@Override
	public <T> void set(String name, T object) throws FrameworkCoreRuntimeException {
		context.set(name, object);
	}

	@Override
	public QConnectionConfig getConnectionConfig() {
		return connectionConfig;
	}

	@Override
	public <T> T getAdapter(Object source, Class<T> target) {
		return context.getAdapter(source, target);
	}

	@Override
	public DatabaseDefinition getDatabaseDefinition() {
		return getAdapter(this, ConnectionInfo.class).getDatabaseDefinition();
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
		
		Connection connection = getAdapter(this, Connection.class);
		QStatement statement = null;
		if(native_)
			statement = new DB2NativeStatementImpl(connection.createStatement());			
		else
			statement = new DB2StatementImpl(connection.createStatement(), queryParser, queryConverter);

		return statement;
	}

	protected synchronized ConnectionInfo getConnectionInfo() {
		
		if(iConnection == null) {
			IConnectionProfile profile = getAdapter(getConnectionConfig(), IConnectionProfile.class);
			IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory(ConnectionInfo.class.getName());
			iConnection = connectionFactoryProvider.createConnection(profile);
		}
		
		return (ConnectionInfo) iConnection.getRawConnection();
	}
}
