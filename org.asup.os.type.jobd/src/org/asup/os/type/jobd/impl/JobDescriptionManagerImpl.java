/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.jobd.impl;

import org.asup.os.type.impl.TypedManagerImpl;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.jobd.QJobDescriptionManager;
import org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QJob Description Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class JobDescriptionManagerImpl extends TypedManagerImpl<QJobDescription> implements QJobDescriptionManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobDescriptionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QJobDescription> getTypedClass() {
		return QJobDescription.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemJobDescriptionPackage.Literals.JOB_DESCRIPTION_MANAGER;
	}

} //QJobDescriptionManagerImpl
