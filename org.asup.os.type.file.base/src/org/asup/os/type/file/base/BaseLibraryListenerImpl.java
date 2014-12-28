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
package org.asup.os.type.file.base;

import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QSchemaDef;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.type.lib.QLibrary;
import org.eclipse.datatools.modelbase.sql.schema.Schema;

public class BaseLibraryListenerImpl extends ServiceImpl implements QResourceListener<QLibrary> {

	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QResourceFactory resourceFactory;

	@PostConstruct
	public void init() {
		resourceFactory.registerListener(QLibrary.class, this);
	}

	@Override
	public void handleEvent(QResourceEvent<QLibrary> event) {

		if(event.getType() != ResourceEventType.PRE_SAVE && event.getType() != ResourceEventType.PRE_DELETE)
			return;
		
		QLibrary library = event.getSource();
		QJob job = event.getResource().getJob();

		QConnection connection = job.getContext().getAdapter(job, QConnection.class);
		if (connection == null)
			throw new OperatingSystemRuntimeException("Database connection not found: " + job);

		switch (event.getType()) {

		case PRE_SAVE:

			try {
				createSchema(job, library, connection);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e); 
			}
			break;

		case PRE_DELETE:
			try {
				dropSchema(job, library, connection);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e); 
			}
			break;

		default:
			break;
		}
	}

	private void createSchema(QJob job, QLibrary library, QConnection connection) throws SQLException {

		// schema
		Schema schema = connection.getCatalogMetaData().getSchema(library.getName());
		if (schema == null) {
			QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();

			databaseManager.createSchema(connection, library.getName(), schemaDef);
		} else
			System.err.println("Schema already exists: " + library.getName());
	}

	private void dropSchema(QJob job, QLibrary library, QConnection connection) throws SQLException {

		// schema
		Schema schema = connection.getCatalogMetaData().getSchema(library.getName());
		if (schema == null)
			throw new SQLException("Schema not found: " + library.getName());

		databaseManager.dropSchema(connection, schema, false);
	}
}