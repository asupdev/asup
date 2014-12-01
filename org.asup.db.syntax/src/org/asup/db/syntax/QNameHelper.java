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
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;

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
	 * @model queryRequired="true"
	 * @generated
	 */
	void resolveContainers(QueryStatement query);

} // QNameHelper
