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
package org.asup.db.core.db2;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.base.BaseConnectionContextImpl;
import org.asup.db.core.base.BaseConnectionImpl;
import org.asup.db.core.impl.ConnectionFactoryImpl;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.QQueryWriterRegistry;
import org.asup.fw.core.QContext;

public class DB2ConnectionFactoryImpl extends ConnectionFactoryImpl {

	@Inject
	private QContext context;
	@Inject
	private QQueryParserRegistry queryParserRegistry;
	@Inject
	private QQueryWriterRegistry queryConverterRegistry;

	private QQueryParser queryParser;

	@PostConstruct
	private void init() {
		this.queryParser = this.queryParserRegistry.lookup("IBMI");
		
	}

	@Override
	public QConnection createDatabaseConnection(QConnectionConfig connectionConfig) {

		QConnectionContext connectionContext = new BaseConnectionContextImpl(context.createChild());
		QQueryWriter queryConverter = queryConverterRegistry.lookup(connectionConfig);
		return new BaseConnectionImpl(connectionContext, connectionConfig, queryParser, queryConverter);
	}
}
