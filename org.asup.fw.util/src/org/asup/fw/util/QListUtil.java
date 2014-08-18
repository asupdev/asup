/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util;

import java.util.List;

import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.util.QFrameworkUtilPackage#getListUtil()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QListUtil extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.asup.fw.java.JavaList" listRequired="true" elementRequired="true"
	 * @generated
	 */
	<E> void addFirst(List<E> list, E element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.asup.fw.java.JavaList" listRequired="true" elementRequired="true"
	 * @generated
	 */
	<E> void addLast(List<E> list, E element);

} // QListUtil
