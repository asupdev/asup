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
package org.asup.il.isam.jdbc;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QAliasResolverRegistry;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.db.syntax.QSyntaxBuilderRegistry;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;

public class JDBCIsamManagerImpl extends ServiceImpl implements QIsamManager {

	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QSyntaxBuilderRegistry syntaxBuilderRegistry;
	@Inject
	private QAliasResolverRegistry aliasResolverRegistry;
	
	@Override
	public QIsamFactory createFactory(QContext context, QContextID contextID) {
				
		QConnection connection = context.getAdapter(contextID, QConnection.class);
		QDataFactory dataFactory = dataManager.createFactory(contextID);
		
		QSyntaxBuilder syntaxBuilder = syntaxBuilderRegistry.lookup(connection.getConnectionConfig());
		QAliasResolver aliasResolver = aliasResolverRegistry.lookup("*JOB");
		
		return new JDBCIsamFactoryImpl(connection, databaseManager, syntaxBuilder, aliasResolver, dataFactory);
	}

}
