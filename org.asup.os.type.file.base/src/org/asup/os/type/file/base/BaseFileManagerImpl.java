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

import javax.inject.Inject;

import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.annotation.ServiceRegistration;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.impl.FileManagerImpl;

public class BaseFileManagerImpl extends FileManagerImpl {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QConnectionManager connectionManager;
	
	@ServiceRegistration
	public void init() {		
		QConnectionConfig connectionConfig = (QConnectionConfig) getConfig();
		connectionManager.registerConnectionConfig(systemManager.getSystem().getSystemDatabase(), connectionConfig);
	}
	
//	@Override
/*	public QConnection getDatabaseConnection(QJob job) throws OperatingSystemRuntimeException {
		
		QConnection databaseConnection = connections.get(job.getID());
		if(databaseConnection == null) {
			databaseConnection = connectionManager.getDatabaseConnection(job.getSystem().getSystemDatabase());
			if(databaseConnection == null)
				throw new OperatingSystemRuntimeException("Database connection not found; "+job.getSystem().getSystemDatabase());
			connections.put(job.getID(), databaseConnection);
		}
		
		return databaseConnection;
	}*/

	@Override
	public void overrideFile(QJob job, String fileFrom, QFile fileTo) throws OperatingSystemRuntimeException {

		try {			
			BaseOverridedFileMap overrideFileMap = getOverridedFile(job);
			overrideFileMap.registerFile(fileFrom, fileTo);
			
		} catch (FrameworkCoreException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public QFile getOverriddenFile(QJob job, String fileName) throws OperatingSystemRuntimeException {
		
		try {
			
			BaseOverridedFileMap overrideFileMap = getOverridedFile(job);
			
			QFile qFile = overrideFileMap.getFile(fileName);

/*			if(qFile != null) 
				return qFile;
		
			QResourceReader<QFile> fileReader = resourceFactory.getResourceReader(job, QFile.class, QScope.LIBRARY_LIST);
			qFile = fileReader.lookup(fileName);
			
			if(qFile == null)
				throw new OperatingSystemRuntimeException("File not found: "+fileName);

			fileReader.close();*/
			
			return qFile;
			
		} catch (FrameworkCoreException e) {
			throw new OperatingSystemRuntimeException(e);
		}
		
	}

	private BaseOverridedFileMap getOverridedFile(QJob job) throws FrameworkCoreException {
		BaseOverridedFileMap overrideFileMap = job.getJobContext().get(BaseOverridedFileMap.class);
		if(overrideFileMap == null) {
			overrideFileMap = new BaseOverridedFileMap();
			job.getJobContext().set(BaseOverridedFileMap.class, overrideFileMap);
		}
		return overrideFileMap;
	}
	

	@Override
	public Class<QFile> getTypedClass() {
		return QFile.class;
	}
}