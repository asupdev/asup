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
package org.asup.db.core.base;

import javax.inject.Inject;

import org.asup.db.core.QConnectionFactory;
import org.asup.db.core.impl.ConnectionFactoryRegistryImpl;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;

public class BaseConnectionFactoryRegistryImpl extends ConnectionFactoryRegistryImpl {

	@SuppressWarnings("unchecked")
	@Inject
	public BaseConnectionFactoryRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QConnectionFactory.class);
		setStore((QPluginRegistry<QConnectionFactory>) pluginRegistry);
	}
}
