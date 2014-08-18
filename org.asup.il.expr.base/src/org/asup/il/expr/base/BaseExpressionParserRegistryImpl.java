/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.il.expr.base;

import javax.inject.Inject;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.impl.ExpressionParserRegistryImpl;

public class BaseExpressionParserRegistryImpl extends ExpressionParserRegistryImpl {

	@SuppressWarnings("unchecked")
	@Inject
	public BaseExpressionParserRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QExpressionParser.class);
		setStore((QPluginRegistry<QExpressionParser>) pluginRegistry);
	}
}
