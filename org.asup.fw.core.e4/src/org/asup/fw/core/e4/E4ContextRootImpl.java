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
package org.asup.fw.core.e4;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContext;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.remoteserviceadmin.RemoteConstants;

public class E4ContextRootImpl extends E4ContextImpl {

	protected BundleContext bundleContext;
	private IEclipseContext eclipseContext;

	public E4ContextRootImpl(BundleContext bundleContext, String id) {
		super(id);

		this.bundleContext = bundleContext;
		this.eclipseContext = EclipseContextFactory.getServiceContext(bundleContext);

	}

	@Override
	public IEclipseContext getEclipseContext() {

		if (eclipseContext == null)
			eclipseContext = EclipseContextFactory.getServiceContext(bundleContext);

		return eclipseContext;
	}

	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {

		// System.out.println("Create child context of: "+getID());

		IEclipseContext eclipseChildContext = getEclipseContext().createChild();

		QContext contextChild = new E4ContextChildImpl(eclipseChildContext, 1, getID().toString(), bundleContext.getBundle().getSymbolicName() + " child");

		// bind remote service
		try {
			for (ServiceReference<?> serviceReference : bundleContext.getAllServiceReferences(null, null)) {
				if (serviceReference.getProperty(RemoteConstants.SERVICE_IMPORTED) != null) {

					Object object = null;
					String className = ((String[]) serviceReference.getProperty("objectClass"))[0];

					for (Bundle bundle : bundleContext.getBundles()) {
						if (className.startsWith(bundle.getSymbolicName())) {
							if (bundle.getSymbolicName().equals("org.asup.os.type"))
								continue;
							object = bundle.getBundleContext().getService(serviceReference);
							if (object == null)
								continue;

							contextChild.set(className, object);
							break;
						}
					}
					// if(object == null)
					// System.err.println("Remote Service not found: "+className);
				}
			}
		} catch (InvalidSyntaxException e) {
			throw new FrameworkCoreRuntimeException(e);
		}
		return contextChild;
	}

}