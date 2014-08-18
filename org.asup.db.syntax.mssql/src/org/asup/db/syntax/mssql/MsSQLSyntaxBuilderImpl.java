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
import org.asup.db.core.QIndex;
import org.asup.db.core.QIndexColumn;
import org.asup.db.core.QTable;
import org.asup.db.core.QTableColumn;
import org.asup.db.core.QView;
import org.asup.db.core.base.BaseSchemaAliasResolverImpl;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QQueryConverter;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.db.syntax.impl.SyntaxBuilderImpl;
import org.asup.dk.parser.InvalidExpressionException;
import org.asup.dk.parser.Parser;
import org.asup.dk.parser.Token;
import org.asup.dk.parser.TokenType;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class MsSQLSyntaxBuilderImpl extends SyntaxBuilderImpl {

	
	@Inject
	private QQueryParserRegistry queryParserRegistry;

	private QQueryConverter queryConverter;
	
	@PostConstruct
	private void init() {
		this.queryConverter = new MsSQLQueryConverterImpl();
	}
	
	@Override
	public String dropTable(QTable table) {
		return "DROP TABLE "+buildEscapedTableName(table);
	}
	
	@Override
	public String createTable(QTable table) {
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(buildEscapedTableName(table)+" (");

		boolean first = true;
		for(QTableColumn field: table.getColumns()) {

			if(!first)
				result.append(", ");
			
			String fieldName = "["+field.getName()+"]";
			
			switch (field.getDataType()) {
				case IDENTITY:
					result.append(fieldName+" INT PRIMARY KEY IDENTITY");					
					break;
				case CHARACTER:
					result.append(fieldName+" CHAR("+field.getPrecision()+")");
					break;
				case VARCHAR:
					if(field.getPrecision()>8000)
						result.append(fieldName+" TEXT");
					else
						result.append(fieldName+" VARCHAR("+field.getPrecision()+")");
					break;
				case DECIMAL:
					if(field.getScale() != 0)
						result.append(fieldName+" DECIMAL("+field.getPrecision()+", "+field.getScale()+")");
					else
						result.append(fieldName+" DECIMAL("+field.getPrecision()+",  0)");
					break;
				case BLOB:
					result.append(fieldName+" TEXT");
					break;
				case TEXT:
					result.append(fieldName+" TEXT");
					break;
				default:
					result.append(fieldName+" "+field.getDataType().getName() .toUpperCase());
			}			
			first = false;
		}
		result.append(")");
		return result.toString();
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
	public String dropIndex(QIndex index) {
		return "DROP INDEX "+"["+index.getName()+"]"+ " ON "+"["+index.getSchema().getName()+"].["+index.getObject()+"]";
	}
	
	@Override
	public String dropView(QView view) {
		return "DROP VIEW "+"["+view.getSchema().getName()+"].["+view.getName()+"]";
	}

	@Override
	public String createIndex(QIndex index) {
//		Table table = index.getTable();
		StringBuffer result = new StringBuffer("CREATE ");
		if(index.isUnique()) 
//			result.append("UNIQUE CLUSTERED ");			
			result.append("UNIQUE ");			
		else {
			result.append("NONCLUSTERED ");
		}
		
		result.append("INDEX ["+index.getName()+"]");
		result.append(" ON "+"["+index.getSchema().getName()+"].["+index.getObject()+"]"+" (");

		boolean first = true;
		
		for(QIndexColumn field: index.getColumns()) {			
			
			if(!first)
				result.append(", ");

			result.append("["+field.getName()+"]");
			
			if(field.getOrdering() == OrderingType.DESCEND) 
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}
	
	@Override
	public String deleteData(QTable table) {
		return "TRUNCATE TABLE "+buildEscapedTableName(table);
	}
	
	@Override
	public String selectData(QTable table) {
		return "SELECT * FROM "+buildEscapedTableName(table);
	}

	@Override
	public String insertData(QTable table, boolean prepare) {
		StringBuffer result = new StringBuffer("INSERT INTO "+buildEscapedTableName(table));
		String tkn1 ="";
		String tkn2 ="";
		boolean first = true;
		for(QTableColumn field: table.getColumns()) {
			
			if(field.getName().equals("QMUKEY")) 
				continue;

			if(!first) {
				tkn1+=", ";
				tkn2+=", ";
			}
			if(prepare) {
				tkn1+= "["+field.getName()+"]";
				tkn2+="?";
			}
			else {
				tkn1+= field.getName();
			}
			first = false;
		}
		if(prepare)
			result.append(" ("+tkn1+") VALUES("+tkn2+")");
		else
			result.append(" VALUES("+tkn1+")");
		return result.toString();
	}
	
	private String buildEscapedTableName(QTable table) {
		return "["+table.getSchema().getName()+"].["+table.getName()+"]";
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