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
package org.asup.os.core.e4;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.impl.ResourceProviderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.lib.QLibrary;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class E4ResourceProviderImpl extends ResourceProviderImpl {

	private String basePath;

	private Map<String, Resource> resources;
	
	private ResourceSet resourceSet;
	
	@Inject
	public E4ResourceProviderImpl(QSystemManager systemManager) {
		
		this.resourceSet = new ResourceSetImpl();
		this.basePath = systemManager.getSystem().getInstallPath()+"/asup-resources/";
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		resources = new HashMap<>();
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String repository) {

		Resource resource = getResource(repository, klass);				
		QResourceReader<T> resourceReader = new E4ResourceReaderImpl<T>(job, repository, klass, resource);
		
		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		
		Map<String, Resource> resources = new HashMap<>();
		
		// set scope libraries
		switch (scope) {
			case ALL:
				QResourceReader<QLibrary> libraryReader = getResourceReader(job, QLibrary.class, job.getSystem().getSystemLibrary());
					
				QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
				while(libraryIterator.hasNext()) {
					QLibrary library = libraryIterator.next();
					Resource resource = getResource(library.getName(), klass);
					resources.put(library.getName(), resource);
				}
				break;
			case LIBRARY_LIST:
				
				for(String libraryName: job.getLibraries()) {
					Resource resource = getResource(libraryName, klass);
					resources.put(libraryName, resource);					
				}

				break;
			default:
				throw new OperatingSystemRuntimeException("Unsupported scope "+scope);
		}

		QResourceSetReader<T> resourceReader = new E4ResourceSetReaderImpl<T>(job, resources, klass);
		
		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String repository) {
		
		Resource resource = getResource(repository, klass);
		QResourceWriter<T> resourceWriter = new E4ResourceWriterImpl<T>(job, repository, klass, resource);
		
		return resourceWriter;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope) {
		return null;
	}

	private <T extends QObjectNameable> Resource getResource(String repository, Class<T> klass) {

		String resourceKey = repository+"/"+klass.getName();
		
		Resource resource = resources.get(resourceKey);
		if(resource == null) {
			XMIResourceImpl xmiResource = (XMIResourceImpl) resourceSet.createResource(URI.createURI(basePath+repository+"/"+klass.getSimpleName()+".xmi"));
			xmiResource.setEncoding("UTF-8");
			resource = xmiResource;
			try {
				resource.load(Collections.EMPTY_MAP);
			} catch (IOException e) {			
				// first load
				try {
					resource.save(Collections.EMPTY_MAP);
				} catch (IOException e1) {
					throw new OperatingSystemRuntimeException(e);
				}
			}
			resources.put(resourceKey, resource);
		}
		return resource;
	}

}