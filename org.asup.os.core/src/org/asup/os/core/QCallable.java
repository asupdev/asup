/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import java.util.concurrent.Callable;

import org.asup.il.data.QData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCallable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getCallable()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface QCallable extends Callable<QData[]>{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QData[] call();

} // QCallable
