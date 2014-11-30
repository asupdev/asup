/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.core.base;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.asup.db.core.QConnectionConfig;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.drivers.DriverInstance;
import org.eclipse.datatools.connectivity.drivers.DriverManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.drivers.models.TemplateDescriptor;
import org.eclipse.datatools.connectivity.sqm.core.SQMServices;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.mappings.ProviderIDMappingRegistry;
import org.osgi.framework.Bundle;

public class BaseConnectionAdapterFactoryImpl implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {

		Object adaptee = null;

		if (ConnectionInfo.class.isAssignableFrom(adapterType)) {
			if (adaptableObject instanceof BaseConnectionImpl) {
				BaseConnectionImpl connection = (BaseConnectionImpl) adaptableObject;
				adaptee = connection.getConnectionInfo();
			}
		}
		else if (IConnectionProfile.class.isAssignableFrom(adapterType)) {

			if (adaptableObject instanceof QConnectionConfig) {
				QConnectionConfig connectionConfig = (QConnectionConfig) adaptableObject;

				try {
					ProfileManager profileManager = ProfileManager.getInstance();

					ProviderIDMappingRegistry providerIDMappingRegistry = SQMServices.getProviderIDMappingRegistry();
					String providerID = providerIDMappingRegistry.getProviderIDforVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
					if (providerID == null)
						providerID = "org.eclipse.datatools.connectivity.db.generic.connectionProfile";

					Properties properties = new Properties();
					for (TemplateDescriptor templateDescriptor : TemplateDescriptor.getDriverTemplateDescriptors()) {

						String vendor = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID);
						String version = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID);

						if (vendor != null && vendor.equals(connectionConfig.getVendor()) && version != null && version.equals(connectionConfig.getVersion())) {
							properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, vendor);
							properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, version);

							// System.out.println(templateDescriptor.getId());
							DriverInstance driverInstances[] = DriverManager.getInstance().getDriverInstancesByTemplate(templateDescriptor.getId());
							if (driverInstances.length > 0)
								properties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, driverInstances[0].getId());
							String driverClass = connectionConfig.getDriverName();
							if (driverClass == null || driverClass.isEmpty())
								driverClass = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID);
							properties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, driverClass);
							properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList(templateDescriptor));

							properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, connectionConfig.getUrl());
							properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, connectionConfig.getUser());
							properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, connectionConfig.getPassword());
							properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

							break;
						}
					}

					adaptee = profileManager.createTransientProfile(providerID, properties);
				} catch (ConnectionProfileException | IOException e) {
					throw new FrameworkCoreRuntimeException(e);
				}
			}

		}

		return adaptee;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { ConnectionInfo.class, IConnectionProfile.class};
	}

	protected String getJarList(TemplateDescriptor templateDescriptor) throws IOException {

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
