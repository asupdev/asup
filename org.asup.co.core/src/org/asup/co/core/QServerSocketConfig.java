/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.core;

import org.asup.fw.core.QServiceConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Socket Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.co.core.QServerSocketConfig#getAddress <em>Address</em>}</li>
 *   <li>{@link org.asup.co.core.QServerSocketConfig#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.co.core.QConnectorCorePackage#getServerSocketConfig()
 * @model
 * @generated
 */
public interface QServerSocketConfig extends QServiceConfig {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.asup.co.core.QConnectorCorePackage#getServerSocketConfig_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.asup.co.core.QServerSocketConfig#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.asup.co.core.QConnectorCorePackage#getServerSocketConfig_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.asup.co.core.QServerSocketConfig#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // ServerSocketConfig
