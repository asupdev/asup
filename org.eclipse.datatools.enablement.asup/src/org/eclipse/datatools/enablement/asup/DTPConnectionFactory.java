package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QDatabaseCoreFactory;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;

public class DTPConnectionFactory extends DTPAbstractConnectionFactory {

	
	public DTPConnectionFactory() {
		super();
	}

	public IConnection createConnection(IConnectionProfile profile) {
		
		QConnectionConfig connectionConfig = QDatabaseCoreFactory.eINSTANCE.createConnectionConfig();
		connectionConfig.setAutoCommit(true);
		connectionConfig.setDefaultCatalog("*LOCAL");
		connectionConfig.setVendor(profile.getBaseProperties().getProperty((IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID)));
		connectionConfig.setVersion(profile.getBaseProperties().getProperty((IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID)));

		QConnection connection = null;
		Exception connectionException = null;
		
		checkActive();
		
		
//		IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory(ConnectionInfo.class.getName());
//		connectionFactory.createDatabaseConnection(connectionConfig);	
//		IConnection iConnection = connectionFactoryProvider.createConnection(connectionProfile);

		DTPConnection dtpConnection = new DTPConnection(connection, connectionException, profile, getClass());

		
		dtpConnection.open();
		
		return dtpConnection;
	}

	

}