package org.asup.db.core.base.graph;

import org.eclipse.datatools.connectivity.sqm.loader.IConnectionFilterProvider;
import org.eclipse.datatools.connectivity.sqm.loader.JDBCSchemaLoader;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Schema;

public class BaseSchemaLoader extends JDBCSchemaLoader {

	public BaseSchemaLoader(BaseCatalogContainer catalogObject, IConnectionFilterProvider connectionFilterProvider) {
		super(catalogObject, connectionFilterProvider);
	}

	@Override
	protected Schema createSchema() {
		
		BaseCatalogContainer catalogContainer = (BaseCatalogContainer) getCatalogObject();
		
		BaseSchema schema = new BaseSchema(catalogContainer.getConnection());
		schema.setCatalog(catalogContainer.getCatalog());

		return schema; 	
	}

	@Override
	protected Catalog getCatalog() {
		BaseCatalogContainer catalogContainer = (BaseCatalogContainer) getCatalogObject();
		return catalogContainer.getCatalog();
	}
}
