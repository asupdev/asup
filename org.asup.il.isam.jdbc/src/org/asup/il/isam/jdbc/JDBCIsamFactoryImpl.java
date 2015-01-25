/**
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

import java.util.ArrayList;
import java.util.List;

import org.asup.db.core.QConnection;
import org.asup.db.core.QDatabaseManager;
import org.asup.il.data.IntegratedLanguageDataRuntimeException;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStruct;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.OperationDirection;
import org.asup.il.isam.QIndex;
import org.asup.il.isam.QIndexColumn;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QKSDataSet;
import org.asup.il.isam.QRRDataSet;
import org.asup.il.isam.QRecord;

public class JDBCIsamFactoryImpl implements QIsamFactory {

	private QConnection connection;
	private QDataFactory dataFactory;

	private static final QIndex TABLE_INDEX_RELATIVE_RECORD_NUMBER = new QIndex() {

		List<QIndexColumn> columns = new ArrayList<QIndexColumn>();

		@Override
		public List<QIndexColumn> getColumns() {

			if (this.columns.isEmpty()) {
				synchronized (this.columns) {
					QIndexColumn indexColumn = new QIndexColumn() {

						@Override
						public OperationDirection getDirection() {
							return OperationDirection.FORWARD;
						}

						@Override
						public int getLength() {
							return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_LENGTH;
						}

						@Override
						public String getName() {
							return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME;
						}

						@Override
						public boolean isNumeric() {
							return true;
						}

					};
					this.columns.add(indexColumn);
				}
			}
			return this.columns;
		}
	};

	public JDBCIsamFactoryImpl(QConnection connection, QDataFactory dataFactory) {
		this.connection = connection;
		this.dataFactory = dataFactory;
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper) {
		return createKeySequencedDataSet(wrapper, AccessMode.INPUT);
	}
	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode) {
		return createKeySequencedDataSet(wrapper, accessMode, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {
		try {

			R record = null;
			if (QDataStruct.class.isAssignableFrom(wrapper))
				record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
			else
				throw new IntegratedLanguageDataRuntimeException("Invalid record class: "+wrapper);

			QIndex index = record.getIndex();
			if (index == null)
				index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

			return new JDBCKeySequencedDataSetImpl<R>(connection, new JDBCTableProvider(connection), index, record, accessMode, userOpen);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper) {

		return createRelativeRecordDataSet(wrapper, AccessMode.INPUT);
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode) {
		return createRelativeRecordDataSet(wrapper, accessMode, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen) {

		try {
			R record = null;
			if (QDataStruct.class.isAssignableFrom(wrapper))
				record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
			else
				throw new IntegratedLanguageDataRuntimeException("Invalid record class: "+wrapper);
			
			QIndex index = record.getIndex();
			if (index == null)
				index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

			return new JDBCRelativeRecordDataSetImpl<R>(connection, new JDBCTableProvider(connection), index, record, accessMode, userOpen);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
