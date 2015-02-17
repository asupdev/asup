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

import javax.sql.DataSource;

import org.asup.co.core.QServerSocketConfig;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.cdo.CDOStoreConfig;
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
import org.osgi.service.jdbc.DataSourceFactory;

@SuppressWarnings("restriction")
public class CDOStoreActivatorHook extends ServiceImpl {
	
	@LevelStarted
	public void start(DataSourceFactory dataSourceFactory) throws SQLException {
		
		OMPlatform.INSTANCE.setDebugging(true); 
		OMPlatform.INSTANCE.addLogHandler(org.eclipse.net4j.util.om.log.PrintLogHandler.CONSOLE); 
		OMPlatform.INSTANCE.addTraceHandler(org.eclipse.net4j.util.om.trace.PrintTraceHandler.CONSOLE); 
		
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the Net4j kernel
	    TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the TCP support
	    CDONet4jServerUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the CDO server

	    
		CDOStoreConfig storeConfig = (CDOStoreConfig) getConfig();
	    
		// adapter
		IDBAdapter adapter = DBUtil.getDBAdapter(storeConfig.getAdapter());

		// provider
		Properties dataSourceProps = new Properties();
		dataSourceProps.put("class", storeConfig.getDriver());
		dataSourceProps.put("url", storeConfig.getUrl());
		dataSourceProps.put("user", storeConfig.getCredentials().getUser());
		dataSourceProps.put("password", storeConfig.getCredentials().getPassword());
		
		// TODO retrieve dataFactory by adapter 
		DataSource dataSource = dataSourceFactory.createDataSource(dataSourceProps);		
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
		IRepository repository = CDOServerUtil.createRepository(storeConfig.getRepository(), store, repositoryProps); 
		CDOServerUtil.addRepository(IPluginContainer.INSTANCE, repository); 
		
		
		QServerSocketConfig socketConfig = storeConfig.getSocketConfig();
		Net4jUtil.getAcceptor(IPluginContainer.INSTANCE, "tcp", socketConfig.getAddress()+":"+socketConfig.getPort());
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