/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.cmd;

import java.util.Map;

import org.asup.il.data.QDataContext;
import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCallable Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.cmd.QCallableCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCallableCommand#getCommandString <em>Command String</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCallableCommand#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCallableCommand#getDataContext <em>Data Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCallableCommand()
 * @model
 * @generated
 */
public interface QCallableCommand extends QObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(QCommand)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCallableCommand_Command()
	 * @model required="true"
	 * @generated
	 */
	QCommand getCommand();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCallableCommand#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(QCommand value);

	/**
	 * Returns the value of the '<em><b>Command String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command String</em>' attribute.
	 * @see #setCommandString(String)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCallableCommand_CommandString()
	 * @model required="true"
	 * @generated
	 */
	String getCommandString();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCallableCommand#getCommandString <em>Command String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command String</em>' attribute.
	 * @see #getCommandString()
	 * @generated
	 */
	void setCommandString(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute.
	 * @see #setVariables(Map)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCallableCommand_Variables()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, Object> getVariables();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCallableCommand#getVariables <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' attribute.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(Map<String, Object> value);

	/**
	 * Returns the value of the '<em><b>Data Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Context</em>' containment reference.
	 * @see #setDataContext(QDataContext)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCallableCommand_DataContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QDataContext getDataContext();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCallableCommand#getDataContext <em>Data Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Context</em>' containment reference.
	 * @see #getDataContext()
	 * @generated
	 */
	void setDataContext(QDataContext value);

} // QCallableCommand
