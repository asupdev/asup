/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Giuliano Giancristofaro - Initial API and implementation 
 */
package org.asup.os.type.file.base.api;

import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QTable;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QPhysicalFile;

@Program(name = "QDBCLRPF")
public class PhysicalFileClearer {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	@Inject 
	private QSystemManager systemManager;
	@Inject 
	private QDatabaseManager databaseManager;	
	@Inject 
	private QConnectionManager connectionManager;


	@Entry
	public void main(TypedReference<QTypedObject> file, @DataDef(length = 10) QEnum<Member, QCharacter> member) {

		// TODO Intercept library special value
		QResourceReader<QFile> fileReader = resourceFactory.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		QFile qFile = fileReader.lookup(file.name.trimR());

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: "+ file);
		qFile.setLibrary(file.library.trimR());
		String databaseName = systemManager.getSystem().getSystemDatabase();
		QConnection databaseConnection = connectionManager.getDatabaseConnection(databaseName);

		// create
		try {
			if(qFile instanceof QPhysicalFile) {
				QTable table = databaseManager.getTable(databaseConnection, qFile.getLibrary(), qFile.getName());				
				databaseManager.deleteData(databaseConnection, table);
			}			
		} catch (SQLException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
	
	public static enum Member {
		@Special(value = "*FIRST")
		FIRST, 
		@Special(value = "*LAST")
		LAST, 
		@Special(value = "*ALL")
		ALL, OTHER
	}

}
