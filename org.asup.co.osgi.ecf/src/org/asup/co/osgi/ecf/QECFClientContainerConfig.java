/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECF Client Container Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.co.osgi.ecf.QECFClientContainerConfig#getClientContainerType <em>Client Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.co.osgi.ecf.QECFConnectorOSGIPackage#getECFClientContainerConfig()
 * @model
 * @generated
 */
public interface QECFClientContainerConfig extends QECFContainerConfig {
	/**
	 * Returns the value of the '<em><b>Client Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Container Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Container Type</em>' attribute.
	 * @see #setClientContainerType(String)
	 * @see org.asup.co.osgi.ecf.QECFConnectorOSGIPackage#getECFClientContainerConfig_ClientContainerType()
	 * @model required="true"
	 * @generated
	 */
	String getClientContainerType();

	/**
	 * Sets the value of the '{@link org.asup.co.osgi.ecf.QECFClientContainerConfig#getClientContainerType <em>Client Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Container Type</em>' attribute.
	 * @see #getClientContainerType()
	 * @generated
	 */
	void setClientContainerType(String value);

} // ECFClientContainerConfig
