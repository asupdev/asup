/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.impl;

import org.asup.fw.core.impl.PluginRegistryImpl;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.QTypeRegistry;
import org.asup.os.type.QTypedManager;
import org.asup.os.type.QTypedObject;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QType Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TypeRegistryImpl extends PluginRegistryImpl<QTypedManager<QTypedObject>> implements QTypeRegistry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPE_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public <T extends QTypedObject> QTypedManager<T> lookup(Class<T> typedClass) {
		
		for(QTypedManager<?> type: list()) {
			if(type.getTypedClass().isAssignableFrom(typedClass))
				return (QTypedManager<T>) type;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public <T extends QTypedObject> QTypedManager<T> lookup(T typedObject) {
		return (QTypedManager<T>) lookup(typedObject.getClass());
	}
} //QTypeRegistryImpl
