package org.asup.db.syntax.base;

import java.util.List;

import org.asup.db.core.OrderingType;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QSchemaDef;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.syntax.impl.DefinitionWriterImpl;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

public abstract class BaseDefinitionWriterImpl extends DefinitionWriterImpl {

	protected ISQLObjectNameHelper sqlObjectNameHelper;

	protected BaseDefinitionWriterImpl(ISQLObjectNameHelper sqlObjectNameHelper) {
		this.sqlObjectNameHelper = sqlObjectNameHelper;
	}
	
	protected void setSQLObjectNameHelper(ISQLObjectNameHelper sqlObjectNameHelper) {
		this.sqlObjectNameHelper = sqlObjectNameHelper;
	} 
	
	public String createSchema(String name, QSchemaDef schema) {
		return "CREATE SCHEMA " + getNameInSQLFormat(name);
	}
	
	public String createTable(Schema schema, String name, QTableDef table) {
		
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema)+"."+getNameInSQLFormat(name) + " (");

		boolean first = true;
		for (QTableColumnDef column : table.getColumns()) {

			if (!first)
				result.append(", ");

			switch (column.getDataType()) {
				case IDENTITY:
					result.append(getNameInSQLFormat(column) + " INT NOT NULL AUTO_INCREMENT");
					break;
				case CHARACTER:
					result.append(getNameInSQLFormat(column) + " CHAR(" + column.getLength() + ")");
					break;
				case VARCHAR:
					result.append(getNameInSQLFormat(column) + " VARCHAR(" + column.getLength() + ")");
					break;
				case DECIMAL:
					if (column.getScale() != 0)
						result.append(getNameInSQLFormat(column) + " DECIMAL(" + column.getLength() + ", " + column.getScale() + ")");
					else
						result.append(getNameInSQLFormat(column) + " DECIMAL(" + column.getLength() + ",  0)");
					break;
				case TEXT:
					result.append(getNameInSQLFormat(column) + " BLOB");
					break;
				default:
					result.append(getNameInSQLFormat(column) + " " + column.getDataType().getName().toUpperCase());
			}
			first = false;
		}

		result.append(")");
		return result.toString();
	}
	
	public String createView(Schema schema, String name, QViewDef view) {
		
		StringBuffer result = new StringBuffer("CREATE VIEW ");

		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name));
		result.append(" (");
		
		List<QTableColumnDef> columns = view.getColumns(); 
		for(int i=1; i<=columns.size(); i++) {
			result.append(getNameInSQLFormat(columns.get(i-1)));
			if(i<columns.size())
				result.append(", ");
		}
		
		result.append(")");

		result.append(" AS ");

		result.append(view.getQuerySelect());
		
		return result.toString();
	}
	
	public String createIndex(Table table, String name, QIndexDef index) {

		StringBuffer result = new StringBuffer("CREATE ");
		if (index.isUnique())
			result.append("UNIQUE ");
		
		// TODO
		if (index.isClustered())
			result.append("");
//			result.append("CLUSTERED ");
		
		result.append("INDEX " + getNameInSQLFormat(name));
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

	public String dropSchema(Schema schema) {
		return "DROP SCHEMA " + getNameInSQLFormat(schema);
	}
	
	public String dropTable(Table table) {
		return "DROP TABLE " + getQualifiedNameInSQLFormat(table);
	}
	
	public String dropView(ViewTable view) {
		return "DROP VIEW " + getQualifiedNameInSQLFormat(view);
	}
	
	public String dropIndex(Index index) {
		return "DROP INDEX " + getNameInSQLFormat(index) + " ON TABLE " + getQualifiedNameInSQLFormat(index.getTable());
	}
	
	public String deleteData(Table table) {
		return "DELETE FROM " + getQualifiedNameInSQLFormat(table);
	}
	
	public String selectData(Table table) {
		return "SELECT * FROM "+getQualifiedNameInSQLFormat(table);
	}
	
	@SuppressWarnings("unchecked")
	public String insertData(Table table) {
		StringBuffer result = new StringBuffer("INSERT INTO " + getQualifiedNameInSQLFormat(table));
		String tkn1 = "";
		String tkn2 = "";
		boolean first = true;
		for (Column column : (List<Column>)table.getColumns()) {

			if (column.getIdentitySpecifier() != null)
				continue;

			if (!first) {
				tkn1 += ", ";
				tkn2 += ", ";
			}

			tkn1 += getNameInSQLFormat(column);
			tkn2 += "?";
			first = false;
		}
		result.append("(" + tkn1 + ") VALUES(" + tkn2 + ")");
		
		return result.toString();

	}
	

	protected String getNameInSQLFormat(String schema, QTableColumnDef table) {
		return getNameInSQLFormat(schema)+"."+getNameInSQLFormat(table);
	}
	
	protected String getNameInSQLFormat(Schema schema) {
		return getIdentifierQuoteString()+schema.getName()+getIdentifierQuoteString();
	}
	
	protected String getNameInSQLFormat(String name) {
		return getIdentifierQuoteString()+name+getIdentifierQuoteString();
	}
			
	protected String getNameInSQLFormat(Index index) {
		return getIdentifierQuoteString()+index.getName()+getIdentifierQuoteString();
	}
		
	protected String getNameInSQLFormat(QTableColumnDef column) {
		return getIdentifierQuoteString()+column.getName()+getIdentifierQuoteString();
	}
		
	protected String getNameInSQLFormat(QIndexColumnDef column) {
		return getIdentifierQuoteString()+column.getName()+getIdentifierQuoteString();
	}
	
	protected String getNameInSQLFormat(Column column) {
		return sqlObjectNameHelper.getNameInSQLFormat(column);
	}

	protected String getNameInSQLFormat(Table table) {
		return sqlObjectNameHelper.getNameInSQLFormat(table);
	}

	protected String getQualifiedNameInSQLFormat(Column column) {
		return sqlObjectNameHelper.getQualifiedNameInSQLFormat(column);
	}

	protected String getQualifiedNameInSQLFormat(Table table) {
		return sqlObjectNameHelper.getQualifiedNameInSQLFormat(table);
	}
	
	protected String getIdentifierQuoteString() {
		return sqlObjectNameHelper.getIdentifierQuoteString();
	}
}
