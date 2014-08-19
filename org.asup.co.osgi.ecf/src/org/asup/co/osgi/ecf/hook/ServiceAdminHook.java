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
package org.asup.co.osgi.ecf.hook;

import org.asup.fw.core.annotation.ApplicationStarting;
import org.asup.fw.core.impl.ServiceImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.remoteserviceadmin.EndpointDescription;
import org.osgi.service.remoteserviceadmin.ExportReference;
import org.osgi.service.remoteserviceadmin.ImportReference;
import org.osgi.service.remoteserviceadmin.RemoteServiceAdminEvent;
import org.osgi.service.remoteserviceadmin.RemoteServiceAdminListener;

public class ServiceAdminHook extends ServiceImpl implements RemoteServiceAdminListener {

	@ApplicationStarting
	public void init(BundleContext bundleContext) {
		bundleContext.registerService(RemoteServiceAdminListener.class, this, null);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void remoteAdminEvent(RemoteServiceAdminEvent event) {
 
		// Print the source bundle for the event
		final Bundle source = event.getSource();
		System.out.println("Received RSA event from "
				+ source.getSymbolicName());
 
		// Handle a few example event types
		switch (event.getType()) {
 
		// A new service was imported into the local framework
		case RemoteServiceAdminEvent.IMPORT_REGISTRATION:
 
			final ImportReference importReference = event.getImportReference();
 
			// Retrieve the ServiceReference and the endpoint it points to
			final ServiceReference importedService = importReference
					.getImportedService();
			final EndpointDescription importedEndpoint = importReference
					.getImportedEndpoint();
 
			System.out.println(importedService + " has been imported from "
					+ importedEndpoint.getFrameworkUUID());
 
			break;
 
		// The export of a service has been removed
		case RemoteServiceAdminEvent.EXPORT_UNREGISTRATION:
 
			final ExportReference exportReference = event.getExportReference();
 
			// Retrieve the ServiceReference
			final ServiceReference exportedService = exportReference
					.getExportedService();
 
			System.out.println(exportedService + " is no longer exported");
 
			break;
 
		default:
			break;
		} 
	}

}