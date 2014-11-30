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
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseCorePackage;
import org.asup.fw.core.impl.ServiceConfigImpl;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.DatabaseContainerImpl#getDefaultConfig <em>Default Config</em>}</li>
 *   <li>{@link org.asup.db.core.impl.DatabaseContainerImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.impl.DatabaseContainerImpl#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseContainerImpl extends ServiceConfigImpl implements QDatabaseContainer {
	/**
	 * The cached value of the '{@link #getDefaultConfig() <em>Default Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfig()
	 * @generated
	 * @ordered
	 */
	protected QConnectionConfig defaultConfig;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getCatalogs() <em>Catalogs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogs()
	 * @generated
	 * @ordered
	 */
	protected EList<Catalog> catalogs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.DATABASE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Catalog> getCatalogs() {
		if (catalogs == null) {
			catalogs = new EObjectContainmentEList<Catalog>(Catalog.class, this, QDatabaseCorePackage.DATABASE_CONTAINER__CATALOGS);
		}
		return catalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectionConfig getDefaultConfig() {
		return defaultConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultConfig(QConnectionConfig newDefaultConfig, NotificationChain msgs) {
		QConnectionConfig oldDefaultConfig = defaultConfig;
		defaultConfig = newDefaultConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG, oldDefaultConfig, newDefaultConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultConfig(QConnectionConfig newDefaultConfig) {
		if (newDefaultConfig != defaultConfig) {
			NotificationChain msgs = null;
			if (defaultConfig != null)
				msgs = ((InternalEObject)defaultConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG, null, msgs);
			if (newDefaultConfig != null)
				msgs = ((InternalEObject)newDefaultConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG, null, msgs);
			msgs = basicSetDefaultConfig(newDefaultConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG, newDefaultConfig, newDefaultConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG:
				return basicSetDefaultConfig(null, msgs);
			case QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE:
				return basicSetDatabase(null, msgs);
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOGS:
				return ((InternalEList<?>)getCatalogs()).basicRemove(otherEnd, msgs);
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG:
				return getDefaultConfig();
			case QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE:
				return getDatabase();
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOGS:
				return getCatalogs();
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG:
				setDefaultConfig((QConnectionConfig)newValue);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE:
				setDatabase((Database)newValue);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOGS:
				getCatalogs().clear();
				getCatalogs().addAll((Collection<? extends Catalog>)newValue);
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG:
				setDefaultConfig((QConnectionConfig)null);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE:
				setDatabase((Database)null);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOGS:
				getCatalogs().clear();
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CONFIG:
				return defaultConfig != null;
			case QDatabaseCorePackage.DATABASE_CONTAINER__DATABASE:
				return database != null;
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOGS:
				return catalogs != null && !catalogs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseContainerImpl
