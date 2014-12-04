package org.asup.db.core.base.graph;

import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;

public class BaseSchemaContainer implements ICatalogObject {

	private Connection connection;
	private Schema schema;
	
	public BaseSchemaContainer(Connection connection, Schema schema) {
		this.connection = connection;
		this.schema = schema;
	}
	
	@Override
	public void refresh() {
		System.out.println("refresh");
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public Database getCatalogDatabase() {
		return schema.getCatalog().getDatabase();
	}

	public Schema getSchema() {
		return schema;
	}
}
