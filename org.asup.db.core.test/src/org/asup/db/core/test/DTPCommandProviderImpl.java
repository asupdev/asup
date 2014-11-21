package org.asup.db.core.test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

import org.asup.db.core.QConnectionConfig;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactoryProvider;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;

public class DTPCommandProviderImpl extends AbstractCommandProviderImpl {

	public void _connect(CommandInterpreter interpreter) throws ConnectionProfileException {
		QConnectionConfig config = loadConfig("MSSQL");

		ProfileManager profileManager = ProfileManager.getInstance();
		
		String providerID = "org.eclipse.datatools.enablement.msft.sqlserver.connectionProfile";
		
		IConnectionProfile profile = profileManager.createTransientProfile(providerID, getMsSQLProperties(config));
		
//		IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory("java.sql.Connection");
		IConnectionFactoryProvider connectionFactoryProvider = profile.getProvider().getConnectionFactory(ConnectionInfo.class.getName());
		IConnection connection = connectionFactoryProvider.createConnection(profile);
		ConnectionInfo connectionInfo = (ConnectionInfo) connection.getRawConnection();
		
		for(Object eCatalog: connectionInfo.getSharedDatabase().getCatalogs()) {
			Catalog catalog = (Catalog) eCatalog;
			System.out.println(catalog);
			
			for(Object eSchema: catalog.getSchemas()) {
				Schema schema = (Schema) eSchema;
				System.out.println("\t"+schema);
			}
		}
		
		connection.close();

	}

	public Properties getMsSQLProperties(QConnectionConfig config) {

		Properties baseProperties = new Properties();
		baseProperties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, "DriverDefn.org.eclipse.datatools.enablement.msft.sqlserver.2008.driverTemplate.Microsoft SQL Server 2008 JDBC Driver");
		baseProperties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.DRIVER_CLASS_PROP_ID, config.getDriver());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.URL_PROP_ID, config.getUrl());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.USERNAME_PROP_ID, config.getUser());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.PASSWORD_PROP_ID, config.getPassword());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.DATABASE_VENDOR_PROP_ID, config.getPluginName());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.DATABASE_VERSION_PROP_ID, "2008");
		baseProperties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());
		return baseProperties;
	}

	private String getJarList() {

		StringBuffer urls = new StringBuffer();

		Bundle[] bundles = Platform.getBundles("org.asup.db.core.mssql", null);
		if (bundles != null && bundles.length > 0) {
			Enumeration<URL> jars = bundles[0].findEntries("lib", "*.jar", true);

			while (jars != null && jars.hasMoreElements()) {
				URL url = (URL) jars.nextElement();

				if (url != null) {
					try {
						url = FileLocator.toFileURL(url);
						IPath path = new Path(url.getFile());
						if (urls.length() > 0)
							urls.append(";");

						urls.append(path.toOSString());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return urls.toString();
	}
}