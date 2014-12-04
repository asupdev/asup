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

public class E4ContextChildImpl extends E4ContextImpl implements QContext {
	
	private IEclipseContext eclipseContext;
	private int level;
	private String text;
	
	public E4ContextChildImpl(IEclipseContext eclipseContext, int level, String id, String text) {
		super(id);
		
		this.eclipseContext = eclipseContext;
		this.level = level;
		this.text = text;
	}

	@Override
	IEclipseContext getEclipseContext() {		
		return eclipseContext;
	}
	@Override
	public QContext createChild() throws FrameworkCoreRuntimeException {

		for(int l=1; l<=level; l++)
			System.out.print("\t");
		
		IEclipseContext eclipseChildContext = getEclipseContext().createChild();
		int childLevel = level+1;
		String childID = getID()+"@"+childLevel;
		QContext contextChild = new E4ContextChildImpl(eclipseChildContext, childLevel, childID, text+"("+childLevel+")");
		

		return contextChild;
	}
}
