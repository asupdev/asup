/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf.impl;

import org.asup.co.osgi.ecf.ECFConnectorOSGIPackage;
import org.asup.co.osgi.ecf.ECFContainerConfig;
import org.asup.co.osgi.impl.BaseConfigImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECF Container Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ECFContainerConfigImpl extends BaseConfigImpl implements ECFContainerConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECFContainerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECFConnectorOSGIPackage.Literals.ECF_CONTAINER_CONFIG;
	}

} //ECFContainerConfigImpl
