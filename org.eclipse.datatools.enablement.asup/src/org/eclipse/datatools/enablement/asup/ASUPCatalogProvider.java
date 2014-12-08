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
package org.eclipse.datatools.enablement.asup;

import java.sql.Connection;

import org.asup.db.core.QDatabaseContainer;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogProvider;
import org.eclipse.datatools.modelbase.sql.schema.Database;

public class ASUPCatalogProvider implements ICatalogProvider, IExecutableExtension {


	@SuppressWarnings("unused")
	private String product;
	@SuppressWarnings("unused")
	private String version;
	
	protected static QDatabaseContainer databaseContainer;

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) {

		this.product = config.getAttribute("product"); //$NON-NLS-1$
		this.version = config.getAttribute("version"); //$NON-NLS-1$
	}

	public Database getCatalogDatabase(Connection connection) {
		return null;
	}
}
