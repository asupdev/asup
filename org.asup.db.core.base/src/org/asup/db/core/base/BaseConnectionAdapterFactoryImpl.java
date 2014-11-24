package org.asup.db.core.base;

import java.sql.Connection;
import java.util.Properties;

import org.asup.db.core.QConnectionConfig;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;

public abstract class BaseConnectionAdapterFactoryImpl implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		Object adaptee = null;
		
		if(adaptableObject instanceof BaseConnectionImpl) {
			BaseConnectionImpl connection = (BaseConnectionImpl) adaptableObject;
			if(ConnectionInfo.class.isAssignableFrom(adapterType))
				adaptee = connection.getConnectionInfo();
			else if(Connection.class.isAssignableFrom(adapterType)) { 
				adaptee = connection.getConnectionInfo().getSharedConnection();
			}
		}

		return adaptee;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] {ConnectionInfo.class, IConnectionProfile.class, Connection.class};
	}
	
	protected Properties getDTPProperties(QConnectionConfig config) {

		Properties baseProperties = new Properties();
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, config.getProduct());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, config.getVersion());

		baseProperties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, config.getDriverName());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, config.getUrl());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, config.getUser());
		baseProperties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, config.getPassword());
		baseProperties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());
		
		return baseProperties;
	}	
}