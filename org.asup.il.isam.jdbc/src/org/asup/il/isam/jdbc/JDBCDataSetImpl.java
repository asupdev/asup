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
package org.asup.il.isam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.asup.db.core.QConnection;
import org.asup.db.core.QStatement;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QDataSet;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

public abstract class JDBCDataSetImpl<DS extends QDataStruct> implements QDataSet<DS> {

	private QConnection databaseConnection;
	private SQLObjectNameHelper sqlObjectNameHelper;
	private AccessMode accessMode;
	private DS record;

	private Table table;
	private QIndicator found;

	private QDataEvaluator evaluator = QIntegratedLanguageDataFactory.eINSTANCE.createDataEvaluator();

	protected enum OpSet {
		SETLL, SETGT, CHAIN;
	}

	protected enum OpRead {
		READ, READE, READP, READPE, CHAIN;
	}

	protected enum OpDir {
		F, B;
	}

	private boolean _isOpen;

	private OpDir _opDir;
	protected OpSet _opSet;
	protected OpRead _opRead;

	protected Object[] _keySet;
	protected Object[] _keyRead;

	private StringBuffer _queySelect;

	private QStatement _statement;
	private ResultSet _result;

	protected boolean _isEndOfData;

	protected JDBCDataSetImpl(QConnection databaseConnection, SQLObjectNameHelper sqlObjectNameHelper, Table table, AccessMode accessMode, DS record) {
		this.databaseConnection = databaseConnection;
		this.sqlObjectNameHelper = sqlObjectNameHelper;
		this.table = table;
		this.accessMode = accessMode;
		this.record = record;
	}

	protected SQLObjectNameHelper getSQLObjectNameHelper() {
		return this.sqlObjectNameHelper;
	}
	
	@Override
	public DS get() {
		return this.record;
	}

	@Override
	public void close() {
		assert _isOpen;

		_reset();
	}

	@Override
	public boolean isEndOfData() {
		assert _isOpen;

		return _isEndOfData;
	}

	@Override
	public void open() {
		_reset();
		_opSet = OpSet.SETLL;
		_isOpen = true;
	}

	@Override
	public boolean read() {

		_opRead = OpRead.READ;
		_keyRead = null;

		// read next record
		try {
			_prepareAccess();
			return _readNext();

		} catch (SQLException e) {
			_isEndOfData = true;
		}

		return false;
	}

	@Override
	public boolean read(QIndicator endOfRecord) {
		read();
		endOfRecord.eval(_isEndOfData);

		return false;
	}

	@Override
	public boolean readp(QIndicator endOfRecord) {
		readp();
		endOfRecord.eval(_isEndOfData);

		return false;
	}

	@Override
	public boolean readp() {
		assert _isOpen;

		_opRead = OpRead.READP;
		_keyRead = null;

		return false;
	}

	@Override
	public void update() {
		assert _isOpen;
	}

	@Override
	public void write() {
		assert _isOpen;
	}

	@Override
	public void delete() {
		assert _isOpen;
	}

	@Override
	public boolean isFound() {
		assert _isOpen;

		return found.asBoolean();
	}

	@Override
	public void unlock() {
		assert _isOpen;
	}

	private void _reset() {

		_isOpen = false;
		_opDir = null;

		_keySet = null;
		_opSet = null;
		_keyRead = null;
		_opRead = null;

		if (_statement != null) {
			try {
				_statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			_statement = null;
		}

		_result = null;
	}

	protected void _prepareAccess() throws SQLException {

		// previous pointer
		if (_opSet == null)
			return;

		// select direction
		_opDir = (_opRead == OpRead.READP || _opRead == OpRead.READPE) ? OpDir.B : OpDir.F;

		// build select
		_buildQuerySelect();

		if (_statement == null) {
			if (accessMode == AccessMode.INPUT)
				_statement = databaseConnection.createStatement();
			else
				_statement = databaseConnection.createStatement(true);
		}
		if (_result != null)
			_result.close();

		_result = _statement.executeQuery(_queySelect.toString());

		// _result.get

		// ResultSetMetaData _result.get
	}

	protected boolean _readNext() throws SQLException {

		_isEndOfData = false;
		if (_result.next()) {

			for (int x = 1; record.getElements().size() > x; x++) {
				record.getElement(x).accept(evaluator.set(_result.getString(x)));
			}
			_opSet = null;
			return true;
		}

		_isEndOfData = true;
		return false;
	}

	private void _buildQuerySelect() {

		_queySelect = new StringBuffer();

		// SELECT
		_queySelect.append("SELECT " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table) + ".*");

		// FROM
		_queySelect.append(" FROM " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table));

		// WHERE
		if (_keySet != null || _keyRead != null)
			_queySelect.append(" WHERE " + buildWhere(_keySet, _keyRead));

		// ORDER
		String orderBy = buildOrderBy(_opDir);
		if(orderBy != null && !orderBy.isEmpty())
			_queySelect.append(" ORDER BY " + buildOrderBy(_opDir));
	}

	protected abstract String buildWhere(Object[] keySet, Object[] keyRead);

	protected abstract String buildOrderBy(OpDir dir);

	@Override
	public void clear() {
		if (record != null)
			record.clear();
	}

} // QDataSetImpl