/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import org.asup.db.core.QIndexDef;
import org.asup.db.core.QQualifiedName;

import org.asup.db.syntax.ddl.QCreateIndexStatement;
import org.asup.db.syntax.ddl.QDdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Index Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl#getOnTable <em>On Table</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateIndexStatementImpl extends EObjectImpl implements QCreateIndexStatement {
	/**
	 * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName indexName;

	/**
	 * The cached value of the '{@link #getOnTable() <em>On Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTable()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName onTable;

	/**
	 * The cached value of the '{@link #getSortBy() <em>Sort By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortBy()
	 * @generated
	 * @ordered
	 */
	protected QIndexDef sortBy;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateIndexStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDdlPackage.Literals.CREATE_INDEX_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getIndexName() {
		if (indexName != null && ((EObject)indexName).eIsProxy()) {
			InternalEObject oldIndexName = (InternalEObject)indexName;
			indexName = (QQualifiedName)eResolveProxy(oldIndexName);
			if (indexName != oldIndexName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, oldIndexName, indexName));
			}
		}
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName basicGetIndexName() {
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexName(QQualifiedName newIndexName) {
		QQualifiedName oldIndexName = indexName;
		indexName = newIndexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, oldIndexName, indexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getOnTable() {
		if (onTable != null && ((EObject)onTable).eIsProxy()) {
			InternalEObject oldOnTable = (InternalEObject)onTable;
			onTable = (QQualifiedName)eResolveProxy(oldOnTable);
			if (onTable != oldOnTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE, oldOnTable, onTable));
			}
		}
		return onTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName basicGetOnTable() {
		return onTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTable(QQualifiedName newOnTable) {
		QQualifiedName oldOnTable = onTable;
		onTable = newOnTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE, oldOnTable, onTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIndexDef getSortBy() {
		if (sortBy != null && ((EObject)sortBy).eIsProxy()) {
			InternalEObject oldSortBy = (InternalEObject)sortBy;
			sortBy = (QIndexDef)eResolveProxy(oldSortBy);
			if (sortBy != oldSortBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY, oldSortBy, sortBy));
			}
		}
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIndexDef basicGetSortBy() {
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortBy(QIndexDef newSortBy) {
		QIndexDef oldSortBy = sortBy;
		sortBy = newSortBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY, oldSortBy, sortBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				if (resolve) return getIndexName();
				return basicGetIndexName();
			case QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				if (resolve) return getOnTable();
				return basicGetOnTable();
			case QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				if (resolve) return getSortBy();
				return basicGetSortBy();
			case QDdlPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				return isUnique();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				setIndexName((QQualifiedName)newValue);
				return;
			case QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				setOnTable((QQualifiedName)newValue);
				return;
			case QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				setSortBy((QIndexDef)newValue);
				return;
			case QDdlPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				setUnique((Boolean)newValue);
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
			case QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				setIndexName((QQualifiedName)null);
				return;
			case QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				setOnTable((QQualifiedName)null);
				return;
			case QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				setSortBy((QIndexDef)null);
				return;
			case QDdlPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				return indexName != null;
			case QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				return onTable != null;
			case QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				return sortBy != null;
			case QDdlPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //CreateIndexStatementImpl
