/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl;

import org.asup.db.syntax.QDatabaseSyntaxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.dbl.QDblFactory
 * @model kind="package"
 * @generated
 */
public interface QDblPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/db/syntax/dbl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax-dbl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDblPackage eINSTANCE = org.asup.db.syntax.dbl.impl.DblPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.dbl.impl.SetTransactionStatementImpl <em>Set Transaction Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.dbl.impl.SetTransactionStatementImpl
	 * @see org.asup.db.syntax.dbl.impl.DblPackageImpl#getSetTransactionStatement()
	 * @generated
	 */
	int SET_TRANSACTION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Isolation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rw Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TRANSACTION_STATEMENT__RW_OPERATION = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Transaction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TRANSACTION_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.dbl.IsolationLevel
	 * @see org.asup.db.syntax.dbl.impl.DblPackageImpl#getIsolationLevel()
	 * @generated
	 */
	int ISOLATION_LEVEL = 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.dbl.RWOperation <em>RW Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.dbl.RWOperation
	 * @see org.asup.db.syntax.dbl.impl.DblPackageImpl#getRWOperation()
	 * @generated
	 */
	int RW_OPERATION = 2;


	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.dbl.QSetTransactionStatement <em>Set Transaction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Transaction Statement</em>'.
	 * @see org.asup.db.syntax.dbl.QSetTransactionStatement
	 * @generated
	 */
	EClass getSetTransactionStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.dbl.QSetTransactionStatement#getIsolationLevel <em>Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolation Level</em>'.
	 * @see org.asup.db.syntax.dbl.QSetTransactionStatement#getIsolationLevel()
	 * @see #getSetTransactionStatement()
	 * @generated
	 */
	EAttribute getSetTransactionStatement_IsolationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.dbl.QSetTransactionStatement#getRwOperation <em>Rw Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Operation</em>'.
	 * @see org.asup.db.syntax.dbl.QSetTransactionStatement#getRwOperation()
	 * @see #getSetTransactionStatement()
	 * @generated
	 */
	EAttribute getSetTransactionStatement_RwOperation();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Isolation Level</em>'.
	 * @see org.asup.db.syntax.dbl.IsolationLevel
	 * @generated
	 */
	EEnum getIsolationLevel();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.syntax.dbl.RWOperation <em>RW Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RW Operation</em>'.
	 * @see org.asup.db.syntax.dbl.RWOperation
	 * @generated
	 */
	EEnum getRWOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDblFactory getDblFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.dbl.impl.SetTransactionStatementImpl <em>Set Transaction Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.dbl.impl.SetTransactionStatementImpl
		 * @see org.asup.db.syntax.dbl.impl.DblPackageImpl#getSetTransactionStatement()
		 * @generated
		 */
		EClass SET_TRANSACTION_STATEMENT = eINSTANCE.getSetTransactionStatement();

		/**
		 * The meta object literal for the '<em><b>Isolation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL = eINSTANCE.getSetTransactionStatement_IsolationLevel();

		/**
		 * The meta object literal for the '<em><b>Rw Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TRANSACTION_STATEMENT__RW_OPERATION = eINSTANCE.getSetTransactionStatement_RwOperation();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.dbl.IsolationLevel
		 * @see org.asup.db.syntax.dbl.impl.DblPackageImpl#getIsolationLevel()
		 * @generated
		 */
		EEnum ISOLATION_LEVEL = eINSTANCE.getIsolationLevel();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.dbl.RWOperation <em>RW Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.dbl.RWOperation
		 * @see org.asup.db.syntax.dbl.impl.DblPackageImpl#getRWOperation()
		 * @generated
		 */
		EEnum RW_OPERATION = eINSTANCE.getRWOperation();

	}

} //QDblPackage
