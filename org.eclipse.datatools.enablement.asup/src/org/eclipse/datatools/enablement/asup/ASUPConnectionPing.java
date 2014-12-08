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
