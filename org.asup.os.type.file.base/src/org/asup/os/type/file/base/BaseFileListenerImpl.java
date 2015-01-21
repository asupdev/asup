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
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.fw.core.QContext;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.type.file.QDatabaseFile;
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

		QFile file = event.getSource();
		
		if(!(file instanceof QDatabaseFile))
			return;
		
			
		if(event.getType() != ResourceEventType.PRE_SAVE && event.getType() != ResourceEventType.PRE_DELETE)
			return;
		
		QJob job = event.getResource().getJob();


//		file.setLibrary(((QResourceReader<QFile>) event.getResource()).getContainer());

		QContext jobContext = job.getContext();
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

	private void createFile(QContext jobContext, QFile file, QConnection connection, Schema schema) throws SQLException {

		if (file instanceof QPhysicalFile) {
			QPhysicalFile physicalFile = (QPhysicalFile) file;

			QTableDef tableDef = jobContext.getAdapter(physicalFile, QTableDef.class);
			Table table = databaseManager.createTable(connection, schema, file.getName(), tableDef);

			QIndexDef index = jobContext.getAdapter(file, QIndexDef.class);
			if (index != null)
				databaseManager.createIndex(connection, table, file.getName(), index);

		} else if (file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;

			Table table = null;
			
			QViewDef viewDef = jobContext.getAdapter(logicalFile, QViewDef.class);
			if(viewDef != null)
				table = databaseManager.createView(connection, schema, file.getName(), viewDef);

			QIndexDef index = jobContext.getAdapter(file, QIndexDef.class);
			if (index != null) {

				// retrieve first table (strategy or index with no view)
				if (!connection.getCatalogGenerationStrategy().isCreateIndexOnView() || table == null)
					table = connection.getCatalogMetaData().getTable(schema.getName(), logicalFile.getTables().get(0));

				if (table != null)
					databaseManager.createIndex(connection, table, file.getName(), index);
				else
					System.err.println("Ecchime !!!!!! : " + file);
			}
		}
	}

	private void deleteFile(QContext jobContext, QFile file, QConnection connection, Schema schema) throws SQLException {

		if (file instanceof QPhysicalFile) {
			Table table = connection.getCatalogMetaData().getTable(schema.getName(), file.getName());
			databaseManager.dropTable(connection, table);
		} else if (file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile)file;
			
			// retrieve first table
			if (!connection.getCatalogGenerationStrategy().isCreateIndexOnView()) {
				Index index = connection.getCatalogMetaData().getIndex(schema.getName(), logicalFile.getTables().get(0), file.getName());
				if (index != null) 
					databaseManager.dropIndex(connection, index);
			}
			else {
				Index index = connection.getCatalogMetaData().getIndex(schema.getName(), file.getName(), file.getName());
				if (index != null) 
					databaseManager.dropIndex(connection, index);
			}
			
			ViewTable view = (ViewTable) connection.getCatalogMetaData().getTable(schema.getName(), file.getName());
			if(view != null)
				databaseManager.dropView(connection, view);
		} else
			return;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private boolean hasClusteredIndex(Table table) {

		for (Index index : (List<Index>) table.getIndex()) {
			if (index.isClustered())
				return true;
		}
		return false;
	}
}
