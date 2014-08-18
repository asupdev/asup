/**
 *  Copyright (c) 2012, 2014 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.core.QPluginRegistry#getStore <em>Store</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getPluginRegistry()
 * @model abstract="true"
 * @generated
 */
public interface QPluginRegistry<T extends QPlugin> extends QService {
	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(QPluginRegistry)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getPluginRegistry_Store()
	 * @model
	 * @generated
	 */
	QPluginRegistry<T> getStore();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QPluginRegistry#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(QPluginRegistry<T> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	T lookup(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<T> list();

} // PluginRegistry
