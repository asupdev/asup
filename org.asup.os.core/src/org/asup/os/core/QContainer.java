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
 *
 * @see org.asup.os.core.QOperatingSystemCorePackage#getContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QContainer<C extends QObject> {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	QObjectContent<C> getContent();

} // QContainer
