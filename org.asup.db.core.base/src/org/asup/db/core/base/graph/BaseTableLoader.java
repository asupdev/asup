package org.asup.db.core.base.graph;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;

import org.eclipse.datatools.connectivity.sqm.loader.IConnectionFilterProvider;
import org.eclipse.datatools.connectivity.sqm.loader.JDBCTableLoader;
import org.eclipse.datatools.connectivity.sqm.loader.Messages;
import org.eclipse.datatools.modelbase.sql.schema.Schema;

public class BaseTableLoader extends JDBCTableLoader {

	public BaseTableLoader(BaseSchemaContainer catalogObject, IConnectionFilterProvider connectionFilterProvider) {
		super(catalogObject, connectionFilterProvider);
	}

	@Override
	protected Schema getSchema() {

		BaseSchemaContainer schemaContainer = (BaseSchemaContainer) getCatalogObject();
		return schemaContainer.getSchema();
	}

	protected ResultSet createResultSet() throws SQLException {
		try {
			Schema schema = getSchema();
			
			// TODO virtual value
			
			return getCatalogObject().getConnection().getMetaData().getTables("", schema.getName(), getJDBCFilterPattern(), null);
		} catch (RuntimeException e) {
			SQLException error = new SQLException(MessageFormat.format(Messages.Error_Unsupported_DatabaseMetaData_Method, new Object[] { "java.sql.DatabaseMetaData.getTables()" })); //$NON-NLS-1$
			error.initCause(e);
			throw error;
		}
	}
}
