/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.output;

import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QService;

import org.asup.os.core.jobs.JobType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Writer Factory Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.output.QOperatingSystemOutputPackage#getObjectWriterFactoryRegistry()
 * @model abstract="true"
 * @generated
 */
public interface QObjectWriterFactoryRegistry extends QPluginRegistry<QObjectWriterFactory>, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobTypeRequired="true"
	 * @generated
	 */
	QObjectWriterFactory lookup(JobType jobType);

} // QObjectWriterFactoryRegistry
