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
package org.asup.os.type.lib.e4;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.QSystem;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QOperatingSystemLibraryFactory;
import org.asup.os.type.lib.impl.LibraryManagerImpl;

public class E4LibraryManagerImpl extends LibraryManagerImpl {

	private QResourceFactory resourceFactory;

	private String systemLibrary;
//	private BundleContext bundleContext;
//	private Map<String, Long> bundleMap;

	@Inject
	public E4LibraryManagerImpl(QSystemManager systemManager, QResourceFactory resourceFactory) {
		
		this.systemLibrary = systemManager.getSystem().getSystemLibrary();		
		this.resourceFactory = resourceFactory;
		
	}	
	
	@PostConstruct
	public void init(QJob job) {
		
//		bundleContext = FrameworkUtil.getBundle(job.getClass()).getBundleContext();
		
		QSystem qSystem = job.getSystem();
		// Library				
		QResourceWriter<QLibrary> resourceLibrary = resourceFactory.getResourceWriter(job, QLibrary.class, qSystem.getSystemLibrary());
		try {
			if(!resourceLibrary.exists(qSystem.getSystemLibrary())) {				
				QLibrary library = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
				library.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(qSystem));
				library.setLibrary(qSystem.getSystemLibrary());		
				library.setName(qSystem.getSystemLibrary());
				library.setText("As.UP System Library");
				resourceLibrary.save(library);				
			}
		}
		catch(OperatingSystemException e) {		
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public QResourceReader<QLibrary> getLibraryReader(QJob job) {		
		QResourceReader<QLibrary> libraryReader = resourceFactory.getResourceReader(job, QLibrary.class, systemLibrary);
		return libraryReader;
	}

	@Override
	public QResourceWriter<QLibrary> getLibraryWriter(QJob job) {
		QResourceWriter<QLibrary> libraryWriter = resourceFactory.getResourceWriter(job, QLibrary.class, systemLibrary);
		return libraryWriter;
	}

	/*
	@Override
	public Class<?> loadClass(QJob job, String library, String name) throws OperatingSystemException {

//		prepareBundleMap();
		
		// load bundle library
		Long bundleId = bundleMap.get(library);
		if(bundleId == null) {
			for(Bundle bundle: bundleContext.getBundles()) {
				System.out.println(bundle);
				bundleMap.put(bundle.getSymbolicName(), bundle.getBundleId());
			}
			bundleId = bundleMap.get(library);
			if(bundleId == null)
				throw new OperatingSystemException("Bundle "+library+" not found");
		}
		Bundle bundleLibrary = bundleContext.getBundle(bundleId);
		Bundle bundleLibrary = Platform.getBundle(library);
		if(bundleLibrary == null)
			throw new OperatingSystemException("Bundle "+library+" not found");
		
		// load class
		try {
			return bundleLibrary.loadClass(name);
		}
		catch (ClassNotFoundException e) {
			throw new OperatingSystemException(e);
		}		
		catch (ClassCastException e) {
			throw new OperatingSystemRuntimeException(e);
		} 	

	}*/

		
/*	private void prepareBundleMap() {
		if(this.bundleMap == null) {
			this.bundleMap = new HashMap<String, Long>();
			for(Bundle bundle: bundleContext.getBundles()) {
				bundleMap.put(bundle.getSymbolicName(), bundle.getBundleId());
			}
		}
	}*/
}