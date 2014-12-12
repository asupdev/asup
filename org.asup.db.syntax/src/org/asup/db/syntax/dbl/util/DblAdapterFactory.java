/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl.util;

import org.asup.db.syntax.QBindingStatement;

import org.asup.db.syntax.dbl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.dbl.QDblPackage
 * @generated
 */
public class DblAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QDblPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DblAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QDblPackage.eINSTANCE;
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
	protected DblSwitch<Adapter> modelSwitch =
		new DblSwitch<Adapter>() {
			@Override
			public Adapter caseDeclareCursorStatement(QDeclareCursorStatement object) {
				return createDeclareCursorStatementAdapter();
			}
			@Override
			public Adapter caseExecuteImmediateStatement(QExecuteImmediateStatement object) {
				return createExecuteImmediateStatementAdapter();
			}
			@Override
			public Adapter caseExecuteStatement(QExecuteStatement object) {
				return createExecuteStatementAdapter();
			}
			@Override
			public Adapter caseIntoClause(QIntoClause object) {
				return createIntoClauseAdapter();
			}
			@Override
			public Adapter caseSetTransactionStatement(QSetTransactionStatement object) {
				return createSetTransactionStatementAdapter();
			}
			@Override
			public Adapter caseOpenStatement(QOpenStatement object) {
				return createOpenStatementAdapter();
			}
			@Override
			public Adapter casePrepareStatement(QPrepareStatement object) {
				return createPrepareStatementAdapter();
			}
			@Override
			public Adapter caseCloseStatement(QCloseStatement object) {
				return createCloseStatementAdapter();
			}
			@Override
			public Adapter caseBindingStatement(QBindingStatement object) {
				return createBindingStatementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QDeclareCursorStatement <em>Declare Cursor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QDeclareCursorStatement
	 * @generated
	 */
	public Adapter createDeclareCursorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QExecuteImmediateStatement <em>Execute Immediate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QExecuteImmediateStatement
	 * @generated
	 */
	public Adapter createExecuteImmediateStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QExecuteStatement <em>Execute Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QExecuteStatement
	 * @generated
	 */
	public Adapter createExecuteStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QSetTransactionStatement <em>Set Transaction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QSetTransactionStatement
	 * @generated
	 */
	public Adapter createSetTransactionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QOpenStatement <em>Open Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QOpenStatement
	 * @generated
	 */
	public Adapter createOpenStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QPrepareStatement <em>Prepare Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QPrepareStatement
	 * @generated
	 */
	public Adapter createPrepareStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QCloseStatement <em>Close Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QCloseStatement
	 * @generated
	 */
	public Adapter createCloseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.dbl.QIntoClause <em>Into Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.dbl.QIntoClause
	 * @generated
	 */
	public Adapter createIntoClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.db.syntax.QBindingStatement <em>Binding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.db.syntax.QBindingStatement
	 * @generated
	 */
	public Adapter createBindingStatementAdapter() {
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

} //DblAdapterFactory
