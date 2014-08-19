/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.flow.QEval#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getEval()
 * @model
 * @generated
 */
public interface QEval extends QInvoke {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' attribute.
	 * @see #setAssignment(String)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getEval_Assignment()
	 * @model required="true"
	 * @generated
	 */
	String getAssignment();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QEval#getAssignment <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' attribute.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(String value);

} // QEval
