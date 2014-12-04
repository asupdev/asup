/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac;

import java.util.Iterator;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QObject Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.OSOmacPackage#getQObjectIterator()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface QObjectIterator<T extends QObject> extends Iterator<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasNext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	T next();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove();

} // QObjectIterator
