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

import org.asup.co.osgi.ecf.QECFClientContainerConfig;
import org.asup.fw.core.annotation.ApplicationStarting;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.ecf.core.IContainerFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

public class ClientActivatorHook extends ServiceImpl {
	
	private int activeService = 0; 
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ApplicationStarting
	public void init() throws Exception {

		BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();		
		QECFClientContainerConfig ecfClientConfig = (QECFClientContainerConfig) getConfig();
		
		ServiceTracker<Object, IContainerFactory> containerFactoryServiceTracker = new ServiceTracker<Object, IContainerFactory>(bundleContext, IContainerFactory.class.getName(), null);
		containerFactoryServiceTracker.open();

		IContainerFactory containerFactory = containerFactoryServiceTracker.getService();
		containerFactory.createContainer(ecfClientConfig.getClientContainerType());
				
		ServiceTracker serviceTracker = new ServiceTracker(bundleContext, 
														   FrameworkUtil.createFilter("(service.imported=*)"), 
														   new ECFServiceCustomizer());
		serviceTracker.open();
		
		while(activeService<=0)
			Thread.sleep(1000);
	}

	@SuppressWarnings("rawtypes")	
	private class ECFServiceCustomizer implements ServiceTrackerCustomizer {

		@SuppressWarnings({"unchecked" })
		@Override
		public Object addingService(ServiceReference serviceReference) {
			
			BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
			
			Object object = null;
			String className = ((String[])serviceReference.getProperty("objectClass"))[0];
			
			for(Bundle bundle: bundleContext.getBundles()) {
				if(bundle.getSymbolicName().equals("org.asup.os.type"))
					continue;
				if(className.startsWith(bundle.getSymbolicName())) {				
					object = bundle.getBundleContext().getService(serviceReference);
					if(object == null) 
						continue;
					
					activeService++;
					
					return object;
				
				}
			}
			
			return null;
//			throw new FrameworkCoreRuntimeException("Service: class not found "+className);
		}

		@Override
		public void modifiedService(ServiceReference reference, Object service) {
		}

		@Override
		public void removedService(ServiceReference reference, Object service) {

			activeService++;
		}

	}
}