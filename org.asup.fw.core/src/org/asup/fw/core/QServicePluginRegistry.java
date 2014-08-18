/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.core.QServicePluginRegistry#getServices <em>Services</em>}</li>
 *   <li>{@link org.asup.fw.core.QServicePluginRegistry#getPluginInterface <em>Plugin Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getServicePluginRegistry()
 * @model
 * @generated
 */
public interface QServicePluginRegistry extends QServiceReference {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.fw.core.QServicePlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServicePluginRegistry_Services()
	 * @model containment="true"
	 * @generated
	 */
	List<QServicePlugin> getServices();

	/**
	 * Returns the value of the '<em><b>Plugin Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Interface</em>' attribute.
	 * @see #setPluginInterface(String)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getServicePluginRegistry_PluginInterface()
	 * @model required="true"
	 * @generated
	 */
	String getPluginInterface();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QServicePluginRegistry#getPluginInterface <em>Plugin Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Interface</em>' attribute.
	 * @see #getPluginInterface()
	 * @generated
	 */
	void setPluginInterface(String value);

} // ServiceRegistry
