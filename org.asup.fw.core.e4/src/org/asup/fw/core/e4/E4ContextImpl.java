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
package org.asup.fw.core.e4;

import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ContextImpl;
import org.eclipse.core.internal.runtime.AdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public abstract class E4ContextImpl extends ContextImpl {

	private static Boolean postConstruct = null;

	private QContextID contextID = null;

	public E4ContextImpl(final String id) {
		
		this.contextID = new QContextID() {

			@Override
			public String getID() {
				return id;
			}
		};
	}

	abstract IEclipseContext getEclipseContext();

	@Override
	public QContextID getID() {
		return this.contextID;
	}

	@Override
	public <T> void set(Class<T> clazz, T object) throws FrameworkCoreRuntimeException {
		getEclipseContext().set(clazz, object);
	}

	@Override
	public <T> void set(String name, T object) throws FrameworkCoreRuntimeException {
		getEclipseContext().set(name, object);
	}

	@Override
	public <T> T make(Class<T> clazz) throws FrameworkCoreRuntimeException {

		IEclipseContext eclipseContext = getEclipseContext();
		T object = ContextInjectionFactory.make(clazz, eclipseContext);

		if (isActivePostConstruct())
			ContextInjectionFactory.invoke(object, PostConstruct.class, eclipseContext, object);

		return object;
	}

	private boolean isActivePostConstruct() {

		if (postConstruct == null) {

			IEclipseContext eclipseContext = getEclipseContext();
			Dummy dummy = ContextInjectionFactory.make(Dummy.class, eclipseContext);
			postConstruct = !dummy.isLoaded();

		}

		return postConstruct;
	}

	@Override
	public void inject(Object consumer) throws FrameworkCoreRuntimeException {
		ContextInjectionFactory.inject(consumer, getEclipseContext());
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return getEclipseContext().get(clazz);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
		try {
			ContextInjectionFactory.invoke(object, qualifier, getEclipseContext());
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public static class Dummy {

		private boolean loaded = false;

		public Dummy() {

		}

		@PostConstruct
		public void init() {
			this.loaded = true;
		}

		public boolean isLoaded() {
			return loaded;
		}
	}

	@Override
	public Class<?> loadClass(QContextID contextID, String address) {

		URI uriAddress = URI.createURI(address);

		Bundle bundleAuthority = Platform.getBundle(uriAddress.segment(1));
		if (bundleAuthority == null)
			return null;

		try {
			return bundleAuthority.loadClass(uriAddress.segment(2));
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public <T> T getAdapter(Object adaptable, Class<T> adapter) {
		AdapterManager adapterManager = AdapterManager.getDefault();
		return (T) adapterManager.getAdapter(adaptable, adapter);
	}

	@Override
	public void close() throws FrameworkCoreRuntimeException {
		getEclipseContext().dispose();
	}
}
