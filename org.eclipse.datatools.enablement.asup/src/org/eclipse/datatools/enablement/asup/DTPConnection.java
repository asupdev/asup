package org.eclipse.datatools.enablement.asup;

import java.sql.Connection;
import java.sql.SQLException;

import org.asup.db.core.QConnection;
import org.eclipse.datatools.connectivity.DriverConnectionBase;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.Version;

public class DTPConnection extends DriverConnectionBase {

	private QConnection connection;
		
	public DTPConnection(QConnection connection, Exception connectionException, IConnectionProfile profile, Class<?> factoryClass) {
		super(profile, factoryClass);
		this.connection = connection;
		this.mConnectException = connectionException;
	}

	@Override
	public void open() {
		if (mConnection != null) {
			close();
		}

		mConnection = connection;
		
		if(mConnectException != null) 
			return;

		try {
						
/*			System.out.println(connectionProfile.getInstanceID());
			System.out.println(connectionProfile.getName());
			System.out.println(connectionProfile.getProviderId());
			System.out.println(connectionProfile.getProviderName());*/
			
			
/*			DriverInstance driver = getDriverDefinition();
			ClassLoader parentCL = getParentClassLoader();
			ClassLoader driverCL = parentCL == null ? driver.getClassLoader()
					: driver.createClassLoader(parentCL);
			
			mConnection = createConnection(driverCL);

			if (mConnection == null) {
				// Connect attempt failed without throwing an exception.
				// We'll generate one for them.
				throw new Exception(ConnectivityPlugin.getDefault().getResourceString("DriverConnectionBase.error.unknown")); //$NON-NLS-1$
			}
*/
//			initVersions();
//			updateVersionCache();
		}
		catch (Throwable t) {
			mConnectException = t;
			clearVersionCache();
		}
		// TODO
	}

	@Override
	public void close() {
		Connection connection = (Connection) getRawConnection();
		if (connection != null) {
			try {
				connection.close();
			}
			catch (SQLException e) {
				// RJC Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	protected Object createConnection(ClassLoader cl) throws Throwable {
		// TODO Auto-generated method stub
		
		cl.toString();
		
		return null;
	}

	@Override
	public Version getProviderVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProviderName() {
		// TODO Auto-generated method stub
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
	protected void initVersions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getTechnologyRootKey() {
		// TODO Auto-generated method stub
		return null;
	}
}
