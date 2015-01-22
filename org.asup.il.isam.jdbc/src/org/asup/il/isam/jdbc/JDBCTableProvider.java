package org.asup.il.isam.jdbc;

import java.sql.SQLException;

import org.asup.db.core.QCatalogMetaData;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionDescription;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class JDBCTableProvider {

	private QConnection connection;

	public JDBCTableProvider(QConnection connection) {
		this.connection = connection;
	}

	public Table getTable(String container, String name) throws SQLException {

		QCatalogMetaData catalogMetaData = connection.getCatalogMetaData();

		if (container == null) {
			QConnectionDescription connectionDescription = connection.getConnectionDescription();
			return catalogMetaData.getTable(connectionDescription, name);
		} else {
			return catalogMetaData.getTable(container, name);
		}
	}

}
