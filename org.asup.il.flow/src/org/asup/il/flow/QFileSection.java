/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import java.util.List;

import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QStatementTerm;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QDisplayTerm;
import org.asup.il.isam.QKeyListTerm;
import org.asup.il.isam.QPrintTerm;

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
 *   <li>{@link org.asup.il.flow.QFileSection#getCursors <em>Cursors</em>}</li>
 *   <li>{@link org.asup.il.flow.QFileSection#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.asup.il.flow.QFileSection#getDisplays <em>Displays</em>}</li>
 *   <li>{@link org.asup.il.flow.QFileSection#getPrinters <em>Printers</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Cursors</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.esql.QCursorTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursors</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Cursors()
	 * @model containment="true"
	 * @generated
	 */
	List<QCursorTerm> getCursors();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.esql.QStatementTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Statements()
	 * @model containment="true"
	 * @generated
	 */
	List<QStatementTerm> getStatements();

	/**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.isam.QDisplayTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Displays()
	 * @model containment="true"
	 * @generated
	 */
	List<QDisplayTerm> getDisplays();

	/**
	 * Returns the value of the '<em><b>Printers</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.isam.QPrintTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printers</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getFileSection_Printers()
	 * @model containment="true"
	 * @generated
	 */
	List<QPrintTerm> getPrinters();
} // QDataSetSection
