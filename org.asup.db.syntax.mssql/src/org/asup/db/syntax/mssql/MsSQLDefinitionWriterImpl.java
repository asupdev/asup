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

import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.core.impl.DatabaseManagerImpl;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.QQueryParserRegistry;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.base.BaseSchemaAliasResolverImpl;
import org.asup.db.syntax.impl.DefinitionWriterImpl;
import org.asup.dk.parser.InvalidExpressionException;
import org.asup.dk.parser.Parser;
import org.asup.dk.parser.Token;
import org.asup.dk.parser.TokenType;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class MsSQLDefinitionWriterImpl extends DefinitionWriterImpl {

	public MsSQLDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Inject
	private QQueryParserRegistry queryParserRegistry;

	private QQueryWriter queryConverter;

	@PostConstruct
	private void init() {
		this.queryConverter = new MsSQLQueryWriterImpl();
		setSQLObjectNameHelper(new SQLObjectNameHelper());
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
	public String createView(Schema schema, String name, QViewDef view) {

		String command = view.getCreationCommand();
		if (command == null)
			return null;

		String commandCreate = null;
		String commandSelect = null;

		int i = command.toUpperCase().indexOf("AS\n  SELECT");
		if (i <= 0) {
			i = command.toUpperCase().indexOf("AS   SELECT");
		}
		if (i > 0) {
			commandCreate = command.substring(0, i).trim();
			commandSelect = command.substring(i + 2).trim();

			try {
				commandCreate = convertCreateCommand(schema, view, commandCreate);
				commandSelect = convertSelectCommand(schema, view, commandSelect);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}

		} else
			System.err.println(command);
		command = commandCreate + " WITH SCHEMABINDING  AS " + commandSelect;
		// System.out.println(command);

		return command;
	}

	@Override
	public String deleteData(Table table) {
		return "TRUNCATE TABLE " + getQualifiedNameInSQLFormat(table);
	}

	private String convertSelectCommand(Schema schema, QViewDef view, String command) throws SQLException {

		try {
			QQueryParser queryParser = queryParserRegistry.lookup(view.getCreationPlugin());

			command = command.replaceFirst("SELECT", "SELECT " + getIdentifierQuoteString()
					+ DatabaseManagerImpl.TABLE_COLUMN_PRIMARY_KEY_NAME + getIdentifierQuoteString() + ",");

			SQLQueryParseResult query = queryParser.parseQuery(new ByteArrayInputStream(command.getBytes()));

			QAliasResolver aliasResolver = new BaseSchemaAliasResolverImpl(schema.getName());
			query.setQueryStatement(aliasResolver.resolveAlias(query.getQueryStatement()));

			command = queryConverter.writeQuery(query.getQueryStatement());

		} catch (Exception e) {
			throw new SQLException(e);
		}

		return command;
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

		while (tokens.hasNext()) {
			Token token = tokens.next();
			String text = token.getText();

			if (text.trim().isEmpty()) {
				parsedCommand.append(" ");
			} else if (text.equals(";")) {
				parsedCommand.append(text);
			} else if (token.getType().equals(TokenType.STRING)) {
				parsedCommand.append("'" + text + "'");
			} else if (token.getType().equals(TokenType.NUMBER)) {
				parsedCommand.append(text);
			} else if (token.getType().equals(TokenType.COMMA)) {
				parsedCommand.append(text);
			} else if (token.getType().equals(TokenType.EXP_OPEN)) {
				parsedCommand.append(text);
			} else if (token.getType().equals(TokenType.EXP_CLOSE)) {
				parsedCommand.append(text);
			} else if (token.getType().equals(TokenType.NOT)) {
				parsedCommand.append(text);
			} else if (text.equals("IS")) {
				parsedCommand.append(text);
			} else if (text.equals("CAST")) {
				parsedCommand.append(text);
			} else if (text.equals("NULL")) {
				parsedCommand.append(text);
			} else if (text.equals("IN")) {
				parsedCommand.append(text);
			} else if (text.equals("OR")) {
				parsedCommand.append(text);
			} else if (text.equals("AND")) {
				parsedCommand.append(text);
			} else if (text.equals("LIKE")) {
				parsedCommand.append(text);
			} else if (text.equals("=")) {
				parsedCommand.append(text);
			} else if (text.equals(">")) {
				parsedCommand.append(text);
			} else if (text.equals(">=")) {
				parsedCommand.append(text);
			} else if (text.equals("<=")) {
				parsedCommand.append(text);
			} else if (text.equals("<=")) {
				parsedCommand.append(text);
			} else if (text.equals("<>")) {
				parsedCommand.append(text);
			} else if (text.equals("BEETWEN")) {
				parsedCommand.append(text);
			} else if (text.equals("SUBSTRING")) {
				parsedCommand.append(text);
			} else if (text.equals("AS")) {
				status = "INIT";
				parsedCommand.append(" WITH SCHEMABINDING " + text);
			} else if (text.equals("FROM")) {
				status = "TABLE";
				parsedCommand.append(text);
			} else if (text.equals("SELECT")) {
				status = "COLUMN";
//				firstColumn = true;
				parsedCommand.append(text);
			} else if (text.equals("CREATE")) {
				status = "CREATE";
				parsedCommand.append(text);
			} else if (text.equals("WHERE")) {
				status = "COLUMN";
				parsedCommand.append(text);
			} else if (status.equals("CREATE") && text.equals("VIEW")) {
				status = "CREATE_VIEW";
				parsedCommand.append(text);
			} else if (status.equals("CREATE_VIEW")) {
				text = getNameInSQLFormat(schema) + "." + getIdentifierQuoteString() + text + getIdentifierQuoteString();
				parsedCommand.append(text);
				status = "COLUMN";
				firstColumn = true;
			} else if (status.equals("TABLE")) {
				text = getNameInSQLFormat(schema) + "." + getIdentifierQuoteString() + text + getIdentifierQuoteString();
				parsedCommand.append(text);
				status = "COLUMN";
			} else if (status.equals("COLUMN")) {
				if (firstColumn)
					parsedCommand.append(getIdentifierQuoteString() + DatabaseManagerImpl.TABLE_COLUMN_PRIMARY_KEY_NAME
							+ getIdentifierQuoteString() + ", ");
				text = getIdentifierQuoteString() + text + getIdentifierQuoteString();
				parsedCommand.append(text);
				firstColumn = false;
			} else {
				parsedCommand.append(text);
				System.out.println("Unknown token " + text + " parsing " + command);
			}
		}

		return parsedCommand.toString();
	}
}
