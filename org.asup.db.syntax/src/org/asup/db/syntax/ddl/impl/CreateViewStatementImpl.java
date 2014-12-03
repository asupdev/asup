/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.impl;

import java.util.Collection;
import java.util.List;

import org.asup.db.core.QQualifiedName;
import org.asup.db.core.QTableColumnDef;

import org.asup.db.syntax.StatementType;
import org.asup.db.syntax.ddl.QCreateViewStatement;
import org.asup.db.syntax.ddl.QDdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateViewStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateViewStatementImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateViewStatementImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.impl.CreateViewStatementImpl#getViewName <em>View Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateViewStatementImpl extends EObjectImpl implements QCreateViewStatement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StatementType TYPE_EDEFAULT = StatementType.DDL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StatementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<QTableColumnDef> fields;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName viewName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateViewStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDdlPackage.Literals.CREATE_VIEW_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StatementType newType) {
		StatementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_VIEW_STATEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QTableColumnDef> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<QTableColumnDef>(QTableColumnDef.class, this, QDdlPackage.CREATE_VIEW_STATEMENT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_VIEW_STATEMENT__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewName(QQualifiedName newViewName, NotificationChain msgs) {
		QQualifiedName oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, oldViewName, newViewName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewName(QQualifiedName newViewName) {
		if (newViewName != viewName) {
			NotificationChain msgs = null;
			if (viewName != null)
				msgs = ((InternalEObject)viewName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, null, msgs);
			if (newViewName != null)
				msgs = ((InternalEObject)newViewName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, null, msgs);
			msgs = basicSetViewName(newViewName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, newViewName, newViewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDdlPackage.CREATE_VIEW_STATEMENT__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				return basicSetViewName(null, msgs);
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
			case QDdlPackage.CREATE_VIEW_STATEMENT__TYPE:
				return getType();
			case QDdlPackage.CREATE_VIEW_STATEMENT__FIELDS:
				return getFields();
			case QDdlPackage.CREATE_VIEW_STATEMENT__QUERY:
				return getQuery();
			case QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				return getViewName();
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
			case QDdlPackage.CREATE_VIEW_STATEMENT__TYPE:
				setType((StatementType)newValue);
				return;
			case QDdlPackage.CREATE_VIEW_STATEMENT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends QTableColumnDef>)newValue);
				return;
			case QDdlPackage.CREATE_VIEW_STATEMENT__QUERY:
				setQuery((String)newValue);
				return;
			case QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				setViewName((QQualifiedName)newValue);
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
			case QDdlPackage.CREATE_VIEW_STATEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QDdlPackage.CREATE_VIEW_STATEMENT__FIELDS:
				getFields().clear();
				return;
			case QDdlPackage.CREATE_VIEW_STATEMENT__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				setViewName((QQualifiedName)null);
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
			case QDdlPackage.CREATE_VIEW_STATEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case QDdlPackage.CREATE_VIEW_STATEMENT__FIELDS:
				return fields != null && !fields.isEmpty();
			case QDdlPackage.CREATE_VIEW_STATEMENT__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case QDdlPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				return viewName != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

} //CreateViewStatementImpl
