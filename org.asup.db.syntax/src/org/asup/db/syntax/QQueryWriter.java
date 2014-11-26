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
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getQueryWriter()
 * @model abstract="true"
 * @generated
 */
public interface QQueryWriter extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model queryRequired="true"
	 * @generated
	 */
	String convertQuery(QueryStatement query);

} // QueryConverter
