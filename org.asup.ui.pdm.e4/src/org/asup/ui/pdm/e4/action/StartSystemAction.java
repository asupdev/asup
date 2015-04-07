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

import java.util.*;

import org.asup.fw.core.*;
import org.asup.ui.pdm.e4.Activator;
import org.asup.ui.pdm.e4.console.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.*;
import org.eclipse.ui.console.*;
import org.osgi.framework.*;

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
			    	BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
			    	ServiceReference<QApplicationManager> applicationManagerReference = bundleContext.getServiceReference(QApplicationManager.class);
			    	
			    	if (applicationManagerReference == null) {
			    		throw new NullPointerException("applicationManager is null. Maybe you need to define asup-co1 machine");
			    	}
			    	
			    	QApplicationManager applicationManager = bundleContext.getService(applicationManagerReference);			    	
	
					Activator.getDefault().setApplication(applicationManager.start(application, stream));
					
			        return Status.OK_STATUS;
				} catch (final Exception e) {
					System.err.println();
					System.err.println("**********");
					e.printStackTrace();
					System.err.println("**********");
			        return new Status(IStatus.CANCEL, "unknown", 1,  e.getMessage(), null);
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