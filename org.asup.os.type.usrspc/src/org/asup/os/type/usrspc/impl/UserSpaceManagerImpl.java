/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.usrspc.impl;

import org.asup.os.type.impl.TypedManagerImpl;
import org.asup.os.type.usrspc.QOperatingSystemUserSpacePackage;
import org.asup.os.type.usrspc.QUserSpace;
import org.asup.os.type.usrspc.QUserSpaceManager;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Space Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class UserSpaceManagerImpl extends TypedManagerImpl<QUserSpace> implements QUserSpaceManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSpaceManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QUserSpace> getTypedClass() {
		return QUserSpace.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemUserSpacePackage.Literals.USER_SPACE_MANAGER;
	}

} //UserSpaceManagerImpl
