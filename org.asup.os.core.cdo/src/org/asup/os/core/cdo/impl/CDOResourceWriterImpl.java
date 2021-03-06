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

import java.io.IOException;
import java.util.Collections;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.lib.QLibrary;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;

public class CDOResourceWriterImpl<T extends QObjectNameable> extends CDOResourceReaderImpl<T> implements QResourceWriter<T> {

	public static final String CDO_OMAC = "os/omac";

	private CDOResource resource;
	private CDOTransaction transaction;
	private QResourceEvent<T> resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
	private Class<T> klass;

	protected CDOResourceWriterImpl(QJob job, Class<T> klass, CDONet4jSession session) {
		super(job, klass, session);
		this.klass = klass;
		resourceEvent.setResource(this);
	}
	
	@Override
	public void delete(T object) throws OperatingSystemException {
		
		CDOTransaction transaction = getTransaction(getJob());
		CDOResource resource = getResource(transaction);
		
		CDOObject cdoObject = CDOUtil.getCDOObject((EObject)object);
		if(cdoObject.cdoID() == null) 
			throw new OperatingSystemException("Object "+object.getName()+" not found");
		
		resource.getContents().remove(object);
		try {
			fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
			
			if(klass.isAssignableFrom(QLibrary.class)) {
				QLibrary qLibrary = (QLibrary)object;
				CDOResource libraryResource = transaction.getOrCreateResource(CDO_OMAC+"/"+qLibrary.getName());
				if(libraryResource != null) {
					try {
						libraryResource.delete(Collections.EMPTY_MAP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			transaction.commit();
			fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);			
		}
		catch (CommitException e) {
			throw new OperatingSystemException(e);
		}
		catch (RuntimeException e) {
			transaction.rollback();
		}
	}

	@Override
	public void save(T object) throws OperatingSystemException {
		save(object, false);
	}

	@Override
	public void save(T object, boolean replace) throws OperatingSystemException {

		
		CDOTransaction transaction = getTransaction(getJob());
		CDOResource resource = getResource(transaction);
		
		CDOObject cdoObject = CDOUtil.getCDOObject((EObject)object);
		
		// insert object
		boolean insert = cdoObject.cdoID() == null; 
		if(insert) {
			// lock resource	
			try {
				if(!resource.cdoWriteLock().tryLock(1000*60)) {
					throw new OperatingSystemException("Unable to lock resource: "+resource);
				}
			} catch (InterruptedException e) {
				throw new OperatingSystemException("Unable to lock resource: "+resource);
			}
			
			T oldObject = lookup(object.getName());
			if(oldObject != null) {
				if(replace) 
					resource.getContents().remove(oldObject);
				else {
					resource.cdoWriteLock().unlock();
					throw new OperatingSystemException("Object already exists: "+object);
				}
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
		// update object
		resource.getContents().add((EObject)object);

		// commit and notify event
		try {
			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			transaction.commit();
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} 
		catch (Exception e) {			
			// unlock resource
			if(insert) 
				resource.cdoWriteLock().unlock();			

			throw new OperatingSystemException(e);
		}
	}	

	@Override
	protected CDOView getView(QJob job) {
		return getTransaction(job);
	}	

	protected CDOTransaction getTransaction(QJob job) {
		if(transaction == null) { 
			transaction = getSession().openTransaction();
		}
		return transaction;
	}
	
	private CDOResource getResource(CDOTransaction transaction) {
		if(resource == null)
			resource = transaction.getOrCreateResource(CDO_OMAC+"/"+getContainer()+"/"+klass.getName());
		return resource;
	}
}