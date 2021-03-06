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

import org.asup.fw.core.QContextID;
import org.asup.os.core.QLocker;
import org.asup.os.core.cdo.util.CDOResourceUtil;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.core.resources.impl.ResourceReaderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.util.collection.CloseableIterator;

public class CDOResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	private CDONet4jSession session;
	private CDOView view;
	private QResourceEvent<T> resourceEvent;
	private CDOObjectLockerImpl<T> objectLocker;
	private Class<T> klass;
	private String klassName;
	private EClass eClass;
	private static Map<QContextID, Map<String, CDOView>> views = new HashMap<QContextID, Map<String,CDOView>>();

	protected CDOResourceReaderImpl(QJob job, Class<T> klass, CDONet4jSession session) {
		setJob(job);
		this.session = session;		
		this.klass = klass;
		this.klassName = CDOResourceUtil.getModelName(klass);
		EPackage ePackage = CDOResourceUtil.getEPackage(session, klass);
		this.eClass = CDOResourceUtil.getEClass(ePackage, klass);
		this.resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);		
		this.objectLocker = new CDOObjectLockerImpl<T>();
	}

	protected CDONet4jSession getSession() {
		return session;
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public T lookup(String name) {

		// select
		StringBuffer queryString = new StringBuffer();
		queryString.append(klassName+".allInstances()");
		queryString.append("->select(o:"+klassName+"| o.library = library and o.name = name)");
		CDOQuery query = getView(getJob()).createQuery("ocl", queryString.toString(), eClass);
		query.setMaxResults(1);
		// library
		query.setParameter("library", getContainer());
		// name
		query.setParameter("name", name);

		try {
			T object = query.getResultValue(klass);
			if(object != null)
				fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

			return object;
		}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {

		if(nameFilter != null && !nameFilter.contains("*"))
			return new CDOSingleObjectIterator(lookup(nameFilter));


		StringBuffer queryString = new StringBuffer();
		queryString.append(klassName+".allInstances()");
		queryString.append("->select(o:"+klassName+"| o.library = library");
		
		if(nameFilter != null) {
			if(nameFilter.endsWith("*"))
				queryString.append(" and o.name.startsWith(nameFilter)");
			else
				queryString.append(" and o.name = nameFilter");
		}

		queryString.append(")");
		queryString.append("->sortedBy(name)");

		// query
		CDOQuery query = getView(getJob()).createQuery("ocl", queryString.toString(), eClass);
		
		//parameters
		query.setParameter("library", getContainer());
		if(nameFilter != null)  {
			if(nameFilter.endsWith("*"))
				query.setParameter("nameFilter", nameFilter.substring(0, nameFilter.length()-1));
			else
				query.setParameter("nameFilter", nameFilter);
		}

		CloseableIterator<T> iterator = query.getResultAsync(klass);

		return new CDOObjectIterator<T>(iterator, resourceEvent);
	}

	@Override
	public QLocker<T> getLocker() {
		return objectLocker;
	}

	protected CDOView getView(QJob job) {

		if(view == null) {

			Map<String, CDOView> typedViews = views.get(job);
			if(typedViews == null) {
				typedViews =  new HashMap<String, CDOView>();
				views.put(job, typedViews);
			}
			else
				view = typedViews.get(klass.getName());

			if(view == null) {
				view = getSession().openView();
				typedViews.put(klass.getName(), view);
			}
		}
		return view;
	}

	private class CDOSingleObjectIterator implements QObjectIterator<T> {

		private T object;

		protected CDOSingleObjectIterator(T object) {
			this.object = object;
		}

		@Override
		public void close() {
			object = null;
		}

		@Override
		public boolean hasNext() {
			return object != null;
		}

		@Override
		public T next() {
			T old = object;
			object = null;
			
			if(old != null)
				fireEvent(resourceEvent, ResourceEventType.POST_LOAD, old);

			return old;
		}

		@Override
		public void remove() {

		}
	}
}