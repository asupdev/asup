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

import java.io.ByteArrayInputStream;
import java.sql.SQLException;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.db.core.OrderingType;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
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
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class MsSQLSyntaxBuilderImpl extends SyntaxBuilderImpl {

	@Inject
	private QQueryParserRegistry queryParserRegistry;

	private QQueryConverter queryConverter;
	
	@PostConstruct
	private void init() {
		this.queryConverter = new MsSQLQueryConverterImpl();
		setSQLObjectNameHelper(new MsSQLNameHelper());
	}
	
	@Override
	public String createTable(Schema schema, QTableDef table) {
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema)+"."+getNameInSQLFormat(table)+" (");

		boolean first = true;
		for(QTableColumnDef column: table.getColumns()) {

			if(!first)
				result.append(", ");
			
			String columnName = getNameInSQLFormat(column);
			
			switch (column.getDataType()) {
				case IDENTITY:
					result.append(columnName+" INT PRIMARY KEY IDENTITY");					
					break;
				case CHARACTER:
					result.append(columnName+" CHAR("+column.getLength()+")");
					break;
				case VARCHAR:
					if(column.getLength()>8000)
						result.append(columnName+" TEXT");
					else
						result.append(columnName+" VARCHAR("+column.getLength()+")");
					break;
				case DECIMAL:
					if(column.getScale() != 0)
						result.append(columnName+" DECIMAL("+column.getLength()+", "+column.getScale()+")");
					else
						result.append(columnName+" DECIMAL("+column.getLength()+",  0)");
					break;
				case BLOB:
					result.append(columnName+" TEXT");
					break;
				case TEXT:
					result.append(columnName+" TEXT");
					break;
				default:
					result.append(columnName+" "+column.getDataType().getName() .toUpperCase());
			}			
			first = false;
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public String createView(Schema schema, QViewDef view) {

		String command = view.getCreationCommand();
		if(command == null)
			return null;
		
		String commandCreate = null;
		String commandSelect = null;

		int i = command.toUpperCase().indexOf("AS\n  SELECT");
		if(i<=0) {
			i = command.toUpperCase().indexOf("AS   SELECT");
		}
		if(i>0) {
			commandCreate = command.substring(0, i).trim();			
			commandSelect = command.substring(i+2).trim();
			
			try {
				commandCreate = convertCreateCommand(schema, view, commandCreate);
				commandSelect = convertSelectCommand(schema, view, commandSelect);
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
	public String createIndex(Table table, QIndexDef index) {
//		Table table = index.getTable();
		StringBuffer result = new StringBuffer("CREATE ");
		if(index.isUnique()) 	
			result.append("UNIQUE ");			
		else 
			result.append("NONCLUSTERED ");
		
		result.append("INDEX ["+index.getName()+"]");
		result.append(" ON "+getQualifiedNameInSQLFormat(table)+" (");

		boolean first = true;
		
		for(QIndexColumnDef column: index.getColumns()) {			
			
			if(!first)
				result.append(", ");

			result.append(getNameInSQLFormat(column));
			
			if(column.getOrdering() == OrderingType.DESCEND) 
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}
	
	@Override
	public String deleteData(Table table) {
		return "TRUNCATE TABLE "+getQualifiedNameInSQLFormat(table);
	}

	private String convertSelectCommand(Schema schema, QViewDef view, String command) throws SQLException {
		
		String commandWork = null;
		
		try {
			QQueryParser queryParser = queryParserRegistry.lookup(view.getCreationPlugin());
			
			commandWork = command.replaceFirst("SELECT", "SELECT QMUKEY,");
			
//			System.out.println(commandWork);
			
			SQLQueryParseResult query = queryParser.parseQuery(new ByteArrayInputStream(commandWork.getBytes()));
			
			QAliasResolver aliasResolver = new BaseSchemaAliasResolverImpl(schema.getName());
			query.setQueryStatement(aliasResolver.resolveAlias(query.getQueryStatement()));
			
			commandWork = queryConverter.convertQuery(query);			
						
		} catch (Exception e) {
			throw new SQLException(e);
		} 
		
		commandWork = commandWork.replaceAll("\\[\\\"", "[");
		commandWork = commandWork.replaceAll("\\\"\\]", "]");
		
		return commandWork;
	}
	
	private String convertCreateCommand(Schema schema, QViewDef view, String command) throws SQLException {
		
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
				text = "["+schema.getName()+"].["+text+"]";
				parsedCommand.append(text);
				status = "COLUMN";
				firstColumn = true;				
			}
			else if(status.equals("TABLE")) {
				text = "["+schema.getName()+"].["+text+"]";
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