package org.asup.db.core.db2;

import java.io.IOException;
import java.util.Properties;

import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.base.BaseConnectionAdapterFactoryImpl;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class DB2ConnectionAdapterFactoryImpl extends BaseConnectionAdapterFactoryImpl {

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		if(adaptableObject instanceof QConnectionConfig) {
			Object adaptee = null;
			QConnectionConfig connectionConfig = (QConnectionConfig)adaptableObject;
			
			if(IConnectionProfile.class.isAssignableFrom(adapterType)) {
				try {
					ProfileManager profileManager = ProfileManager.getInstance();

					Properties properties = getDTPProperties(connectionConfig);
					properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList());

					String providerID = "org.eclipse.datatools.enablement.ibm.db2.luw.connectionProfile";
					adaptee = profileManager.createTransientProfile(providerID, properties);
					
				} catch (ConnectionProfileException e) {
					throw new FrameworkCoreRuntimeException(e);
				}

			}
			return adaptee;
		}
		else
			return super.getAdapter(adaptableObject, adapterType);
	}
	
	private String getJarList() {
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		StringBuffer jarList = new StringBuffer();
		try {
//			jarList.append(new Path(FileLocator.toFileURL(bundle.getEntry("lib/db2jcc_license_cu.jar")).getFile()).toOSString());
			jarList.append(new Path(FileLocator.toFileURL(bundle.getEntry("lib/db2jcc.jar")).getFile()).toOSString());			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jarList.toString();
	}
}