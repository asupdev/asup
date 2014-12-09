/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.db.core.base;

import org.asup.db.core.QDatabaseContainer;
import org.asup.db.core.QDatabaseManager;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;

public class BaseDatabaseActivatorHook extends ServiceImpl {


	@LevelStarted
	public void init(QDatabaseManager databaseManager) {
		
		QDatabaseContainer databaseContainer = (QDatabaseContainer) getConfig();
		
		databaseManager.start(databaseContainer);
	}
}
