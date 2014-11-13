package org.asup.db.syntax.db2;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.*;
import org.asup.db.syntax.*;
import org.asup.db.syntax.base.BaseSchemaAliasResolverImpl;
import org.asup.db.syntax.db2.quoting.*;
import org.asup.db.syntax.impl.SyntaxBuilderImpl;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class DB2SyntaxBuilderImpl extends SyntaxBuilderImpl {
	
	@Inject
	private QQueryParserRegistry queryParserRegistry;
	private QQueryConverter queryConverter;
	private final Quoter quoter = new Quoter("\"");

	
	@PostConstruct
	private void init() {
		this.queryConverter = new DB2QueryConverterImpl();
	}
	
	@Override
	public String createSchema(QSchema schema) {
		return "CREATE SCHEMA "+ quoter.quote(schema.getName());
	}
	
	@Override
	public String dropSchema(QSchema schema) {
		return "DROP SCHEMA " + quoter.quote(schema.getName()) + " RESTRICT";		
	}


	public String createTable(QTable table) {
		return db2CreateTable(new QuotedTable(table, quoter));
	}

	private String db2CreateTable(QTable table) {
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(table.getFullName()+" (");

		String pkey_name = null;
		
		boolean first = true;
		for(QColumn field: table.getColumns()) {
			if(!first) {
				result.append(", ");
			} else {
				first = false;
			}
			
			switch (field.getDataType()) {
				case IDENTITY:
					result.append(field.getName()+" INTEGER NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)");					
					pkey_name = field.getName();
					break;
				case CHARACTER:
					if (field.getPrecision() <= 254) {
						result.append(field.getName()+" CHAR("+field.getPrecision()+")");
					} else {
						result.append(field.getName()+" VARCHAR("+field.getPrecision()+")");
					}
					break;
				case VARCHAR:
					result.append(field.getName()+" VARCHAR("+field.getPrecision()+")");
					break;
				case DECIMAL:
					if (field.getPrecision() > 31) {
						result.append(field.getName()+" DECFLOAT(34)");
					} 
					else if(field.getScale() != 0)
						result.append(field.getName()+" DECIMAL("+field.getPrecision()+", "+field.getScale()+")");
					else
						result.append(field.getName()+" DECIMAL("+field.getPrecision()+",  0)");
					break;
				case TEXT:
					result.append(field.getName()+" BLOB");
					break;
				default:
					result.append(field.getName()+" "+field.getDataType().getName() .toUpperCase());
			}			
		}
		if(pkey_name != null) {
			result.append(", PRIMARY KEY ("+pkey_name+")");
		}
		result.append(")");
		return result.toString();
	}
	@Override
	public String dropTable(QTable table) {
		return "DROP TABLE " + quoter.quoteFullName(table.getSchema(),  table.getName()) ;		
	}

	@Override
	public String createIndex(QIndex index) {
		return db2CreateIndex(new QuotedIndex(index, quoter));
	}

	private String db2CreateIndex(QuotedIndex index) {
		StringBuffer result = new StringBuffer("CREATE ");
		if(index.isUnique()) {
			result.append("UNIQUE ");			
		}
		result.append("INDEX "+index.getFullName());
		result.append(" ON "+index.getSchema().getName()+"."+index.getObject()+" (");

		boolean first = true;
		for(QIndexColumn field: index.getColumns()) {			
			if(!first) {
				result.append(", ");
			} else {
				first = false;
			}
			
			result.append(field.getName());
			
			if(field.getOrdering().equals(OrderingType.DESCEND)) { 
				result.append(" DESC");
			}
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public String dropIndex(QIndex index) {
		return "DROP INDEX " + quoter.quoteFullName(index.getSchema(), index.getName());
	}
	
	@Override
	public String deleteData(QTable table) {
		return super.deleteData(new QuotedTable(table, quoter));
	}

	@Override
	public String selectData(QTable table) {
		return super.selectData(new QuotedTable(table, quoter));
	}

	@Override
	public String insertData(QTable table, boolean prepare) {
		return super.insertData(new QuotedTable(table, quoter), prepare);
	}

	@Override
	public String dropView(QView view) {
		return "DROP VIEW " + quoter.quoteFullName(view.getSchema(), view.getName());
	}

	@Override
	public String createView(QView view) {
		String command = view.getCreationCommand();
		
		int i = command.toUpperCase().indexOf("  AS\n  SELECT");
		if(i > 0) {
			String commandCreate = command.substring(0, i);			
			String commandSelect = command.substring(i + 4);
			
			try {
				commandCreate = convertCreateCommand(view, commandCreate);
				commandSelect = convertSelectCommand(view.getCreationPlugin(), view.getSchema().getName(), commandSelect);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			
			command = commandCreate + " AS " + commandSelect;
		}

		return command;
	}
	
	private String convertCreateCommand(QView view, String command) throws SQLException {
		return command.replaceFirst(view.getName(), 
							   	    quoter.quoteFullName(view.getSchema(), view.getName()))
					  .replaceFirst("\\(" , "(QMUKEY,");
	}
	
	
	private String convertSelectCommand(String creationPlugin, String schemaName, String command) throws SQLException {
		String commandWork = null;
		try {
			QQueryParser queryParser = queryParserRegistry.lookup(creationPlugin);
			
			commandWork = command.replaceFirst("SELECT", "SELECT QMUKEY,");
			
			SQLQueryParseResult query = queryParser.parseQuery(new ByteArrayInputStream(commandWork.getBytes()));
			
			QAliasResolver aliasResolver = new BaseSchemaAliasResolverImpl(schemaName);
			query.setQueryStatement(aliasResolver.resolveAlias(query.getQueryStatement()));
			
			commandWork = queryConverter.convertQuery(query);			
		} catch (Exception e) {
			throw new SQLException(e);
		} 
				
		return commandWork;
	}
}
