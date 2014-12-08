package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;

public class ASUPConnectionInfoFactory extends ASUPConnectionFactory {

	public IConnection createConnection(IConnectionProfile profile) {
		
		ASUPPlugin plugin = ASUPPlugin.getInstance();
		if(plugin == null)
			return null;

		return null;
/*		// database information
		QDatabaseManager databaseManager = plugin.getDatabaseManager();
		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();

		// check singleton
		ASUPConnectionInfo connectionInfo = (ASUPConnectionInfo) DatabaseConnectionRegistry.getInstance().getConnectionForDatabase(database); 
		if(connectionInfo != null)
			return connectionInfo;
	
		connectionInfo = new ASUPConnectionInfo(profile, ASUPConnectionFactory.class);
		connectionInfo.setSharedDatabase(database);
				
		return connectionInfo;*/
	}

	

}