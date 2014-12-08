package org.asup.db.core.base;

import java.util.List;

import org.asup.db.core.impl.CatalogMetaDataImpl;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

public class BaseCatalogMetaDataImpl extends CatalogMetaDataImpl {

	private List<Schema> schemas;
	
	public BaseCatalogMetaDataImpl(List<Schema> schemas) {
		this.schemas = schemas;
	}

	@Override
	public Schema getSchema(String schemaName) {

		for (Schema schema : (List<Schema>) getSchemas()) {
			if (schema.getName().equals(schemaName))
				return schema;
		}

		return null;
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
		if (table instanceof ViewTable)
			return (ViewTable) table;
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Index getIndex(String schemaName, String tableName, String indexName) {

		Schema schema = getSchema(schemaName);
		for (Index index : (List<Index>) schema.getIndices()) {
			if (index.getName().equalsIgnoreCase(indexName))
				return index;
		}
		
		return null;
	}

	public List<Schema> getSchemas() {
		return schemas;
	}
}
