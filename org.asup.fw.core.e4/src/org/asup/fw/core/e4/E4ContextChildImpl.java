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

import org.asup.fw.core.QContext;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleContext;

public class E4ContextChildImpl extends E4AbstractContextImpl implements QContext {

	private IEclipseContext eclipseContext;
	
	public E4ContextChildImpl(QContext parent, IEclipseContext eclipseContext, BundleContext bundleContext) {
		super(bundleContext);
		this.eclipseContext = eclipseContext;
	}

	@Override
	IEclipseContext getEclipseContext() {		
		return eclipseContext;
	}
}