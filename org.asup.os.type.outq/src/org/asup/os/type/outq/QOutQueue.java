/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.outq;

import org.asup.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.outq.QOutQueue#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.outq.QOperatingSystemOutQueuePackage#getOutQueue()
 * @model
 * @generated
 */
public interface QOutQueue extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.os.type.outq.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see org.asup.os.type.outq.SequenceType
	 * @see #setSequence(SequenceType)
	 * @see org.asup.os.type.outq.QOperatingSystemOutQueuePackage#getOutQueue_Sequence()
	 * @model required="true"
	 * @generated
	 */
	SequenceType getSequence();

	/**
	 * Sets the value of the '{@link org.asup.os.type.outq.QOutQueue#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see org.asup.os.type.outq.SequenceType
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(SequenceType value);

} // QOutQueue
