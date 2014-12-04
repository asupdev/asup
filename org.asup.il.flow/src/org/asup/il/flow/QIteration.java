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
 * A representation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.flow.QIteration#getBody <em>Body</em>}</li>
 *   <li>{@link org.asup.il.flow.QIteration#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getIteration()
 * @model abstract="true"
 * @generated
 */
public interface QIteration extends QStatement {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getIteration_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QIteration#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(QStatement)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getIteration_Body()
	 * @model containment="true"
	 * @generated
	 */
	QStatement getBody();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QIteration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(QStatement value);

} // Iteration
