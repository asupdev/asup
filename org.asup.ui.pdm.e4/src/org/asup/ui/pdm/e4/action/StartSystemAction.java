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

import java.util.Collections;
import java.util.Map;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.e4.E4ApplicationStarter;
import org.asup.ui.pdm.e4.Activator;
import org.asup.ui.pdm.e4.console.ConsoleSystem;
import org.asup.ui.pdm.e4.console.ConsoleSystemHelper;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IOConsoleOutputStream;

public class StartSystemAction implements IObjectActionDelegate {
	
	private IWorkbenchWindow window = null;
	
	private Resource resource = null;
	
	public StartSystemAction() {
		
	}

	@Override
	public void run(IAction action) {
		try {
			startSystem(resource);
		} catch (Exception e) {
			MessageDialog.openError(window.getShell(), "Start System", e.getMessage());
		}

	}

	private Resource loadResource(IFile file) throws Exception {
		QFrameworkCorePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    
	    ResourceSet resourceSet = new ResourceSetImpl();
	    URI uri = URI.createURI(file.getLocationURI().toString());
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		
		return resource;
	}

	private boolean isValidResource(Resource resource) {
		
		if(resource == null)
			return false;
		
		EObject eObject = resource.getContents().get(0);
		if(eObject instanceof QApplication)
			return true;
		return false;
		
	}
	
	private void startSystem(final Resource resource) throws Exception {

  		EObject eObject = resource.getContents().get(0);
		
		final QApplication application = (QApplication)eObject;

	    ConsoleSystem consoleSystem = ConsoleSystemHelper.findConsole("As.UP");
	    if(consoleSystem == null)
	    	consoleSystem = ConsoleSystemHelper.createConsole("As.UP");

		// Start application
	    final IOConsoleOutputStream stream = consoleSystem.newOutputStream();

		IWorkbenchPage page = window.getActivePage();
	    String id = IConsoleConstants.ID_CONSOLE_VIEW;
	    IConsoleView view = (IConsoleView) page.showView(id);
	    
	    view.display(consoleSystem);

		
		Job job = new Job("System Starter") {
			
		      @Override
		      protected IStatus run(IProgressMonitor monitor) {

			    try {
					E4ApplicationStarter applicationStarter = new E4ApplicationStarter(application, stream);

					applicationStarter.start();

					Activator.getDefault().setApplication(application);
					
			        return Status.OK_STATUS;
				} catch (Exception e) {
			        MessageDialog.openError(window.getShell(), "System error", e.getMessage());
			        return Status.CANCEL_STATUS;
				}
		      }
		    };
		    
		    job.setUser(true);
		    job.schedule();
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		this.resource = null;
		action.setEnabled(false);		
		
		if(Activator.getDefault().getApplication() != null) 
			return;
		
		if(selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			
			Object object = treeSelection.getFirstElement();
			if(object instanceof IFile) {
				IFile iFile = (IFile)object;
				try {
					this.resource = loadResource(iFile);
				} catch (Exception e) {
					MessageDialog.openError(window.getShell(), "Start System", e.getMessage());
				}
			}
			else if(object instanceof Resource) {
				this.resource = (Resource)object;
			}
			
			if(isValidResource(resource))
				action.setEnabled(true);
			
		}

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.window = targetPart.getSite().getWorkbenchWindow();
	}
}