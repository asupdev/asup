/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.fw.core.QFrameworkCorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.asup.db.syntax.QDatabaseSyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseSyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "syntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/db/syntax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxPackage eINSTANCE = org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.BindingParseErrorImpl <em>Binding Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.BindingParseErrorImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseError()
	 * @generated
	 */
	int BINDING_PARSE_ERROR = 0;

	/**
	 * The number of structural features of the '<em>Binding Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.StatementParserImpl <em>Statement Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.StatementParserImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementParser()
	 * @generated
	 */
	int STATEMENT_PARSER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.BindingParserImpl <em>Binding Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.BindingParserImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParser()
	 * @generated
	 */
	int BINDING_PARSER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER__NAME = STATEMENT_PARSER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER__TEXT = STATEMENT_PARSER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER__VERSION = STATEMENT_PARSER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER__VENDOR = STATEMENT_PARSER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER__CONFIG = STATEMENT_PARSER__CONFIG;

	/**
	 * The number of structural features of the '<em>Binding Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.BindingParseResultImpl <em>Binding Parse Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.BindingParseResultImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseResult()
	 * @generated
	 */
	int BINDING_PARSE_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Binding Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_RESULT__BINDING_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_RESULT__ERROR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Binding Parse Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.BindingStatementImpl <em>Binding Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.BindingStatementImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingStatement()
	 * @generated
	 */
	int BINDING_STATEMENT = 3;

	/**
	 * The number of structural features of the '<em>Binding Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParserImpl <em>Definition Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParserImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParser()
	 * @generated
	 */
	int DEFINITION_PARSER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__NAME = STATEMENT_PARSER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__TEXT = STATEMENT_PARSER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__VERSION = STATEMENT_PARSER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__VENDOR = STATEMENT_PARSER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__CONFIG = STATEMENT_PARSER__CONFIG;

	/**
	 * The number of structural features of the '<em>Definition Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParserRegistryImpl <em>Definition Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParserRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserRegistry()
	 * @generated
	 */
	int DEFINITION_PARSER_REGISTRY = 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Definition Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParseErrorImpl <em>Definition Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParseErrorImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseError()
	 * @generated
	 */
	int DEFINITION_PARSE_ERROR = 6;

	/**
	 * The number of structural features of the '<em>Definition Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParseResultImpl <em>Definition Parse Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParseResultImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseResult()
	 * @generated
	 */
	int DEFINITION_PARSE_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT__ERROR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Definition Parse Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.StatementWriterImpl <em>Statement Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.StatementWriterImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementWriter()
	 * @generated
	 */
	int STATEMENT_WRITER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__NAME_HELPER = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionWriterImpl <em>Definition Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionWriterImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriter()
	 * @generated
	 */
	int DEFINITION_WRITER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__NAME = STATEMENT_WRITER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__TEXT = STATEMENT_WRITER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__VERSION = STATEMENT_WRITER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__VENDOR = STATEMENT_WRITER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__CONFIG = STATEMENT_WRITER__CONFIG;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__NAME_HELPER = STATEMENT_WRITER__NAME_HELPER;

	/**
	 * The number of structural features of the '<em>Definition Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_FEATURE_COUNT = STATEMENT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionWriterRegistryImpl <em>Definition Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionWriterRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriterRegistry()
	 * @generated
	 */
	int DEFINITION_WRITER_REGISTRY = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Definition Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionStatementImpl <em>Definition Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionStatementImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionStatement()
	 * @generated
	 */
	int DEFINITION_STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Definition Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.QEmbeddedStatement <em>Embedded Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.QEmbeddedStatement
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getEmbeddedStatement()
	 * @generated
	 */
	int EMBEDDED_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_STATEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Embedded Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.NameHelperImpl <em>Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.NameHelperImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelper()
	 * @generated
	 */
	int NAME_HELPER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.NameHelperRegistryImpl <em>Name Helper Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.NameHelperRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelperRegistry()
	 * @generated
	 */
	int NAME_HELPER_REGISTRY = 13;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Name Helper Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryWriterImpl <em>Query Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryWriterImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriter()
	 * @generated
	 */
	int QUERY_WRITER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__NAME = STATEMENT_WRITER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__TEXT = STATEMENT_WRITER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__VERSION = STATEMENT_WRITER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__VENDOR = STATEMENT_WRITER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__CONFIG = STATEMENT_WRITER__CONFIG;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__NAME_HELPER = STATEMENT_WRITER__NAME_HELPER;

	/**
	 * The number of structural features of the '<em>Query Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_FEATURE_COUNT = STATEMENT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryWriterRegistryImpl <em>Query Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryWriterRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriterRegistry()
	 * @generated
	 */
	int QUERY_WRITER_REGISTRY = 15;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Query Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryParserImpl <em>Query Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryParserImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParser()
	 * @generated
	 */
	int QUERY_PARSER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__NAME = STATEMENT_PARSER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__TEXT = STATEMENT_PARSER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__VERSION = STATEMENT_PARSER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__VENDOR = STATEMENT_PARSER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__CONFIG = STATEMENT_PARSER__CONFIG;

	/**
	 * The number of structural features of the '<em>Query Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryParserRegistryImpl <em>Query Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryParserRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParserRegistry()
	 * @generated
	 */
	int QUERY_PARSER_REGISTRY = 17;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Query Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLObjectNameHelper()
	 * @generated
	 */
	int SQL_OBJECT_NAME_HELPER = 18;

	/**
	 * The number of structural features of the '<em>SQL Object Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OBJECT_NAME_HELPER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.StatementType <em>Statement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.StatementType
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 21;

	/**
	 * The meta object id for the '<em>SQL Query Parse Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLQueryParseResult()
	 * @generated
	 */
	int SQL_QUERY_PARSE_RESULT = 22;


	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QBindingParseError <em>Binding Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parse Error</em>'.
	 * @see org.asup.db.syntax.QBindingParseError
	 * @generated
	 */
	EClass getBindingParseError();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QBindingParser <em>Binding Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parser</em>'.
	 * @see org.asup.db.syntax.QBindingParser
	 * @generated
	 */
	EClass getBindingParser();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QBindingParseResult <em>Binding Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parse Result</em>'.
	 * @see org.asup.db.syntax.QBindingParseResult
	 * @generated
	 */
	EClass getBindingParseResult();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.QBindingParseResult#getBindingStatement <em>Binding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Statement</em>'.
	 * @see org.asup.db.syntax.QBindingParseResult#getBindingStatement()
	 * @see #getBindingParseResult()
	 * @generated
	 */
	EReference getBindingParseResult_BindingStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.asup.db.syntax.QBindingParseResult#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error List</em>'.
	 * @see org.asup.db.syntax.QBindingParseResult#getErrorList()
	 * @see #getBindingParseResult()
	 * @generated
	 */
	EReference getBindingParseResult_ErrorList();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QBindingStatement <em>Binding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Statement</em>'.
	 * @see org.asup.db.syntax.QBindingStatement
	 * @generated
	 */
	EClass getBindingStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionParser <em>Definition Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser</em>'.
	 * @see org.asup.db.syntax.QDefinitionParser
	 * @generated
	 */
	EClass getDefinitionParser();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionParserRegistry <em>Definition Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser Registry</em>'.
	 * @see org.asup.db.syntax.QDefinitionParserRegistry
	 * @generated
	 */
	EClass getDefinitionParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionParseError <em>Definition Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parse Error</em>'.
	 * @see org.asup.db.syntax.QDefinitionParseError
	 * @generated
	 */
	EClass getDefinitionParseError();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionParseResult <em>Definition Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parse Result</em>'.
	 * @see org.asup.db.syntax.QDefinitionParseResult
	 * @generated
	 */
	EClass getDefinitionParseResult();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.QDefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition Statement</em>'.
	 * @see org.asup.db.syntax.QDefinitionParseResult#getDefinitionStatement()
	 * @see #getDefinitionParseResult()
	 * @generated
	 */
	EReference getDefinitionParseResult_DefinitionStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.asup.db.syntax.QDefinitionParseResult#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error List</em>'.
	 * @see org.asup.db.syntax.QDefinitionParseResult#getErrorList()
	 * @see #getDefinitionParseResult()
	 * @generated
	 */
	EReference getDefinitionParseResult_ErrorList();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionWriter <em>Definition Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Writer</em>'.
	 * @see org.asup.db.syntax.QDefinitionWriter
	 * @generated
	 */
	EClass getDefinitionWriter();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionWriterRegistry <em>Definition Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Writer Registry</em>'.
	 * @see org.asup.db.syntax.QDefinitionWriterRegistry
	 * @generated
	 */
	EClass getDefinitionWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Statement</em>'.
	 * @see org.asup.db.syntax.QDefinitionStatement
	 * @generated
	 */
	EClass getDefinitionStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QEmbeddedStatement <em>Embedded Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Statement</em>'.
	 * @see org.asup.db.syntax.QEmbeddedStatement
	 * @generated
	 */
	EClass getEmbeddedStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.QEmbeddedStatement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.db.syntax.QEmbeddedStatement#getType()
	 * @see #getEmbeddedStatement()
	 * @generated
	 */
	EAttribute getEmbeddedStatement_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QNameHelper <em>Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Helper</em>'.
	 * @see org.asup.db.syntax.QNameHelper
	 * @generated
	 */
	EClass getNameHelper();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QNameHelperRegistry <em>Name Helper Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Helper Registry</em>'.
	 * @see org.asup.db.syntax.QNameHelperRegistry
	 * @generated
	 */
	EClass getNameHelperRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QQueryWriter <em>Query Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Writer</em>'.
	 * @see org.asup.db.syntax.QQueryWriter
	 * @generated
	 */
	EClass getQueryWriter();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QQueryWriterRegistry <em>Query Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Writer Registry</em>'.
	 * @see org.asup.db.syntax.QQueryWriterRegistry
	 * @generated
	 */
	EClass getQueryWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QQueryParser <em>Query Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parser</em>'.
	 * @see org.asup.db.syntax.QQueryParser
	 * @generated
	 */
	EClass getQueryParser();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QQueryParserRegistry <em>Query Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parser Registry</em>'.
	 * @see org.asup.db.syntax.QQueryParserRegistry
	 * @generated
	 */
	EClass getQueryParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Object Name Helper</em>'.
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @model instanceClass="org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper"
	 * @generated
	 */
	EClass getSQLObjectNameHelper();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QStatementWriter <em>Statement Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Writer</em>'.
	 * @see org.asup.db.syntax.QStatementWriter
	 * @generated
	 */
	EClass getStatementWriter();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.QStatementWriter#getNameHelper <em>Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Helper</em>'.
	 * @see org.asup.db.syntax.QStatementWriter#getNameHelper()
	 * @see #getStatementWriter()
	 * @generated
	 */
	EReference getStatementWriter_NameHelper();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QStatementParser <em>Statement Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Parser</em>'.
	 * @see org.asup.db.syntax.QStatementParser
	 * @generated
	 */
	EClass getStatementParser();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.syntax.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statement Type</em>'.
	 * @see org.asup.db.syntax.StatementType
	 * @generated
	 */
	EEnum getStatementType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult <em>SQL Query Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SQL Query Parse Result</em>'.
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @model instanceClass="org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult"
	 * @generated
	 */
	EDataType getSQLQueryParseResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseSyntaxFactory getDatabaseSyntaxFactory();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.BindingParseErrorImpl <em>Binding Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.BindingParseErrorImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseError()
		 * @generated
		 */
		EClass BINDING_PARSE_ERROR = eINSTANCE.getBindingParseError();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.BindingParserImpl <em>Binding Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.BindingParserImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParser()
		 * @generated
		 */
		EClass BINDING_PARSER = eINSTANCE.getBindingParser();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.BindingParseResultImpl <em>Binding Parse Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.BindingParseResultImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseResult()
		 * @generated
		 */
		EClass BINDING_PARSE_RESULT = eINSTANCE.getBindingParseResult();

		/**
		 * The meta object literal for the '<em><b>Binding Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PARSE_RESULT__BINDING_STATEMENT = eINSTANCE.getBindingParseResult_BindingStatement();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PARSE_RESULT__ERROR_LIST = eINSTANCE.getBindingParseResult_ErrorList();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.BindingStatementImpl <em>Binding Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.BindingStatementImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingStatement()
		 * @generated
		 */
		EClass BINDING_STATEMENT = eINSTANCE.getBindingStatement();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionParserImpl <em>Definition Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionParserImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParser()
		 * @generated
		 */
		EClass DEFINITION_PARSER = eINSTANCE.getDefinitionParser();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionParserRegistryImpl <em>Definition Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionParserRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserRegistry()
		 * @generated
		 */
		EClass DEFINITION_PARSER_REGISTRY = eINSTANCE.getDefinitionParserRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionParseErrorImpl <em>Definition Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionParseErrorImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseError()
		 * @generated
		 */
		EClass DEFINITION_PARSE_ERROR = eINSTANCE.getDefinitionParseError();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionParseResultImpl <em>Definition Parse Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionParseResultImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseResult()
		 * @generated
		 */
		EClass DEFINITION_PARSE_RESULT = eINSTANCE.getDefinitionParseResult();

		/**
		 * The meta object literal for the '<em><b>Definition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT = eINSTANCE.getDefinitionParseResult_DefinitionStatement();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSE_RESULT__ERROR_LIST = eINSTANCE.getDefinitionParseResult_ErrorList();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionWriterImpl <em>Definition Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionWriterImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriter()
		 * @generated
		 */
		EClass DEFINITION_WRITER = eINSTANCE.getDefinitionWriter();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionWriterRegistryImpl <em>Definition Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionWriterRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriterRegistry()
		 * @generated
		 */
		EClass DEFINITION_WRITER_REGISTRY = eINSTANCE.getDefinitionWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionStatementImpl <em>Definition Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionStatementImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionStatement()
		 * @generated
		 */
		EClass DEFINITION_STATEMENT = eINSTANCE.getDefinitionStatement();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.QEmbeddedStatement <em>Embedded Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.QEmbeddedStatement
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getEmbeddedStatement()
		 * @generated
		 */
		EClass EMBEDDED_STATEMENT = eINSTANCE.getEmbeddedStatement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_STATEMENT__TYPE = eINSTANCE.getEmbeddedStatement_Type();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.NameHelperImpl <em>Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.NameHelperImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelper()
		 * @generated
		 */
		EClass NAME_HELPER = eINSTANCE.getNameHelper();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.NameHelperRegistryImpl <em>Name Helper Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.NameHelperRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelperRegistry()
		 * @generated
		 */
		EClass NAME_HELPER_REGISTRY = eINSTANCE.getNameHelperRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.QueryWriterImpl <em>Query Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.QueryWriterImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriter()
		 * @generated
		 */
		EClass QUERY_WRITER = eINSTANCE.getQueryWriter();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.QueryWriterRegistryImpl <em>Query Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.QueryWriterRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriterRegistry()
		 * @generated
		 */
		EClass QUERY_WRITER_REGISTRY = eINSTANCE.getQueryWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.QueryParserImpl <em>Query Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.QueryParserImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParser()
		 * @generated
		 */
		EClass QUERY_PARSER = eINSTANCE.getQueryParser();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.QueryParserRegistryImpl <em>Query Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.QueryParserRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParserRegistry()
		 * @generated
		 */
		EClass QUERY_PARSER_REGISTRY = eINSTANCE.getQueryParserRegistry();

		/**
		 * The meta object literal for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLObjectNameHelper()
		 * @generated
		 */
		EClass SQL_OBJECT_NAME_HELPER = eINSTANCE.getSQLObjectNameHelper();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.StatementWriterImpl <em>Statement Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.StatementWriterImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementWriter()
		 * @generated
		 */
		EClass STATEMENT_WRITER = eINSTANCE.getStatementWriter();

		/**
		 * The meta object literal for the '<em><b>Name Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WRITER__NAME_HELPER = eINSTANCE.getStatementWriter_NameHelper();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.StatementParserImpl <em>Statement Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.StatementParserImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementParser()
		 * @generated
		 */
		EClass STATEMENT_PARSER = eINSTANCE.getStatementParser();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.StatementType <em>Statement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.StatementType
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementType()
		 * @generated
		 */
		EEnum STATEMENT_TYPE = eINSTANCE.getStatementType();

		/**
		 * The meta object literal for the '<em>SQL Query Parse Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLQueryParseResult()
		 * @generated
		 */
		EDataType SQL_QUERY_PARSE_RESULT = eINSTANCE.getSQLQueryParseResult();

	}

} //QDatabaseSyntaxPackage
