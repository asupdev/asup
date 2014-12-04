/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.expr.impl;

import org.asup.fw.core.impl.PluginRegistryImpl;

import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QExpressionParserRegistry;
import org.asup.il.expr.QIntegratedLanguageExpressionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Parser Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionParserRegistryImpl extends PluginRegistryImpl<QExpressionParser> implements QExpressionParserRegistry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionParserRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.EXPRESSION_PARSER_REGISTRY;
	}

} //ExpressionParserRegistryImpl
