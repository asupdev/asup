/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.module;

import org.asup.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.module.QModule#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.module.QOperatingSystemModulePackage#getModule()
 * @model
 * @generated
 */
public interface QModule extends QTypedObject {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(QModuleSource)
	 * @see org.asup.os.type.module.QOperatingSystemModulePackage#getModule_Source()
	 * @model containment="true"
	 * @generated
	 */
	QModuleSource getSource();

	/**
	 * Sets the value of the '{@link org.asup.os.type.module.QModule#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QModuleSource value);
} // QModule