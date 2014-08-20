/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler.impl;

import org.asup.dk.compiler.QCompilerPackage;
import org.asup.dk.compiler.QUnitConverter;
import org.asup.dk.compiler.QUnitConverterRegistry;

import org.asup.fw.core.impl.PluginRegistryImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Converter Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class UnitConverterRegistryImpl extends PluginRegistryImpl<QUnitConverter> implements QUnitConverterRegistry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitConverterRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QCompilerPackage.Literals.UNIT_CONVERTER_REGISTRY;
	}

} //UnitConverterRegistryImpl
