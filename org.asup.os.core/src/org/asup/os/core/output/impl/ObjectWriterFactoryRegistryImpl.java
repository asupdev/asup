/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.output.impl;

import org.asup.fw.core.impl.PluginRegistryImpl;
import org.asup.os.core.jobs.JobType;
import org.asup.os.core.output.QObjectWriterFactory;
import org.asup.os.core.output.QObjectWriterFactoryRegistry;
import org.asup.os.core.output.QOperatingSystemOutputPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QObject Writer Factory Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ObjectWriterFactoryRegistryImpl extends PluginRegistryImpl<QObjectWriterFactory> implements QObjectWriterFactoryRegistry {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectWriterFactoryRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemOutputPackage.Literals.OBJECT_WRITER_FACTORY_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QObjectWriterFactory lookup(JobType jobType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //QObjectWriterFactoryRegistryImpl
