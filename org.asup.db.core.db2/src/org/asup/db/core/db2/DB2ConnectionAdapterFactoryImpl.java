package org.asup.db.core.db2;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import org.asup.db.core.QConnectionConfig;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Path;
import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class DB2ConnectionAdapterFactoryImpl implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		Object adaptee = null;
		
		if(adaptableObject instanceof DB2ConnectionImpl) {
			DB2ConnectionImpl connection = (DB2ConnectionImpl) adaptableObject;
			if(ConnectionInfo.class.isAssignableFrom(adapterType))
				adaptee = connection.getConnectionInfo();
			else if(Connection.class.isAssignableFrom(adapterType)) 
				adaptee = connection.getConnectionInfo().getSharedConnection();
		}
		else if(adaptableObject instanceof QConnectionConfig) {
			QConnectionConfig connectionConfig = (QConnectionConfig)adaptableObject;
			if(IConnectionProfile.class.isAssignableFrom(adapterType)) {
				try {
					ProfileManager profileManager = ProfileManager.getInstance();
					String providerID = "org.eclipse.datatools.enablement.ibm.db2.luw.connectionProfile";
					adaptee = profileManager.createTransientProfile(providerID, getDB2Properties(connectionConfig));
				} catch (ConnectionProfileException e) {
					throw new FrameworkCoreRuntimeException(e);
				}

			}
		}
		return adaptee;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] {ConnectionInfo.class, IConnectionProfile.class, Connection.class};
	}
	
	
	private Properties getDB2Properties(QConnectionConfig config) {

		Properties baseProperties = new Properties();
//		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_CATEGORY_ID, ILUWConnectionProfileConstants.DB2_LUW_CATEGORY_ID);
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, config.getProduct());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, config.getVersion());

		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, config.getDriverName());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, config.getUrl());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, config.getUser());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, config.getPassword());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());
		
//		baseProperties.setProperty(ConnectionProfileConstants.PROP_PREFIX+"driverDefinitionType", "com.ibm.datatools.db2.luw.jdbc4.driverTemplate");
//		baseProperties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, "DriverDefn.org.eclipse.datatools.enablement.ibm.db2.luw.jdbc4.driverTemplate.IBM Data Server Driver As.UP");
		baseProperties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList());
		
		return baseProperties;
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