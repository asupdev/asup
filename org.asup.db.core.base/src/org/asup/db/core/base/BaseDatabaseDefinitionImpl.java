package org.asup.db.core.base;

import org.asup.db.core.QDatabaseDefinition;
import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;

public class BaseDatabaseDefinitionImpl implements QDatabaseDefinition {
	
	private DatabaseDefinition dtpDatabaseDefinition;
	
	public BaseDatabaseDefinitionImpl(DatabaseDefinition dtpDatabaseDefinition) {
		this.dtpDatabaseDefinition = dtpDatabaseDefinition;
	}

	@Override
	public boolean supportsIdentityColumns() {
		return this.dtpDatabaseDefinition.supportsIdentityColumns();
	}
	

}
