/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;
import org.asup.il.core.QTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.data.QDataTerm#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.asup.il.data.QDataTerm#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.asup.il.data.QDataTerm#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.asup.il.data.QDataTerm#getLike <em>Like</em>}</li>
 *   <li>{@link org.asup.il.data.QDataTerm#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.il.data.QDataTerm#isRestricted <em>Restricted</em>}</li>
 *   <li>{@link org.asup.il.data.QDataTerm#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm()
 * @model abstract="true"
 * @generated
 */
public interface QDataTerm<DD extends QDataDef<?>> extends QTerm {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(QDataDef)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Definition()
	 * @model containment="true"
	 * @generated
	 */
	DD getDefinition();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DD value);

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Initialized()
	 * @model required="true"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Like</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Like</em>' attribute.
	 * @see #setLike(String)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Like()
	 * @model
	 * @generated
	 */
	String getLike();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#getLike <em>Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Like</em>' attribute.
	 * @see #getLike()
	 * @generated
	 */
	void setLike(String value);

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
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' attribute.
	 * @see #setRestricted(boolean)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Restricted()
	 * @model
	 * @generated
	 */
	boolean isRestricted();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#isRestricted <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted</em>' attribute.
	 * @see #isRestricted()
	 * @generated
	 */
	void setRestricted(boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataTerm_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.asup.il.data.QDataTerm#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DataTermType getDataTermType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QDataTermVisitor visitor);

} // QDataTerm
