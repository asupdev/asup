/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.fw.core.QFrameworkCorePackage;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '{@link org.asup.db.syntax.impl.ExtendedQueryExpressionBodyImpl <em>Extended Query Expression Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.ExtendedQueryExpressionBodyImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getExtendedQueryExpressionBody()
	 * @generated
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__EANNOTATIONS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__NAME = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__DEPENDENCIES = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__DESCRIPTION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__LABEL = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COMMENTS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COMMENTS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__EXTENSIONS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__PRIVILEGES = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__PRIVILEGES;

	/**
	 * The feature id for the '<em><b>Table Joined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_RIGHT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__TABLE_JOINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Table Joined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_LEFT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__TABLE_JOINED_LEFT;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__QUERY_SELECT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__QUERY_SELECT;

	/**
	 * The feature id for the '<em><b>Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__NEST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__NEST;

	/**
	 * The feature id for the '<em><b>Merge Source Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__MERGE_SOURCE_TABLE = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__MERGE_SOURCE_TABLE;

	/**
	 * The feature id for the '<em><b>Column List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COLUMN_LIST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COLUMN_LIST;

	/**
	 * The feature id for the '<em><b>Table Correlation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__TABLE_CORRELATION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__TABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Result Table All Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__RESULT_TABLE_ALL_COLUMNS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__RESULT_TABLE_ALL_COLUMNS;

	/**
	 * The feature id for the '<em><b>Value Expr Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__VALUE_EXPR_COLUMNS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__VALUE_EXPR_COLUMNS;

	/**
	 * The feature id for the '<em><b>Merge Target Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__MERGE_TARGET_TABLE = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__MERGE_TARGET_TABLE;

	/**
	 * The feature id for the '<em><b>Row Fetch Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__ROW_FETCH_LIMIT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__ROW_FETCH_LIMIT;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__QUERY_EXPRESSION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__QUERY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Combined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_LEFT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COMBINED_LEFT;

	/**
	 * The feature id for the '<em><b>Combined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_RIGHT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COMBINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Predicate Exists</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__PREDICATE_EXISTS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__PREDICATE_EXISTS;

	/**
	 * The feature id for the '<em><b>Update Source Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__UPDATE_SOURCE_QUERY = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__UPDATE_SOURCE_QUERY;

	/**
	 * The feature id for the '<em><b>With Table Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__WITH_TABLE_SPECIFICATION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__WITH_TABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Query Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__QUERY_NEST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__QUERY_NEST;

	/**
	 * The feature id for the '<em><b>Sort Spec List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__SORT_SPEC_LIST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__SORT_SPEC_LIST;

	/**
	 * The feature id for the '<em><b>Row Optimize Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Query Expression Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.ExtendedQuerySelectImpl <em>Extended Query Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.ExtendedQuerySelectImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getExtendedQuerySelect()
	 * @generated
	 */
	int EXTENDED_QUERY_SELECT = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__EANNOTATIONS = EXTENDED_QUERY_EXPRESSION_BODY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__NAME = EXTENDED_QUERY_EXPRESSION_BODY__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__DEPENDENCIES = EXTENDED_QUERY_EXPRESSION_BODY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__DESCRIPTION = EXTENDED_QUERY_EXPRESSION_BODY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__LABEL = EXTENDED_QUERY_EXPRESSION_BODY__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COMMENTS = EXTENDED_QUERY_EXPRESSION_BODY__COMMENTS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__EXTENSIONS = EXTENDED_QUERY_EXPRESSION_BODY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__PRIVILEGES = EXTENDED_QUERY_EXPRESSION_BODY__PRIVILEGES;

	/**
	 * The feature id for the '<em><b>Table Joined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__TABLE_JOINED_RIGHT = EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Table Joined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__TABLE_JOINED_LEFT = EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_LEFT;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__QUERY_SELECT = EXTENDED_QUERY_EXPRESSION_BODY__QUERY_SELECT;

	/**
	 * The feature id for the '<em><b>Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__NEST = EXTENDED_QUERY_EXPRESSION_BODY__NEST;

	/**
	 * The feature id for the '<em><b>Merge Source Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__MERGE_SOURCE_TABLE = EXTENDED_QUERY_EXPRESSION_BODY__MERGE_SOURCE_TABLE;

	/**
	 * The feature id for the '<em><b>Column List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COLUMN_LIST = EXTENDED_QUERY_EXPRESSION_BODY__COLUMN_LIST;

	/**
	 * The feature id for the '<em><b>Table Correlation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__TABLE_CORRELATION = EXTENDED_QUERY_EXPRESSION_BODY__TABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Result Table All Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__RESULT_TABLE_ALL_COLUMNS = EXTENDED_QUERY_EXPRESSION_BODY__RESULT_TABLE_ALL_COLUMNS;

	/**
	 * The feature id for the '<em><b>Value Expr Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__VALUE_EXPR_COLUMNS = EXTENDED_QUERY_EXPRESSION_BODY__VALUE_EXPR_COLUMNS;

	/**
	 * The feature id for the '<em><b>Merge Target Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__MERGE_TARGET_TABLE = EXTENDED_QUERY_EXPRESSION_BODY__MERGE_TARGET_TABLE;

	/**
	 * The feature id for the '<em><b>Row Fetch Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__ROW_FETCH_LIMIT = EXTENDED_QUERY_EXPRESSION_BODY__ROW_FETCH_LIMIT;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__QUERY_EXPRESSION = EXTENDED_QUERY_EXPRESSION_BODY__QUERY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Combined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COMBINED_LEFT = EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_LEFT;

	/**
	 * The feature id for the '<em><b>Combined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COMBINED_RIGHT = EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Predicate Exists</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__PREDICATE_EXISTS = EXTENDED_QUERY_EXPRESSION_BODY__PREDICATE_EXISTS;

	/**
	 * The feature id for the '<em><b>Update Source Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__UPDATE_SOURCE_QUERY = EXTENDED_QUERY_EXPRESSION_BODY__UPDATE_SOURCE_QUERY;

	/**
	 * The feature id for the '<em><b>With Table Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__WITH_TABLE_SPECIFICATION = EXTENDED_QUERY_EXPRESSION_BODY__WITH_TABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Query Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__QUERY_NEST = EXTENDED_QUERY_EXPRESSION_BODY__QUERY_NEST;

	/**
	 * The feature id for the '<em><b>Sort Spec List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__SORT_SPEC_LIST = EXTENDED_QUERY_EXPRESSION_BODY__SORT_SPEC_LIST;

	/**
	 * The feature id for the '<em><b>Row Optimize Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__ROW_OPTIMIZE_LIMIT = EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__DISTINCT = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__HAVING_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__WHERE_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group By Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Select Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__SELECT_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__FROM_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Into Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__INTO_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Extended Query Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT_FEATURE_COUNT = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryConverterImpl <em>Query Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryConverterImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryConverter()
	 * @generated
	 */
	int QUERY_CONVERTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryConverterRegistryImpl <em>Query Converter Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryConverterRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryConverterRegistry()
	 * @generated
	 */
	int QUERY_CONVERTER_REGISTRY = 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Query Converter Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONVERTER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.QueryParserImpl <em>Query Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.QueryParserImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParser()
	 * @generated
	 */
	int QUERY_PARSER = 6;

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
	int QUERY_PARSER_REGISTRY = 7;

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
	 * The meta object id for the '{@link org.asup.db.syntax.impl.SyntaxBuilderImpl <em>Syntax Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.SyntaxBuilderImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSyntaxBuilder()
	 * @generated
	 */
	int SYNTAX_BUILDER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Syntax Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.db.syntax.impl.SyntaxBuilderRegistryImpl <em>Syntax Builder Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.syntax.impl.SyntaxBuilderRegistryImpl
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSyntaxBuilderRegistry()
	 * @generated
	 */
	int SYNTAX_BUILDER_REGISTRY = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Syntax Builder Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_BUILDER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Query Parse Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParseResult()
	 * @generated
	 */
	int QUERY_PARSE_RESULT = 10;

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
	 * Returns the meta object for class '{@link org.asup.db.syntax.QExtendedQueryExpressionBody <em>Extended Query Expression Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Query Expression Body</em>'.
	 * @see org.asup.db.syntax.QExtendedQueryExpressionBody
	 * @generated
	 */
	EClass getExtendedQueryExpressionBody();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.syntax.QExtendedQueryExpressionBody#getRowOptimizeLimit <em>Row Optimize Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Optimize Limit</em>'.
	 * @see org.asup.db.syntax.QExtendedQueryExpressionBody#getRowOptimizeLimit()
	 * @see #getExtendedQueryExpressionBody()
	 * @generated
	 */
	EAttribute getExtendedQueryExpressionBody_RowOptimizeLimit();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QExtendedQuerySelect <em>Extended Query Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Query Select</em>'.
	 * @see org.asup.db.syntax.QExtendedQuerySelect
	 * @generated
	 */
	EClass getExtendedQuerySelect();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QQueryConverter <em>Query Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Converter</em>'.
	 * @see org.asup.db.syntax.QQueryConverter
	 * @generated
	 */
	EClass getQueryConverter();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QQueryConverterRegistry <em>Query Converter Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Converter Registry</em>'.
	 * @see org.asup.db.syntax.QQueryConverterRegistry
	 * @generated
	 */
	EClass getQueryConverterRegistry();

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
	 * Returns the meta object for class '{@link org.asup.db.syntax.QSyntaxBuilder <em>Syntax Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Builder</em>'.
	 * @see org.asup.db.syntax.QSyntaxBuilder
	 * @generated
	 */
	EClass getSyntaxBuilder();

	/**
	 * Returns the meta object for class '{@link org.asup.db.syntax.QSyntaxBuilderRegistry <em>Syntax Builder Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Builder Registry</em>'.
	 * @see org.asup.db.syntax.QSyntaxBuilderRegistry
	 * @generated
	 */
	EClass getSyntaxBuilderRegistry();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.ExtendedQueryExpressionBodyImpl <em>Extended Query Expression Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.ExtendedQueryExpressionBodyImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getExtendedQueryExpressionBody()
		 * @generated
		 */
		EClass EXTENDED_QUERY_EXPRESSION_BODY = eINSTANCE.getExtendedQueryExpressionBody();

		/**
		 * The meta object literal for the '<em><b>Row Optimize Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT = eINSTANCE.getExtendedQueryExpressionBody_RowOptimizeLimit();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.ExtendedQuerySelectImpl <em>Extended Query Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.ExtendedQuerySelectImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getExtendedQuerySelect()
		 * @generated
		 */
		EClass EXTENDED_QUERY_SELECT = eINSTANCE.getExtendedQuerySelect();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.QueryConverterImpl <em>Query Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.QueryConverterImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryConverter()
		 * @generated
		 */
		EClass QUERY_CONVERTER = eINSTANCE.getQueryConverter();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.QueryConverterRegistryImpl <em>Query Converter Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.QueryConverterRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryConverterRegistry()
		 * @generated
		 */
		EClass QUERY_CONVERTER_REGISTRY = eINSTANCE.getQueryConverterRegistry();

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
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.SyntaxBuilderImpl <em>Syntax Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.SyntaxBuilderImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSyntaxBuilder()
		 * @generated
		 */
		EClass SYNTAX_BUILDER = eINSTANCE.getSyntaxBuilder();

		/**
		 * The meta object literal for the '{@link org.asup.db.syntax.impl.SyntaxBuilderRegistryImpl <em>Syntax Builder Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.syntax.impl.SyntaxBuilderRegistryImpl
		 * @see org.asup.db.syntax.impl.DatabaseSyntaxPackageImpl#getSyntaxBuilderRegistry()
		 * @generated
		 */
		EClass SYNTAX_BUILDER_REGISTRY = eINSTANCE.getSyntaxBuilderRegistry();

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
