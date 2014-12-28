/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.resources;

import java.util.List;

import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QResource Cross Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.core.resources.QResourceSetReader#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.core.resources.QOperatingSystemResourcesPackage#getResourceSetReader()
 * @model
 * @generated
 */
public interface QResourceSetReader<T extends QObjectNameable> extends QResourceReader<T> {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' attribute list.
	 * @see org.asup.os.core.resources.QOperatingSystemResourcesPackage#getResourceSetReader_Containers()
	 * @model required="true"
	 * @generated
	 */
	List<String> getContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true" nameRequired="true"
	 * @generated
	 */
	T lookup(String container, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" containerRequired="true" nameRequired="true"
	 * @generated
	 */
	boolean exists(String container, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true"
	 * @generated
	 */
	QObjectIterator<T> find(String container, String nameFilter);

} // QResourceCrossReader
