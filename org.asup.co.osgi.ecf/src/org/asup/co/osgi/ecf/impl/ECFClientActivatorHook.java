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
package org.asup.co.osgi.ecf.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import javax.inject.Inject;

import org.asup.co.osgi.QCommunicationManager;
import org.asup.co.osgi.ecf.ECFConnectorOSGIFactory;
import org.asup.fw.core.annotation.ApplicationStarting;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.ecf.core.ContainerCreateException;
import org.eclipse.ecf.server.generic.GenericServerContainerGroupCreateException;
import org.eclipse.ecf.server.generic.IGenericServerContainerGroupFactory;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.remoteserviceadmin.EndpointDescription;
import org.osgi.service.remoteserviceadmin.EndpointListener;

@SuppressWarnings({ "deprecation" })
public class ECFClientActivatorHook extends ServiceImpl {

	@SuppressWarnings("unused")
	@Inject
	private IGenericServerContainerGroupFactory genericServerFactory;

	private static InternalEndPointListener endpointListener;
	
	@ApplicationStarting
	public void init() throws GenericServerContainerGroupCreateException, ContainerCreateException, IOException {
		
		BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		endpointListener = new InternalEndPointListener();
		
		Dictionary<String, String> props = new Hashtable<String, String>(); 
		props.put("endpoint.listener.scope","(endpoint.id=*)"); 
		bundleContext.registerService(EndpointListener.class, endpointListener, props);

		QCommunicationManager communicationManager = ECFConnectorOSGIFactory.eINSTANCE.createECFCommunicationManager();
		bundleContext.registerService(QCommunicationManager.class, communicationManager, null);
		
/*		IGenericServerContainerGroup containerGroup = genericServerFactory.createContainerGroup("192.168.42.34",3797);		
		ISharedObjectContainer container = containerGroup.createContainer("/server");
		System.out.println(container);
		containerGroup.startListening();
	*/	
	}

	public static List<EndpointDescription> getEndPoints() {
		return endpointListener.getEndpointDescriptions();
	}
	
	Properties props = new Properties(); // setup a scope for the desired endpoints props.put("endpoint.listener.scope","(endpoint.id=*)"); 
	@SuppressWarnings("static-access")
	private static class InternalEndPointListener implements EndpointListener {

		protected static List<EndpointDescription> endpointDescriptions = new ArrayList<EndpointDescription>();
		
		
		@Override
		public void endpointAdded(EndpointDescription endpoint, String matchedFilter) {
			this.endpointDescriptions.add(endpoint);
		}

		@Override
		public void endpointRemoved(EndpointDescription endpoint, String matchedFilter) {
			this.endpointDescriptions.remove(endpoint);
		}
		
		protected List<EndpointDescription> getEndpointDescriptions() {
			return this.endpointDescriptions;
		}
	}
}