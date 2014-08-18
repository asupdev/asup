/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.fw.core.impl;

import java.util.List;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.fw.core.impl.PluginRegistryImpl#getStore <em>Store</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PluginRegistryImpl<T extends QPlugin> extends ServiceImpl implements QPluginRegistry<T> {
	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected QPluginRegistry<T> store;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFrameworkCorePackage.Literals.PLUGIN_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public QPluginRegistry<T> getStore() {
		if (store != null && ((EObject)store).eIsProxy()) {
			InternalEObject oldStore = (InternalEObject)store;
			store = (QPluginRegistry<T>)eResolveProxy(oldStore);
			if (store != oldStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QFrameworkCorePackage.PLUGIN_REGISTRY__STORE, oldStore, store));
			}
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPluginRegistry<T> basicGetStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(QPluginRegistry<T> newStore) {
		QPluginRegistry<T> oldStore = store;
		store = newStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.PLUGIN_REGISTRY__STORE, oldStore, store));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public T lookup(String name) {
		if(getStore() != null)
			return getStore().lookup(name);
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<T> list() {
		if(getStore() != null)
			return getStore().list();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QFrameworkCorePackage.PLUGIN_REGISTRY__STORE:
				if (resolve) return getStore();
				return basicGetStore();
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
			case QFrameworkCorePackage.PLUGIN_REGISTRY__STORE:
				setStore((QPluginRegistry<T>)newValue);
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
			case QFrameworkCorePackage.PLUGIN_REGISTRY__STORE:
				setStore((QPluginRegistry<T>)null);
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
			case QFrameworkCorePackage.PLUGIN_REGISTRY__STORE:
				return store != null;
		}
		return super.eIsSet(featureID);
	}

} //PluginRegistryImpl
