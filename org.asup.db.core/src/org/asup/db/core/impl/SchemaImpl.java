/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;


import java.util.Collection;
import java.util.List;
import org.asup.db.core.QDatabase;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.core.QIndex;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.SchemaImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.impl.SchemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.asup.db.core.impl.SchemaImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.asup.db.core.impl.SchemaImpl#getIndexes <em>Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements QSchema {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected QDatabase database;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<QTable> tables;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<QView> views;

	/**
	 * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<QIndex> indexes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabase getDatabase() {
		if (database != null && ((EObject)database).eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (QDatabase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.SCHEMA__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabase basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(QDatabase newDatabase, NotificationChain msgs) {
		QDatabase oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.SCHEMA__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(QDatabase newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, QDatabaseCorePackage.DATABASE__SCHEMAS, QDatabase.class, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, QDatabaseCorePackage.DATABASE__SCHEMAS, QDatabase.class, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.SCHEMA__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QTable> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentWithInverseEList<QTable>(QTable.class, this, QDatabaseCorePackage.SCHEMA__TABLES, QDatabaseCorePackage.TABLE__SCHEMA);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QView> getViews() {
		if (views == null) {
			views = new EObjectContainmentWithInverseEList<QView>(QView.class, this, QDatabaseCorePackage.SCHEMA__VIEWS, QDatabaseCorePackage.VIEW__SCHEMA);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QIndex> getIndexes() {
		if (indexes == null) {
			indexes = new EObjectContainmentWithInverseEList<QIndex>(QIndex.class, this, QDatabaseCorePackage.SCHEMA__INDEXES, QDatabaseCorePackage.INDEX__SCHEMA);
		}
		return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.SCHEMA__DATABASE:
				if (database != null)
					msgs = ((InternalEObject)database).eInverseRemove(this, QDatabaseCorePackage.DATABASE__SCHEMAS, QDatabase.class, msgs);
				return basicSetDatabase((QDatabase)otherEnd, msgs);
			case QDatabaseCorePackage.SCHEMA__TABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTables()).basicAdd(otherEnd, msgs);
			case QDatabaseCorePackage.SCHEMA__VIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
			case QDatabaseCorePackage.SCHEMA__INDEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndexes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.SCHEMA__DATABASE:
				return basicSetDatabase(null, msgs);
			case QDatabaseCorePackage.SCHEMA__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case QDatabaseCorePackage.SCHEMA__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case QDatabaseCorePackage.SCHEMA__INDEXES:
				return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
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
			case QDatabaseCorePackage.SCHEMA__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case QDatabaseCorePackage.SCHEMA__NAME:
				return getName();
			case QDatabaseCorePackage.SCHEMA__TABLES:
				return getTables();
			case QDatabaseCorePackage.SCHEMA__VIEWS:
				return getViews();
			case QDatabaseCorePackage.SCHEMA__INDEXES:
				return getIndexes();
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
			case QDatabaseCorePackage.SCHEMA__DATABASE:
				setDatabase((QDatabase)newValue);
				return;
			case QDatabaseCorePackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case QDatabaseCorePackage.SCHEMA__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends QTable>)newValue);
				return;
			case QDatabaseCorePackage.SCHEMA__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends QView>)newValue);
				return;
			case QDatabaseCorePackage.SCHEMA__INDEXES:
				getIndexes().clear();
				getIndexes().addAll((Collection<? extends QIndex>)newValue);
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
			case QDatabaseCorePackage.SCHEMA__DATABASE:
				setDatabase((QDatabase)null);
				return;
			case QDatabaseCorePackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.SCHEMA__TABLES:
				getTables().clear();
				return;
			case QDatabaseCorePackage.SCHEMA__VIEWS:
				getViews().clear();
				return;
			case QDatabaseCorePackage.SCHEMA__INDEXES:
				getIndexes().clear();
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
			case QDatabaseCorePackage.SCHEMA__DATABASE:
				return database != null;
			case QDatabaseCorePackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QDatabaseCorePackage.SCHEMA__TABLES:
				return tables != null && !tables.isEmpty();
			case QDatabaseCorePackage.SCHEMA__VIEWS:
				return views != null && !views.isEmpty();
			case QDatabaseCorePackage.SCHEMA__INDEXES:
				return indexes != null && !indexes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
