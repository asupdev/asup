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

		QLibrary library = event.getSource();
		QJob job = event.getResource().getJob();

		QConnection connection = job.getJobContext().getAdapter(job, QConnection.class);
		if (connection == null)
			throw new OperatingSystemRuntimeException("Database connection not found: " + job);

		try {
			connection.setAutoCommit(false);

			switch (event.getType()) {

			case PRE_SAVE:

				createSchema(job, library, connection);
				break;

			case PRE_DELETE:
				dropSchema(job, library, connection);
				break;

			default:
				break;
			}

			connection.commit();
		} catch (Exception exception) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}

	}

	private void createSchema(QJob job, QLibrary library, QConnection connection) throws Exception {

		// schema
		Schema schema = connection.getCatalogMetaData().getSchema(library.getName());
		if (schema == null) {
			QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();

			databaseManager.createSchema(connection, library.getName(), schemaDef);
		} else
			System.err.println("Schema already exists: " + library.getName());
	}

	private void dropSchema(QJob job, QLibrary library, QConnection connection) throws Exception {

		// schema
		Schema schema = connection.getCatalogMetaData().getSchema(library.getName());
		if (schema == null)
			throw new OperatingSystemRuntimeException("Schema not found: " + library.getName());

		databaseManager.dropSchema(connection, schema, false);
	}
}