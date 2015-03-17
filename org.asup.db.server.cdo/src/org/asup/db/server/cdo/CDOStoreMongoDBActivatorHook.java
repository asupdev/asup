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

import org.asup.co.core.QServerSocketConfig;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.cdo.CDOStoreConfig;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.mongodb.CDOMongoDBUtil;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.osgi.service.jdbc.DataSourceFactory;

public class CDOStoreMongoDBActivatorHook extends ServiceImpl {
	
	@LevelStarted
	public void start(DataSourceFactory dataSourceFactory) throws SQLException {
		try {
			System.out.println("Connecting to Mongo...");
			
			OMPlatform.INSTANCE.setDebugging(true); 
			OMPlatform.INSTANCE.addLogHandler(org.eclipse.net4j.util.om.log.PrintLogHandler.CONSOLE); 
			OMPlatform.INSTANCE.addTraceHandler(org.eclipse.net4j.util.om.trace.PrintTraceHandler.CONSOLE); 
			
			Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the Net4j kernel
			TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the TCP support
			CDONet4jServerUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the CDO server

			CDOStoreConfig storeConfig = (CDOStoreConfig) getConfig();

			IStore store = CDOMongoDBUtil.createStore("mongodb://172.16.3.27", "ASUP_CDO");
			
			// repository 
			Map<String, String> repositoryProps = new HashMap<String, String>(); 
			repositoryProps.put("overrideUUID", "");
			repositoryProps.put("supportingAudits", "false");
			repositoryProps.put("supportingBranches", "false");
			IRepository repository = CDOServerUtil.createRepository("AS400A", store, repositoryProps); 
			CDOServerUtil.addRepository(IPluginContainer.INSTANCE, repository); 
					
			QServerSocketConfig socketConfig = storeConfig.getSocketConfig();
			Net4jUtil.getAcceptor(IPluginContainer.INSTANCE, "tcp", socketConfig.getAddress()+":"+socketConfig.getPort());
			
			System.out.println("...connection to Mongo completed");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}