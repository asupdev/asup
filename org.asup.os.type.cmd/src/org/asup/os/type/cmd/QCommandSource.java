/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.cmd;

import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCommand Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.cmd.QCommandSource#getType <em>Type</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCommandSource#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandSource()
 * @model
 * @generated
 */
public interface QCommandSource extends QObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"ASUP"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandSource_Type()
	 * @model default="ASUP"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandSource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandSource_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandSource#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // QCommandSource
