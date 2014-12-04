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
 * A representation of the model object '<em><b>Definition Parser Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionParserRegistry()
 * @model abstract="true"
 * @generated
 */
public interface QDefinitionParserRegistry extends QPluginRegistry<QDefinitionParser> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionConfigRequired="true"
	 * @generated
	 */
	QDefinitionParser lookup(QConnectionConfig connectionConfig);

} // QDefinitionParserRegistry
