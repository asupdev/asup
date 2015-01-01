/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql;

import org.asup.fw.core.QFrameworkCorePackage;

import org.asup.il.core.QIntegratedLanguageCorePackage;

import org.asup.il.data.QIntegratedLanguageDataPackage;

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
 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageEmbeddedSQLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/il/esql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-esql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageEmbeddedSQLPackage eINSTANCE = org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.il.esql.impl.CommunicationAreaImpl <em>Communication Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.impl.CommunicationAreaImpl
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCommunicationArea()
	 * @generated
	 */
	int COMMUNICATION_AREA = 0;

	/**
	 * The number of structural features of the '<em>Communication Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_AREA_FEATURE_COUNT = QIntegratedLanguageDataPackage.DATA_STRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.QESqlObject <em>ESql Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.QESqlObject
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlObject()
	 * @generated
	 */
	int ESQL_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>ESql Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.QCursor <em>Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.QCursor
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCursor()
	 * @generated
	 */
	int CURSOR = 1;

	/**
	 * The number of structural features of the '<em>Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_FEATURE_COUNT = ESQL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.impl.ESqlTermImpl <em>ESql Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.impl.ESqlTermImpl
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlTerm()
	 * @generated
	 */
	int ESQL_TERM = 5;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_TERM__FACETS = QIntegratedLanguageCorePackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_TERM__NAME = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ESql Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_TERM_FEATURE_COUNT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.impl.CursorTermImpl <em>Cursor Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.impl.CursorTermImpl
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCursorTerm()
	 * @generated
	 */
	int CURSOR_TERM = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM__FACETS = ESQL_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM__NAME = ESQL_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Cursor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM__CURSOR_TYPE = ESQL_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM__HOLD = ESQL_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM__SQL = ESQL_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM__STATEMENT_NAME = ESQL_TERM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cursor Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_TERM_FEATURE_COUNT = ESQL_TERM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.impl.DescriptorAreaImpl <em>Descriptor Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.impl.DescriptorAreaImpl
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getDescriptorArea()
	 * @generated
	 */
	int DESCRIPTOR_AREA = 3;

	/**
	 * The number of structural features of the '<em>Descriptor Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_AREA_FEATURE_COUNT = QIntegratedLanguageDataPackage.DATA_STRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.QStatement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.QStatement
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 6;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = ESQL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.impl.StatementTermImpl <em>Statement Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.impl.StatementTermImpl
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getStatementTerm()
	 * @generated
	 */
	int STATEMENT_TERM = 7;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TERM__FACETS = ESQL_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TERM__NAME = ESQL_TERM__NAME;

	/**
	 * The number of structural features of the '<em>Statement Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TERM_FEATURE_COUNT = ESQL_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.QESqlManager <em>ESql Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.QESqlManager
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlManager()
	 * @generated
	 */
	int ESQL_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>ESql Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.QESqlFactory <em>ESql Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.QESqlFactory
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlFactory()
	 * @generated
	 */
	int ESQL_FACTORY = 9;

	/**
	 * The number of structural features of the '<em>ESql Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQL_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.CursorType <em>Cursor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.CursorType
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCursorType()
	 * @generated
	 */
	int CURSOR_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.asup.il.esql.FetchPositioning <em>Fetch Positioning</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.esql.FetchPositioning
	 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getFetchPositioning()
	 * @generated
	 */
	int FETCH_POSITIONING = 11;


	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QCommunicationArea <em>Communication Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Area</em>'.
	 * @see org.asup.il.esql.QCommunicationArea
	 * @generated
	 */
	EClass getCommunicationArea();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cursor</em>'.
	 * @see org.asup.il.esql.QCursor
	 * @generated
	 */
	EClass getCursor();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QCursorTerm <em>Cursor Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cursor Term</em>'.
	 * @see org.asup.il.esql.QCursorTerm
	 * @generated
	 */
	EClass getCursorTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.esql.QCursorTerm#getCursorType <em>Cursor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Type</em>'.
	 * @see org.asup.il.esql.QCursorTerm#getCursorType()
	 * @see #getCursorTerm()
	 * @generated
	 */
	EAttribute getCursorTerm_CursorType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.esql.QCursorTerm#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.asup.il.esql.QCursorTerm#isHold()
	 * @see #getCursorTerm()
	 * @generated
	 */
	EAttribute getCursorTerm_Hold();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.esql.QCursorTerm#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql</em>'.
	 * @see org.asup.il.esql.QCursorTerm#getSql()
	 * @see #getCursorTerm()
	 * @generated
	 */
	EAttribute getCursorTerm_Sql();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.esql.QCursorTerm#getStatementName <em>Statement Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Name</em>'.
	 * @see org.asup.il.esql.QCursorTerm#getStatementName()
	 * @see #getCursorTerm()
	 * @generated
	 */
	EAttribute getCursorTerm_StatementName();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QDescriptorArea <em>Descriptor Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Area</em>'.
	 * @see org.asup.il.esql.QDescriptorArea
	 * @generated
	 */
	EClass getDescriptorArea();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QESqlObject <em>ESql Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESql Object</em>'.
	 * @see org.asup.il.esql.QESqlObject
	 * @generated
	 */
	EClass getESqlObject();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QESqlTerm <em>ESql Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESql Term</em>'.
	 * @see org.asup.il.esql.QESqlTerm
	 * @generated
	 */
	EClass getESqlTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.esql.QESqlTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.esql.QESqlTerm#getName()
	 * @see #getESqlTerm()
	 * @generated
	 */
	EAttribute getESqlTerm_Name();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.asup.il.esql.QStatement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QStatementTerm <em>Statement Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Term</em>'.
	 * @see org.asup.il.esql.QStatementTerm
	 * @generated
	 */
	EClass getStatementTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QESqlManager <em>ESql Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESql Manager</em>'.
	 * @see org.asup.il.esql.QESqlManager
	 * @generated
	 */
	EClass getESqlManager();

	/**
	 * Returns the meta object for class '{@link org.asup.il.esql.QESqlFactory <em>ESql Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESql Factory</em>'.
	 * @see org.asup.il.esql.QESqlFactory
	 * @generated
	 */
	EClass getESqlFactory();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.esql.CursorType <em>Cursor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cursor Type</em>'.
	 * @see org.asup.il.esql.CursorType
	 * @generated
	 */
	EEnum getCursorType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.esql.FetchPositioning <em>Fetch Positioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Positioning</em>'.
	 * @see org.asup.il.esql.FetchPositioning
	 * @generated
	 */
	EEnum getFetchPositioning();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageEmbeddedSQLFactory getIntegratedLanguageEmbeddedSQLFactory();

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
		 * The meta object literal for the '{@link org.asup.il.esql.impl.CommunicationAreaImpl <em>Communication Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.impl.CommunicationAreaImpl
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCommunicationArea()
		 * @generated
		 */
		EClass COMMUNICATION_AREA = eINSTANCE.getCommunicationArea();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.QCursor <em>Cursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.QCursor
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCursor()
		 * @generated
		 */
		EClass CURSOR = eINSTANCE.getCursor();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.impl.CursorTermImpl <em>Cursor Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.impl.CursorTermImpl
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCursorTerm()
		 * @generated
		 */
		EClass CURSOR_TERM = eINSTANCE.getCursorTerm();

		/**
		 * The meta object literal for the '<em><b>Cursor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR_TERM__CURSOR_TYPE = eINSTANCE.getCursorTerm_CursorType();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR_TERM__HOLD = eINSTANCE.getCursorTerm_Hold();

		/**
		 * The meta object literal for the '<em><b>Sql</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR_TERM__SQL = eINSTANCE.getCursorTerm_Sql();

		/**
		 * The meta object literal for the '<em><b>Statement Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR_TERM__STATEMENT_NAME = eINSTANCE.getCursorTerm_StatementName();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.impl.DescriptorAreaImpl <em>Descriptor Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.impl.DescriptorAreaImpl
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getDescriptorArea()
		 * @generated
		 */
		EClass DESCRIPTOR_AREA = eINSTANCE.getDescriptorArea();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.QESqlObject <em>ESql Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.QESqlObject
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlObject()
		 * @generated
		 */
		EClass ESQL_OBJECT = eINSTANCE.getESqlObject();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.impl.ESqlTermImpl <em>ESql Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.impl.ESqlTermImpl
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlTerm()
		 * @generated
		 */
		EClass ESQL_TERM = eINSTANCE.getESqlTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESQL_TERM__NAME = eINSTANCE.getESqlTerm_Name();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.QStatement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.QStatement
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.impl.StatementTermImpl <em>Statement Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.impl.StatementTermImpl
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getStatementTerm()
		 * @generated
		 */
		EClass STATEMENT_TERM = eINSTANCE.getStatementTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.QESqlManager <em>ESql Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.QESqlManager
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlManager()
		 * @generated
		 */
		EClass ESQL_MANAGER = eINSTANCE.getESqlManager();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.QESqlFactory <em>ESql Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.QESqlFactory
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getESqlFactory()
		 * @generated
		 */
		EClass ESQL_FACTORY = eINSTANCE.getESqlFactory();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.CursorType <em>Cursor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.CursorType
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getCursorType()
		 * @generated
		 */
		EEnum CURSOR_TYPE = eINSTANCE.getCursorType();

		/**
		 * The meta object literal for the '{@link org.asup.il.esql.FetchPositioning <em>Fetch Positioning</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.esql.FetchPositioning
		 * @see org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLPackageImpl#getFetchPositioning()
		 * @generated
		 */
		EEnum FETCH_POSITIONING = eINSTANCE.getFetchPositioning();

	}

} //QIntegratedLanguageEmbeddedSQLPackage
