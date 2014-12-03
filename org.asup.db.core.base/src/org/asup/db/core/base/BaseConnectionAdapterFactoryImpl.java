/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.core.base;

import org.asup.db.core.QConnectionConfig;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;

public class BaseConnectionAdapterFactoryImpl implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {

		Object adaptee = null;

		if (ConnectionInfo.class.isAssignableFrom(adapterType)) {
			if (adaptableObject instanceof BaseConnectionImpl) {
				BaseConnectionImpl connection = (BaseConnectionImpl) adaptableObject;
				connection.toString();
//				adaptee = connection.getConnectionInfo();
			}
		}
		else if (IConnectionProfile.class.isAssignableFrom(adapterType)) {

			if (adaptableObject instanceof QConnectionConfig) {
				QConnectionConfig connectionConfig = (QConnectionConfig) adaptableObject;
				connectionConfig.toString();
			}

		}

		return adaptee;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { ConnectionInfo.class, IConnectionProfile.class};
	}

}
