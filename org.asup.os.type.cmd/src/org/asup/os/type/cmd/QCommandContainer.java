/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.cmd;

import java.util.List;
import org.asup.os.type.QTypedContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.cmd.QCommandContainer#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandContainer()
 * @model
 * @generated
 */
public interface QCommandContainer extends QTypedContainer<QCommand> {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandContainer_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandContainer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" orderRequired="true"
	 * @generated
	 */
	List<QCommand> getCommands(CommandOrder order);
} // QCommandContainer
