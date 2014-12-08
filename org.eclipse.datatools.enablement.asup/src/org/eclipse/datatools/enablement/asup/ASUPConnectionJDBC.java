package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.connectivity.DriverConnectionBase;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.Version;
import org.eclipse.datatools.connectivity.drivers.jdbc.JDBCConnectionFactory;

public class ASUPConnectionJDBC extends DriverConnectionBase {

	@SuppressWarnings("unused")
	private QConnectionManager connectionManager;

	@SuppressWarnings("unused")
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
		return null;
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
		return null;
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
/*			
			try {
				
				QDatabaseContainer databaseContainer = databaseManager.getDatabaseContainer();
				
				
				
				for(QCatalogContainer catalogContainer: databaseContainer.getCatalogContainers()) {
					
//					if(catalogContainer.getCatalog().equals(databaseContainer.getDefaultCatalog())) {
						QConnectionConfig connectionConfig = catalogContainer.getConnectionConfig();
						QConnection qConnection = connectionManager.createDatabaseConnection(connectionConfig);
						mConnection = qConnection;
						
						break;
//					}
				}
				
				
//				job.getJobContext().set(QConnection.class, connection);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}*/
		} 
		if(mConnection == null) {
			System.err.println("Unexpected condition: qw823nx5734xn32were");
		}
		return mConnection;
	}
}
