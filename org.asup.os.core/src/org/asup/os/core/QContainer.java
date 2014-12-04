/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core;

import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QContainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.core.QContainer#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QContainer<T extends QObject> {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(QObjectContent)
	 * @see org.asup.os.core.QOperatingSystemCorePackage#getContainer_Content()
	 * @model containment="true"
	 * @generated
	 */
	QObjectContent<T> getContent();

	/**
	 * Sets the value of the '{@link org.asup.os.core.QContainer#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(QObjectContent<T> value);

} // QContainer
