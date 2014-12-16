/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow.impl;

import java.util.Collection;
import java.util.List;

import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QStatementTerm;
import org.asup.il.flow.QFileSection;
import org.asup.il.flow.QIntegratedLanguageFlowPackage;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QKeyListTerm;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.il.flow.impl.FileSectionImpl#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link org.asup.il.flow.impl.FileSectionImpl#getKeyLists <em>Key Lists</em>}</li>
 *   <li>{@link org.asup.il.flow.impl.FileSectionImpl#getCursors <em>Cursors</em>}</li>
 *   <li>{@link org.asup.il.flow.impl.FileSectionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSectionImpl extends UnitSectionImpl implements QFileSection {
	/**
	 * The cached value of the '{@link #getDataSets() <em>Data Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<QDataSetTerm> dataSets;
	/**
	 * The cached value of the '{@link #getKeyLists() <em>Key Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLists()
	 * @generated
	 * @ordered
	 */
	protected EList<QKeyListTerm> keyLists;

	/**
	 * The cached value of the '{@link #getCursors() <em>Cursors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursors()
	 * @generated
	 * @ordered
	 */
	protected EList<QCursorTerm> cursors;
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<QStatementTerm> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.FILE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QDataSetTerm> getDataSets() {
		if (dataSets == null) {
			dataSets = new EObjectContainmentEList<QDataSetTerm>(QDataSetTerm.class, this, QIntegratedLanguageFlowPackage.FILE_SECTION__DATA_SETS);
		}
		return dataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QKeyListTerm> getKeyLists() {
		if (keyLists == null) {
			keyLists = new EObjectContainmentEList<QKeyListTerm>(QKeyListTerm.class, this, QIntegratedLanguageFlowPackage.FILE_SECTION__KEY_LISTS);
		}
		return keyLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QCursorTerm> getCursors() {
		if (cursors == null) {
			cursors = new EObjectContainmentEList<QCursorTerm>(QCursorTerm.class, this, QIntegratedLanguageFlowPackage.FILE_SECTION__CURSORS);
		}
		return cursors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QStatementTerm> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<QStatementTerm>(QStatementTerm.class, this, QIntegratedLanguageFlowPackage.FILE_SECTION__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.FILE_SECTION__DATA_SETS:
				return ((InternalEList<?>)getDataSets()).basicRemove(otherEnd, msgs);
			case QIntegratedLanguageFlowPackage.FILE_SECTION__KEY_LISTS:
				return ((InternalEList<?>)getKeyLists()).basicRemove(otherEnd, msgs);
			case QIntegratedLanguageFlowPackage.FILE_SECTION__CURSORS:
				return ((InternalEList<?>)getCursors()).basicRemove(otherEnd, msgs);
			case QIntegratedLanguageFlowPackage.FILE_SECTION__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.FILE_SECTION__DATA_SETS:
				return getDataSets();
			case QIntegratedLanguageFlowPackage.FILE_SECTION__KEY_LISTS:
				return getKeyLists();
			case QIntegratedLanguageFlowPackage.FILE_SECTION__CURSORS:
				return getCursors();
			case QIntegratedLanguageFlowPackage.FILE_SECTION__STATEMENTS:
				return getStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.FILE_SECTION__DATA_SETS:
				getDataSets().clear();
				getDataSets().addAll((Collection<? extends QDataSetTerm>)newValue);
				return;
			case QIntegratedLanguageFlowPackage.FILE_SECTION__KEY_LISTS:
				getKeyLists().clear();
				getKeyLists().addAll((Collection<? extends QKeyListTerm>)newValue);
				return;
			case QIntegratedLanguageFlowPackage.FILE_SECTION__CURSORS:
				getCursors().clear();
				getCursors().addAll((Collection<? extends QCursorTerm>)newValue);
				return;
			case QIntegratedLanguageFlowPackage.FILE_SECTION__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends QStatementTerm>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.FILE_SECTION__DATA_SETS:
				getDataSets().clear();
				return;
			case QIntegratedLanguageFlowPackage.FILE_SECTION__KEY_LISTS:
				getKeyLists().clear();
				return;
			case QIntegratedLanguageFlowPackage.FILE_SECTION__CURSORS:
				getCursors().clear();
				return;
			case QIntegratedLanguageFlowPackage.FILE_SECTION__STATEMENTS:
				getStatements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.FILE_SECTION__DATA_SETS:
				return dataSets != null && !dataSets.isEmpty();
			case QIntegratedLanguageFlowPackage.FILE_SECTION__KEY_LISTS:
				return keyLists != null && !keyLists.isEmpty();
			case QIntegratedLanguageFlowPackage.FILE_SECTION__CURSORS:
				return cursors != null && !cursors.isEmpty();
			case QIntegratedLanguageFlowPackage.FILE_SECTION__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSetSectionImpl
