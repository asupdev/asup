/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.resources.impl;

import org.asup.os.core.resources.QOperatingSystemResourcesPackage;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceListener;
import org.asup.os.core.resources.QResourceProvider;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QResource Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ResourceFactoryImpl extends ResourceProviderImpl implements QResourceFactory {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemResourcesPackage.Literals.RESOURCE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QObjectNameable> void registerListener(Class<T> klass, QResourceListener<T> listener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QObjectNameable> void registerProvider(Class<T> klass, QResourceProvider provider) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
} //QResourceFactoryImpl
