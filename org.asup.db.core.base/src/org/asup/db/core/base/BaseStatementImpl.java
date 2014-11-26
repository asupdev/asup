package org.asup.db.core.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.asup.db.core.QStatement;
import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.base.BaseSchemaAliasResolverImpl;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

public class BaseStatementImpl implements QStatement {

	private Statement statement;
	private QQueryParser queryParser;
	private QQueryWriter queryConverter;
	
	protected BaseStatementImpl(Statement statement, QQueryParser queryParser, QQueryWriter queryConverter) {
		this.statement = statement;
		this.queryParser = queryParser;
		this.queryConverter = queryConverter;
	}
	
	@Override
	public void close() throws SQLException {
		statement.close();
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		sql = translate(sql);
		return statement.execute(sql);
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		sql = translate(sql);
		return statement.executeQuery(sql);
	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		sql = translate(sql);
		return statement.executeUpdate(sql);
	}

	private String translate(String sql) throws SQLException {
		
		String semicolonReplacement = "§SEMICOLON§";
		sql.replace(";", semicolonReplacement);
		try {
			SQLQueryParseResult query = queryParser.parseQuery(sql);
			
			QAliasResolver aliasResolver = new BaseSchemaAliasResolverImpl("SMEUP_DAT");
			query.setQueryStatement(aliasResolver.resolveAlias(query.getQueryStatement()));
			
			sql = queryConverter.convertQuery(query.getQueryStatement());
		} catch (Exception e) {
			throw new SQLException(e);
		}
		
		return sql.replace(semicolonReplacement, ";");
	}
}