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
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ContextImpl;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.remoteserviceadmin.RemoteConstants;

public abstract class E4AbstractContextImpl extends ContextImpl {
	
	protected BundleContext bundleContext;
	private static Boolean postConstruct = null;
	
	public E4AbstractContextImpl(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
		
	abstract IEclipseContext getEclipseContext();

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
		
		if(isActivePostConstruct())
			ContextInjectionFactory.invoke(object, PostConstruct.class, eclipseContext, object);
		
		return object;
	}

	private boolean isActivePostConstruct() {

		if(postConstruct == null) {

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
	public QContext createChild() throws FrameworkCoreRuntimeException {
		
		QContext contextChild =  new E4ContextChildImpl(this, getEclipseContext().createChild(), bundleContext);
		
		// bind remote service
		try {
			for(ServiceReference<?> serviceReference: bundleContext.getAllServiceReferences(null, null)) {
				if(serviceReference.getProperty(RemoteConstants.SERVICE_IMPORTED) != null) {
					
					Object object = null;
					String className = ((String[])serviceReference.getProperty("objectClass"))[0];
					
					for(Bundle bundle: bundleContext.getBundles()) {
						if(className.startsWith(bundle.getSymbolicName())) {		
							if(bundle.getSymbolicName().equals("org.asup.os.type"))
								continue;
							object = bundle.getBundleContext().getService(serviceReference);
							if(object == null)
								continue;
							
							contextChild.set(className, object);
							break;
						}
					}
//					if(object == null)
//						System.err.println("Remote Service not found: "+className);
				}
			}
		} catch (InvalidSyntaxException e) {
			throw new FrameworkCoreRuntimeException(e);
		}
		return contextChild;
	}
	
	@Override
	public <T> T get(Class<T> clazz) {	
		return getEclipseContext().get(clazz);		
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException {
		try {
			ContextInjectionFactory.invoke(object, qualifier, getEclipseContext());
		}
		catch(Exception e) {
//			e.printStackTrace();
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
		if(bundleAuthority == null)
			return null;
		
		try {
			return bundleAuthority.loadClass(uriAddress.segment(2));
		}
		catch (ClassNotFoundException e) {
			return null;
		}		
	}
}
