/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm;

import org.asup.il.data.QData;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QCallable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCallable Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.pgm.QCallableProgram#getQActivationGroup <em>QActivation Group</em>}</li>
 *   <li>{@link org.asup.os.type.pgm.QCallableProgram#getQEntry <em>QEntry</em>}</li>
 *   <li>{@link org.asup.os.type.pgm.QCallableProgram#getQProgram <em>QProgram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getCallableProgram()
 * @model abstract="true"
 * @generated
 */
public interface QCallableProgram extends QCallable {
	/**
	 * Returns the value of the '<em><b>QProgram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QProgram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QProgram</em>' reference.
	 * @see #setQProgram(QProgram)
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getCallableProgram_QProgram()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	QProgram getQProgram();

	/**
	 * Sets the value of the '{@link org.asup.os.type.pgm.QCallableProgram#getQProgram <em>QProgram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QProgram</em>' reference.
	 * @see #getQProgram()
	 * @generated
	 */
	void setQProgram(QProgram value);

	/**
	 * Returns the value of the '<em><b>QEntry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QEntry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QEntry</em>' attribute.
	 * @see #setQEntry(QData[])
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getCallableProgram_QEntry()
	 * @model dataType="org.asup.os.type.pgm.ParameterList" required="true"
	 * @generated
	 */
	QData[] getQEntry();

	/**
	 * Sets the value of the '{@link org.asup.os.type.pgm.QCallableProgram#getQEntry <em>QEntry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QEntry</em>' attribute.
	 * @see #getQEntry()
	 * @generated
	 */
	void setQEntry(QData[] value);

	/**
	 * Returns the value of the '<em><b>QActivation Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.asup.os.type.pgm.QActivationGroup#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QActivation Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QActivation Group</em>' container reference.
	 * @see #setQActivationGroup(QActivationGroup)
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getCallableProgram_QActivationGroup()
	 * @see org.asup.os.type.pgm.QActivationGroup#getPrograms
	 * @model opposite="programs"
	 * @generated
	 */
	QActivationGroup getQActivationGroup();

	/**
	 * Sets the value of the '{@link org.asup.os.type.pgm.QCallableProgram#getQActivationGroup <em>QActivation Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QActivation Group</em>' container reference.
	 * @see #getQActivationGroup()
	 * @generated
	 */
	void setQActivationGroup(QActivationGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Object getRawProgram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isStateless();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException"
	 * @generated
	 */
	void open() throws OperatingSystemRuntimeException;

} // QCallableProgram