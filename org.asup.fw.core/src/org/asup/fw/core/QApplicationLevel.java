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
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.fw.core.QApplicationLevel#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.asup.fw.core.QApplicationLevel#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.fw.core.QApplicationLevel#getModules <em>Modules</em>}</li>
 *   <li>{@link org.asup.fw.core.QApplicationLevel#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getApplicationLevel()
 * @model
 * @generated
 */
public interface QApplicationLevel {
	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.fw.core.QServiceHook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' containment reference list.
	 * @see org.asup.fw.core.QFrameworkCorePackage#getApplicationLevel_Hooks()
	 * @model containment="true"
	 * @generated
	 */
	List<QServiceHook> getHooks();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getApplicationLevel_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QApplicationLevel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.asup.fw.core.QFrameworkCorePackage#getApplicationLevel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.fw.core.QApplicationLevel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.asup.fw.core.QApplicationModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see org.asup.fw.core.QFrameworkCorePackage#getApplicationLevel_Modules()
	 * @model
	 * @generated
	 */
	List<QApplicationModule> getModules();

} // Level
