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
package org.asup.db.server.cdo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.QConnectionFactoryRegistry;
import org.asup.db.core.QConnectionManager;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.IDBStore;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalNonAuditMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.OMPlatform;

@SuppressWarnings("restriction")
public class CDODatabaseActivatorHook extends ServiceImpl {

	@Inject
	private QConnectionFactoryRegistry connectionFactoryRegistry;
	@Inject
	private QConnectionManager connectionManager;
	
	@LevelStarted
	public void start() throws SQLException {

		OMPlatform.INSTANCE.setDebugging(true); 
		OMPlatform.INSTANCE.addLogHandler(org.eclipse.net4j.util.om.log.PrintLogHandler.CONSOLE); 
		OMPlatform.INSTANCE.addTraceHandler(org.eclipse.net4j.util.om.trace.PrintTraceHandler.CONSOLE); 
		
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the Net4j kernel
	    TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the TCP support
	    CDONet4jServerUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the CDO server

	    
		QConnectionConfig connectionConfig = (QConnectionConfig) getConfig();
		connectionManager.registerConnectionConfig(connectionConfig.getDatabaseName(), connectionConfig);
	    
		// adapter
		IDBAdapter adapter = DBUtil.getDBAdapter(connectionConfig.getPluginName());

		// provider
		QConnectionFactory connectionFactory = connectionFactoryRegistry.lookup(connectionConfig.getPluginName());
		Properties dataSourceProps = new Properties();
		dataSourceProps.put("class", connectionConfig.getDriver());
		dataSourceProps.put("url", connectionConfig.getUrl());
		dataSourceProps.put("user", connectionConfig.getUser());
		dataSourceProps.put("password", connectionConfig.getPassword());

/*		dataSourceProps.put("class", "com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
		dataSourceProps.put("url", "jdbc:mysql://localhost/asup_cdo?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=UTF-8");
		dataSourceProps.put("user", "root");
		dataSourceProps.put("password", "asup2013");*/
		DataSource dataSource = connectionFactory.createDataSource(dataSourceProps);		
		IDBConnectionProvider provider = DBUtil.createConnectionProvider(dataSource); 

		// store 		
		Map<String, String> databaseProps = new HashMap<String, String>();
		databaseProps.put("readerPoolCapacity", "10");
		databaseProps.put("writerPoolCapacity", "10");
			
		// strategy 
		IMappingStrategy strategy = new InternalMappingStrategy(); 
		Map<String, String> mappingProps = new HashMap<String, String>();
		mappingProps.put("toManyReferences", "ONE_TABLE_PER_CLASS"); 
		mappingProps.put("qualifiedNames", "false");

		strategy.setProperties(mappingProps);
			
		IDBStore store = CDODBUtil.createStore(strategy, adapter, provider, databaseProps);		
		strategy.setStore(store); 

		// repository 
		Map<String, String> repositoryProps = new HashMap<String, String>(); 
		repositoryProps.put("overrideUUID", "");
		repositoryProps.put("supportingAudits", "false");
		repositoryProps.put("supportingBranches", "false");
		IRepository repository = CDOServerUtil.createRepository("AS400A", store, repositoryProps); 
		CDOServerUtil.addRepository(IPluginContainer.INSTANCE, repository); 
		
		Net4jUtil.getAcceptor(IPluginContainer.INSTANCE, "tcp", "0.0.0.0:2036");
	}
	
	private class InternalMappingStrategy extends HorizontalNonAuditMappingStrategy {

		@Override
		public String getTableName(ENamedElement element) {
			EClass eClass = null;
			if(element instanceof EClass) 
				eClass = (EClass)element;
			else
				eClass = element.eClass();
			
			EPackage ePackage = eClass.getEPackage();
			if(ePackage.getNsURI().contains("www.asup.org"))
				return ("asup_"+ePackage.getNsPrefix().replaceAll("-",  "_")+"_"+element.getName()).toLowerCase();
			else
				return super.getTableName(element);
		}

		@Override
		public String getTableName(EClass eClass, EStructuralFeature feature) {
			EPackage ePackage = eClass.getEPackage();
			if(ePackage.getNsURI().contains("www.asup.org"))
				return ("asup_"+ePackage.getNsPrefix().replaceAll("-",  "_")+"_"+eClass.getName()+"_"+feature.getName()).toLowerCase();
			else
				return super.getTableName(eClass, feature);
		}

	}
}