package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;


public class DTPPingConnectionFactory extends DTPAbstractConnectionFactory {

	public DTPPingConnectionFactory() {
		super();
	}

	@Override
	public IConnection createConnection(IConnectionProfile profile) {

		checkActive();
		
		return null;
	}
}
