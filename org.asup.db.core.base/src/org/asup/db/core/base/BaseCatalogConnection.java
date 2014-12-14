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

import java.sql.Connection;
import java.sql.SQLException;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QCatalogMetaData;
import org.asup.db.syntax.QDefinitionWriter;
import org.asup.db.syntax.QQueryWriter;
import org.asup.fw.core.FrameworkCoreUnexpectedConditionException;

public class BaseCatalogConnection {

	private Connection rawConnection;

	private QCatalogContainer catalogContainer;
	
	private QQueryWriter queryWriter;
	private QDefinitionWriter definitionWriter;

	protected BaseCatalogConnection(QCatalogContainer catalogContainer) {
		this.catalogContainer = catalogContainer;
		this.queryWriter = catalogContainer.getCatalogContext().get(QQueryWriter.class);
		this.definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
	}

	public QCatalogContainer getCatalogContainer() {
		return this.catalogContainer;
	}
	
	public QQueryWriter getQueryWriter() {
		return queryWriter;
	}

	public QDefinitionWriter getDefinitionWriter() {
		return definitionWriter;
	}

	public QCatalogMetaData getCatalogMetaData() {
		return catalogContainer.getMetaData();
	}
	
	protected synchronized Connection getRawConnection() throws SQLException {

		if (rawConnection == null || rawConnection.isClosed()) {

			this.rawConnection = catalogContainer.createConnection(Connection.class);
			if (this.rawConnection == null)
				throw new FrameworkCoreUnexpectedConditionException("Raw connection is null: " + this);

			this.rawConnection.setCatalog(catalogContainer.getConnectionConfig().getCatalog());
		}

		return rawConnection;
	}

	public void close() throws SQLException {

		if (this.rawConnection != null)
			this.rawConnection.close();
	}
}
