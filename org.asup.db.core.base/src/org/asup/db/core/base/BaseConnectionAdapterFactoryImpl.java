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
import org.asup.db.core.util.QConnectionHelper;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
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
				connection.toString();
//				adaptee = connection.getConnectionInfo();
			}
		}
		else if (IConnectionProfile.class.isAssignableFrom(adapterType)) {

			if (adaptableObject instanceof QConnectionConfig) {
				QConnectionConfig connectionConfig = (QConnectionConfig) adaptableObject;

				try {

					ProviderIDMappingRegistry providerIDMappingRegistry = SQMServices.getProviderIDMappingRegistry();
					String providerID = providerIDMappingRegistry.getProviderIDforVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
					if (providerID == null)
						providerID = "org.eclipse.datatools.connectivity.db.generic.connectionProfile";

					Properties properties = QConnectionHelper.buildDTPPropertiesByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());

					// configuration overrides template
					if(connectionConfig.getUrl() != null)
						properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, connectionConfig.getUrl());
					if(connectionConfig.getUser() != null)
						properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, connectionConfig.getUser());
					if(connectionConfig.getPassword() != null)
						properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, connectionConfig.getPassword());
					
					properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

					
					ProfileManager profileManager = ProfileManager.getInstance();
					if(connectionConfig.isPersistent()) {
						String profileID = "DTP_"+connectionConfig.getVendor()+"_"+connectionConfig.getVersion();
						adaptee = profileManager.getProfileByName(profileID);
						if(adaptee == null)
							adaptee = profileManager.createProfile(profileID, connectionConfig.getVendor()+"("+connectionConfig.getVersion()+")", providerID, properties);
					}
					else
						adaptee = profileManager.createTransientProfile(providerID, properties);
				} catch (ConnectionProfileException e) {
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
