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
package org.asup.db.core.ibmi;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabase;
import org.asup.db.core.impl.ConnectionImpl;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400JDBCDriver;

public class IBMiDatabaseConnectionImpl extends ConnectionImpl {

	private AS400 connection;
	private Connection sql_connection = null;
	
	public IBMiDatabaseConnectionImpl(AS400 connection) {
		this.connection = connection;
		
		QDatabase database = QDatabaseCoreFactory.eINSTANCE.createDatabase();
		database.setName(connection.getSystemName());
		setDatabase(database);
		
		QConnectionConfig config = QDatabaseCoreFactory.eINSTANCE.createConnectionConfig();
		config.setUser(connection.getUserId());
		config.setDatabaseName(connection.getSystemName());
		config.setPluginName("IBMI");
		setConnectionConfig(config);
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		if(sql_connection == null || sql_connection.isClosed()) {
			AS400JDBCDriver as400driver = new AS400JDBCDriver();
			Properties p = new Properties();
			// setup to manage table with CCSID(65535)
			p.put("translate binary", "true");
			sql_connection = as400driver.connect(connection, p, null);
		}
		return sql_connection;
	}
}