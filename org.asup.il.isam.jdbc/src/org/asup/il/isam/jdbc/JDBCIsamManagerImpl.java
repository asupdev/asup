package org.asup.il.isam.jdbc;

import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QAliasResolverRegistry;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QIsamManager;

public class JDBCIsamManagerImpl extends ServiceImpl implements QIsamManager {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QAliasResolverRegistry aliasResolverRegistry;
	
	@Override
	public QIsamFactory createFactory(QContextID contextID) {
				
		QDataFactory dataFactory = dataManager.createFactory(contextID);
		QConnection connection = connectionManager.getDatabaseConnection("*LOCAL");

		QAliasResolver aliasResolver = aliasResolverRegistry.lookup("*JOB");
		
		return new JDBCIsamFactoryImpl(connection, aliasResolver, dataFactory);
	}

}
