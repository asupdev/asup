package org.asup.db.syntax.db2;

import org.asup.db.core.*;
import org.asup.db.syntax.base.BaseDefinitionWriterImpl;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl;

public class DB2DefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public DB2DefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}


	@Override
	public String dropSchema(Schema schema) {
		return dropSchema(schema, false);
	}

	@Override
	public String createTable(Schema schema, String name, QTableDef table) {

		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		String pkey_name = null;

		boolean first = true;
		for (QTableColumnDef field : table.getColumns()) {
			if (!first)
				result.append(", ");
			else
				first = false;

			switch (field.getDataType()) {
			case IDENTITY:
				result.append(getNameInSQLFormat(field) + " INTEGER NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)");
				pkey_name = getNameInSQLFormat(field);
				break;
			case CHARACTER:
				if (field.getLength() <= 254)
					result.append(getNameInSQLFormat(field) + " CHAR(" + field.getLength() + ")");
				else
					result.append(getNameInSQLFormat(field) + " VARCHAR(" + field.getLength() + ")");
				break;
			case VARCHAR:
				result.append(getNameInSQLFormat(field) + " VARCHAR(" + field.getLength() + ")");
				break;
			case DECIMAL:
				if (field.getLength() > 31)
					result.append(getNameInSQLFormat(field) + " DECFLOAT(34)");
				else if (field.getScale() != 0)
					result.append(getNameInSQLFormat(field) + " DECIMAL(" + field.getLength() + ", " + field.getScale() + ")");
				else
					result.append(getNameInSQLFormat(field) + " DECIMAL(" + field.getLength() + ", 0)");
				break;
			case TEXT:
				result.append(getNameInSQLFormat(field) + " BLOB");
				break;
			default:
				result.append(getNameInSQLFormat(field) + " " + field.getDataType().getName().toUpperCase());
			}
		}
		if (pkey_name != null)
			result.append(", PRIMARY KEY (" + pkey_name + ")");
		result.append(")");
		return result.toString();
	}

	public String createIndex(Table table, String indexName, QIndexDef index) {
		StringBuffer result = new StringBuffer("CREATE ");
		if (index.isUnique())
			result.append("UNIQUE ");
		
		
		result.append("INDEX " + getQualifiedNameInSQLFormat(asTable(table.getSchema().getName(), indexName)));
		result.append(" ON " + getQualifiedNameInSQLFormat(table) + " (");

		boolean first = true;

		for (QIndexColumnDef column : index.getColumns()) {

			if (!first)
				result.append(", ");

			result.append(getNameInSQLFormat(column));

			if (column.getOrdering() == OrderingType.DESCEND)
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}	
	

	// TODO ?!?
	private Table asTable(final String schemaName, final String indexName) {
		return new TableImpl() {
			public Schema getSchema() {
				return new SchemaImpl() {
					public String getName() {
						return schemaName;
					}
				};
			}
			public String getName() {
				return indexName;
			}
		};
	}


	@Override
	public String dropIndex(Index index) {
		return "DROP INDEX " + getQualifiedNameInSQLFormat(asTable(index.getSchema().getName(), index.getName()));
	}

	@Override
	public String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty) {

		if (!ignoreFailOnNonEmpty)
			return "DROP SCHEMA " + getNameInSQLFormat(schema) + " RESTRICT";
		else {
			String sql = "begin " + "  declare l_errschema varchar(128) default 'ERRORSCHEMA';" + "  declare l_errtab varchar(128) default 'ERRORTABLE';" + "  CALL SYSPROC.ADMIN_DROP_SCHEMA('"
					+ schema.getName() + "', NULL, l_errschema, l_errtab);" + " end";

			return sql;
		}
	}

}