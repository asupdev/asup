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
import org.asup.fw.core.QContext;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
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

		switch (event.getType()) {
		case PRE_SAVE:
			createFile(event);
			break;
		case PRE_DELETE:
			deleteFile(event);
		default:
			break;
		}
	}

	private void createFile(QResourceEvent<QFile> event) throws OperatingSystemRuntimeException {

		QJob job = event.getResource().getJob();
		QContext jobContext = job.getJobContext();

		QFile file = event.getSource();
		file.setLibrary(((QResourceWriter<QFile>) event.getResource()).getContainer());

		QConnection connection = jobContext.getAdapter(job, QConnection.class);

		Schema schema = databaseManager.getSchema(connection, file.getLibrary());
		if (schema == null)
			throw new OperatingSystemRuntimeException("Schema not found: " + file.getLibrary());

		try {
			connection.setAutoCommit(false);

			if (file instanceof QPhysicalFile) {
				QPhysicalFile physicalFile = (QPhysicalFile) file;

				QTableDef tableDef = jobContext.getAdapter(physicalFile, QTableDef.class);
				databaseManager.createTable(connection, schema, file.getName(), tableDef);
			} else if (file instanceof QLogicalFile) {
				QLogicalFile logicalFile = (QLogicalFile) file;

				QViewDef viewDef = jobContext.getAdapter(logicalFile, QViewDef.class);
				databaseManager.createView(connection, schema, file.getName(), viewDef);
			}

			QIndexDef index = jobContext.getAdapter(file, QIndexDef.class);
			if (index != null) {
				Table table = databaseManager.getTable(connection, schema.getName(), file.getName());

				// append clustered index if needed
				if(!index.isClustered() && !hasClusteredIndex(table)) {
					
					QIndexDef pkIndexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();
					pkIndexDef.setClustered(true);
					pkIndexDef.setUnique(true);
					
					QIndexColumnDef pkIndexColumnDef = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
					pkIndexColumnDef.setName(DatabaseManagerImpl.TABLE_COLUMN_PRIMARY_KEY_NAME);
					pkIndexColumnDef.setSequence(1);					
					pkIndexDef.getColumns().add(pkIndexColumnDef);
					
					databaseManager.createIndex(connection, table, "QAS_"+table.getName()+"_RRN_IDX", pkIndexDef);
				}
				
				databaseManager.createIndex(connection, table, file.getName(), index);
			}
			
			try {
				connection.commit();
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e);
			}
		} catch (Exception e) {
			
			try {
				// TODO rollback on DTP graph
				connection.rollback();
			} catch (SQLException e1) {
				throw new OperatingSystemRuntimeException(e);
			}
			
			throw new OperatingSystemRuntimeException(e.getMessage(), e);
		}
	}

	private void deleteFile(QResourceEvent<QFile> event) throws OperatingSystemRuntimeException {

		QJob job = event.getResource().getJob();
		QContext jobContext = job.getJobContext();

		QFile file = event.getSource();
		file.setLibrary(((QResourceWriter<QFile>) event.getResource()).getContainer());

		QConnection databaseConnection = jobContext.getAdapter(job, QConnection.class);
		Schema schema = databaseManager.getSchema(databaseConnection, file.getLibrary());

		try {
			Index index = databaseManager.getIndex(databaseConnection, schema.getName(), file.getName());
			if (index != null)
				databaseManager.dropIndex(databaseConnection, index);
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage(), e);
		}

		try {
			if (file instanceof QPhysicalFile) {
				Table table = databaseManager.getTable(databaseConnection, schema.getName(), file.getName());
				databaseManager.dropTable(databaseConnection, table);
			} else if (file instanceof QLogicalFile) {
				ViewTable view = databaseManager.getView(databaseConnection, schema.getName(), file.getName());
				databaseManager.dropView(databaseConnection, view);
			}
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("unchecked")
	private boolean hasClusteredIndex(Table table) {
		
		for(Index index: (List<Index>)table.getIndex()) {
			if(index.isClustered())
				return true;
		}
		
		return false;
	}
}
