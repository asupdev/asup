/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.impl;

import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.QNameHelper;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QService;
import org.asup.fw.core.QServiceConfig;
import org.asup.fw.core.impl.PluginImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.impl.NameHelperImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NameHelperImpl extends PluginImpl implements QNameHelper {
	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected QServiceConfig config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.NAME_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(QServiceConfig newConfig, NotificationChain msgs) {
		QServiceConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.NAME_HELPER__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(QServiceConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxPackage.NAME_HELPER__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxPackage.NAME_HELPER__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.NAME_HELPER__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resolveContainers(QueryStatement query) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.NAME_HELPER__CONFIG:
				return basicSetConfig(null, msgs);
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
			case QDatabaseSyntaxPackage.NAME_HELPER__CONFIG:
				return getConfig();
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
			case QDatabaseSyntaxPackage.NAME_HELPER__CONFIG:
				setConfig((QServiceConfig)newValue);
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
			case QDatabaseSyntaxPackage.NAME_HELPER__CONFIG:
				setConfig((QServiceConfig)null);
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
			case QDatabaseSyntaxPackage.NAME_HELPER__CONFIG:
				return config != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QService.class) {
			switch (derivedFeatureID) {
				case QDatabaseSyntaxPackage.NAME_HELPER__CONFIG: return QFrameworkCorePackage.SERVICE__CONFIG;
				default: return -1;
			}
		}
		if (baseClass == ISQLObjectNameHelper.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QService.class) {
			switch (baseFeatureID) {
				case QFrameworkCorePackage.SERVICE__CONFIG: return QDatabaseSyntaxPackage.NAME_HELPER__CONFIG;
				default: return -1;
			}
		}
		if (baseClass == ISQLObjectNameHelper.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NameHelperImpl
