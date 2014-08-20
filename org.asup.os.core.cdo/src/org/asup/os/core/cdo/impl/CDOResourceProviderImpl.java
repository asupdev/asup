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
package org.asup.os.core.cdo.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.cdo.util.CDOSessionUtil;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.impl.ResourceProviderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.lib.QLibrary;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;

public class CDOResourceProviderImpl extends ResourceProviderImpl {

	private final Map<QContextID, CDONet4jSession> sessions;

	@Inject
	private QResourceFactory resourceFactory;

	public CDOResourceProviderImpl() {
		this.sessions  = new HashMap<QContextID, CDONet4jSession>();
	}
		
	@PostConstruct
	public void init() {
		resourceFactory.registerProvider(QTypedObject.class, this);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String library) { 
		assert job != null;
		
		// session
		CDONet4jSession session = getSession(job);
		
		// resource
		QResourceReader<T> resource = new CDOResourceReaderImpl<T>(job, klass, session);
		
		prepareResource(job, resource, library, klass);
		
		return resource;
	}


	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		assert job != null;
		
		// session
		CDONet4jSession session = getSession(job);
		
		// resource
		QResourceSetReader<T> resource = new CDOResourceSetReaderImpl<T>(job, klass, session);

		prepareResource(job, resource, scope, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String library) {
		assert job != null;

		// session
		CDONet4jSession session = getSession(job);
		
		// resource
		QResourceWriter<T> resource = new CDOResourceWriterImpl<T>(job, klass, session);
		
		prepareResource(job, resource, library, klass);		
		
		
		return resource;
	}

	private <T extends QObjectNameable> void prepareResource(QJob job, QResourceReader<T> resource, String library, Class<T> klass) {
		
		resource.setJob(job);
		
		// set scope library
		resource.setContainer(library);
	}
	
	private <T extends QObjectNameable> void prepareResource(QJob job, QResourceSetReader<T> resource, Scope scope, Class<T> klass) {
		
		resource.setJob(job);
		
		// set scope libraries
		switch (scope) {
			case ALL:
				QResourceReader<QLibrary> libraryReader = getResourceReader(job, QLibrary.class, job.getSystem().getSystemLibrary());
					
				QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
				while(libraryIterator.hasNext()) {
					QLibrary library = libraryIterator.next();
					resource.getContainers().add(library.getName());	
				}
				break;
			case LIBRARY_LIST:
				resource.getContainers().addAll(job.getLibraries());
				break;
			default:
				throw new OperatingSystemRuntimeException("Unsupported scope "+scope);
		}
		
	}

	private CDONet4jSession getSession(QJob job) {
				
		CDONet4jSession session = sessions.get(job);
		if(session == null) {
			session = CDOSessionUtil.openSession("localhost:2036", job.getSystem().getName());
			session.options().getNet4jProtocol().setTimeout(60000);
			sessions.put(job, session);
		}
		return session;
	}
}