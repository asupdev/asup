/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getSyntaxBuilder()
 * @model abstract="true" superTypes="org.asup.fw.core.Plugin org.asup.fw.core.Service org.asup.db.core.DatabaseNameHelper"
 * @generated
 */
public interface QSyntaxBuilder extends QPlugin, QService, ISQLObjectNameHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true"
	 * @generated
	 */
	String dropSchema(Schema schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String dropTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" viewRequired="true"
	 * @generated
	 */
	String dropView(ViewTable view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true"
	 * @generated
	 */
	String dropIndex(Index index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String deleteData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String selectData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String insertData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true"
	 * @generated
	 */
	String createSchema(QSchemaDef schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" tableRequired="true"
	 * @generated
	 */
	String createTable(Schema schema, QTableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" viewRequired="true"
	 * @generated
	 */
	String createView(Schema schema, QViewDef view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" indexRequired="true"
	 * @generated
	 */
	String createIndex(Table table, QIndexDef index);

} // SyntaxBuilder
