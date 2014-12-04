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

import org.asup.db.core.QDatabaseDefinition;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;

public class BaseDatabaseDefinitionImpl implements QDatabaseDefinition {
	
	private DatabaseDefinition dtpDatabaseDefinition;
	
	public BaseDatabaseDefinitionImpl(DatabaseDefinition dtpDatabaseDefinition) {
		this.dtpDatabaseDefinition = dtpDatabaseDefinition;
	}

	@Override
	public boolean supportsRelativeRecordNumber() {
		return this.dtpDatabaseDefinition.supportsIdentityColumns();
	}

}
