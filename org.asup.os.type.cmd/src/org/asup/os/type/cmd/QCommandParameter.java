/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.cmd;

import org.asup.il.data.QDataTerm;
import org.asup.os.omac.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCommand Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.cmd.QCommandParameter#isAllowVariable <em>Allow Variable</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCommandParameter#getDataTerm <em>Data Term</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCommandParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCommandParameter#getPosition <em>Position</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCommandParameter#getStatus <em>Status</em>}</li>
 *   <li>{@link org.asup.os.type.cmd.QCommandParameter#isHidden <em>Hidden</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter()
 * @model
 * @generated
 */
public interface QCommandParameter extends QObject {
	/**
	 * Returns the value of the '<em><b>Allow Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Variable</em>' attribute.
	 * @see #setAllowVariable(boolean)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter_AllowVariable()
	 * @model required="true"
	 * @generated
	 */
	boolean isAllowVariable();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandParameter#isAllowVariable <em>Allow Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Variable</em>' attribute.
	 * @see #isAllowVariable()
	 * @generated
	 */
	void setAllowVariable(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Term</em>' containment reference.
	 * @see #setDataTerm(QDataTerm)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter_DataTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QDataTerm<?> getDataTerm();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandParameter#getDataTerm <em>Data Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Term</em>' containment reference.
	 * @see #getDataTerm()
	 * @generated
	 */
	void setDataTerm(QDataTerm<?> value);

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
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter_Position()
	 * @model required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandParameter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSupported();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"SUP"</code>.
	 * The literals are from the enumeration {@link org.asup.os.type.cmd.CommandStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.asup.os.type.cmd.CommandStatus
	 * @see #setStatus(CommandStatus)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter_Status()
	 * @model default="SUP"
	 * @generated
	 */
	CommandStatus getStatus();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandParameter#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.asup.os.type.cmd.CommandStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CommandStatus value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandParameter_Hidden()
	 * @model required="true"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link org.asup.os.type.cmd.QCommandParameter#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isCompound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isMany();

} // QCommandParameter
