package org.asup.db.core.test;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;

public class DTPCommandProviderImpl extends AbstractCommandProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDatabaseManager databaseManager;
	
	public void _connect(CommandInterpreter interpreter) throws ConnectionProfileException, SQLException {

		QConnectionConfig config = loadConfig(interpreter.nextArgument());

		long timeIni = System.currentTimeMillis();
		QConnection connection = connectionManager.createDatabaseConnection(config);		
		long timeEnd = System.currentTimeMillis();

		Database database = databaseManager.getDatabase(connection);
		System.out.println(database.getName()+"("+(timeEnd-timeIni)+" ms)");

		connection.close();
	}

	public Properties getMsSQLProperties(QConnectionConfig config) {

		Properties baseProperties = new Properties();
		baseProperties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID,
				"DriverDefn.org.eclipse.datatools.enablement.msft.sqlserver.2008.driverTemplate.Microsoft SQL Server 2008 JDBC Driver");
		baseProperties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList("org.asup.db.core.mssql"));
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, config.getDriverName());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, config.getUrl());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, config.getUser());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, config.getPassword());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, config.getProduct());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, config.getVersion());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());
		return baseProperties;
	}


	private String getJarList(String pluginName) {

		StringBuffer urls = new StringBuffer();

		Bundle[] bundles = Platform.getBundles(pluginName, null);
		if (bundles != null && bundles.length > 0) {
			Enumeration<URL> jars = bundles[0].findEntries("lib", "*.jar", true);

			while (jars != null && jars.hasMoreElements()) {
				URL url = jars.nextElement();

				if (url != null)
					try {
						url = FileLocator.toFileURL(url);
						IPath path = new Path(url.getFile());
						if (path.toString().contains("_license_"))
							continue;
						if (urls.length() > 0)
							urls.append(";");

						urls.append(path.toOSString());
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
		return urls.toString();
	}
}