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
import org.asup.db.syntax.QStatementWriter;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QService;
import org.asup.fw.core.QServiceConfig;

import org.asup.fw.core.impl.PluginImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.syntax.impl.StatementWriterImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.asup.db.syntax.impl.StatementWriterImpl#getNameHelper <em>Name Helper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StatementWriterImpl extends PluginImpl implements QStatementWriter {
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
	 * The cached value of the '{@link #getNameHelper() <em>Name Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameHelper()
	 * @generated
	 * @ordered
	 */
	protected QNameHelper nameHelper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.STATEMENT_WRITER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG, oldConfig, newConfig);
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
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameHelper getNameHelper() {
		if (nameHelper != null && ((EObject)nameHelper).eIsProxy()) {
			InternalEObject oldNameHelper = (InternalEObject)nameHelper;
			nameHelper = (QNameHelper)eResolveProxy(oldNameHelper);
			if (nameHelper != oldNameHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER, oldNameHelper, nameHelper));
			}
		}
		return nameHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameHelper basicGetNameHelper() {
		return nameHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameHelper(QNameHelper newNameHelper) {
		QNameHelper oldNameHelper = nameHelper;
		nameHelper = newNameHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER, oldNameHelper, nameHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG:
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG:
				return getConfig();
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				if (resolve) return getNameHelper();
				return basicGetNameHelper();
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG:
				setConfig((QServiceConfig)newValue);
				return;
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				setNameHelper((QNameHelper)newValue);
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG:
				setConfig((QServiceConfig)null);
				return;
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				setNameHelper((QNameHelper)null);
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
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG:
				return config != null;
			case QDatabaseSyntaxPackage.STATEMENT_WRITER__NAME_HELPER:
				return nameHelper != null;
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
				case QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG: return QFrameworkCorePackage.SERVICE__CONFIG;
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
				case QFrameworkCorePackage.SERVICE__CONFIG: return QDatabaseSyntaxPackage.STATEMENT_WRITER__CONFIG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StatementWriterImpl
