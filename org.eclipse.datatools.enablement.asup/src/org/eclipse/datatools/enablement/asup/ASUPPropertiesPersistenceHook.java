package org.eclipse.datatools.enablement.asup;

import org.eclipse.datatools.connectivity.IPropertiesPersistenceHook;
import org.eclipse.datatools.connectivity.PropertiesPersistenceHook;

public class ASUPPropertiesPersistenceHook extends PropertiesPersistenceHook implements IPropertiesPersistenceHook {

	public ASUPPropertiesPersistenceHook() {
		// TODO Auto-generated constructor stub
	}

	public String getConnectionPropertiesPageID() {
		return "org.eclipse.datatools.enablement.asup.profileProperties"; //$NON-NLS-1$
	}
}
