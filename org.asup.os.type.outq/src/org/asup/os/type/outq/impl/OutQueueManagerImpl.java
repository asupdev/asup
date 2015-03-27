/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.outq.impl;

import org.asup.os.type.impl.TypedManagerImpl;
import org.asup.os.type.outq.QOperatingSystemOutQueuePackage;
import org.asup.os.type.outq.QOutQueue;
import org.asup.os.type.outq.QOutQueueManager;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Queue Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OutQueueManagerImpl extends TypedManagerImpl<QOutQueue> implements QOutQueueManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutQueueManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QOutQueue> getTypedClass() {
		return QOutQueue.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemOutQueuePackage.Literals.OUT_QUEUE_MANAGER;
	}
} //OutQueueManagerImpl