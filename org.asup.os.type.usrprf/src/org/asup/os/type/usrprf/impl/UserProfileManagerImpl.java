/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.usrprf.impl;

import org.asup.os.type.impl.TypedManagerImpl;
import org.asup.os.type.usrprf.QOperatingSystemUserProfilePackage;
import org.asup.os.type.usrprf.QUserProfile;
import org.asup.os.type.usrprf.QUserProfileManager;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QUser Profile Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class UserProfileManagerImpl extends TypedManagerImpl<QUserProfile> implements QUserProfileManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QUserProfile> getTypedClass() {
		return QUserProfile.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemUserProfilePackage.Literals.USER_PROFILE_MANAGER;
	}

} //QUserProfileManagerImpl
