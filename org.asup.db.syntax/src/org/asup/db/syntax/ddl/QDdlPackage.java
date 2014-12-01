/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl;

import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.asup.db.syntax.ddl.QDdlFactory
 * @model kind="package"
 * @generated
 */
public interface QDdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ddl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/db/syntax/ddl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax-ddl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDdlPackage eINSTANCE = org.asup.db.syntax.ddl.impl.DdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.CommitStatementImpl <em>Commit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.CommitStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCommitStatement()
	 * @generated
	 */
	int COMMIT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_STATEMENT__HOLD = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Commit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.ConnectStatementImpl <em>Connect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.ConnectStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getConnectStatement()
	 * @generated
	 */
	int CONNECT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__PWD = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__RESET = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__TO = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__USER = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl <em>Create Alias Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCreateAliasStatement()
	 * @generated
	 */
	int CREATE_ALIAS_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT__ALIAS_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT__TABLE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Alias Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCreateIndexStatement()
	 * @generated
	 */
	int CREATE_INDEX_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__INDEX_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__ON_TABLE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__SORT_BY = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__UNIQUE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Index Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.CreateTableStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCreateTableStatement()
	 * @generated
	 */
	int CREATE_TABLE_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__TABLE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__FIELDS = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.DisconnectStatementImpl <em>Disconnect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.DisconnectStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDisconnectStatement()
	 * @generated
	 */
	int DISCONNECT_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_STATEMENT__TARGET = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disconnect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.DropAliasStatementImpl <em>Drop Alias Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.DropAliasStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropAliasStatement()
	 * @generated
	 */
	int DROP_ALIAS_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALIAS_STATEMENT__ALIAS_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Alias Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALIAS_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.DropIndexStatementImpl <em>Drop Index Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.DropIndexStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropIndexStatement()
	 * @generated
	 */
	int DROP_INDEX_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_STATEMENT__INDEX_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Index Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.DropTableStatementImpl <em>Drop Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.DropTableStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropTableStatement()
	 * @generated
	 */
	int DROP_TABLE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_STATEMENT__TABLE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_STATEMENT__RANGE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drop Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.impl.DropViewStatementImpl <em>Drop View Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.impl.DropViewStatementImpl
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropViewStatement()
	 * @generated
	 */
	int DROP_VIEW_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_STATEMENT__VIEW_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_STATEMENT__RANGE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drop View Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.DropRange <em>Drop Range</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.DropRange
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropRange()
	 * @generated
	 */
	int DROP_RANGE = 10;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.ddl.TargetItem <em>Target Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.ddl.TargetItem
	 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getTargetItem()
	 * @generated
	 */
	int TARGET_ITEM = 11;


	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QCommitStatement <em>Commit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QCommitStatement
	 * @generated
	 */
	EClass getCommitStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QCommitStatement#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.asup.db.syntax.ddl.QCommitStatement#isHold()
	 * @see #getCommitStatement()
	 * @generated
	 */
	EAttribute getCommitStatement_Hold();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QConnectStatement <em>Connect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QConnectStatement
	 * @generated
	 */
	EClass getConnectStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QConnectStatement#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.asup.db.syntax.ddl.QConnectStatement#getPwd()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QConnectStatement#isReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset</em>'.
	 * @see org.asup.db.syntax.ddl.QConnectStatement#isReset()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_Reset();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QConnectStatement#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.asup.db.syntax.ddl.QConnectStatement#getTo()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_To();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QConnectStatement#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.asup.db.syntax.ddl.QConnectStatement#getUser()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_User();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QCreateAliasStatement <em>Create Alias Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Alias Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateAliasStatement
	 * @generated
	 */
	EClass getCreateAliasStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QCreateAliasStatement#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alias Name</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateAliasStatement#getAliasName()
	 * @see #getCreateAliasStatement()
	 * @generated
	 */
	EReference getCreateAliasStatement_AliasName();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QCreateAliasStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Name</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateAliasStatement#getTableName()
	 * @see #getCreateAliasStatement()
	 * @generated
	 */
	EReference getCreateAliasStatement_TableName();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QCreateIndexStatement <em>Create Index Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Index Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateIndexStatement
	 * @generated
	 */
	EClass getCreateIndexStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QCreateIndexStatement#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Name</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateIndexStatement#getIndexName()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_IndexName();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QCreateIndexStatement#getOnTable <em>On Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Table</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateIndexStatement#getOnTable()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_OnTable();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QCreateIndexStatement#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort By</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateIndexStatement#getSortBy()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QCreateIndexStatement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateIndexStatement#isUnique()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EAttribute getCreateIndexStatement_Unique();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QCreateTableStatement <em>Create Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Table Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateTableStatement
	 * @generated
	 */
	EClass getCreateTableStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QCreateTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Name</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateTableStatement#getTableName()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EReference getCreateTableStatement_TableName();

	/**
	 * Returns the meta object for the reference list '{@link org.asup.db.syntax.ddl.QCreateTableStatement#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see org.asup.db.syntax.ddl.QCreateTableStatement#getFields()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EReference getCreateTableStatement_Fields();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QDisconnectStatement <em>Disconnect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QDisconnectStatement
	 * @generated
	 */
	EClass getDisconnectStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QDisconnectStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.asup.db.syntax.ddl.QDisconnectStatement#getTarget()
	 * @see #getDisconnectStatement()
	 * @generated
	 */
	EAttribute getDisconnectStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QDropAliasStatement <em>Drop Alias Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Alias Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QDropAliasStatement
	 * @generated
	 */
	EClass getDropAliasStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QDropAliasStatement#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alias Name</em>'.
	 * @see org.asup.db.syntax.ddl.QDropAliasStatement#getAliasName()
	 * @see #getDropAliasStatement()
	 * @generated
	 */
	EReference getDropAliasStatement_AliasName();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QDropIndexStatement <em>Drop Index Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Index Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QDropIndexStatement
	 * @generated
	 */
	EClass getDropIndexStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QDropIndexStatement#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Name</em>'.
	 * @see org.asup.db.syntax.ddl.QDropIndexStatement#getIndexName()
	 * @see #getDropIndexStatement()
	 * @generated
	 */
	EReference getDropIndexStatement_IndexName();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QDropTableStatement <em>Drop Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Table Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QDropTableStatement
	 * @generated
	 */
	EClass getDropTableStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QDropTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Name</em>'.
	 * @see org.asup.db.syntax.ddl.QDropTableStatement#getTableName()
	 * @see #getDropTableStatement()
	 * @generated
	 */
	EReference getDropTableStatement_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QDropTableStatement#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.asup.db.syntax.ddl.QDropTableStatement#getRange()
	 * @see #getDropTableStatement()
	 * @generated
	 */
	EAttribute getDropTableStatement_Range();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.ddl.QDropViewStatement <em>Drop View Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop View Statement</em>'.
	 * @see org.asup.db.syntax.ddl.QDropViewStatement
	 * @generated
	 */
	EClass getDropViewStatement();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.ddl.QDropViewStatement#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Name</em>'.
	 * @see org.asup.db.syntax.ddl.QDropViewStatement#getViewName()
	 * @see #getDropViewStatement()
	 * @generated
	 */
	EReference getDropViewStatement_ViewName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.ddl.QDropViewStatement#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.asup.db.syntax.ddl.QDropViewStatement#getRange()
	 * @see #getDropViewStatement()
	 * @generated
	 */
	EAttribute getDropViewStatement_Range();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.syntax.ddl.DropRange <em>Drop Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drop Range</em>'.
	 * @see org.asup.db.syntax.ddl.DropRange
	 * @generated
	 */
	EEnum getDropRange();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.syntax.ddl.TargetItem <em>Target Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Item</em>'.
	 * @see org.asup.db.syntax.ddl.TargetItem
	 * @generated
	 */
	EEnum getTargetItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDdlFactory getDdlFactory();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.CommitStatementImpl <em>Commit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.CommitStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCommitStatement()
		 * @generated
		 */
		EClass COMMIT_STATEMENT = eINSTANCE.getCommitStatement();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT_STATEMENT__HOLD = eINSTANCE.getCommitStatement_Hold();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.ConnectStatementImpl <em>Connect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.ConnectStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getConnectStatement()
		 * @generated
		 */
		EClass CONNECT_STATEMENT = eINSTANCE.getConnectStatement();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__PWD = eINSTANCE.getConnectStatement_Pwd();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__RESET = eINSTANCE.getConnectStatement_Reset();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__TO = eINSTANCE.getConnectStatement_To();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__USER = eINSTANCE.getConnectStatement_User();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl <em>Create Alias Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.CreateAliasStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCreateAliasStatement()
		 * @generated
		 */
		EClass CREATE_ALIAS_STATEMENT = eINSTANCE.getCreateAliasStatement();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ALIAS_STATEMENT__ALIAS_NAME = eINSTANCE.getCreateAliasStatement_AliasName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ALIAS_STATEMENT__TABLE_NAME = eINSTANCE.getCreateAliasStatement_TableName();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.CreateIndexStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCreateIndexStatement()
		 * @generated
		 */
		EClass CREATE_INDEX_STATEMENT = eINSTANCE.getCreateIndexStatement();

		/**
		 * The meta object literal for the '<em><b>Index Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__INDEX_NAME = eINSTANCE.getCreateIndexStatement_IndexName();

		/**
		 * The meta object literal for the '<em><b>On Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__ON_TABLE = eINSTANCE.getCreateIndexStatement_OnTable();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__SORT_BY = eINSTANCE.getCreateIndexStatement_SortBy();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX_STATEMENT__UNIQUE = eINSTANCE.getCreateIndexStatement_Unique();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.CreateTableStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getCreateTableStatement()
		 * @generated
		 */
		EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getCreateTableStatement_TableName();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE_STATEMENT__FIELDS = eINSTANCE.getCreateTableStatement_Fields();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.DisconnectStatementImpl <em>Disconnect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.DisconnectStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDisconnectStatement()
		 * @generated
		 */
		EClass DISCONNECT_STATEMENT = eINSTANCE.getDisconnectStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECT_STATEMENT__TARGET = eINSTANCE.getDisconnectStatement_Target();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.DropAliasStatementImpl <em>Drop Alias Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.DropAliasStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropAliasStatement()
		 * @generated
		 */
		EClass DROP_ALIAS_STATEMENT = eINSTANCE.getDropAliasStatement();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_ALIAS_STATEMENT__ALIAS_NAME = eINSTANCE.getDropAliasStatement_AliasName();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.DropIndexStatementImpl <em>Drop Index Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.DropIndexStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropIndexStatement()
		 * @generated
		 */
		EClass DROP_INDEX_STATEMENT = eINSTANCE.getDropIndexStatement();

		/**
		 * The meta object literal for the '<em><b>Index Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_INDEX_STATEMENT__INDEX_NAME = eINSTANCE.getDropIndexStatement_IndexName();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.DropTableStatementImpl <em>Drop Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.DropTableStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropTableStatement()
		 * @generated
		 */
		EClass DROP_TABLE_STATEMENT = eINSTANCE.getDropTableStatement();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getDropTableStatement_TableName();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_TABLE_STATEMENT__RANGE = eINSTANCE.getDropTableStatement_Range();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.impl.DropViewStatementImpl <em>Drop View Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.impl.DropViewStatementImpl
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropViewStatement()
		 * @generated
		 */
		EClass DROP_VIEW_STATEMENT = eINSTANCE.getDropViewStatement();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_VIEW_STATEMENT__VIEW_NAME = eINSTANCE.getDropViewStatement_ViewName();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_VIEW_STATEMENT__RANGE = eINSTANCE.getDropViewStatement_Range();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.DropRange <em>Drop Range</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.DropRange
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getDropRange()
		 * @generated
		 */
		EEnum DROP_RANGE = eINSTANCE.getDropRange();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.ddl.TargetItem <em>Target Item</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.ddl.TargetItem
		 * @see org.asup.db.syntax.ddl.impl.DdlPackageImpl#getTargetItem()
		 * @generated
		 */
		EEnum TARGET_ITEM = eINSTANCE.getTargetItem();

	}

} //QDdlPackage
