/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.cdo.impl;

import org.asup.os.core.cdo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOSystemCoreFactoryImpl extends EFactoryImpl implements QCDOSystemCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QCDOSystemCoreFactory init() {
		try {
			QCDOSystemCoreFactory theCDOSystemCoreFactory = (QCDOSystemCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QCDOSystemCorePackage.eNS_URI);
			if (theCDOSystemCoreFactory != null) {
				return theCDOSystemCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDOSystemCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOSystemCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QCDOSystemCorePackage.CDO_SYSTEM_CONFIG: return (EObject)createCDOSystemConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCDOSystemConfig createCDOSystemConfig() {
		CDOSystemConfigImpl cdoSystemConfig = new CDOSystemConfigImpl();
		return cdoSystemConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCDOSystemCorePackage getCDOSystemCorePackage() {
		return (QCDOSystemCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QCDOSystemCorePackage getPackage() {
		return QCDOSystemCorePackage.eINSTANCE;
	}

} //CDOSystemCoreFactoryImpl
