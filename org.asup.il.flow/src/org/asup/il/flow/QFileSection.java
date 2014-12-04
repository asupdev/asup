/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import java.util.List;

import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QKeyListTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.flow.QFileSection#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link org.asup.il.flow.QFileSection#getKeyLists <em>Key Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection()
 * @model
 * @generated
 */
public interface QFileSection extends QUnitSection {

	/**
	 * Returns the value of the '<em><b>Data Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.isam.QDataSetTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sets</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection_DataSets()
	 * @model containment="true"
	 * @generated
	 */
	List<QDataSetTerm> getDataSets();

	/**
	 * Returns the value of the '<em><b>Key Lists</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.isam.QKeyListTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Lists</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection_KeyLists()
	 * @model containment="true"
	 * @generated
	 */
	List<QKeyListTerm> getKeyLists();
} // QDataSetSection
