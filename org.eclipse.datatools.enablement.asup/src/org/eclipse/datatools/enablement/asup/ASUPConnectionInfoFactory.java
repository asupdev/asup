package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.DatabaseConnectionRegistry;
import org.eclipse.datatools.modelbase.sql.schema.Database;

public class ASUPConnectionInfoFactory extends ASUPConnectionFactory {

	public IConnection createConnection(IConnectionProfile profile) {
		
		ASUPPlugin plugin = ASUPPlugin.getInstance();
		if(plugin == null)
			return null;

		// database information
		QDatabaseManager databaseManager = plugin.getDatabaseManager();
		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();
		Database database = databaseContainer.getDatabase();

		// check singleton
		ASUPConnectionInfo connectionInfo = (ASUPConnectionInfo) DatabaseConnectionRegistry.getInstance().getConnectionForDatabase(database); 
		if(connectionInfo != null)
			return connectionInfo;
	
		connectionInfo = new ASUPConnectionInfo(profile, ASUPConnectionFactory.class);
		connectionInfo.setSharedDatabase(database);
				
		return connectionInfo;
	}

	

}