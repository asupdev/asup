package org.eclipse.datatools.enablement.asup;

import org.asup.db.core.QDatabaseManager;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;


public class ASUPConnectionPingFactory extends ASUPConnectionFactory {

	public ASUPConnectionPingFactory() {
		super();
	}

	@Override
	public IConnection createConnection(IConnectionProfile profile) {

		checkActive();
		
		QDatabaseManager databaseManager = getDatabaseManager();
		if(databaseManager.isStarted())
			return new ASUPConnectionPing(profile);
		else
			return null;
	}
}
