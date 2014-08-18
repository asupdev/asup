/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Giuliano Giancristoforo - Initial API and implementation 
 */
package org.asup.db.syntax.mssql;

import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public class MsSQLNameHelper extends SQLObjectNameHelper {



	private static final String QUALIFIED_FIELDS_SEPARATOR = ".";
	private static final String OPEN_FIELD_IDENTIFIER = "[";
	private static final String CLOSE_FIELD_IDENTIFIER = "]";

	public MsSQLNameHelper() {
		super();

		// Set the delimiter for table names
		setIdentifierQuoteString("");
	}

	public String getQualifiedNameInSQLFormat(Column column) {
        String qualifiedSQLName = null;

        if (column != null) {
            String quoteString = getIdentifierQuoteString();

            /* Get the object name and delimit it if necessary. */
            String name = column.getName();
            String sqlFormatName = convertCatalogIdentifierToSQLFormat(name, quoteString);
            qualifiedSQLName = OPEN_FIELD_IDENTIFIER + sqlFormatName + CLOSE_FIELD_IDENTIFIER;

            /* Get and add the table name. */
            String tableName = null;
            Table table = column.getTable();
            if (table != null) {
                tableName = table.getName();
                String sqlFormatTableName = convertCatalogIdentifierToSQLFormat(tableName, quoteString);
                qualifiedSQLName = OPEN_FIELD_IDENTIFIER + sqlFormatTableName + CLOSE_FIELD_IDENTIFIER + QUALIFIED_FIELDS_SEPARATOR + OPEN_FIELD_IDENTIFIER + sqlFormatName + CLOSE_FIELD_IDENTIFIER;
            }
        }

        return qualifiedSQLName;
    }

	public String getQualifiedNameInSQLFormat(Table table) {
        String qualifiedSQLName = null;

        if (table != null) {
            String quoteString = getIdentifierQuoteString();

            /* Get the table name and delimit it if necessary. */
            String tableName = table.getName();
            String sqlFormatTableName = convertCatalogIdentifierToSQLFormat(tableName, quoteString);
            qualifiedSQLName = OPEN_FIELD_IDENTIFIER + sqlFormatTableName + CLOSE_FIELD_IDENTIFIER;

            /* Get and add the schema name. */
            String schemaName = null;
            Schema schema = table.getSchema();
            if (schema != null) {
                schemaName = schema.getName();
                String sqlFormatSchemaName = convertCatalogIdentifierToSQLFormat(schemaName, quoteString);
                qualifiedSQLName = OPEN_FIELD_IDENTIFIER + sqlFormatSchemaName + CLOSE_FIELD_IDENTIFIER + QUALIFIED_FIELDS_SEPARATOR + OPEN_FIELD_IDENTIFIER + sqlFormatTableName + CLOSE_FIELD_IDENTIFIER;
            }
        }

        return qualifiedSQLName;
    }

	public String getNameInSQLFormat(Table table) {
        String sqlFormatName = null;

        if (table != null) {
            String quoteString = getIdentifierQuoteString();

            /* Get the object name and delimit it if necessary. */
            String name = table.getName();
            sqlFormatName = convertCatalogIdentifierToSQLFormat(name, quoteString);
        }

        return OPEN_FIELD_IDENTIFIER + sqlFormatName + CLOSE_FIELD_IDENTIFIER;
    }

}
