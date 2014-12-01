package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.DatabaseConnectionRegistry;

public class ASUPConnectionInfoFactory extends ASUPConnectionFactory {

	
	public ASUPConnectionInfoFactory() {
		super();
	}

	public IConnection createConnection(IConnectionProfile profile) {
		
/*		QConnectionConfig connectionConfig = QDatabaseCoreFactory.eINSTANCE.createConnectionConfig();
		connectionConfig.setAutoCommit(true);
		connectionConfig.setDefaultCatalog("*LOCAL");
		connectionConfig.setVendor(profile.getBaseProperties().getProperty((IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID)));
		connectionConfig.setVersion(profile.getBaseProperties().getProperty((IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID)));*/

		checkActive();
		
		
//		IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory(ConnectionInfo.class.getName());
//		connectionFactory.createDatabaseConnection(connectionConfig);	
//		IConnection iConnection = connectionFactoryProvider.createConnection(connectionProfile);

		ASUPConnectionInfo connectionInfo = new ASUPConnectionInfo(profile, ASUPConnectionFactory.class);
	
		// set shared database
		QDatabaseManager databaseManager = getDatabaseManager();
		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();
		
		if(DatabaseConnectionRegistry.getInstance().getConnectionForDatabase(databaseContainer.getDatabase()) == null)
			connectionInfo.setSharedDatabase(databaseContainer.getDatabase());
		
		/*		dtpConnection.open();

		// set shared database
		QDatabaseManager databaseManager = getDatabaseManager();
		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();

		ASUPConnectionInfo asupConnectionInfo = (ASUPConnectionInfo) dtpConnection.getRawConnection();
//		asupConnectionInfo.setSharedConnection();
		asupConnectionInfo.setSharedDatabase(databaseContainer.getDatabase());*/
		
		return connectionInfo;
	}

	

}