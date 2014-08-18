/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getQueryConverter()
 * @model abstract="true"
 * @generated
 */
public interface QQueryConverter extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model queryDataType="org.asup.db.syntax.QueryParseResult" queryRequired="true"
	 * @generated
	 */
	String convertQuery(SQLQueryParseResult query);

} // QueryConverter
