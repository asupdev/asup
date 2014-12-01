/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core.impl;

import org.asup.db.core.QCatalogContainer;
import org.asup.db.core.QConnectionConfig;
import org.asup.db.core.QDatabaseCorePackage;

import org.asup.fw.core.impl.ServiceConfigImpl;

import org.eclipse.datatools.modelbase.sql.schema.Catalog;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#getDefaultConfig <em>Default Config</em>}</li>
 *   <li>{@link org.asup.db.core.impl.CatalogContainerImpl#getCatalog <em>Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogContainerImpl extends ServiceConfigImpl implements QCatalogContainer {
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
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected Catalog catalog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return null;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG, oldDefaultConfig, newDefaultConfig);
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
				msgs = ((InternalEObject)defaultConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG, null, msgs);
			if (newDefaultConfig != null)
				msgs = ((InternalEObject)newDefaultConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG, null, msgs);
			msgs = basicSetDefaultConfig(newDefaultConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG, newDefaultConfig, newDefaultConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(Catalog newCatalog, NotificationChain msgs) {
		Catalog oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG, oldCatalog, newCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(Catalog newCatalog) {
		if (newCatalog != catalog) {
			NotificationChain msgs = null;
			if (catalog != null)
				msgs = ((InternalEObject)catalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG, null, msgs);
			if (newCatalog != null)
				msgs = ((InternalEObject)newCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG, null, msgs);
			msgs = basicSetCatalog(newCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG, newCatalog, newCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG:
				return basicSetDefaultConfig(null, msgs);
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG:
				return basicSetCatalog(null, msgs);
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG:
				return getDefaultConfig();
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG:
				return getCatalog();
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG:
				setDefaultConfig((QConnectionConfig)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG:
				setCatalog((Catalog)newValue);
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG:
				setDefaultConfig((QConnectionConfig)null);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG:
				setCatalog((Catalog)null);
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__DEFAULT_CONFIG:
				return defaultConfig != null;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CATALOG:
				return catalog != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogContainerImpl
