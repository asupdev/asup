/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.asup.os.omac.e4;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.omac.QBundleVisitor;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QObjectContainer;
import org.asup.os.omac.impl.BundleManagerImpl;
import org.asup.os.type.cmd.CommandStatus;
import org.asup.os.type.cmd.QCommand;
import org.asup.os.type.cmd.QCommandContainer;
import org.asup.os.type.pgm.QCallableProgram;
import org.asup.os.type.pgm.QOperatingSystemProgramFactory;
import org.asup.os.type.pgm.QProgram;
import org.asup.os.type.pgm.QProgramContainer;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleWiring;

public class E4BundleManagerImpl extends BundleManagerImpl {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QResourceFactory resourceFactory;

	private ResourceSet resourceSet = new ResourceSetImpl();
	
	@Override
	public boolean isRegisterable(QContextID contextID, String symbolicName) {

		Bundle bundle = Platform.getBundle(symbolicName);
		if(bundle == null)
			return false;
		
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
		if(models == null)
			return false;
		
		return true;
	}

	@Override
	public void register(QContextID contextID, String symbolicName) {

		// exclude
		if(!isRegisterable(contextID, symbolicName))
			return;

		Bundle bundle = Platform.getBundle(symbolicName);
		
		QJob job = jobManager.lookup(contextID);
		
		registerBundle(job, bundle);
	}

	@Override
	public void unregister(QContextID contextID, String symbolicName) {

		// exclude
		if(!isRegisterable(contextID, symbolicName))
			return;

		Bundle bundle = Platform.getBundle(symbolicName);
		
		QJob job = jobManager.lookup(contextID);
		unregisterBundle(job, bundle);
		
	}

	private synchronized void registerBundle(QJob job, Bundle bundle) {

		// As.UP introspection
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
				
		// context
		while (models.hasMoreElements()) {
			
			URL entry = bundle.getEntry(models.nextElement());
			if(entry == null)
				continue;

			// XMI only
			if(!(entry.toString().endsWith(".xmi")))
				continue;

			Resource resource = null;
			try {
				resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
			}
			catch(Exception e) {
				System.out.println("Error on loading resource "+entry);
				return;
			}
	
			// type check
			EObject eObject = resource.getContents().get(0);
			
			if(eObject instanceof QProgramContainer) {
				QResourceWriter<QProgram> programWriter = resourceFactory.getResourceWriter(job, QProgram.class, systemManager.getSystem().getSystemLibrary());
				QProgramContainer programContainer = (QProgramContainer)eObject;

				// package introspection
				if(programContainer.isScanPackage()) {
					List<QProgram> programs = loadPrograms(bundle, programContainer.getBasePackage());
					for(QProgram program: programs) {						
						try {
							programWriter.save(program, true);
						} catch (OperatingSystemException e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}					
					}
				}
				
				// container read
				List<QProgram > programs = new ArrayList<>(programContainer.getContents());
				for(QProgram program: programs) {
					
					try {
						// set address
						if(program.getAddress() == null) {
							URI uriAddress = URI.createPlatformPluginURI(bundle.getSymbolicName(), true);
							uriAddress = uriAddress.appendSegment(programContainer.getBasePackage()+"."+program.getName());
							program.setAddress(uriAddress.toString());
						}
						programWriter.save(program, true);
					} catch (OperatingSystemException e) {
						System.err.println("Unexpected error: "+e.getMessage());
					}					
				}
			}
			else if(eObject instanceof QCommandContainer) {
				QResourceWriter<QCommand> commandWriter = resourceFactory.getResourceWriter(job, QCommand.class, systemManager.getSystem().getSystemLibrary());				
				QCommandContainer commandContainer = (QCommandContainer)eObject;
				List<QCommand > commands = new ArrayList<>(commandContainer.getContents()); 
				
				for(QCommand command: commands) {
					try {
						if(command.getStatus() == CommandStatus.SUPPORTED ||
						   command.getStatus() == CommandStatus.TODO ||
						   command.getStatus() == CommandStatus.POSSIBLE)
							commandWriter.save(command, true);
							
					} catch (OperatingSystemException e) {
						System.err.println("Unexpected error: "+e.getMessage());
					}
				}
			}
			else
				System.out.println("Unknown entry "+eObject);
		}
	
	}

	private synchronized void unregisterBundle(QJob job, Bundle bundle) {

		// As.UP introspection
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
				
		// context
		while (models.hasMoreElements()) {
			
			URL entry = bundle.getEntry(models.nextElement());
			if(entry == null)
				continue;

			// XMI only
			if(!(entry.toString().endsWith(".xmi")))
				continue;

			Resource resource = null;
			try {
				resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				return;
			}
	
			// type check
			EObject eObject = resource.getContents().get(0);
			
			if(eObject instanceof QProgramContainer) {
				QResourceWriter<QProgram> programWriter = resourceFactory.getResourceWriter(job, QProgram.class, systemManager.getSystem().getSystemLibrary());
				QProgramContainer programContainer = (QProgramContainer)eObject;
				

				// package introspection
				if(programContainer.isScanPackage()) {
					List<QProgram> programs = loadPrograms(bundle, programContainer.getBasePackage());
					for(QProgram program: programs) {
						QProgram previousProgram = programWriter.lookup(program.getName());
						if(previousProgram != null) {
							try {
								programWriter.delete(previousProgram);
							}
							catch(OperatingSystemException e) {
								System.err.println("Unexpected error: "+e.getMessage());
							}						
						}					
					}
				}
				
				List<QProgram > programs = new ArrayList<>(programContainer.getContents());
				for(QProgram program: programs) {
					QProgram previousProgram = programWriter.lookup(program.getName());
					if(previousProgram != null) {
						try {
							programWriter.delete(previousProgram);
						}
						catch(OperatingSystemException e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}						
					}					
				}
			}
			else if(eObject instanceof QCommandContainer) {
				QResourceWriter<QCommand> commandWriter = resourceFactory.getResourceWriter(job, QCommand.class, systemManager.getSystem().getSystemLibrary());				
				QCommandContainer commandContainer = (QCommandContainer)eObject;
				List<QCommand > commands = new ArrayList<>(commandContainer.getContents()); 
				for(QCommand command: commands) {
					QCommand previousCommand = commandWriter.lookup(command.getName());
					if(previousCommand != null) {
						try {
							commandWriter.delete(previousCommand);
						}
						catch(OperatingSystemException e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}
					}	
				}
			}
			else
				System.out.println("Unknown entry "+eObject);			
		}
	}
	
	@SuppressWarnings("unchecked")
	private List<QProgram> loadPrograms(Bundle bundle, String basePackage) {
		
		List<QProgram> programs = new ArrayList<>();
		
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
		for(String resource: bundleWiring.listResources(basePackage.replace('.', '/'), null, BundleWiring.LISTRESOURCES_LOCAL)) {
			Class<?> klass = null;
			try {
				klass = bundle.loadClass(resource.replace(".class", "").replace('/', '.'));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				continue;
			}
			if(QCallableProgram.class.isAssignableFrom(klass) || klass.getAnnotation(Program.class) != null)
				programs.add(buildProgram(bundle, (Class<QCallableProgram>)klass));
		}
		
		return programs;
	}
	
	private QProgram buildProgram(Bundle bundle, Class<?> klass) {
		
		QProgram qProgram = QOperatingSystemProgramFactory.eINSTANCE.createProgram();

		// address
		URI uriAddress = URI.createURI("asup:/omac");
		uriAddress = uriAddress.appendSegment(bundle.getSymbolicName());
		uriAddress = uriAddress.appendSegment(klass.getName());
		qProgram.setAddress(uriAddress.toString());
		
		// annotation
		Program programAnnotation = klass.getAnnotation(Program.class);
		if(programAnnotation != null) {
			qProgram.setName(programAnnotation.name());			
			if(!programAnnotation.text().isEmpty()) 
				qProgram.setText(programAnnotation.text());
		}
		else
			qProgram.setName(klass.getSimpleName());
		
		return qProgram;
	}

	@Override
	public void visit(QContextID contextID, String bundleName, QBundleVisitor visitor) {

		// bundle
		Bundle bundle = Platform.getBundle(bundleName);		
		if(bundle == null)
			throw new OperatingSystemRuntimeException("Bundle not found: "+bundleName);

		
		// As.UP introspection
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
				
		// context
		while (models.hasMoreElements()) {
			
			URL entry = bundle.getEntry(models.nextElement());
			if(entry == null)
				continue;

			// XMI only
			if(!(entry.toString().endsWith(".xmi")))
				continue;

			Resource resource = null;
			try {
				resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
				
				resource.unload();
			}
			catch(Exception e) {
				e.printStackTrace();
				return;
			}
	
			// type check
			EObject eObject = resource.getContents().get(0);
			resource.unload();
			
			if(eObject instanceof QObjectContainer) {
				QObjectContainer<?> objectContainer = (QObjectContainer<?>)eObject;
				
				// enter
				visitor.visitEnter(objectContainer);
				
				// visit
				for (QObject qObject: objectContainer.getContents()) 
					visitor.visit(qObject);
				
				// exit
				visitor.visitExit(objectContainer);
			}
		}
	}
}