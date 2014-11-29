package org.eclipse.datatools.enablement.asup;

import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.definition.DatabaseDefinition;
import org.eclipse.datatools.connectivity.sqm.core.definition.IDatabaseRecognizer;

public class DTPDatabaseRecognizer implements IDatabaseRecognizer {

	public DTPDatabaseRecognizer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DatabaseDefinition recognize(Connection connection) {

		System.out.println(connection);
		return null;
	}

}
