package org.eclipse.datatools.enablement.asup;

import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;
import org.eclipse.datatools.connectivity.sqm.core.definition.IDatabaseRecognizer;
import org.eclipse.datatools.connectivity.sqm.internal.core.definition.DatabaseDefinitionRegistryImpl;

public class ASUPDatabaseRecognizer implements IDatabaseRecognizer {

	public ASUPDatabaseRecognizer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DatabaseDefinition recognize(Connection connection) {

		return DatabaseDefinitionRegistryImpl.getInstance().getDefinition("AsUP", "053");
	}

}
