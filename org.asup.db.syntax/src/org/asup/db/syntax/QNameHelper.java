/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.db.core.QConnection;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getNameHelper()
 * @model abstract="true" superTypes="org.asup.fw.core.Plugin org.asup.fw.core.Service org.asup.db.syntax.SQLObjectNameHelper"
 * @generated
 */
public interface QNameHelper extends QPlugin, QService, ISQLObjectNameHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" queryRequired="true"
	 * @generated
	 */
	QueryStatement resolveAlias(QueryStatement query);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" columnRequired="true"
	 * @generated
	 */
	String getAliasForColumn(Table table, String column);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	Table getAliasForTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexRequired="true"
	 * @generated
	 */
	Index getIndex(QConnection connection, String index);

} // QNameHelper
