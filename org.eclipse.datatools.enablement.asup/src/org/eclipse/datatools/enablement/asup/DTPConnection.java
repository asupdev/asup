package org.eclipse.datatools.enablement.asup;

import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.datatools.connectivity.DriverConnectionBase;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.Version;

public class DTPConnection extends DriverConnectionBase {

	public DTPConnection(IConnectionProfile profile, Class<?> factoryClass) {
		super(profile, factoryClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		if (mConnection != null) {
			close();
		}

		mConnection = null;
		mConnectException = null;

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
	protected Object createConnection(ClassLoader cl) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void initVersions() {
		// TODO Auto-generated method stub
		System.out.println("ecchime");
	}

	@Override
	protected String getTechnologyRootKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
