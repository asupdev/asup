/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionFactory()
 * @model abstract="true"
 * @generated
 */
public interface QConnectionFactory extends QPlugin, QService {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model connectionConfigRequired="true"
	 * @generated
	 */
	QConnection createDatabaseConnection(QConnectionConfig connectionConfig);
} // ConnectionFactory
