package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;

public class ASUPConnectionPing implements IConnection {

	IConnectionProfile profile;
	
	public ASUPConnectionPing(IConnectionProfile profile) {
		this.profile = profile;
	}

	@Override
	public Object getRawConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
	}

	@Override
	public Throwable getConnectException() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConnectionProfile getConnectionProfile() {
		return profile;
	}

}
