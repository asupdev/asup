/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 * 
 */
package org.asup.os.core.jdt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.core.resources.impl.ResourceReaderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class JDTResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	protected QSourceManager sourceManager;
	protected Class<T> klass;
	protected QResourceEvent<T> resourceEvent;
	protected EMFConverter emfConverter;
	
	public JDTResourceReaderImpl(QJob job, QSourceManager sourceManager, String container, Class<T> klass) {
		setJob(job);
		setContainer(container);
		this.sourceManager = sourceManager;
		this.klass = klass;
		this.resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);
		String uri = "asup://"+job.getSystem().getName()+"/"+container+"/"+klass.getSimpleName().toLowerCase().substring(1);
		this.emfConverter = new EMFConverter(new ResourceSetImpl(), uri);
		
//		sourceManager.refreshEntry(job, sourceManager.getLibraryEntry(job, container));
	}
	
	@Override
	public boolean exists(String name) {
		return sourceManager.getObjectEntry(getJob(), getContainer(), klass, name) != null;		
	}


	@Override
	public QObjectIterator<T> find(String nameFilter) {
		
		List<QSourceEntry> entries = sourceManager.listObjectEntries(getJob(), getContainer(), klass, nameFilter);
		if(entries == null)
			entries = new ArrayList<>();
		
		return new JDTObjectIteratorImpl<T>(klass, new JDTSourceIterator(emfConverter, entries.iterator()), resourceEvent);
	}
	
	@Override
	public T lookup(String name) {

		
		QSourceEntry entry = sourceManager.getObjectEntry(getJob(), getContainer(), klass, name);
		if(entry == null)
			return null;
		
		T object = null;
		try {
			InputStream inputStream = entry.getInputStream();
			object = (T) emfConverter.convertToEObject(inputStream);
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		if(object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}
}