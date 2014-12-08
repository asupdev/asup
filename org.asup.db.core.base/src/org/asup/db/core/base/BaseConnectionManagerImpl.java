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

import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.impl.ConnectionManagerImpl;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.fw.core.QContext;

public class BaseConnectionManagerImpl extends ConnectionManagerImpl {

	@Inject
	private QContext context;

	private static int connectionID = 0;

	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QQueryParserRegistry queryParserRegistry;


	@Override
	public QConnection createConnection() throws SQLException {
		return createConnection(null, null, null);
	}

	@Override
	public QConnection createConnection(String catalog) throws SQLException {
		return createConnection(catalog, null, null);
	}

	@Override
	public QConnection createConnection(String user, String password) throws SQLException {
		return createConnection(null, user, password);
	}
	
	@Override
	public QConnection createConnection(String catalog, String user, String password) throws SQLException {

		QConnectionContext connectionContext = new BaseConnectionContextImpl(context.createChild(), nextConnectionID());
		
		// query parser from container
		QDatabaseContainer databaseContainer = ((BaseDatabaseManagerImpl)databaseManager).getDatabaseContainer();
		QQueryParser queryParser = this.queryParserRegistry.lookupByVendorVersion(databaseContainer.getVendor(), databaseContainer.getVersion());
		connectionContext.set(QQueryParser.class, queryParser);

		QConnection connection = new BaseConnectionImpl(databaseContainer, connectionContext); 
		connection.setCatalog(catalog);
		
		return connection;
	}
	
	protected synchronized String nextConnectionID() {

		connectionID = connectionID++;
		String stringID = context.getID()+"/"+connectionID;
		
		return stringID;
	}
}