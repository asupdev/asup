package org.eclipse.datatools.enablement.asup;

import java.sql.SQLException;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.connectivity.DriverConnectionBase;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.Version;
import org.eclipse.datatools.connectivity.drivers.jdbc.JDBCConnectionFactory;

public class ASUPConnectionJDBC extends DriverConnectionBase {

	private QConnectionManager connectionManager;

	private QDatabaseManager databaseManager;

	public ASUPConnectionJDBC(QConnectionManager connectionManager, QDatabaseManager databaseManager, IConnectionProfile profile, Class<JDBCConnectionFactory> class1) {
		super(profile, class1);
		
		this.connectionManager = connectionManager;
		this.databaseManager = databaseManager;
	}

	@Override
	public void close() {
		System.err.println("Close "+mConnection);
	}

	@Override
	public Version getProviderVersion() {
		return new Version(0, 5, 3, null);
	}

	@Override
	public String getProviderName() {
		return "AsUP";
	}

	@Override
	public Version getTechnologyVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTechnologyName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object createConnection(ClassLoader cl) throws Throwable {		
		return getRawConnection();
	}

	@Override
	protected void initVersions() {
	}

	@Override
	protected String getTechnologyRootKey() {
		return "AsUP";
	}

	@Override
	protected void updateVersionCache() {
	}

	@Override
	protected void clearVersionCache() {
	}

	@Override
	public Object getRawConnection() {

		if(mConnection == null) {
			
			try {
				
				QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();
				
				for(QCatalogContainer catalogContainer: databaseContainer.getCatalogs()) {
					
					if(catalogContainer.getCatalog().getName().equals(databaseContainer.getLocalCatalog())) {
						QConnectionConfig connectionConfig = catalogContainer.getDefaultConfig();
						QConnection qConnection = connectionManager.createDatabaseConnection(connectionConfig);
						mConnection = qConnection;
						
						break;
					}
				}
				
				
//				job.getJobContext().set(QConnection.class, connection);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		} 
		if(mConnection == null) {
			System.err.println("Unexpected condition: qw823nx5734xn32were");
		}
		return mConnection;
	}
}
