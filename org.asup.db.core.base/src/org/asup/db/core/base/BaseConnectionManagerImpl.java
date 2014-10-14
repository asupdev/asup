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


import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.QDatabase;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.impl.ConnectionManagerImpl;

public class BaseConnectionManagerImpl extends ConnectionManagerImpl {

	@Inject
	private QConnectionFactoryRegistry connectionFactoryRegistry;

	private Map<String, QDatabase> databases;
	private Map<String, QConnectionConfig> connectionConfigs;

	@PostConstruct
	public void init() {
		this.databases = new HashMap<String, QDatabase>();
		this.connectionConfigs = new HashMap<String,QConnectionConfig>();
	}
	
	@Override
	public QConnection getDatabaseConnection(String name) {

		// lookup connection config
		QConnectionConfig config = connectionConfigs.get(name);
		if(config == null) 
			return null;
		
		return getDatabaseConnection(config);
	}

	@Override
	public QConnection getDatabaseConnection(QConnectionConfig config) {
		// lookup database
		QDatabase database = databases.get(config.getDatabaseName());
		if(database == null)
			database = registerDatabase(config);			

		QConnection dbConnection = QDatabaseCoreFactory.eINSTANCE.createConnection();
		dbConnection.setConnectionConfig(config);
		dbConnection.setDatabase(database);
		
		// TODO if bundle was reloaded, connection factory does not change 
		QConnectionFactory connectionFactory = connectionFactoryRegistry.lookup(config);
		if(connectionFactory == null)
			return null;
		
		dbConnection.setConnectionFactory(connectionFactory);
		
		return dbConnection;
	}	

	@Override
	public void registerConnectionConfig(String name, QConnectionConfig config) {
		registerDatabase(config);
		connectionConfigs.put(name, config);
	}

	private QDatabase registerDatabase(QConnectionConfig config) {
		// lookup database
		QDatabase database = databases.get(config.getDatabaseName());
		// if not exists runtime creation
		if(database == null) {
			database = QDatabaseCoreFactory.eINSTANCE.createDatabase();
			database.setName(config.getDatabaseName());
			databases.put(database.getName(), database);
		}		
		
		return database;
	}
	@Override
	public QConnectionConfig createConnectionConfig(Dictionary<String, Object> dictionary) {
		QConnectionConfig connectionConfig = QDatabaseCoreFactory.eINSTANCE.createConnectionConfig();
		connectionConfig.setPluginName(dictionary.get("org.asup.db.core.pluginName").toString());		
		connectionConfig.setDatabaseName(dictionary.get("org.asup.db.core.name").toString());
		connectionConfig.setDriver(dictionary.get("org.asup.db.core.driver").toString());
		connectionConfig.setUrl(dictionary.get("org.asup.db.core.url").toString());
		connectionConfig.setUser(dictionary.get("org.asup.db.core.user").toString());
		connectionConfig.setPassword(dictionary.get("org.asup.db.core.password").toString());
		connectionConfig.setUseCatalog(Boolean.valueOf(dictionary.get("org.asup.db.core.useCatalog").toString()));
		connectionConfig.setUsePool(Boolean.valueOf(dictionary.get("org.asup.db.core.usePool").toString()));
		return connectionConfig;		
	}
}