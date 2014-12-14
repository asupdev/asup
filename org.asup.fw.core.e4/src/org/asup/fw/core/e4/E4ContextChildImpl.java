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
import org.eclipse.e4.core.contexts.IEclipseContext;

public class E4ContextChildImpl extends E4ContextImpl {
	
	private IEclipseContext eclipseContext;
	
	public E4ContextChildImpl(IEclipseContext eclipseContext, String name) {
		super(name);
		
		this.eclipseContext = eclipseContext;
	}

	@Override
	IEclipseContext getEclipseContext() {		
		return eclipseContext;
	}
	
	@Override
	public QContext createLocalContext(String name) throws FrameworkCoreRuntimeException {
		
		IEclipseContext eclipseChildContext = getEclipseContext().createChild();
		
		initializeContext(eclipseChildContext);
		
		QContext contextChild = new E4ContextChildImpl(eclipseChildContext, name);
		
		return contextChild;
	}
}
