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
import java.util.List;
import java.util.Map;

import org.asup.os.core.QLocker;
import org.asup.os.core.cdo.util.CDOResourceUtil;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.core.resources.impl.ResourceSetReaderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.util.collection.CloseableIterator;

public class CDOResourceSetReaderImpl <T extends QObjectNameable> extends ResourceSetReaderImpl<T> {

	private CDONet4jSession session;
	private CDOView view;
	private QResourceEvent<T> resourceEvent;
	private Class<T> klass;
	private String klassName;
	private EClass eClass;

	private CDOObjectLockerImpl<T> objectLocker;
	
	private static Map<Thread, Map<String, CDOView>> views = new HashMap<Thread, Map<String,CDOView>>();
	
	protected CDOResourceSetReaderImpl(QJob job, Class<T> klass, CDONet4jSession session) {
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

	@Override
	public QLocker<T> getLocker() {
		return objectLocker;
	}

	@Override
	public T lookup(String name) {
		return lookup(null, name);
	}	
	
	@Override
	public T lookup(String library, String name) {

		T object = null;
		int objectIndex = Integer.MAX_VALUE;

		List<String> libraries = getJob().getLibraries();
		
		// select
		String queryString = buildLookupOCLQuery(klassName, library);
		
		CDOQuery query = getView().createQuery("ocl", queryString.toString(), eClass);
		// object name
		query.setParameter("name", name);		
		
		// single library
		if(library != null) {
			query.setMaxResults(1);
			
			query.setParameter("library", library);
			object = query.getResultValue(klass);
		}
		else {
			query.setMaxResults(libraries.size());

			// set object by position
			List<T> objects = query.getResult(klass);
			for(T o: objects) {
				if(libraries.indexOf(o) < objectIndex) 
					object = o;
			}
		}

		if(object == null)
			return null;

		// notify
		fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);
		
		return object;
	}
	
	@Override
	public QObjectIterator<T> find(String nameFilter) {
		return find(null, nameFilter);
	}

	
	@Override
	public QObjectIterator<T> find(String library, String nameFilter) {

		StringBuffer queryString = new StringBuffer();
		queryString.append(klassName+".allInstances()");			
		queryString.append("->select(o:"+klassName+"|");
		queryString.append(" ("+buildInLibraries(getContainers())+")");

		if(nameFilter != null) {
			if(nameFilter.endsWith("*"))
				queryString.append(" and o.name.startsWith(nameFilter)");
			else
				queryString.append(" and o.name = nameFilter");
		}
		
		if(library != null)
			queryString.append(" and o.library = library");
		
//		queryString.append(" and getLibraryPriority() > 1");
		
		queryString.append(")");
		
		queryString.append("->sortedBy(name)");

		// query
		CDOQuery query = getView().createQuery("ocl", queryString.toString(), eClass);
		
		// library
		if(library != null)
			query.setParameter("library", library);

		// name filter
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
	public boolean exists(String name) {
		return exists(null, name);
	}

	@Override
	public boolean exists(String library, String name) {
		return lookup(library, name) != null;
	}

	private String buildInLibraries(List<String> libraries) {
		StringBuffer sb = new StringBuffer();
		for(String library: libraries) {
			if(sb.length() != 0)
				sb.append(" or ");
			sb.append("o.library = '"+library+"'");
		}
		return sb.toString();
	}

	protected CDONet4jSession getSession() {
		return session;
	}
	
	protected CDOView getView() {
		if(view == null) {
			
			Map<String, CDOView> typedViews = views.get(Thread.currentThread());
			if(typedViews == null) {
				typedViews =  new HashMap<String, CDOView>();
				views.put(Thread.currentThread(),typedViews);
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
	
	private String buildLookupOCLQuery(String className, String library) {
		// select
		StringBuffer queryString = new StringBuffer();
		queryString.append(className+".allInstances()");			
		queryString.append("->select(o:"+className+"| o.name = name");
		queryString.append(" and ("+buildInLibraries(getContainers())+")");		
		if(library != null)
			queryString.append(" and o.library = library");
		queryString.append(")");

		queryString.append("->sortedBy(library)");
		
		return queryString.toString();
	}
}