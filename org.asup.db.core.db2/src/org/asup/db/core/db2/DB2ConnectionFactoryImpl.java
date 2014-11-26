package org.asup.db.core.db2;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionContext;
import org.asup.db.core.base.BaseConnectionAdapterFactoryImpl;
import org.asup.db.core.base.BaseConnectionContextImpl;
import org.asup.db.core.base.BaseConnectionImpl;
import org.asup.db.core.impl.ConnectionFactoryImpl;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.QQueryWriterRegistry;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.fw.core.QContext;
import org.eclipse.core.internal.runtime.AdapterManager;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.datatools.enablement.ibm.db2.luw.catalog.LUWCatalogDatabase;

@SuppressWarnings("restriction")
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
		IAdapterFactory adapterFactory = new BaseConnectionAdapterFactoryImpl();
		
		AdapterManager.getDefault().registerAdapters(adapterFactory, QConnection.class);
		AdapterManager.getDefault().registerAdapters(adapterFactory, QConnectionConfig.class);

		this.queryParser = this.queryParserRegistry.lookup("IBMI");
		
	}

	@Override
	public QConnection createDatabaseConnection(QConnectionConfig connectionConfig) {

		QConnectionContext connectionContext = new BaseConnectionContextImpl(context.createChild());
		QQueryWriter queryConverter = queryConverterRegistry.lookup(connectionConfig);
		return new BaseConnectionImpl(connectionContext, connectionConfig, queryParser, queryConverter);
	}
}
