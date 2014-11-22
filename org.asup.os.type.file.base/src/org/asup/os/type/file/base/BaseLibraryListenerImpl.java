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
		QJob job = null;
		switch (event.getType()) {
			case PRE_SAVE:
				job = event.getResource().getJob();
				createSchema(job, library);
				break;

			case PRE_DELETE:
				job = event.getResource().getJob();
				dropSchema(job, library);
				break;

			default:
				break;
		}

	}

	private void createSchema(QJob job, QLibrary library) throws OperatingSystemRuntimeException {

		// database connection
		QConnection databaseConnection = job.getJobContext().getAdapter(job, QConnection.class);
		if (databaseConnection == null)
			throw new OperatingSystemRuntimeException("Database connection not found: " + job);

		// schema
		Schema schema = databaseManager.getSchema(databaseConnection, library.getName());
		if (schema == null) {
			QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
			schemaDef.setName(library.getName());

			// create
			try {
				databaseManager.createSchema(databaseConnection, schemaDef);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		} else
			System.err.println("Schema already exists: " + library.getName());
	}

	private void dropSchema(QJob job, QLibrary library) throws OperatingSystemRuntimeException {

		// database connection
		QConnection databaseConnection = job.getJobContext().getAdapter(job, QConnection.class);
		if (databaseConnection == null)
			throw new OperatingSystemRuntimeException("Database connection not found: " + job);

		// schema
		Schema schema = databaseManager.getSchema(databaseConnection, library.getName());
		if (schema == null)
			throw new OperatingSystemRuntimeException("Schema not found: " + library.getName());

		try {
			databaseManager.dropSchema(databaseConnection, schema);
		} catch (SQLException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}