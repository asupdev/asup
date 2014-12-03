package org.asup.db.core.util;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

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

public class QConnectionHelper {


	public static Properties buildDTPPropertiesByVendorVersion(String vendor, String version) {

		Properties properties = new Properties();
		for (TemplateDescriptor templateDescriptor : TemplateDescriptor.getDriverTemplateDescriptors()) {

			String templateVendor = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID);
			String templateVersion = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID);
 
			if (templateVendor != null && templateVendor.equals(vendor) && 
				templateVersion != null && templateVersion.equals(version)) {

				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, templateVendor);
				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, templateVersion);

				// System.out.println(templateDescriptor.getId());
				DriverInstance driverInstances[] = DriverManager.getInstance().getDriverInstancesByTemplate(templateDescriptor.getId());
				if (driverInstances.length > 0)
					properties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, driverInstances[0].getId());
				
				String driverClass = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID);
				if(driverClass != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, driverClass);
				
				try {
					properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList(templateDescriptor));
				} catch (IOException e) {
					e.printStackTrace();
				}

				String driverUrl = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.URL_PROP_ID);
				if(driverUrl != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, driverUrl);
				
				String user = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID);
				if(user != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, user);
				
				String password = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID);
				if(password != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, password);				
				
				properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

				break;
			}
		}
		
		return properties;
	}
	
	protected static String getJarList(TemplateDescriptor templateDescriptor) throws IOException {

		StringBuffer jarList = new StringBuffer();

		Bundle bundle = Platform.getBundle(templateDescriptor.getElement().getDeclaringExtension().getNamespaceIdentifier());

		String paths[] = templateDescriptor.getJarList().split(";");
		for (int i = 0; i < paths.length; i++) {
			if (i > 0)
				jarList.append(System.getProperty("path.separator"));
			URL pathURL = bundle.getEntry(paths[i].trim());
			jarList.append(new Path(FileLocator.toFileURL(pathURL).getFile()).toOSString());
		}

		return jarList.toString();
	}

}
