package org.asup.db.core.base;

import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionFilter;
import org.eclipse.datatools.connectivity.sqm.loader.ConnectionFilterProvider;

public class BaseConnectionFilterProvider extends ConnectionFilterProvider {

	@Override
	public ConnectionFilter getConnectionFilter(ICatalogObject catalogObject) {
		return new BaseConnectionFilter();
	}

}
