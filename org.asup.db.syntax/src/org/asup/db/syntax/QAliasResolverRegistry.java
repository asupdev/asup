/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.db.core.QConnectionConfig;
import org.asup.fw.core.QPluginRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QAlias Resolver Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getAliasResolverRegistry()
 * @model abstract="true"
 * @generated
 */
public interface QAliasResolverRegistry extends QPluginRegistry<QAliasResolver> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionConfigRequired="true"
	 * @generated
	 */
	QAliasResolver lookup(QConnectionConfig connectionConfig);
} // QAliasResolverRegistry
