/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.core.QService#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getService()
 * @model abstract="true"
 * @generated
 */
public interface QService {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(QServiceConfig)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getService_Config()
	 * @model containment="true"
	 * @generated
	 */
	QServiceConfig getConfig();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QService#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(QServiceConfig value);

} // Service
