/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf;

import java.util.List;

import org.asup.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.msgf.QMessageFile#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.msgf.QOperatingSystemMessageFilePackage#getMessageFile()
 * @model
 * @generated
 */
public interface QMessageFile extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.os.type.msgf.QMessageDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.asup.os.type.msgf.QOperatingSystemMessageFilePackage#getMessageFile_Messages()
	 * @model containment="true"
	 * @generated
	 */
	List<QMessageDescription> getMessages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameType="org.asup.fw.java.JavaEnum" nameRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> QMessageDescription lookup(Enum<E> name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> QMessageDescription lookup(String name);

} // QMessageFile
