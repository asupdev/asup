package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;


public class ASUPConnectionPingFactory extends ASUPConnectionFactory {

	@Override
	public IConnection createConnection(IConnectionProfile profile) {

		
		ASUPPlugin plugin = ASUPPlugin.getInstance();
		if(plugin == null)
			return null;

		if(plugin.getDatabaseManager().isStarted())
			return new ASUPConnectionPing(profile);
		else
			return null;
	}
}
