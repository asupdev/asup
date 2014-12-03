/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl.util;

import org.asup.db.syntax.QDefinitionStatement;
import org.asup.db.syntax.ddl.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.ddl.QDdlPackage
 * @generated
 */
public class DdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QDdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QDdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdlSwitch<Adapter> modelSwitch =
		new DdlSwitch<Adapter>() {
			@Override
			public Adapter caseCommitStatement(QCommitStatement object) {
				return createCommitStatementAdapter();
			}
			@Override
			public Adapter caseConnectStatement(QConnectStatement object) {
				return createConnectStatementAdapter();
			}
			@Override
			public Adapter caseCreateAliasStatement(QCreateAliasStatement object) {
				return createCreateAliasStatementAdapter();
			}
			@Override
			public Adapter caseCreateIndexStatement(QCreateIndexStatement object) {
				return createCreateIndexStatementAdapter();
			}
			@Override
			public Adapter caseCreateTableStatement(QCreateTableStatement object) {
				return createCreateTableStatementAdapter();
			}
			@Override
			public Adapter caseCreateViewStatement(QCreateViewStatement object) {
				return createCreateViewStatementAdapter();
			}
			@Override
			public Adapter caseDisconnectStatement(QDisconnectStatement object) {
				return createDisconnectStatementAdapter();
			}
			@Override
			public Adapter caseDropStatement(QDropStatement object) {
				return createDropStatementAdapter();
			}
			@Override
			public Adapter caseDefinitionStatement(QDefinitionStatement object) {
				return createDefinitionStatementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QCommitStatement <em>Commit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QCommitStatement
	 * @generated
	 */
	public Adapter createCommitStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QConnectStatement <em>Connect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QConnectStatement
	 * @generated
	 */
	public Adapter createConnectStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QCreateAliasStatement <em>Create Alias Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QCreateAliasStatement
	 * @generated
	 */
	public Adapter createCreateAliasStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QCreateIndexStatement <em>Create Index Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QCreateIndexStatement
	 * @generated
	 */
	public Adapter createCreateIndexStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QCreateTableStatement <em>Create Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QCreateTableStatement
	 * @generated
	 */
	public Adapter createCreateTableStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QCreateViewStatement <em>Create View Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QCreateViewStatement
	 * @generated
	 */
	public Adapter createCreateViewStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QDisconnectStatement <em>Disconnect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QDisconnectStatement
	 * @generated
	 */
	public Adapter createDisconnectStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.ddl.QDropStatement <em>Drop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.ddl.QDropStatement
	 * @generated
	 */
	public Adapter createDropStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.QDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.QDefinitionStatement
	 * @generated
	 */
	public Adapter createDefinitionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DdlAdapterFactory
