/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.fw.core.QFrameworkCorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '{@link org.asup.db.syntax.impl.AliasResolverImpl <em>Alias Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.AliasResolverImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getAliasResolver()
	 * @generated
	 */
	int ALIAS_RESOLVER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alias Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.AliasResolverRegistryImpl <em>Alias Resolver Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.AliasResolverRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getAliasResolverRegistry()
	 * @generated
	 */
	int ALIAS_RESOLVER_REGISTRY = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Alias Resolver Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParserImpl <em>Definition Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParserImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParser()
	 * @generated
	 */
	int DEFINITION_PARSER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.QDefinitionParserError <em>Definition Parser Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.QDefinitionParserError
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserError()
	 * @generated
	 */
	int DEFINITION_PARSER_ERROR = 3;

	/**
	 * The number of structural features of the '<em>Definition Parser Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParserRegistryImpl <em>Definition Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParserRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserRegistry()
	 * @generated
	 */
	int DEFINITION_PARSER_REGISTRY = 4;

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
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionParserResultImpl <em>Definition Parser Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionParserResultImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserResult()
	 * @generated
	 */
	int DEFINITION_PARSER_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_RESULT__ERROR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Definition Parser Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionWriterImpl <em>Definition Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionWriterImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriter()
	 * @generated
	 */
	int DEFINITION_WRITER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.DefinitionWriterRegistryImpl <em>Definition Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.DefinitionWriterRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriterRegistry()
	 * @generated
	 */
	int DEFINITION_WRITER_REGISTRY = 7;

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
	 * The meta object id for the '{@link org.asup.db.syntax.QDefinitionStatement <em>Definition Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.QDefinitionStatement
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionStatement()
	 * @generated
	 */
	int DEFINITION_STATEMENT = 8;

	/**
	 * The number of structural features of the '<em>Definition Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryWriterImpl <em>Query Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryWriterImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriter()
	 * @generated
	 */
	int QUERY_WRITER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryWriterRegistryImpl <em>Query Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryWriterRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriterRegistry()
	 * @generated
	 */
	int QUERY_WRITER_REGISTRY = 10;

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
	int QUERY_PARSER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryParserRegistryImpl <em>Query Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryParserRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParserRegistry()
	 * @generated
	 */
	int QUERY_PARSER_REGISTRY = 12;

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
	 * The meta object id for the '<em>Query Parse Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParseResult()
	 * @generated
	 */
	int QUERY_PARSE_RESULT = 13;

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QAliasResolver <em>Alias Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Resolver</em>'.
	 * @see org.asup.db.syntax.QAliasResolver
	 * @generated
	 */
	EClass getAliasResolver();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QAliasResolverRegistry <em>Alias Resolver Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Resolver Registry</em>'.
	 * @see org.asup.db.syntax.QAliasResolverRegistry
	 * @generated
	 */
	EClass getAliasResolverRegistry();

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
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionParserError <em>Definition Parser Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser Error</em>'.
	 * @see org.asup.db.syntax.QDefinitionParserError
	 * @generated
	 */
	EClass getDefinitionParserError();

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
	 * Returns the meta object for class '{@link org.asup.db.syntax.QDefinitionParserResult <em>Definition Parser Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser Result</em>'.
	 * @see org.asup.db.syntax.QDefinitionParserResult
	 * @generated
	 */
	EClass getDefinitionParserResult();

	/**
	 * Returns the meta object for the reference '{@link org.asup.db.syntax.QDefinitionParserResult#getDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition Statement</em>'.
	 * @see org.asup.db.syntax.QDefinitionParserResult#getDefinitionStatement()
	 * @see #getDefinitionParserResult()
	 * @generated
	 */
	EReference getDefinitionParserResult_DefinitionStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.asup.db.syntax.QDefinitionParserResult#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error List</em>'.
	 * @see org.asup.db.syntax.QDefinitionParserResult#getErrorList()
	 * @see #getDefinitionParserResult()
	 * @generated
	 */
	EReference getDefinitionParserResult_ErrorList();

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
	 * Returns the meta object for data type '{@link org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult <em>Query Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Query Parse Result</em>'.
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @model instanceClass="org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult"
	 * @generated
	 */
	EDataType getQueryParseResult();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.AliasResolverImpl <em>Alias Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.AliasResolverImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getAliasResolver()
		 * @generated
		 */
		EClass ALIAS_RESOLVER = eINSTANCE.getAliasResolver();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.AliasResolverRegistryImpl <em>Alias Resolver Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.AliasResolverRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getAliasResolverRegistry()
		 * @generated
		 */
		EClass ALIAS_RESOLVER_REGISTRY = eINSTANCE.getAliasResolverRegistry();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.QDefinitionParserError <em>Definition Parser Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.QDefinitionParserError
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserError()
		 * @generated
		 */
		EClass DEFINITION_PARSER_ERROR = eINSTANCE.getDefinitionParserError();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.DefinitionParserResultImpl <em>Definition Parser Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.DefinitionParserResultImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserResult()
		 * @generated
		 */
		EClass DEFINITION_PARSER_RESULT = eINSTANCE.getDefinitionParserResult();

		/**
		 * The meta object literal for the '<em><b>Definition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSER_RESULT__DEFINITION_STATEMENT = eINSTANCE.getDefinitionParserResult_DefinitionStatement();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSER_RESULT__ERROR_LIST = eINSTANCE.getDefinitionParserResult_ErrorList();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.QDefinitionStatement <em>Definition Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.QDefinitionStatement
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionStatement()
		 * @generated
		 */
		EClass DEFINITION_STATEMENT = eINSTANCE.getDefinitionStatement();

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
		 * The meta object literal for the '<em>Query Parse Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParseResult()
		 * @generated
		 */
		EDataType QUERY_PARSE_RESULT = eINSTANCE.getQueryParseResult();

	}

} //DBSyntaxPackage
