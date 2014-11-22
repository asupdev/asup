/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.db.syntax.base;

import org.asup.db.syntax.impl.AliasResolverImpl;
import org.eclipse.datatools.modelbase.sql.query.TableInDatabase;
import org.eclipse.datatools.modelbase.sql.query.TableJoined;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionColumn;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaFactory;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.ecore.EObject;

public class BaseSchemaAliasResolverImpl extends AliasResolverImpl {

	private String schemaWork;

	public BaseSchemaAliasResolverImpl(String schemaWork) {
		this.schemaWork = schemaWork;
	}

	@Override
	public String getAliasForColumn(Table table, String column) {
		return column;
	}

	@Override
	public Table getAliasForTable(Table table) {

		// Table name conversion
		table.setName(table.getName());

		Schema schema = table.getSchema();

		// Schema conversion
		if (schema == null) {
			schema = SQLSchemaFactory.eINSTANCE.createSchema();
			schema.setName(schemaWork);
		}

		String schemaName = schema.getName();

		if (schemaName == null || schemaName.length() == 0)
			schemaName = schemaWork;

		schema.setName(schemaName);
		table.setSchema(schema);

		return table;
	}

	@Override
	protected void analizeObject(EObject obj) {
		if (obj instanceof TableInDatabase) {

			TableInDatabase tableInDatabase = (TableInDatabase) obj;

			@SuppressWarnings("unused")
			String alias = "";

			Table resolvedTable = getAliasForTable(tableInDatabase
					.getDatabaseTable());

			tableInDatabase.setDatabaseTable(resolvedTable);
			tableInDatabase.setName(schemaWork+ getSchemaSeparator() + resolvedTable.getName());
		} else if (obj instanceof ValueExpressionColumn) {

			ValueExpressionColumn column = (ValueExpressionColumn) obj;

			TableInDatabase tableInDB = column.getTableInDatabase();

			Table table = null;

			if (tableInDB != null) {
				table = tableInDB.getDatabaseTable();
			}

			String name = column.getName();

			if (name != null && name.length() > 0) {
				String alias = getAliasForColumn(table, name);
				column.setName(alias);
			}
		} else if (obj instanceof TableJoined) {
			TableJoined tableJoined = (TableJoined) obj;
			
			// left
			TableInDatabase tableReferenceLeft = (TableInDatabase) tableJoined.getTableRefLeft();
			tableReferenceLeft.setName(schemaWork+ getSchemaSeparator() + tableReferenceLeft.getName());
			
			// right
			TableInDatabase tableReferenceRight = (TableInDatabase) tableJoined.getTableRefRight();
			tableReferenceRight.setName(schemaWork+ getSchemaSeparator() + tableReferenceRight.getName());
			
		}
	}
	
	private String getSchemaSeparator() {
		return ".";
	}
}
