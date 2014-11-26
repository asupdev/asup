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

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.impl.ConnectionManagerImpl;
import org.eclipse.core.internal.runtime.AdapterManager;
import org.eclipse.core.runtime.IAdapterFactory;

@SuppressWarnings("restriction")
public class BaseConnectionManagerImpl extends ConnectionManagerImpl {

	@Inject
	private QConnectionFactoryRegistry connectionFactoryRegistry;

	private Map<String, QConnectionConfig> connectionConfigs;


	@PostConstruct
	public void init() {
		this.connectionConfigs = new HashMap<String, QConnectionConfig>();
		
		IAdapterFactory adapterFactory = new BaseConnectionAdapterFactoryImpl();
		AdapterManager.getDefault().registerAdapters(adapterFactory, QConnection.class);
		AdapterManager.getDefault().registerAdapters(adapterFactory, QConnectionConfig.class);

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
}