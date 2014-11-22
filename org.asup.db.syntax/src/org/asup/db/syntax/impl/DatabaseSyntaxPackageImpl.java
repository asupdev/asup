/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.impl;

import org.asup.db.core.QDatabaseCorePackage;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QAliasResolverRegistry;
import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.QDatabaseSyntaxPackage;
import org.asup.db.syntax.QExtendedQueryExpressionBody;
import org.asup.db.syntax.QExtendedQuerySelect;
import org.asup.db.syntax.QQueryConverter;
import org.asup.db.syntax.QQueryConverterRegistry;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.db.syntax.QSyntaxBuilder;
import org.asup.db.syntax.QSyntaxBuilderRegistry;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxPackageImpl extends EPackageImpl implements QDatabaseSyntaxPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasResolverEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasResolverRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedQueryExpressionBodyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedQuerySelectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryConverterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryConverterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParserEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxBuilderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxBuilderRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queryParseResultEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseSyntaxPackageImpl() {
		super(eNS_URI, QDatabaseSyntaxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDatabaseSyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseSyntaxPackage init() {
		if (isInited) return (QDatabaseSyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI);

		// Obtain or create and register package
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseSyntaxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatabaseSyntaxPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseSyntaxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseSyntaxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseSyntaxPackage.eNS_URI, theDatabaseSyntaxPackage);
		return theDatabaseSyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasResolver() {
		return aliasResolverEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasResolverRegistry() {
		return aliasResolverRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedQueryExpressionBody() {
		return extendedQueryExpressionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedQueryExpressionBody_RowOptimizeLimit() {
		return (EAttribute)extendedQueryExpressionBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedQuerySelect() {
		return extendedQuerySelectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryConverter() {
		return queryConverterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryConverterRegistry() {
		return queryConverterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParser() {
		return queryParserEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParserRegistry() {
		return queryParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxBuilder() {
		return syntaxBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxBuilderRegistry() {
		return syntaxBuilderRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQueryParseResult() {
		return queryParseResultEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxFactory getDatabaseSyntaxFactory() {
		return (QDatabaseSyntaxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aliasResolverEClass = createEClass(ALIAS_RESOLVER);

		aliasResolverRegistryEClass = createEClass(ALIAS_RESOLVER_REGISTRY);

		extendedQueryExpressionBodyEClass = createEClass(EXTENDED_QUERY_EXPRESSION_BODY);
		createEAttribute(extendedQueryExpressionBodyEClass, EXTENDED_QUERY_EXPRESSION_BODY__ROW_OPTIMIZE_LIMIT);

		extendedQuerySelectEClass = createEClass(EXTENDED_QUERY_SELECT);

		queryConverterEClass = createEClass(QUERY_CONVERTER);

		queryConverterRegistryEClass = createEClass(QUERY_CONVERTER_REGISTRY);

		queryParserEClass = createEClass(QUERY_PARSER);

		queryParserRegistryEClass = createEClass(QUERY_PARSER_REGISTRY);

		syntaxBuilderEClass = createEClass(SYNTAX_BUILDER);

		syntaxBuilderRegistryEClass = createEClass(SYNTAX_BUILDER_REGISTRY);

		// Create data types
		queryParseResultEDataType = createEDataType(QUERY_PARSE_RESULT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);
		SQLQueryModelPackage theSQLQueryModelPackage = (SQLQueryModelPackage)EPackage.Registry.INSTANCE.getEPackage(SQLQueryModelPackage.eNS_URI);
		SQLTablesPackage theSQLTablesPackage = (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		QDatabaseCorePackage theDatabaseCorePackage = (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aliasResolverEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		aliasResolverEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		EGenericType g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getAliasResolver());
		g1.getETypeArguments().add(g2);
		aliasResolverRegistryEClass.getEGenericSuperTypes().add(g1);
		extendedQueryExpressionBodyEClass.getESuperTypes().add(theSQLQueryModelPackage.getQueryExpressionBody());
		extendedQuerySelectEClass.getESuperTypes().add(this.getExtendedQueryExpressionBody());
		extendedQuerySelectEClass.getESuperTypes().add(theSQLQueryModelPackage.getQuerySelect());
		queryConverterEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		queryConverterEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		g2 = createEGenericType(this.getQueryConverter());
		g1.getETypeArguments().add(g2);
		queryConverterRegistryEClass.getEGenericSuperTypes().add(g1);
		queryParserEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		queryParserEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		g2 = createEGenericType(this.getQueryParser());
		g1.getETypeArguments().add(g2);
		queryParserRegistryEClass.getEGenericSuperTypes().add(g1);
		syntaxBuilderEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		syntaxBuilderEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		syntaxBuilderEClass.getESuperTypes().add(theDatabaseCorePackage.getDatabaseNameHelper());
		g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		g2 = createEGenericType(this.getSyntaxBuilder());
		g1.getETypeArguments().add(g2);
		syntaxBuilderRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(aliasResolverEClass, QAliasResolver.class, "AliasResolver", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(aliasResolverEClass, theSQLQueryModelPackage.getQueryStatement(), "resolveAlias", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLQueryModelPackage.getQueryStatement(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(aliasResolverEClass, ecorePackage.getEString(), "getAliasForColumn", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "column", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(aliasResolverEClass, theSQLTablesPackage.getTable(), "getAliasForTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(aliasResolverEClass, theSQLConstraintsPackage.getIndex(), "getIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aliasResolverRegistryEClass, QAliasResolverRegistry.class, "AliasResolverRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(aliasResolverRegistryEClass, this.getAliasResolver(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extendedQueryExpressionBodyEClass, QExtendedQueryExpressionBody.class, "ExtendedQueryExpressionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedQueryExpressionBody_RowOptimizeLimit(), theEcorePackage.getEInt(), "rowOptimizeLimit", null, 0, 1, QExtendedQueryExpressionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedQuerySelectEClass, QExtendedQuerySelect.class, "ExtendedQuerySelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryConverterEClass, QQueryConverter.class, "QueryConverter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryConverterEClass, ecorePackage.getEString(), "convertQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQueryParseResult(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryConverterRegistryEClass, QQueryConverterRegistry.class, "QueryConverterRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryConverterRegistryEClass, this.getQueryConverter(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryParserEClass, QQueryParser.class, "QueryParser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryParserEClass, this.getQueryParseResult(), "parseQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		op = addEOperation(queryParserEClass, this.getQueryParseResult(), "parseQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		initEClass(queryParserRegistryEClass, QQueryParserRegistry.class, "QueryParserRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryParserRegistryEClass, this.getQueryParser(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(syntaxBuilderEClass, QSyntaxBuilder.class, "SyntaxBuilder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "createSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getSchemaDef(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "createTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "createView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getViewDef(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "createIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getIndexDef(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "dropSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "dropTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "dropView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "dropIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "deleteData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "insertData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(syntaxBuilderEClass, ecorePackage.getEString(), "selectData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(syntaxBuilderRegistryEClass, QSyntaxBuilderRegistry.class, "SyntaxBuilderRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(syntaxBuilderRegistryEClass, this.getSyntaxBuilder(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(queryParseResultEDataType, SQLQueryParseResult.class, "QueryParseResult", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // DBSyntaxPackageImpl
