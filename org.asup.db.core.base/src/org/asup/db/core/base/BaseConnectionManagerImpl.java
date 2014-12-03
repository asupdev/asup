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
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.impl.ConnectionManagerImpl;
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

public class BaseConnectionManagerImpl extends ConnectionManagerImpl {

	@Inject
	private QConnectionFactoryRegistry connectionFactoryRegistry;

	private Map<String, QConnectionConfig> connectionConfigs;

	@PostConstruct
	public void init() {
		this.connectionConfigs = new HashMap<String, QConnectionConfig>();
	}

	@Override
	public QConnection createDatabaseConnection(String name) {

		QConnectionConfig connectionConfig = connectionConfigs.get(name);
		if (connectionConfig == null)
			return null;

		return createDatabaseConnection(connectionConfig);
	}

	@Override
	public QConnection createDatabaseConnection(QConnectionConfig connectionConfig) {

		QConnectionFactory connectionFactory = connectionFactoryRegistry.lookup(connectionConfig);
		QConnection connection = connectionFactory.createDatabaseConnection(connectionConfig);

		return connection;
	}

	@Override
	public void registerConnectionConfig(String name, QConnectionConfig connectionConfig) {
		connectionConfigs.put(name, connectionConfig);
	}

	@Override
	public Properties createPropertiesByVendorVersion(String vendor, String version) {

		Properties properties = new Properties();
		for (TemplateDescriptor templateDescriptor : TemplateDescriptor.getDriverTemplateDescriptors()) {

			String templateVendor = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID);
			String templateVersion = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID);

			if (templateVendor != null && templateVendor.equals(vendor) && templateVersion != null && templateVersion.equals(version)) {

				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, templateVendor);
				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, templateVersion);

				// System.out.println(templateDescriptor.getId());
				DriverInstance driverInstances[] = DriverManager.getInstance().getDriverInstancesByTemplate(templateDescriptor.getId());
				if (driverInstances.length > 0)
					properties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, driverInstances[0].getId());

				String driverClass = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID);
				if (driverClass != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, driverClass);

				try {

					// platform dependent jar list
					// TODO replace with environment variable
					StringBuffer jarList = new StringBuffer();
					Bundle bundle = Platform.getBundle(templateDescriptor.getElement().getDeclaringExtension().getNamespaceIdentifier());
					String paths[] = templateDescriptor.getJarList().split(";");
					for (int i = 0; i < paths.length; i++) {
						if (i > 0)
							jarList.append(System.getProperty("path.separator"));
						URL pathURL = bundle.getEntry(paths[i].trim());
						jarList.append(new Path(FileLocator.toFileURL(pathURL).getFile()).toOSString());
					}

					properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, jarList.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}

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

	@Override
	public Properties createPropertiesByConnectionConfig(QConnectionConfig connectionConfig) {
		
		Properties properties = createPropertiesByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
		
		// configuration overrides template
		if(connectionConfig.getUrl() != null)
			properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, connectionConfig.getUrl());
		if(connectionConfig.getUser() != null)
			properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, connectionConfig.getUser());
		if(connectionConfig.getPassword() != null)
			properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, connectionConfig.getPassword());
		
		properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

		return properties;
	}

}