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
package org.asup.ui.pdm.e4.action;

import org.asup.ui.pdm.e4.Activator;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class StopSystemAction implements IObjectActionDelegate  {
	
	public StopSystemAction() {
		
	}

	@Override
	public void run(IAction action) {
		action.toString();
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if(Activator.getDefault().getApplicationContext() != null)
			action.setEnabled(true);
		else
			action.setEnabled(false);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}
}