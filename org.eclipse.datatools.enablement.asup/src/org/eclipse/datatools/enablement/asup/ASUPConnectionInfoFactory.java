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
package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;

public class ASUPConnectionInfoFactory extends ASUPConnectionFactory {

	public IConnection createConnection(IConnectionProfile profile) {
		
		ASUPPlugin plugin = ASUPPlugin.getInstance();
		if(plugin == null)
			return null;

		return null;
/*		// database information
		QDatabaseManager databaseManager = plugin.getDatabaseManager();
		QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();

		// check singleton
		ASUPConnectionInfo connectionInfo = (ASUPConnectionInfo) DatabaseConnectionRegistry.getInstance().getConnectionForDatabase(database); 
		if(connectionInfo != null)
			return connectionInfo;
	
		connectionInfo = new ASUPConnectionInfo(profile, ASUPConnectionFactory.class);
		connectionInfo.setSharedDatabase(database);
				
		return connectionInfo;*/
	}

	

}