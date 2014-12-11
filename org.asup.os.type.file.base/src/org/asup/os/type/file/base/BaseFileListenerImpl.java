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
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.core.impl.DatabaseManagerImpl;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobContext;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QPhysicalFile;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

public class BaseFileListenerImpl extends ServiceImpl implements QResourceListener<QFile> {

	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QResourceFactory resourceFactory;

	@PostConstruct
	public void init() {
		resourceFactory.registerListener(QFile.class, this);
	}

	@Override
	public void handleEvent(QResourceEvent<QFile> event) {

		QJob job = event.getResource().getJob();

		QFile file = event.getSource();
		file.setLibrary(((QResourceWriter<QFile>) event.getResource()).getContainer());

		QJobContext jobContext = job.getJobContext();
		QConnection connection = jobContext.getAdapter(job, QConnection.class);

		Schema schema = connection.getCatalogMetaData().getSchema(file.getLibrary());

		if (schema == null)
			throw new OperatingSystemRuntimeException("Schema not found: " + file.getLibrary());

		switch (event.getType()) {
		case PRE_SAVE:
			try {
				createFile(jobContext, file, connection, schema);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e); 
			}
			break;
		case PRE_DELETE:
			try {
				deleteFile(jobContext, file, connection, schema);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e); 
			}
		default:
			break;
		}
	}

	private void createFile(QJobContext jobContext, QFile file, QConnection connection, Schema schema) throws SQLException {

		if (file instanceof QPhysicalFile) {
			QPhysicalFile physicalFile = (QPhysicalFile) file;

			QTableDef tableDef = jobContext.getAdapter(physicalFile, QTableDef.class);
			databaseManager.createTable(connection, schema, file.getName(), tableDef);
		} else if (file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;

			QViewDef viewDef = jobContext.getAdapter(logicalFile, QViewDef.class);
			databaseManager.createView(connection, schema, file.getName(), viewDef);
		}
		else
			System.err.println(file);

		try {
			QIndexDef index = jobContext.getAdapter(file, QIndexDef.class);
			if (index != null) {
				Table table = connection.getCatalogMetaData().getTable(schema.getName(), file.getName());
	
				// append clustered index if needed
				if (!index.isClustered() && !hasClusteredIndex(table)) {
	
					QIndexDef pkIndexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();
					pkIndexDef.setClustered(true);
					pkIndexDef.setUnique(true);
	
					QIndexColumnDef pkIndexColumnDef = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
					pkIndexColumnDef.setName(DatabaseManagerImpl.TABLE_COLUMN_PRIMARY_KEY_NAME);
					pkIndexColumnDef.setSequence(1);
					pkIndexDef.getColumns().add(pkIndexColumnDef);
	
					databaseManager.createIndex(connection, table, "QAS_" + table.getName() + "_RRN_IDX", pkIndexDef);
				}
	
				databaseManager.createIndex(connection, table, file.getName(), index);
			}
		}
		// TODO issue #77
		catch(Exception e) {
			System.err.println(e);
		}
	}

	private void deleteFile(QJobContext jobContext, QFile file, QConnection connection, Schema schema) throws SQLException {

		Table table = connection.getCatalogMetaData().getTable(schema.getName(), file.getName());

		Index index = connection.getCatalogMetaData().getIndex(table.getSchema().getName(), table.getName(), file.getName());
		if (index != null)
			databaseManager.dropIndex(connection, index);

		if (file instanceof QPhysicalFile) {
			databaseManager.dropTable(connection, table);
		} else if (file instanceof QLogicalFile) {
			ViewTable view = (ViewTable) table;
			databaseManager.dropView(connection, view);
		}
	}

	@SuppressWarnings("unchecked")
	private boolean hasClusteredIndex(Table table) {

		for (Index index : (List<Index>) table.getIndex()) {
			if (index.isClustered())
				return true;
		}
		return false;
	}
}
