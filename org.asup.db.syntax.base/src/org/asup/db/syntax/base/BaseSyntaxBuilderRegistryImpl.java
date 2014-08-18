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

import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.db.syntax.impl.SyntaxBuilderRegistryImpl;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;

public class BaseSyntaxBuilderRegistryImpl extends SyntaxBuilderRegistryImpl {


	@SuppressWarnings("unchecked")
	@Inject
	public BaseSyntaxBuilderRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QSyntaxBuilder.class);
		setStore((QPluginRegistry<QSyntaxBuilder>) pluginRegistry);
	}
}
