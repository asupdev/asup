package org.asup.db.syntax.db2;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.OrderingType;
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QQueryConverter;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.db.syntax.base.BaseSchemaAliasResolverImpl;
import org.asup.db.syntax.impl.SyntaxBuilderImpl;
import org.asup.dk.parser.InvalidExpressionException;
import org.asup.dk.parser.Parser;
import org.asup.dk.parser.Token;
import org.asup.dk.parser.TokenType;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class DB2SyntaxBuilderImpl extends SyntaxBuilderImpl {
	
	@Inject
	private QQueryParserRegistry queryParserRegistry;

	private final Quoter quoter = new Quoter("\"");

	private QQueryConverter queryConverter;
	
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


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createTable(QTable table) {
		return db2CreateTable(new QuotedTable(table, quoter));
	}

	private String db2CreateTable(QTable table) {
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(table.getFullName()+" (");

		boolean pkey = false;
		String pkey_name = null;
		
		boolean first = true;
		for(QTableColumn field: table.getColumns()) {

			if(!first)
				result.append(", ");
			
			switch (field.getDataType()) {
				case IDENTITY:
					result.append(field.getName()+" INTEGER NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)");					
					pkey = true;
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
					if(field.getScale() != 0)
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
			first = false;
		}
		if(pkey)
			result.append(", PRIMARY KEY ("+pkey_name+")");
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
			
			if(!first)
				result.append(", ");

			result.append(field.getName());
			
			if(field.getOrdering() == OrderingType.DESCEND) 
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public String dropIndex(QIndex index) {
		return "DROP INDEX " + quoter.quoteFullName(index.getSchema(), index.getName());
	}
	
	@Override
	public String createView(QView view) {

		String command = view.getCreationCommand();
		
		String commandCreate = null;
		String commandSelect = null;

		int i = command.toUpperCase().indexOf("  AS\n  SELECT");
		if(i>0) {
			commandCreate = command.substring(0, i);			
			commandSelect = command.substring(i+4);
			
			try {
				commandCreate = convertCreateCommand(view, commandCreate);
				commandSelect = convertSelectCommand(view, commandSelect);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			
		}
		command = commandCreate + " WITH SCHEMABINDING  AS " + commandSelect;
//		System.out.println(command);

		return command;
	}

	@Override
	public String dropView(QView view) {
		// TODO Auto-generated method stub
		return super.dropView(view);
	}
	
	@Override
	public String deleteData(QTable table) {
		// TODO Auto-generated method stub
		return super.deleteData(table);
	}

	@Override
	public String selectData(QTable table) {
		// TODO Auto-generated method stub
		return super.selectData(table);
	}

	@Override
	public String insertData(QTable table, boolean prepare) {
		// TODO Auto-generated method stub
		return super.insertData(table, prepare);
	}



	private String convertSelectCommand(QView view, String command) throws SQLException {
		
		String commandWork = null;
		
		try {
			QQueryParser queryParser = queryParserRegistry.lookup(view.getCreationPlugin());
			
			commandWork = command.replaceFirst("SELECT", "SELECT QMUKEY,");
			
//			System.out.println(commandWork);
			
			SQLQueryParseResult query = queryParser.parseQuery(new ByteArrayInputStream(commandWork.getBytes()));
			
			QAliasResolver aliasResolver = new BaseSchemaAliasResolverImpl(view.getSchema().getName());
			query.setQueryStatement(aliasResolver.resolveAlias(query.getQueryStatement()));
			
			commandWork = queryConverter.convertQuery(query);			
						
		} catch (Exception e) {
			throw new SQLException(e);
		} 
		
		commandWork = commandWork.replaceAll("\\[\\\"", "[");
		commandWork = commandWork.replaceAll("\\\"\\]", "]");
		
		return commandWork;
	}
	
	private String convertCreateCommand(QView view, String command) throws SQLException {
		
		Parser parser = Parser.buildParser("db2400");
		Iterator<Token> tokens;
		try {
			tokens = parser.tokenize(command);
		} catch (InvalidExpressionException e) {
			throw new SQLException(e);
		}

		String status = "INIT";
		StringBuffer parsedCommand = new StringBuffer();		
		
		boolean firstColumn = false;
		
		while(tokens.hasNext()) {
			Token token = tokens.next();
			String text = token.getText();

			if(text.trim().isEmpty()) {
				parsedCommand.append(" ");
			}
			else if(text.equals(";")) {
				parsedCommand.append(text);
			}
			else if(token.getType().equals(TokenType.STRING)) {
				parsedCommand.append("'"+text+"'");
			}
			else if(token.getType().equals(TokenType.NUMBER)) {
				parsedCommand.append(text);
			}
			else if(token.getType().equals(TokenType.COMMA)) {
				parsedCommand.append(text);
			}
			else if(token.getType().equals(TokenType.EXP_OPEN)) {
				parsedCommand.append(text);
			}
			else if(token.getType().equals(TokenType.EXP_CLOSE)) {
				parsedCommand.append(text);
			}
			else if(token.getType().equals(TokenType.NOT)) {
				parsedCommand.append(text);
			}
			else if(text.equals("IS")) {
				parsedCommand.append(text);
			}
			else if(text.equals("CAST")) {
				parsedCommand.append(text);
			}
			else if(text.equals("NULL")) {
				parsedCommand.append(text);
			}			
			else if(text.equals("IN")) {
				parsedCommand.append(text);
			}
			else if(text.equals("OR")) {
				parsedCommand.append(text);
			}			
			else if(text.equals("AND")) {
				parsedCommand.append(text);
			}			
			else if(text.equals("LIKE")) {
				parsedCommand.append(text);
			}
			else if(text.equals("=")) {
				parsedCommand.append(text);
			}			
			else if(text.equals(">")) {
				parsedCommand.append(text);
			}
			else if(text.equals(">=")) {
				parsedCommand.append(text);
			}
			else if(text.equals("<=")) {
				parsedCommand.append(text);
			}
			else if(text.equals("<=")) {				
				parsedCommand.append(text);
			}
			else if(text.equals("<>")) {				
				parsedCommand.append(text);
			}
			else if(text.equals("BEETWEN")) {
				parsedCommand.append(text);
			}
			else if(text.equals("SUBSTRING")) {
				parsedCommand.append(text);
			}
			else if(text.equals("AS")) {
				status = "INIT";
				parsedCommand.append(" WITH SCHEMABINDING "+text);
			}
			else if(text.equals("FROM")) {
				status = "TABLE";
				parsedCommand.append(text);
			}
			else if(text.equals("SELECT")) {
				status = "COLUMN";
				firstColumn = true;
				parsedCommand.append(text);
			}
			else if(text.equals("CREATE")) {
				status = "CREATE";
				parsedCommand.append(text);
			}
			else if(text.equals("WHERE")) {
				status = "COLUMN";
				parsedCommand.append(text);
			}		
			else if(status.equals("CREATE") && text.equals("VIEW")) {
				status = "CREATE_VIEW";
				parsedCommand.append(text);
			}
			else if(status.equals("CREATE_VIEW")) {
				text = "["+view.getSchema().getName()+"].["+text+"]";
				parsedCommand.append(text);
				status = "COLUMN";
				firstColumn = true;				
			}
			else if(status.equals("TABLE")) {
				text = "["+view.getSchema().getName()+"].["+text+"]";
				parsedCommand.append(text);
				status = "COLUMN";
			}
			else if(status.equals("COLUMN")) {
				if(firstColumn)
					parsedCommand.append("[QMUKEY], ");
				text = "["+text+"]";
				parsedCommand.append(text);
				firstColumn = false;
			}
			else {
				parsedCommand.append(text);
				System.out.println("Unknown token "+text+" parsing "+command);
//					throw new SQLException("Unknown token "+text+" parsing "+command);
			}
		}

		return parsedCommand.toString();
	}	
}
