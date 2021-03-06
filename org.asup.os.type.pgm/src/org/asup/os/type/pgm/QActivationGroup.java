/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm;

import java.util.List;

import org.asup.fw.core.QContext;
import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QActivation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.pgm.QActivationGroup#getFrameworkContext <em>Framework Context</em>}</li>
 *   <li>{@link org.asup.os.type.pgm.QActivationGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.os.type.pgm.QActivationGroup#getPrograms <em>Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getActivationGroup()
 * @model
 * @generated
 */
public interface QActivationGroup extends QObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.os.type.pgm.QCallableProgram}.
	 * It is bidirectional and its opposite is '{@link org.asup.os.type.pgm.QCallableProgram#getQActivationGroup <em>QActivation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getActivationGroup_Programs()
	 * @see org.asup.os.type.pgm.QCallableProgram#getQActivationGroup
	 * @model opposite="qActivationGroup" containment="true" transient="true"
	 * @generated
	 */
	List<QCallableProgram> getPrograms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	QCallableProgram lookup(QProgram program);

	/**
	 * Returns the value of the '<em><b>Framework Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Context</em>' containment reference.
	 * @see #setFrameworkContext(QContext)
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getActivationGroup_FrameworkContext()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	QContext getFrameworkContext();

	/**
	 * Sets the value of the '{@link org.asup.os.type.pgm.QActivationGroup#getFrameworkContext <em>Framework Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Context</em>' containment reference.
	 * @see #getFrameworkContext()
	 * @generated
	 */
	void setFrameworkContext(QContext value);

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
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getActivationGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.os.type.pgm.QActivationGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QActivationGroup
