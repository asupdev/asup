/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.util.List;



public class QDatabaseCoreHelper {
	public static QTable findTableByName(List<QSchema> schemas, String tableName) {		
		for(QSchema schema: schemas) {
			for(QTable table: schema.getTables()) {
				if(table.getName().equals(tableName))
					return table;			
			}
		}
		return null;
	}
}
