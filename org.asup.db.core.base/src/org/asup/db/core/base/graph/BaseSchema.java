package org.asup.db.core.base.graph;

import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.rte.jdbc.JDBCSchema;
import org.eclipse.datatools.connectivity.sqm.loader.JDBCTableLoader;

public class BaseSchema extends JDBCSchema {
	
	private Connection connection;
	
	public BaseSchema(Connection connection) {
		super();
		this.connection = connection;
	}
	
	protected JDBCTableLoader createTableLoader() {
	
		BaseSchemaContainer schemaContainer = new BaseSchemaContainer(connection, this);
		
		BaseTableLoader tableLoader = new BaseTableLoader(schemaContainer, new BaseConnectionFilterProvider());	
		
		return tableLoader;
	}
}