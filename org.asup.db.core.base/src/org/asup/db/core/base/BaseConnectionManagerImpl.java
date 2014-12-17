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
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.impl.ConnectionManagerImpl;
import org.asup.fw.core.QApplication;
import org.asup.fw.core.QContext;

public class BaseConnectionManagerImpl extends ConnectionManagerImpl {

	private static int connectionID = 0;

	@Inject
	private QApplication application;
	@Inject
	private QDatabaseManager databaseManager;

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

		if (!(databaseManager instanceof BaseDatabaseManagerImpl))
			return null;

		BaseDatabaseManagerImpl baseDatabaseManagerImpl = (BaseDatabaseManagerImpl) databaseManager;

		String connectionID = nextConnectionID(baseDatabaseManagerImpl);
		QContext context = application.getContext().createLocalContext(catalog + "/" + connectionID);

		QConnection connection = new BaseConnectionImpl(baseDatabaseManagerImpl.getDatabaseContainer(), context);
		connection.setCatalog(catalog);

		return connection;
	}

	protected synchronized String nextConnectionID(BaseDatabaseManagerImpl baseDatabaseManagerImpl) {

		connectionID++;
		String stringID = application.getContext().getName() + "/" + connectionID;

		return stringID;
	}
}