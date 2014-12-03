/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dml.impl;

import org.asup.db.syntax.dml.*;

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
public class DatabaseDMLFactoryImpl extends EFactoryImpl implements QDatabaseDMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDatabaseDMLFactory init() {
		try {
			QDatabaseDMLFactory theDatabaseDMLFactory = (QDatabaseDMLFactory)EPackage.Registry.INSTANCE.getEFactory(QDatabaseDMLPackage.eNS_URI);
			if (theDatabaseDMLFactory != null) {
				return theDatabaseDMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseDMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseDMLFactoryImpl() {
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
			case QDatabaseDMLPackage.EXTENDED_QUERY_SELECT: return createExtendedQuerySelect();
			case QDatabaseDMLPackage.EXTENDED_QUERY_EXPRESSION_BODY: return createExtendedQueryExpressionBody();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExtendedQuerySelect createExtendedQuerySelect() {
		ExtendedQuerySelectImpl extendedQuerySelect = new ExtendedQuerySelectImpl();
		return extendedQuerySelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExtendedQueryExpressionBody createExtendedQueryExpressionBody() {
		ExtendedQueryExpressionBodyImpl extendedQueryExpressionBody = new ExtendedQueryExpressionBodyImpl();
		return extendedQueryExpressionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseDMLPackage getDatabaseDMLPackage() {
		return (QDatabaseDMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDatabaseDMLPackage getPackage() {
		return QDatabaseDMLPackage.eINSTANCE;
	}

} //DatabaseDMLFactoryImpl
