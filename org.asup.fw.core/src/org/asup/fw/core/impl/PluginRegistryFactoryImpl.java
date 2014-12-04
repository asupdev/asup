/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Registry Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PluginRegistryFactoryImpl extends ServiceImpl implements QPluginRegistryFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginRegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFrameworkCorePackage.Literals.PLUGIN_REGISTRY_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QPlugin> QPluginRegistry<T> createPluginRegistry(Class<T> pluginClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //PluginRegistryFactoryImpl
