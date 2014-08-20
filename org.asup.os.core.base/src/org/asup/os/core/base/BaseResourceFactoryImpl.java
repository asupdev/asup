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
package org.asup.os.core.base;

import java.util.HashMap;
import java.util.Map;

import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResource;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.core.resources.QResourceNotifier;
import org.asup.os.core.resources.QResourceProvider;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.impl.ResourceFactoryImpl;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QTypedObject;

public class BaseResourceFactoryImpl extends ResourceFactoryImpl {


	private final Map<Class<? extends QObjectNameable>, QResourceNotifier<? extends QObject>> notifiers;
	private final Map<Class<? extends QObjectNameable>, QResourceProvider> providers;

	public BaseResourceFactoryImpl() {
		super();
		
		notifiers = new HashMap<Class<? extends QObjectNameable>, QResourceNotifier<? extends QObject>> ();
		providers = new HashMap<Class<? extends QObjectNameable>, QResourceProvider> ();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> void registerListener(Class<T> klass, QResourceListener<T> listener) {
		QResourceNotifier<T> notifier = (QResourceNotifier<T>) notifiers.get(klass);
		if(notifier == null) {
			notifier = QOperatingSystemResourcesFactory.eINSTANCE.createResourceNotifier();
			notifiers.put(klass, notifier);
		}
		notifier.registerListener(listener);
	}
	
	@Override
	public <T extends QObjectNameable> void registerProvider(Class<T> klass, QResourceProvider provider) {
		providers.put(klass, provider);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {
		
		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceReader<T> resourceReader = resourceProvider.getResourceReader(job, klass, container);
		prepareListener(resourceReader, klass);
		
		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
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

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceSetReader<T> resourceSetReader = resourceProvider.getResourceReader(job, klass, scope);
		prepareListener(resourceSetReader, klass);
		
		return resourceSetReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceWriter<T> resourceWriter = resourceProvider.getResourceWriter(job, klass, container);
		prepareListener(resourceWriter, klass);
		
		return resourceWriter;
	}
	
	private <T extends QObjectNameable> QResourceProvider getResourceProvider(Class<T> klass) {
		
		QResourceProvider resourceProvider = providers.get(klass);
		if(resourceProvider == null)
			resourceProvider = providers.get(QTypedObject.class);
		
		return resourceProvider;
	}

	@SuppressWarnings("unchecked")
	private <T extends QObjectNameable> void prepareListener(QResource<T> resource, Class<T> klass) {

		QResourceNotifier<T> notifier = (QResourceNotifier<T>) notifiers.get(klass);
		if(notifier == null) 
			return;

		// TODO copy
		resource.setNotifier(notifier);
		
	}
}
