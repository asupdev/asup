package org.eclipse.datatools.enablement.asup;

import javax.annotation.PostConstruct;

import org.asup.db.core.QDatabaseManager;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QApplication;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactory;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class DTPConnectionFactory implements IConnectionFactory {
	
	public DTPConnectionFactory() {
		super();
	}

	@PostConstruct
	private void init() {
		System.err.println("Ecchime !! stcj589t23574c45bcq345");
	}

	public IConnection createConnection(IConnectionProfile profile) {
		DTPConnection connection = new DTPConnection(profile, getClass());
		
		checkActive();
		
		connection.open();
		return connection;
	}

	public IConnection createConnection(IConnectionProfile profile, String uid, String pwd) {
		return createConnection(profile);
	}
	
	protected synchronized void checkActive() {

		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
    	ServiceReference<QDatabaseManager> databaseManagerRef = bundleContext.getServiceReference(QDatabaseManager.class);
    	if(databaseManagerRef == null)
    		throw new FrameworkCoreRuntimeException("Database Manager not started");
		
	}
}