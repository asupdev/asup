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
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionParser()
 * @model abstract="true"
 * @generated
 */
public interface QDefinitionParser extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" streamDataType="org.asup.fw.java.JavaInputStream" streamRequired="true"
	 * @generated
	 */
	QDefinitionParserResult parseDefinition(InputStream stream) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	QDefinitionParserResult parseDefinition(String sql) throws SQLException;

} // QDefinitionParser
