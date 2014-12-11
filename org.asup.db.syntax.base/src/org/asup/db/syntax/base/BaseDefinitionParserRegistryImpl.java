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

import org.asup.db.syntax.QDefinitionParser;
import org.asup.db.syntax.impl.DefinitionParserRegistryImpl;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;

public class BaseDefinitionParserRegistryImpl extends DefinitionParserRegistryImpl {

	@SuppressWarnings("unchecked")
	@Inject
	public BaseDefinitionParserRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QDefinitionParser.class);
		setStore((QPluginRegistry<QDefinitionParser>) pluginRegistry);
	}

}
