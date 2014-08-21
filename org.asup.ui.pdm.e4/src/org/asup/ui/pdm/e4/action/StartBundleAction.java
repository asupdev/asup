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

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class StartBundleAction implements IObjectActionDelegate {

	private IProject project = null;
	
	public StartBundleAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {

		if(project == null)
			return;
		
		action.toString();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		if(selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			
			Object object = treeSelection.getFirstElement();
			if(object instanceof IProject) {
				project = (IProject) object;
				action.setEnabled(true);
			}
			else {
				action.setEnabled(false);
				project = null;
			}
		}
		else
			System.out.println(selection);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		action.toString();
	}

}
