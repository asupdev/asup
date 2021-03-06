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
import org.asup.db.core.QStatement;
import org.asup.db.syntax.QDefinitionWriter;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QPhysicalFile;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

@Program(name = "QDBCLRPF")
public class PhysicalFileClearer {

	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;

	@Entry
	public void main(TypedReference<QTypedObject> file, @DataDef(length = 10) QEnum<Member, QCharacter> member) {

		// TODO Intercept library special value
		QResourceReader<QFile> fileReader = resourceFactory.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		QFile qFile = fileReader.lookup(file.name.trimR());

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: "+ file);
		qFile.setLibrary(file.library.trimR());
		QConnection connection = job.getContext().getAdapter(job, QConnection.class);

		// create
		try {
			if(qFile instanceof QPhysicalFile) {
				Table table = connection.getCatalogMetaData().getTable(qFile.getLibrary(), qFile.getName());				
				deleteData(connection, table);
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


	public void deleteData(QConnection connection, Table table) throws SQLException {

		// persistent table only
		if (table instanceof ViewTable)
			return;

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = connection.getContext().get(QDefinitionWriter.class);
			String command = definitionWriter.deleteData(table);
			
			statement = connection.createStatement(true);
			statement.execute(command);
		} finally {
			if (statement != null)
				statement.close();
		}
	}

}
