/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core.impl;

import java.util.Collection;
import java.util.List;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QServicePlugin;
import org.asup.fw.core.QServicePluginRegistry;
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
 * An implementation of the model object '<em><b>Service Plugin Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.fw.core.impl.ServicePluginRegistryImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.asup.fw.core.impl.ServicePluginRegistryImpl#getPluginInterface <em>Plugin Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServicePluginRegistryImpl extends ServiceReferenceImpl implements QServicePluginRegistry {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<QServicePlugin> services;

	/**
	 * The default value of the '{@link #getPluginInterface() <em>Plugin Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginInterface() <em>Plugin Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginInterface()
	 * @generated
	 * @ordered
	 */
	protected String pluginInterface = PLUGIN_INTERFACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicePluginRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFrameworkCorePackage.Literals.SERVICE_PLUGIN_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QServicePlugin> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<QServicePlugin>(QServicePlugin.class, this, QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginInterface() {
		return pluginInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginInterface(String newPluginInterface) {
		String oldPluginInterface = pluginInterface;
		pluginInterface = newPluginInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE, oldPluginInterface, pluginInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__SERVICES:
				return getServices();
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE:
				return getPluginInterface();
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
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends QServicePlugin>)newValue);
				return;
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE:
				setPluginInterface((String)newValue);
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
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__SERVICES:
				getServices().clear();
				return;
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE:
				setPluginInterface(PLUGIN_INTERFACE_EDEFAULT);
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
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__SERVICES:
				return services != null && !services.isEmpty();
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE:
				return PLUGIN_INTERFACE_EDEFAULT == null ? pluginInterface != null : !PLUGIN_INTERFACE_EDEFAULT.equals(pluginInterface);
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
		result.append(" (pluginInterface: ");
		result.append(pluginInterface);
		result.append(')');
		return result.toString();
	}

} //ServicePluginRegistryImpl
