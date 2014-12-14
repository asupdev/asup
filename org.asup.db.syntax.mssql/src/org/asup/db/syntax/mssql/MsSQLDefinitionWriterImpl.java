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
package org.asup.db.syntax.mssql;

import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.syntax.base.BaseDefinitionWriterImpl;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class MsSQLDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public MsSQLDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String createTable(Schema schema, String name,  QTableDef table) {
		
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		boolean first = true;
		for (QTableColumnDef column : table.getColumns()) {

			if (!first)
				result.append(", ");

			String columnName = getNameInSQLFormat(column);

			switch (column.getDataType()) {
			case IDENTITY:
				result.append(columnName + " INT PRIMARY KEY IDENTITY");
				break;
			case CHARACTER:
				result.append(columnName + " CHAR(" + column.getLength() + ")");
				break;
			case VARCHAR:
				if (column.getLength() > 8000)
					result.append(columnName + " TEXT");
				else
					result.append(columnName + " VARCHAR(" + column.getLength() + ")");
				break;
			case DECIMAL:
				if (column.getScale() != 0)
					result.append(columnName + " DECIMAL(" + column.getLength() + ", " + column.getScale() + ")");
				else
					result.append(columnName + " DECIMAL(" + column.getLength() + ",  0)");
				break;
			case BLOB:
				result.append(columnName + " TEXT");
				break;
			case TEXT:
				result.append(columnName + " TEXT");
				break;
			default:
				result.append(columnName + " " + column.getDataType().getName().toUpperCase());
			}
			first = false;
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public String deleteData(Table table) {
		return "TRUNCATE TABLE " + getQualifiedNameInSQLFormat(table);
	}
}
