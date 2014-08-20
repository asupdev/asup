/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.omac.QObjectContainer#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.omac.QOperatingSystemOmacPackage#getObjectContainer()
 * @model abstract="true"
 * @generated
 */
public interface QObjectContainer<T extends QObject> {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.asup.os.omac.QOperatingSystemOmacPackage#getObjectContainer_Contents()
	 * @model containment="true"
	 * @generated
	 */
	List<T> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	T lookupByName(String name);

} // QObjectContainer
