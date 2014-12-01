package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.DriverConnectionBase;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.Version;
import org.eclipse.datatools.connectivity.drivers.DriverInstance;

public abstract class ASUPConnection extends DriverConnectionBase {

	public ASUPConnection(IConnectionProfile profile, Class<?> factoryClass) {
		super(profile, factoryClass);
	}

	@Override
	public void open() {
		if (mConnection != null) {
			close();
		}

		mConnection = null;
		mConnectException = null;
		
		if(mConnectException != null) 
			return;

		super.open();
		
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
		if (mConnection != null)
			mConnection = null;
	}

	@Override
	protected Object createConnection(ClassLoader cl) throws Throwable {

		return new ASUPConnectionInfo(getConnectionProfile(), getConnectionFactoryClass());
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

	@Override
	public Object getRawConnection() {
		// TODO Auto-generated method stub
		return super.getRawConnection();
	}

	@Override
	public Throwable getConnectException() {
		// TODO Auto-generated method stub
		return super.getConnectException();
	}

	@Override
	protected ClassLoader getParentClassLoader() {
		// TODO Auto-generated method stub
		return super.getParentClassLoader();
	}

	@Override
	protected DriverInstance getDriverDefinition() throws Exception {
		// TODO Auto-generated method stub
		return super.getDriverDefinition();
	}

	@Override
	protected String getDriverDefinitionId() {
		// TODO Auto-generated method stub
		return super.getDriverDefinitionId();
	}

	@Override
	public IConnectionProfile getConnectionProfile() {
		// TODO Auto-generated method stub
		return super.getConnectionProfile();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<ASUPConnectionFactory> getConnectionFactoryClass() {
		return super.getConnectionFactoryClass();
	}

	@Override
	protected void updateVersionCache() {
		return;
	}

	@Override
	protected void clearVersionCache() {
		// TODO Auto-generated method stub
		super.clearVersionCache();
	}
}
