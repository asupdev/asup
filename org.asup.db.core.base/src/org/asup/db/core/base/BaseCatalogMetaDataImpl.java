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
package org.asup.db.core.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.asup.db.core.impl.CatalogMetaDataImpl;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

public class BaseCatalogMetaDataImpl extends CatalogMetaDataImpl {

	private Map<String, Schema> schemas;
	
	public BaseCatalogMetaDataImpl(Map<String, Schema> schemas) {
		this.schemas = schemas;
	}

	@Override
	public Schema getSchema(String schemaName) {
		return this.schemas.get(schemaName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Table getTable(String schemaName, String tableName) {

		Schema schema = getSchema(schemaName);
		if (schema == null)
			return null;

		for (Table table : (List<Table>) schema.getTables()) {
			
			if (table.getName().equals(tableName))
				return table;
		}

		return null;
	}

	@Override
	public ViewTable getView(String schemaName, String tableName) {

		Table table = getTable(schemaName, tableName);
		if(table == null)
			return null;
		
		if (table instanceof ViewTable)
			return (ViewTable) table;
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Index getIndex(String schemaName, String tableName, String indexName) {

		Table table = getTable(schemaName, tableName);
		if(table == null)
			return null;
		
		for (Index index : (List<Index>) table.getIndex()) {
			System.out.println(index.getName());
			if (index.getName().equalsIgnoreCase(indexName))
				return index;
		}
		
		return null;
	}

	public List<Schema> getSchemas() {
		return new ArrayList<Schema>(this.schemas.values());
	}
}
