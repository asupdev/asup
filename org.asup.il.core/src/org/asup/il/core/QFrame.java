/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.core.QFrame#getSlots <em>Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getFrame()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFrame extends QNameable {

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' reference list.
	 * The list contents are of type {@link org.asup.il.core.QSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' reference list.
	 * @see org.asup.il.core.QIntegratedLanguageCorePackage#getFrame_Slots()
	 * @model
	 * @generated
	 */
	List<QSlot> getSlots();
} // QFrame
