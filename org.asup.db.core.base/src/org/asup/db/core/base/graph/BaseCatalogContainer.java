package org.asup.db.core.base.graph;

import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;

public class BaseCatalogContainer implements ICatalogObject {

	private Connection connection;
	private Catalog catalog;
	
	public BaseCatalogContainer(Connection connection, Catalog catalog) {
		this.connection = connection;
		this.catalog = catalog;
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
		return catalog.getDatabase();
	}

	protected Catalog getCatalog() {
		return catalog;
	}
}
