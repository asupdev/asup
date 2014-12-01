package org.eclipse.datatools.enablement.asup;

import java.sql.Connection;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionInfoImpl;
import org.eclipse.datatools.modelbase.sql.schema.Database;

public class ASUPConnectionInfo extends ConnectionInfoImpl {

	public ASUPConnectionInfo(IConnectionProfile profile, Class<ASUPConnectionFactory> factoryClass) {
		super(profile, factoryClass);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseDefinition getDatabaseDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDriverClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIdentifierQuoteString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getSharedConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Database getSharedDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Database getCachedDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCachedDatabaseTimestamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<?> getFilters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConnectionProfile getConnectionProfile() {
		return super.getConnectionProfile();
	}

}
