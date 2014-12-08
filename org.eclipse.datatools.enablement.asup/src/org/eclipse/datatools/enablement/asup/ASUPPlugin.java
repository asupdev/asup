package org.eclipse.datatools.enablement.asup;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QApplication;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.DriverInstance;
import org.eclipse.datatools.connectivity.drivers.DriverManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.drivers.models.TemplateDescriptor;
import org.osgi.framework.Bundle;
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

//		ASUPCatalogProvider.databaseContainer = databaseManager.getDatabaseContainer();

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
	
	public Properties createPropertiesByVendorVersion(String vendor, String version) {

		Properties properties = new Properties();
		for (TemplateDescriptor templateDescriptor : TemplateDescriptor.getDriverTemplateDescriptors()) {

			String templateVendor = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID);
			String templateVersion = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID);

			if (templateVendor != null && templateVendor.equals(vendor) && templateVersion != null && templateVersion.equals(version)) {

				if (!templateDescriptor.getId().endsWith(QCatalogContainer.TEMPLATE_SUFFIX))
					continue;

				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, templateVendor);
				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, templateVersion);

				// System.out.println(templateDescriptor.getId());
				DriverInstance driverInstances[] = DriverManager.getInstance().getDriverInstancesByTemplate(templateDescriptor.getId());
				if (driverInstances.length > 0)
					properties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, driverInstances[0].getId());

				String driverClass = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID);
				if (driverClass != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, driverClass);

				// platform dependent jar list
				StringBuffer jarList = new StringBuffer();
				try {
					Bundle bundle = Platform.getBundle(templateDescriptor.getElement().getDeclaringExtension().getNamespaceIdentifier());
					String paths[] = templateDescriptor.getJarList().split(";");
					for (int i = 0; i < paths.length; i++) {
						if (i > 0)
							jarList.append(System.getProperty("path.separator"));
						URL pathURL = bundle.getEntry(paths[i].trim());
						jarList.append(new Path(FileLocator.toFileURL(pathURL).getFile()).toOSString());
					}
				} catch (IOException e) {
					throw new FrameworkCoreRuntimeException(e);
				}

				properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, jarList.toString());

				String driverUrl = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.URL_PROP_ID);
				if (driverUrl != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, driverUrl);

				String user = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID);
				if (user != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, user);

				String password = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID);
				if (password != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, password);

				properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

				break;
			}
		}

		return properties;

	}
}
