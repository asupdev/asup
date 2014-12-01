package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QApplication;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactory;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public abstract class ASUPConnectionFactory  implements IConnectionFactory {

	private QDatabaseManager databaseManager;
	private QConnectionManager connectionManager;

	public IConnection createConnection(IConnectionProfile profile, String uid, String pwd) {
		return createConnection(profile);
	}
	
	protected QConnectionManager getConnectionManager() {
		checkActive();
		
		return connectionManager;
	}
	
	protected QDatabaseManager getDatabaseManager() {
		checkActive();
		
		return this.databaseManager;
	}
	
	protected synchronized void checkActive() {

		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
    	
		if(databaseManager == null) {
			ServiceReference<QDatabaseManager> databaseManagerRef = bundleContext.getServiceReference(QDatabaseManager.class);
	    	if(databaseManagerRef == null)
	    		throw new FrameworkCoreRuntimeException("Database Manager not started");
	
	    	databaseManager = bundleContext.getService(databaseManagerRef);
		}
    	if(!databaseManager.isStarted())
    		throw new FrameworkCoreRuntimeException("Database Manager not started");
    	
		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();
		ASUPCatalogProvider.database = databaseContainer.getDatabase();
    	
    	if(connectionManager == null) {
        	ServiceReference<QConnectionManager> connectionManagaer = bundleContext.getServiceReference(QConnectionManager.class);
        	if(connectionManagaer == null)
        		throw new FrameworkCoreRuntimeException("Connection Manager not found");

        	connectionManager = bundleContext.getService(connectionManagaer);
        	if(!databaseManager.isStarted())
        		throw new FrameworkCoreRuntimeException("Connection Manager not found");   	
	
    	}
	}
}
