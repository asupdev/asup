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

		return DatabaseDefinitionRegistryImpl.getInstance().getDefinition("As.UP", "V0.5");
	}

}
