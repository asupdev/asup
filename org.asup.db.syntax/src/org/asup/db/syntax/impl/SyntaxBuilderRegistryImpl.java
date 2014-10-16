/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.impl;

import org.asup.db.core.QConnectionConfig;
import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.db.syntax.QSyntaxBuilderRegistry;
import org.asup.fw.core.impl.PluginRegistryImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntax Builder Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SyntaxBuilderRegistryImpl extends PluginRegistryImpl<QSyntaxBuilder> implements QSyntaxBuilderRegistry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxBuilderRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.SYNTAX_BUILDER_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QSyntaxBuilder lookup(QConnectionConfig connectionConfig) {
		return lookup(connectionConfig.getPluginName());
	}

} //SyntaxBuilderRegistryImpl