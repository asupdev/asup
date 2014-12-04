/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.os.type.QType#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.asup.os.type.QType#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.asup.os.type.QType#getManager <em>Manager</em>}</li>
 *   <li>{@link org.asup.os.type.QType#getSpecials <em>Specials</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.os.type.QOperatingSystemTypePackage#getType()
 * @model
 * @generated
 */
public interface QType extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.asup.os.type.QOperatingSystemTypePackage#getType_ClassName()
	 * @model required="true"
	 *        annotation="il-data length='64'"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.asup.os.type.QType#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.asup.os.type.QOperatingSystemTypePackage#getType_Domain()
	 * @model required="true"
	 *        annotation="il-data length='32'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.asup.os.type.QType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(String)
	 * @see org.asup.os.type.QOperatingSystemTypePackage#getType_Manager()
	 * @model required="true"
	 *        annotation="il-data length='64'"
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link org.asup.os.type.QType#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(String value);

	/**
	 * Returns the value of the '<em><b>Specials</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specials</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specials</em>' attribute list.
	 * @see org.asup.os.type.QOperatingSystemTypePackage#getType_Specials()
	 * @model
	 * @generated
	 */
	List<String> getSpecials();

} // QType
