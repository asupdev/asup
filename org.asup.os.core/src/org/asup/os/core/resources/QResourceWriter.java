/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.resources;

import org.asup.os.core.OperatingSystemException;
import org.asup.os.omac.QObjectNameable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QResource Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.resources.QOperatingSystemResourcesPackage#getResourceWriter()
 * @model abstract="true"
 * @generated
 */
public interface QResourceWriter<T extends QObjectNameable> extends QResourceReader<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" objectRequired="true"
	 * @generated
	 */
	void delete(T object) throws OperatingSystemException, OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" objectRequired="true"
	 * @generated
	 */
	void save(T object) throws OperatingSystemException, OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" objectRequired="true" replaceRequired="true"
	 * @generated
	 */
	void save(T object, boolean replace) throws OperatingSystemException;

} // QResourceWriter
