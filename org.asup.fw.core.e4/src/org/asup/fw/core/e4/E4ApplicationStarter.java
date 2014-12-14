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

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QApplication;
import org.asup.fw.core.QApplicationLevel;
import org.asup.fw.core.QApplicationModule;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;
import org.asup.fw.core.QServiceHook;
import org.asup.fw.core.QServicePlugin;
import org.asup.fw.core.QServicePluginRegistry;
import org.asup.fw.core.QServiceReference;
import org.asup.fw.core.ServiceStatus;
import org.asup.fw.core.annotation.ApplicationStarted;
import org.asup.fw.core.annotation.ApplicationStarting;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.annotation.LevelStarting;
import org.asup.fw.core.annotation.ServiceRegistration;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;

public class E4ApplicationStarter {

	private QApplication application;
	private BundleContext bundleContext;
	
	private int messageLevel;
	private Writer writer;
	
	protected E4ApplicationStarter(QApplication application, BundleContext bundleContext, OutputStream outputStream) {
		this.application = application;
		this.bundleContext = bundleContext;
		this.writer = new OutputStreamWriter(outputStream);
	}
	
	public QApplication start() throws Exception {		
		
		println("");
		
		println(">application "+application);		

		// root context
        QContext context = new E4ContextRootImpl(bundleContext, bundleContext.getBundle().getSymbolicName());

        QApplication application = new E4ApplicationImpl(this.application, context);
	    bundleContext.registerService(QApplication.class, application, null);

	    // hooks
		messageLevel++;			
		for(QServiceHook hook: application.getHooks()) {

			// STOPPED
			if(hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook "+hook+" unactive");
				continue;
			}

			println("+hook "+hook);				
			QService service = (QService)loadObject(context, hook.getClassName());
			service.setConfig(hook.getConfig());
			Dictionary<String, Object> properties = new Hashtable<String, Object>();
			properties.put("org.asup.fw.core.hook.application", application.getText());
			bundleContext.registerService(QService.class, service, properties);
			context.invoke(service, ApplicationStarting.class);			
		}

		messageLevel--;
		
		for(QApplicationLevel level: application.getLevels()) {

			messageLevel++;
			println(">level "+level);

			// hooks
			messageLevel++;			
			for(QServiceHook hook: level.getHooks()) {
				// STOPPED
				if(hook.getStatus() == ServiceStatus.STOPPED) {
					println("-hook "+hook+" unactive");
					continue;
				}

				println("+hook "+hook);				
				QService service = (QService)loadObject(context, hook.getClassName());
				service.setConfig(hook.getConfig());
				Dictionary<String, Object> properties = new Hashtable<String, Object>();
				properties.put("org.asup.fw.core.hook.level", level.getValue());
				bundleContext.registerService(QService.class, service, properties);
			}
			messageLevel--;
			
			// LevelStarting event
			messageLevel++;
			for(QService hook: loadHooks(level)) {
				println("!level starting "+hook);
				context.invoke(hook, LevelStarting.class);
			}
			messageLevel--;
			
			for(QApplicationModule module: level.getModules()) {
				messageLevel++;
				println(">module "+module);

				messageLevel++;
				for(QServiceReference serviceReference: module.getServices()) {
					try {
						registerService(application, level, context, serviceReference);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				messageLevel--;				
				messageLevel--;
			}
			
			// LevelStarted event
			messageLevel++;
			for(QService hook: loadHooks(level)) {
				println("!level started "+hook);
				context.invoke(hook, LevelStarted.class);
			}
			messageLevel--;
			
			messageLevel--;
		}
		
		// hooks
		messageLevel++;			

		for(QService hook: loadHooks(application)) {
			println("+hook "+hook);		
			context.invoke(hook, ApplicationStarted.class);			
		}

		messageLevel--;
		
		return application;
	}

	public void registerService(QApplication application, QApplicationLevel level, QContext context, QServiceReference serviceReference) throws ClassNotFoundException {

		// STOPPED
		if(serviceReference.getStatus() == ServiceStatus.STOPPED) {
			println("-service "+serviceReference+" unactive");
			return;
		}

		println("+service "+serviceReference);

		// load service
		QService service = (QService)loadObject(context, serviceReference.getClassName());		
		service.setConfig(serviceReference.getConfig());

		// register on context
		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();
		
		// service registry
		if(serviceReference instanceof QServicePluginRegistry) {
			
			// by interface
			if(serviceReference.getInterfaceName() != null)
			   if(bundleContext.getServiceReference(serviceReference.getInterfaceName()) == null)
				   registerService(application, level, context, serviceReference.getInterfaceName(), service, dictionary, serviceReference.isRemoteExport());
			// by class
			else if(serviceReference.getClassName() != null)
				if(bundleContext.getServiceReference(serviceReference.getClassName()) == null)
					registerService(application, level, context, serviceReference.getClassName(), service, dictionary, serviceReference.isRemoteExport());

			
			messageLevel++;			
			QServicePluginRegistry serviceRegistry = (QServicePluginRegistry)serviceReference;
			registerService(application, level, context, serviceRegistry);
			messageLevel--;
		}
		else {

			if(serviceReference.getInterfaceName() != null)
				registerService(application, level, context, serviceReference.getInterfaceName(), service, dictionary, serviceReference.isRemoteExport());
			else
				registerService(application, level, context, serviceReference.getClassName(), service, dictionary, serviceReference.isRemoteExport());

		}
	}
	
	public void registerService(QApplication application, QApplicationLevel level, QContext context, QServicePluginRegistry serviceRegistry) throws ClassNotFoundException {
		
		for(QServicePlugin servicePlugin: serviceRegistry.getServices()) {

			// STOPPED
			if(servicePlugin.getStatus() == ServiceStatus.STOPPED) {
				println("-plugin "+servicePlugin+" unactive ");
				continue;
			}

			println("+plugin "+servicePlugin);
			// service references
			messageLevel++;
			for(QServiceReference serviceReference: servicePlugin.getServices())
				registerService(application, level, context, serviceReference);
			messageLevel--;

			// load service
			QService service = (QService)loadObject(context, servicePlugin.getClassName());
			service.setConfig(servicePlugin.getConfig());

			QPlugin plugin = (QPlugin)service;
			plugin.setName(servicePlugin.getName());
			plugin.setText(servicePlugin.getText());
			plugin.setVendor(servicePlugin.getVendor());
			plugin.setVersion(servicePlugin.getVersion());
			
			// register on context
			Dictionary<String, Object> properties = new Hashtable<String, Object>();
			properties.put("org.asup.fw.core.plugin.name", servicePlugin.getName());		
			registerService(application, level, context,serviceRegistry.getPluginInterface(), service, properties, serviceRegistry.isRemoteExport());
			if(servicePlugin.getInterfaceName() != null) 
				registerService(application, level, context, servicePlugin.getInterfaceName(), service, new Hashtable<String, Object>(), servicePlugin.isRemoteExport());
			
		}		
	}

	public void registerService(QApplication application, QApplicationLevel level, QContext context, String name, Object service, Dictionary<String, Object> properties, boolean remoteExport) {

		QContext contextService = context.createLocalContext(name);
		contextService.set("org.asup.fw.core.service.name", name);
		contextService.set("org.asup.fw.core.service.object", service);			
		contextService.set("org.asup.fw.core.service.properties", properties);
		contextService.set("org.asup.fw.core.service.remoteExport", remoteExport);
		
		// application hooks
		for(QService hook:loadHooks(application)) 
			contextService.invoke(hook, ServiceRegistration.class);
		
		// level hooks
		for(QService hook:loadHooks(level)) 
			contextService.invoke(hook, ServiceRegistration.class);

		// register on context
		contextService.invoke(service, ServiceRegistration.class);
		
		bundleContext.registerService(name, service, properties);
		
		contextService.close();
	}

	public Object loadObject(QContext context, String className) {
		
		for(Bundle bundle: bundleContext.getBundles()) {

			if(className.startsWith(bundle.getSymbolicName())) {				
				try {
					Class<?> tempClass = bundle.loadClass(className);
					return context.make(tempClass);
				}
				catch(ClassNotFoundException e) {
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		throw new FrameworkCoreRuntimeException("Service: class not found "+className);
	}
	
	private List<QService> loadHooks(QApplication application) {
		
		List<QService> hooks = new ArrayList<>();

		try {
			String serviceFilter = "(org.asup.fw.core.hook.application="+application.getText()+")";
			for(org.osgi.framework.ServiceReference<QService> reference: bundleContext.getServiceReferences(QService.class, serviceFilter)) {
				QService service = bundleContext.getService(reference);
				hooks.add(service);
			}
		}
		catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
		
		return hooks;
	}

	private List<QService> loadHooks(QApplicationLevel level) {
		
		List<QService> hooks = new ArrayList<>();

		try {
			String serviceFilter = "(org.asup.fw.core.hook.level="+level.getValue()+")";
			for(org.osgi.framework.ServiceReference<QService> reference: bundleContext.getServiceReferences(QService.class, serviceFilter)) {
				QService service = bundleContext.getService(reference);
				hooks.add(service);
			}
		}
		catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
		
		return hooks;
	}
	
	private void println(String message) {
		
		try {
			writer.write(appendChars(message+"\n", "\t", messageLevel, true));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String appendChars(String in, String chars, int times, boolean before) {
		StringBuffer sb = new StringBuffer();
		if(!before)
			sb.append(in);
		for(int x=0; x<times; x++)
			sb.append(chars);
		if(before)
			sb.append(in);
		sb.trimToSize();
		return sb.toString();
	}
}
