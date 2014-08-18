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
import org.osgi.service.jdbc.DataSourceFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionFactory()
 * @model abstract="true" superTypes="org.asup.fw.core.Plugin org.asup.fw.core.Service org.asup.db.core.DataSourceFactory"
 * @generated
 */
public interface QConnectionFactory extends QPlugin, QService, DataSourceFactory {
} // ConnectionFactory
