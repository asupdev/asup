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
import org.asup.db.syntax.impl.DefinitionStatementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class CreateIndexStatementImpl extends DefinitionStatementImpl implements QCreateIndexStatement {
	/**
	 * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName indexName;

	/**
	 * The cached value of the '{@link #getOnTable() <em>On Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTable()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName onTable;

	/**
	 * The cached value of the '{@link #getSortBy() <em>Sort By</em>}' containment reference.
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
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexName(QQualifiedName newIndexName, NotificationChain msgs) {
		QQualifiedName oldIndexName = indexName;
		indexName = newIndexName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, oldIndexName, newIndexName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexName(QQualifiedName newIndexName) {
		if (newIndexName != indexName) {
			NotificationChain msgs = null;
			if (indexName != null)
				msgs = ((InternalEObject)indexName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, null, msgs);
			if (newIndexName != null)
				msgs = ((InternalEObject)newIndexName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, null, msgs);
			msgs = basicSetIndexName(newIndexName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, newIndexName, newIndexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getOnTable() {
		return onTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnTable(QQualifiedName newOnTable, NotificationChain msgs) {
		QQualifiedName oldOnTable = onTable;
		onTable = newOnTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE, oldOnTable, newOnTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTable(QQualifiedName newOnTable) {
		if (newOnTable != onTable) {
			NotificationChain msgs = null;
			if (onTable != null)
				msgs = ((InternalEObject)onTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE, null, msgs);
			if (newOnTable != null)
				msgs = ((InternalEObject)newOnTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE, null, msgs);
			msgs = basicSetOnTable(newOnTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE, newOnTable, newOnTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIndexDef getSortBy() {
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortBy(QIndexDef newSortBy, NotificationChain msgs) {
		QIndexDef oldSortBy = sortBy;
		sortBy = newSortBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY, oldSortBy, newSortBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortBy(QIndexDef newSortBy) {
		if (newSortBy != sortBy) {
			NotificationChain msgs = null;
			if (sortBy != null)
				msgs = ((InternalEObject)sortBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY, null, msgs);
			if (newSortBy != null)
				msgs = ((InternalEObject)newSortBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY, null, msgs);
			msgs = basicSetSortBy(newSortBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY, newSortBy, newSortBy));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				return basicSetIndexName(null, msgs);
			case QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				return basicSetOnTable(null, msgs);
			case QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				return basicSetSortBy(null, msgs);
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
			case QDdlPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				return getIndexName();
			case QDdlPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				return getOnTable();
			case QDdlPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				return getSortBy();
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
