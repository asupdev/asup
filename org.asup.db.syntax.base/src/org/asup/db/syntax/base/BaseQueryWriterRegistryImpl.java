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
package org.asup.db.syntax.base;

import javax.inject.Inject;

import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.impl.QueryWriterRegistryImpl;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;

public class BaseQueryWriterRegistryImpl extends QueryWriterRegistryImpl {

	@SuppressWarnings("unchecked")
	@Inject
	public BaseQueryWriterRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QQueryWriter.class);
		setStore((QPluginRegistry<QQueryWriter>) pluginRegistry);
	}
}
