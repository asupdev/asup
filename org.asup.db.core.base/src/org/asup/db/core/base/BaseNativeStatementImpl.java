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
package org.asup.db.core.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.asup.db.core.QStatement;

public class BaseNativeStatementImpl implements QStatement {

	private Statement statement;
	
	protected BaseNativeStatementImpl(Statement statement) {
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
