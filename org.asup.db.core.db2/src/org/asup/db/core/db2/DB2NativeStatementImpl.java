package org.asup.db.core.db2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.asup.db.core.QStatement;

public class DB2NativeStatementImpl implements QStatement {

	private Statement statement;
	
	protected DB2NativeStatementImpl(Statement statement) {
		this.statement = statement;
	}
	
	@Override
	public void close() throws SQLException {
		statement.close();
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		return statement.execute(sql);
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		return statement.executeQuery(sql);
	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		return statement.executeUpdate(sql);
	}

}
