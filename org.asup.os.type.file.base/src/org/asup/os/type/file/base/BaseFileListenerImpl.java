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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QIndex;
import org.asup.db.core.QTable;
import org.asup.db.core.QView;
import org.asup.fw.core.QAdapterManager;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QPhysicalFile;

public class BaseFileListenerImpl extends ServiceImpl implements QResourceListener<QFile> {


	private QConnectionManager connectionManager = null;
	private QDatabaseManager databaseManager = null;	
	private QAdapterManager adapterManager;
	
	@Inject
	private QResourceFactory resourceFactory;
	
	@PostConstruct
	public void init() {
		resourceFactory.registerListener(QFile.class, this);
	}

	@Inject
	public BaseFileListenerImpl(QConnectionManager connectionManager, QDatabaseManager databaseManager, QAdapterManager adapterManager) {
		this.connectionManager = connectionManager;
		this.databaseManager = databaseManager;
		this.adapterManager = adapterManager;
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

		QFile file = event.getSource();
   		file.setLibrary(((QResourceWriter<QFile>)event.getResource()).getContainer());

   		String databaseName = event.getResource().getJob().getSystem().getSystemDatabase();
   		QConnection databaseConnection = connectionManager.getDatabaseConnection(databaseName);
		if(databaseConnection == null)
			throw new OperatingSystemRuntimeException("Install schema error: "+file.getLibrary());

		try {
			if(file instanceof QPhysicalFile) {
				QPhysicalFile physicalFile = (QPhysicalFile)file;
				
				QTable table = adapterManager.getAdapter(physicalFile, QTable.class);
				databaseManager.createTable(databaseConnection, table, false);				
				
				QIndex index = adapterManager.getAdapter(physicalFile, QIndex.class);
				if(index != null)
					databaseManager.createIndex(databaseConnection, index);
			}
			else if(file instanceof QLogicalFile) {
				QLogicalFile logicalFile = (QLogicalFile)file;
				
				QView view = adapterManager.getAdapter(logicalFile, QView.class);
				databaseManager.createView(databaseConnection, view);
				
				QIndex index = adapterManager.getAdapter(logicalFile, QIndex.class);
				if(index != null)
					databaseManager.createIndex(databaseConnection, index);
			}
		}
		catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage(), e);
		}
	}

	private void deleteFile(QResourceEvent<QFile> event) throws OperatingSystemRuntimeException {
		
/*		
		QFile file = event.getSource();
   		file.setLibrary(((QResourceWriter<QFile>)event.getResource()).getContainer());

   		String databaseName = event.getResource().getJob().getSystem().getSystemDatabase();
   		QConnection databaseConnection = connectionManager.getDatabaseConnection(databaseName);
		if(databaseConnection == null)
			throw new OperatingSystemRuntimeException("Install schema error: "+file.getLibrary());

		QSchema schema = databaseManager.getSchema(databaseConnection, file.getLibrary());

		if(file instanceof QPhysicalFile) {
			QPhysicalFile physicalFile = (QPhysicalFile)file;
			QTable table = physicalFile.getTable();
			
			table = (QTable) EcoreUtil.copy((EObject)table);
			table.setSchema(schema);
			try {
				databaseManager.dropTable(databaseConnection, table);
			}
			catch (Exception e) {
				throw new OperatingSystemRuntimeException(e.getMessage(), e);
			}
		}
		else if(file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile)file;
			QIndex index = logicalFile.getIndex();
			
			index = (QIndex) EcoreUtil.copy((EObject)index);
			index.setSchema(schema);
			try {
				databaseManager.dropIndex(databaseConnection, index);
			}
			catch (Exception e) {
				throw new OperatingSystemRuntimeException(e.getMessage(), e);
			}

			QView view = logicalFile.getView();
			view = (QView) EcoreUtil.copy((EObject)view);
			view.setSchema(schema);
			try {
				databaseManager.dropView(databaseConnection, view);
			}
			catch (Exception e) {
				throw new OperatingSystemRuntimeException(e.getMessage(), e);
			}					
		}*/
	}
}