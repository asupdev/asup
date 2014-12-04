/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaara.impl;

import org.asup.os.type.dtaara.QDataArea;
import org.asup.os.type.dtaara.QDataAreaManager;
import org.asup.os.type.dtaara.QOperatingSystemDataAreaPackage;
import org.asup.os.type.impl.TypedManagerImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QData Area Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataAreaManagerImpl extends TypedManagerImpl<QDataArea> implements QDataAreaManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAreaManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QDataArea> getTypedClass() {
		return QDataArea.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemDataAreaPackage.Literals.DATA_AREA_MANAGER;
	}

} //DataAreaManagerImpl
