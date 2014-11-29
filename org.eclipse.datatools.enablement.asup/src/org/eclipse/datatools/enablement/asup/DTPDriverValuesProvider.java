package org.eclipse.datatools.enablement.asup;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.drivers.DefaultDriverValuesProvider;
import org.eclipse.datatools.connectivity.drivers.IDriverValuesProvider;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.osgi.framework.Bundle;

public class DTPDriverValuesProvider extends DefaultDriverValuesProvider {

	public String getDriverDirName() {
		return "lib/AsUP_053";
	}

	public String createDefaultValue(String key) {
		/**
		 * Check to see if the wrapper plug-in is in the Eclipse environment. If
		 * it is we'll use it and grab the driver jar from there.
		 */
		if (key.equals(IDriverValuesProvider.VALUE_CREATE_DEFAULT)) {
			Bundle[] bundles = Platform.getBundles("org.asup.db.core", null); //$NON-NLS-1$
			if (bundles != null && bundles.length > 0) {
				Enumeration<URL> jars = bundles[0].findEntries(getDriverDirName(), "*.jar", true); //$NON-NLS-1$
				while (jars != null && jars.hasMoreElements()) {
					URL url = (URL) jars.nextElement();
					if (url != null) {
						return Boolean.toString(true);
					}
				}
				return Boolean.toString(true);
			}
		}
		else if (key.equals(IDriverValuesProvider.VALUE_JARLIST)) {
			Bundle[] bundles = Platform.getBundles("org.asup.db.core", null); //$NON-NLS-1$
			if (bundles != null && bundles.length > 0) {
				Enumeration<URL> jars = bundles[0].findEntries(getDriverDirName(), "*.jar", true); //$NON-NLS-1$
				StringBuffer urls = null;
				while (jars != null && jars.hasMoreElements()) {
					URL url = (URL) jars.nextElement();

					if (url != null) {
						try {
							url = FileLocator.toFileURL(url);
							IPath path = new Path(url.getFile());
							if (urls == null) {
								urls = new StringBuffer();
							}
							if (urls.length() > 0) {
								urls.append(";");
							}
							urls.append(path.toOSString());
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				if (urls != null && urls.length() > 0) {
					return urls.toString();
				}
				return "";
			}
		}
		else if (key.equals(IDriverValuesProvider.VALUE_NAME)) {
			return "AsUP";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID)) {
			return "org.eclipse.datatools.enablement.asup.JDBCDriver";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID)) {
			return "AsUP";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID)) {
			return "053";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.DATABASE_NAME_PROP_ID)) {
			return "AsUP";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.URL_PROP_ID)) {
			return "jdbc:asup://localhost";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID)) {
			return "ASUP";
		}
		else if (key.equals(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID)) {
			return "";
		}
		else if (key.equals(IDriverValuesProvider.VALUE_DEFAULT_DEFINITION_NAME)) {
			return "AsUP 053 JDBC Driver";
		}

		
		System.err.println(key);
		return "";
	}

}
