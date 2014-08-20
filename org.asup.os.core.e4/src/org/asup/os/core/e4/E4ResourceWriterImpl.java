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

import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QTypedObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class E4ResourceWriterImpl<T extends QObjectNameable> extends E4ResourceReaderImpl<T> implements QResourceWriter<T> {

	private QResourceEvent<T> resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
	
	public E4ResourceWriterImpl(QJob job, String container, Class<T> klass, Resource resource) {
		super(job, container, klass, resource);
		resourceEvent.setResource(this);
	}
	
	@Override
	public synchronized void delete(T object) throws OperatingSystemException {
		if(!exists(object.getName()))
			throw new OperatingSystemException("Object "+object.getName()+" not found");
		
		try {
			
			Resource resource = getResource();			
			resource.getContents().remove(object);
			
			fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
			resource.save(Collections.EMPTY_MAP);			
			fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);
		} catch (IOException e) {
			throw new OperatingSystemException(e);
		}
	}

	
	@Override
	public synchronized void save(T object) throws OperatingSystemException {
		save(object, false);
	}
	

	@Override
	public synchronized void save(T object, boolean replace) throws OperatingSystemException {
		
		try {
			Resource resource = getResource();

			T oldObject = lookup(object.getName());
			if(oldObject != null) {
				if(replace) 
					resource.getContents().remove(oldObject);
				else {
					throw new OperatingSystemException("Object already exists: "+object);
				}
			}

			if(object instanceof QTypedObject) {
				QTypedObject typedObject  = (QTypedObject)object;

				// library
				typedObject.setLibrary(getContainer());
		
				// creation info
				if(typedObject.getCreationInfo() == null)
					typedObject.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
			
			}
			
			resource.getContents().add((EObject)object);
			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			resource.save(Collections.EMPTY_MAP);
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (IOException e) {
			throw new OperatingSystemException(e);
		}		
	}	
}
