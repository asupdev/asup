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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.impl.PluginRegistryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class E4PluginRegistryImpl<T extends QPlugin> extends PluginRegistryImpl<T> {

	private BundleContext bundleContext;
	private Class<T> pluginClass;
	private Map<String, T> plugins;
	
	
	public E4PluginRegistryImpl(BundleContext bundleContext, Class<T> pluginClass) {
		this.bundleContext = bundleContext;
		this.pluginClass = pluginClass;
		this.plugins = new HashMap<String, T>();
	}

	@Override
	public T lookup(String name) {
		
		// cached value
		T plugin = plugins.get(name);
		if(plugin != null)
			return plugin;
		
		// search plugin
		String serviceFilter = "(org.asup.fw.core.plugin.name="+name+")";
		
		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(pluginClass, serviceFilter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
			return null;
		}
		
		ServiceReference<T> pluginReference = null;
		for(ServiceReference<T> pReference: pluginReferences) {
			pluginReference = pReference;
			break;
		}
		
		if(pluginReference == null)
			return null;
		
		plugin = bundleContext.getService(pluginReference);
		
		// build dynamic properties
		for(String key: pluginReference.getPropertyKeys()) {
			if(key.startsWith("org.asup.fw.core.plugin") && !key.equals("org.asup.fw.core.plugin.name")) {
				String featureName = key.substring(key.lastIndexOf(".")+1);					
				EObject eObject = (EObject)plugin;
				EStructuralFeature structuralFeature = eObject.eClass().getEStructuralFeature(featureName);
				eObject.eSet(structuralFeature, pluginReference.getProperty(key));
			}
		}
		
		// cache value
		if(plugin != null)
			plugins.put(plugin.getName(), plugin);
		
		return plugin;
	}


	@Override
	public List<T> list() {

		List<T> plugins = new ArrayList<T>();
		
		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(pluginClass, null);
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}
		
		// TODO
		for(ServiceReference<T> pluginReference: pluginReferences) {
			if(pluginReference != null) {
				T plugin = bundleContext.getService(pluginReference);				
				plugins.add(lookup(plugin.getName()));
			}
		}
		
		return plugins;
	}
}
