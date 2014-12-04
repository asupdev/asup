/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.module.impl;

import org.asup.os.type.impl.TypedManagerImpl;
import org.asup.os.type.module.QModule;
import org.asup.os.type.module.QModuleManager;
import org.asup.os.type.module.QOperatingSystemModulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ModuleManagerImpl extends TypedManagerImpl<QModule> implements QModuleManager {
	

	@Override
	public Class<QModule> getTypedClass() {
		return QModule.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemModulePackage.Literals.MODULE_MANAGER;
	}
} //ModuleManagerImpl
