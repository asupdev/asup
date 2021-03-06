/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import java.util.List;
import org.asup.il.core.QAnnotation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.flow.QSetupSection#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.asup.il.flow.QSetupSection#getApplication <em>Application</em>}</li>
 *   <li>{@link org.asup.il.flow.QSetupSection#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.asup.il.flow.QSetupSection#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link org.asup.il.flow.QSetupSection#getModules <em>Modules</em>}</li>
 *   <li>{@link org.asup.il.flow.QSetupSection#isTermSensitive <em>Term Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection()
 * @model
 * @generated
 */
public interface QSetupSection extends QUnitSection {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.core.QAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	List<QAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection_Application()
	 * @model
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QSetupSection#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection_Encoding()
	 * @model
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QSetupSection#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' attribute.
	 * @see #setExpressionType(String)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection_ExpressionType()
	 * @model
	 * @generated
	 */
	String getExpressionType();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QSetupSection#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' attribute.
	 * @see #getExpressionType()
	 * @generated
	 */
	void setExpressionType(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' attribute list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection_Modules()
	 * @model
	 * @generated
	 */
	List<String> getModules();

	/**
	 * Returns the value of the '<em><b>Term Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Sensitive</em>' attribute.
	 * @see #setTermSensitive(boolean)
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getSetupSection_TermSensitive()
	 * @model
	 * @generated
	 */
	boolean isTermSensitive();

	/**
	 * Sets the value of the '{@link org.asup.il.flow.QSetupSection#isTermSensitive <em>Term Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Sensitive</em>' attribute.
	 * @see #isTermSensitive()
	 * @generated
	 */
	void setTermSensitive(boolean value);

} // QSetupSection
