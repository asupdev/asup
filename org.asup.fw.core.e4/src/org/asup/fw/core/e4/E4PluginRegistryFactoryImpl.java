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

import javax.inject.Inject;

import org.asup.fw.core.QContext;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.impl.PluginRegistryFactoryImpl;

public class E4PluginRegistryFactoryImpl extends PluginRegistryFactoryImpl {

	@Inject
	private QContext asupContext;

	@Override
	public <T extends QPlugin> QPluginRegistry<T> createPluginRegistry(Class<T> pluginClass) {
		return new E4PluginRegistryImpl<T>(((E4ContextRootImpl)asupContext).bundleContext, pluginClass);
	}
}
