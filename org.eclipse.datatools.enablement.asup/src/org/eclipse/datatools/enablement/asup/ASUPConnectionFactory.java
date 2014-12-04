package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionFactory;
import org.eclipse.datatools.connectivity.IConnectionProfile;

public abstract class ASUPConnectionFactory  implements IConnectionFactory {

	
	public IConnection createConnection(IConnectionProfile profile, String uid, String pwd) {
		return createConnection(profile);
	}

}
