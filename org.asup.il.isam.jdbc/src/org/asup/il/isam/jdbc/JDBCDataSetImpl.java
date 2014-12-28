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

import java.net.URI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseManager;
import org.asup.db.core.QStatement;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.OperationDirection;
import org.asup.il.isam.OperationRead;
import org.asup.il.isam.OperationSet;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QIndex;
import org.asup.il.isam.QIndexColumn;
import org.asup.il.isam.QRecord;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;

@SuppressWarnings("unused")
public abstract class JDBCDataSetImpl<R extends QRecord> implements QDataSet<R> {

	private QConnection databaseConnection;
	private JDBCAccessHelper jdbcIndexHelper;

	private Table table;
	private QIndex index;
	private R record;

	private AccessMode accessMode;
	private boolean userOpen;

	private JDBCDataEvaluatorImpl evaluator;

	private boolean open;
	private boolean found;
	private boolean error;
	private boolean equal;
	private boolean endOfData;
	private int rrn;

	protected OperationSet currentOpSet;
	protected Object[] currentKeySet;
	private OperationRead currentOpRead;


	private QStatement statement;
	private ResultSet resultSet;

	protected JDBCDataSetImpl(QConnection databaseConnection, Table table, QIndex index, R record, AccessMode accessMode, boolean userOpen) {

		this.databaseConnection = databaseConnection;
		this.table = table;
		this.index = index;
		this.record = record;
		this.accessMode = accessMode;
		this.userOpen = userOpen;

		this.jdbcIndexHelper = new JDBCAccessHelper();
		this.evaluator = new JDBCDataEvaluatorImpl();

		if (!userOpen)
			open(null);

		init();
	}

	protected Object[] buildKeySet() {

		Object[] keySet = new Object[index.getColumns().size()];
		int i = 0;
		for (QIndexColumn indexColumn: index.getColumns()) {
	
			// virtual element
			if (indexColumn.getName().equals(QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME))
				keySet[i] = rrn;
			else
				keySet[i] = record.getElement(indexColumn.getName());
			
			i++;
		}

		return keySet;
	}

	@Override
	public void clear() {
		this.record.clear();
	}

	@Override
	public void close() {
		close(null);
	}

	@Override
	public void close(QIndicator error) {

		init();

		try {
			if(this.statement != null)
				this.statement.close();
		} catch (SQLException e) {
			handleSQLException(e);
		}
	}

	@Override
	public void delete() {
		delete(null);
	}

	@Override
	public void delete(QIndicator error) {
		
		// TODO

		if(error != null)
			error.eval(onError());
	}

	@Override
	public R get() {
		return this.record;
	}

	protected void handleSQLException(SQLException e) {

		this.error = true;
		this.found = false;		
		this.equal = false;
		this.endOfData = true;
		this.rrn = 0;
	}

	private void init() {

		this.open = false;

		this.found = false;
		this.error = false;
		this.equal = false;
		this.endOfData = true;
		this.rrn = 0;

		this.currentOpSet = null;
		this.currentKeySet = null;

		this.currentOpRead = null;

	}

	protected boolean isBeforeFirst() throws SQLException {
		
		if(this.resultSet == null)
			return true;

		if(this.resultSet.isClosed())
			return true;
		
		return this.resultSet.isBeforeFirst();
	}

	@Override
	public boolean isEndOfData() {

		return this.endOfData;
	}

	@Override
	public boolean isEqual() {

		return this.equal;
	}

	@Override
	public boolean isFound() {
		
		return this.found;
	}

	@Override
	public boolean onError() {
		
		return this.error;
	}

	@Override
	public void open() {
		open(null);
	}

	@Override
	public void open(QIndicator error) {

		init();

		try {
			statement = databaseConnection.createStatement(true);
			
			this.open = true;
		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (error != null)
			error.eval(onError());
	}

	protected void prepareAccess(OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead) throws SQLException {

		this.currentOpRead = opRead;

		if (this.resultSet != null)
			this.resultSet.close();
		
		String querySelect = jdbcIndexHelper.buildSelect(table, index, opSet, keySet, opRead, keyRead);

		this.resultSet = this.statement.executeQuery(querySelect);
		this.evaluator.set(this.resultSet);
	}

	@Override
	public boolean read() {
		return read(null, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData) {
		return read(endOfData, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock) {
		return read(endOfData, lock, null);
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock, QIndicator error) {

		try {
			if (rebuildNeeded(OperationDirection.FORWARD)) {
				
				if(this.currentKeySet == null)
					prepareAccess(OperationSet.SET_GREATER_THAN, buildKeySet(), OperationRead.READ, null);
				else
					prepareAccess(OperationSet.SET_GREATER_THAN, this.currentKeySet, OperationRead.READ, null);				
			}

			return readNext();

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if(endOfData != null)
			endOfData.eval(isEndOfData());
		
		if(error != null)
			error.eval(onError());
		
		return isFound();
	}

	protected boolean readNext() throws SQLException {

		this.error = false;
		this.equal = false;
		
		if (!this.resultSet.next()) {

			// TODO verify if not necessary
			this.record.clear();
			this.rrn = 0;
			
			this.found = false;
			this.endOfData = true;			

			return false;			
		}
			
		try {
			this.record.accept(this.evaluator);
			this.rrn = this.resultSet.getInt(record.getElements().size()+1);
			
			this.found = true;
			this.endOfData = false;
			
			return true;
		}
		catch(SQLException e) {
			handleSQLException(e);
			return false;
		}

	}

	@Override
	public boolean readp() {
		return readp(null, null, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData) {
		return readp(beginningOfData, null, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock) {
		return readp(beginningOfData, lock, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock, QIndicator error) {

		try {
			if (rebuildNeeded(OperationDirection.BACKWARD)) {
				
				if(this.currentKeySet == null)
					prepareAccess(OperationSet.SET_LOWER_LIMIT, buildKeySet(), OperationRead.READ_PRIOR, null);
				else
					prepareAccess(OperationSet.SET_LOWER_LIMIT, this.currentKeySet, OperationRead.READ_PRIOR, null);				
			}
			return readNext();

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if(beginningOfData != null)
			beginningOfData.eval(isEndOfData());
		
		if(error != null)
			error.eval(onError());

		return isFound();
	}

	protected boolean rebuildNeeded(OperationDirection opDirection) {
				
		if(this.currentOpRead == null)
			return true;
		
		boolean result = false;

		switch (opDirection) {
		case BACKWARD:
			switch (this.currentOpRead) {
			case CHAIN:
			case READ:
			case READ_EQUAL:
				result = true;
			default:
				break;
			}
			break;
		case FORWARD:
			switch (this.currentOpRead) {
			case CHAIN:
			case READ_PRIOR:
			case READ_PRIOR_EQUAL:
				result = true;
			default:
				break;
			}
			break;
		}

		return result;
	}

	protected void setKeySet(OperationSet opSet, Object[] keyList) {
		this.currentOpSet = opSet;
		this.currentKeySet = keyList;
		this.currentOpRead = null;
	}

	@Override
	public void unlock() {
		unlock(null);
	}

	@Override
	public void unlock(QIndicator error) {
		
		// TODO

		if(error != null)
			error.eval(onError());
	}

	@Override
	public void update() {
		update(null);
	}

	@Override
	public void update(QIndicator error) {
		
		// TODO

		if(error != null)
			error.eval(onError());
	}

	@Override
	public void write() {
		write(null);
	}
	
	@Override
	public void write(QIndicator error) {
		
		// TODO
		
		if(error != null)
			error.eval(onError());
	}
} // QDataSetImpl