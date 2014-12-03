package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.drivers.jdbc.JDBCConnectionFactory;

public class ASUPConnectionJDBCFactory extends ASUPConnectionFactory {

	@Override
	public IConnection createConnection(IConnectionProfile profile) {
		
		ASUPPlugin plugin = ASUPPlugin.getInstance();
		if(plugin == null)
			return null;
		
		QConnectionManager connectionManager = plugin.getConnectionManager();
		QDatabaseManager databaseManager = plugin.getDatabaseManager();

		ASUPConnectionJDBC jdbcConnection = new ASUPConnectionJDBC(connectionManager, databaseManager, profile, JDBCConnectionFactory.class);		
		jdbcConnection.open();

		return jdbcConnection;
	}

	@Override
	public IConnection createConnection(IConnectionProfile profile, String uid, String pwd) {
		return createConnection(profile);
	}

}
