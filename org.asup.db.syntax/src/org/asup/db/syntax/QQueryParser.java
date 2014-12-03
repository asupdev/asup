/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import java.io.InputStream;
import java.sql.SQLException;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserException;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserInternalException;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getQueryParser()
 * @model abstract="true"
 * @generated
 */
public interface QQueryParser extends QStatementParser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.syntax.SQLQueryParseResult" exceptions="org.asup.db.core.DatabaseException" streamDataType="org.asup.fw.java.JavaInputStream" streamRequired="true"
	 * @generated
	 */
	SQLQueryParseResult parseQuery(InputStream stream) throws SQLParserException, SQLParserInternalException, SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.db.syntax.SQLQueryParseResult" exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	SQLQueryParseResult parseQuery(String sql) throws SQLException;

} // QueryParser
