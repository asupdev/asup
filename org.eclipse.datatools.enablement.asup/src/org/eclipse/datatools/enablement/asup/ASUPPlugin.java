package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QApplication;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class ASUPPlugin {

	private static ASUPPlugin INSTANCE = null;

	private static QDatabaseManager databaseManager;
	private static QConnectionManager connectionManager;

	public static ASUPPlugin getInstance() {
		if (INSTANCE == null) {
			synchronized (ASUPPlugin.class) {
				if (INSTANCE == null) {
					injectServices();
					INSTANCE = new ASUPPlugin();
				}
			}
		}
		return INSTANCE;
	}

	protected void releaseInstance() {
		
		if (INSTANCE == null) {
			synchronized (ASUPPlugin.class) {
				if (INSTANCE == null) {

					connectionManager = null;
					databaseManager = null;

					INSTANCE = null;
				}
			}

			return;
		}

	}

	public QConnectionManager getConnectionManager() {
		return connectionManager;
	}

	public QDatabaseManager getDatabaseManager() {
		return databaseManager;
	}

	private static void injectServices() {
		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();

		if (databaseManager == null) {
			ServiceReference<QDatabaseManager> databaseManagerRef = bundleContext.getServiceReference(QDatabaseManager.class);
			if (databaseManagerRef == null)
				throw new FrameworkCoreRuntimeException("Database Manager not started");

			databaseManager = bundleContext.getService(databaseManagerRef);
		}
		if (!databaseManager.isStarted())
			throw new FrameworkCoreRuntimeException("Database Manager not started");

		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();
		ASUPCatalogProvider.database = databaseContainer.getDatabase();

		if (connectionManager == null) {
			ServiceReference<QConnectionManager> connectionManagaer = bundleContext.getServiceReference(QConnectionManager.class);
			if (connectionManagaer == null)
				throw new FrameworkCoreRuntimeException("Connection Manager not found");

			connectionManager = bundleContext.getService(connectionManagaer);
			if (!databaseManager.isStarted())
				throw new FrameworkCoreRuntimeException("Connection Manager not found");

		}

			return;
	}
}
