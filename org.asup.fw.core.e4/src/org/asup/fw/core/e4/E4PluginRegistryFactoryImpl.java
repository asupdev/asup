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

import org.asup.fw.core.QApplication;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.impl.PluginRegistryFactoryImpl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public class E4PluginRegistryFactoryImpl extends PluginRegistryFactoryImpl {

	@Override
	public <T extends QPlugin> QPluginRegistry<T> createPluginRegistry(Class<T> pluginClass) {
		
		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
		
		return new E4PluginRegistryImpl<T>(bundleContext, pluginClass);
	}
}
