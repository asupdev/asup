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

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleContext;

public class E4ContextImpl extends E4AbstractContextImpl {

	protected BundleContext bundleContext;
	private IEclipseContext eclipseContext;
	
	public E4ContextImpl(BundleContext context)  {
		super(context);
		bundleContext = context;
	}

	@Override
	IEclipseContext getEclipseContext() {
		
		if(eclipseContext == null)
			eclipseContext = EclipseContextFactory.getServiceContext(bundleContext);
		
		return eclipseContext;
	}	
}