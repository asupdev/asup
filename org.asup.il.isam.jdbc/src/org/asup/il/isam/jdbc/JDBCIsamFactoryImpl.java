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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.asup.db.core.QCatalogMetaData;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionDescription;
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
import org.eclipse.datatools.modelbase.sql.tables.Table;

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

	/*
	 * @Override public QDataSet<?> createDataSet(QDataSetTerm dataSetTerm) {
	 * 
	 * try { Table table = getTable(dataSetTerm.getFileName()); if(table ==
	 * null) return null;
	 * 
	 * QRecord dataStruct = dataFactory.createData(dataSetTerm.getRecord(),
	 * true);
	 * 
	 * if(dataSetTerm.isKeyedAccess()) { QIndex index =
	 * connection.getContext().getAdapter(dataStruct, QIndex.class);
	 * JDBCKeySequencedDataSetImpl<QRecord> jdbcIndexDataSetImpl = new
	 * JDBCKeySequencedDataSetImpl<QRecord>(connection, sqlObjectNameHelper,
	 * table, index, dataStruct, AccessMode.UPDATE, dataSetTerm.isUserOpen());
	 * 
	 * return jdbcIndexDataSetImpl; } else { QIndex index =
	 * TABLE_INDEX_RELATIVE_RECORD_NUMBER; return new
	 * JDBCRelativeRecordDataSetImpl<QRecord>(connection, sqlObjectNameHelper,
	 * table, index, dataStruct, AccessMode.INPUT, dataSetTerm.isUserOpen()); }
	 * } catch(Exception e) { e.printStackTrace(); return null; } }
	 */

	public JDBCIsamFactoryImpl(QConnection connection, QDataFactory dataFactory) {
		this.connection = connection;
		this.dataFactory = dataFactory;
	}

	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(String container, Class<R> wrapper) {
		return createKeySequencedDataSet(container, wrapper, AccessMode.INPUT);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(String container, Class<R> wrapper, AccessMode accessMode) {
		try {
			Table table = getTable(container, wrapper.getSimpleName());
			if (table == null)
				return null;

			R record = null;
			if (wrapper.isAssignableFrom(QDataStruct.class))
				record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
			else
				throw new IntegratedLanguageDataRuntimeException("Invalid record class: "+wrapper);

			QIndex index = record.getIndex();
			if (index == null)
				index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

			return new JDBCKeySequencedDataSetImpl<R>(connection, table, index, record, accessMode, true);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(String container, Class<R> wrapper) {

		return createRelativeRecordDataSet(container, wrapper, AccessMode.INPUT);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(String container, Class<R> wrapper, AccessMode accessMode) {

		try {
			Table table = getTable(container, wrapper.getSimpleName());
			if (table == null)
				return null;

			R record = null;
			if (wrapper.isAssignableFrom(QDataStruct.class))
				record = (R) this.dataFactory.createDataStruct((Class<QDataStruct>) wrapper, 0, true);
			else
				throw new IntegratedLanguageDataRuntimeException("Invalid record class: "+wrapper);
			
			QIndex index = record.getIndex();
			if (index == null)
				index = TABLE_INDEX_RELATIVE_RECORD_NUMBER;

			return new JDBCRelativeRecordDataSetImpl<R>(connection, table, index, record, accessMode, true);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/*
	 * @Override public QDataSetTerm createDataSetTerm(Type type,
	 * List<Annotation> annotations) {
	 * 
	 * // annotations if (annotations == null) annotations = new
	 * ArrayList<Annotation>();
	 * 
	 * QDataSetTerm dataSetTerm =
	 * QIntegratedLanguageIsamFactory.eINSTANCE.createDataSetTerm();
	 * 
	 * // klass List<Type> arguments = new ArrayList<Type>(); Class<? extends
	 * QData> klass = null; if(type instanceof ParameterizedType) {
	 * ParameterizedType pType = (ParameterizedType)type; klass = (Class<?
	 * extends QData>) pType.getRawType(); for(Type argument:
	 * pType.getActualTypeArguments()) arguments.add(argument); } else klass =
	 * (Class<? extends QData>) type;
	 * 
	 * if(QKSDataSet.class.isAssignableFrom(klass))
	 * dataSetTerm.setKeyedAccess(true);
	 * 
	 * for(Annotation annotation: annotations) { if(annotation instanceof
	 * DataSetDef) { DataSetDef fileDef = (DataSetDef)annotation;
	 * dataSetTerm.setFileName(fileDef.name());
	 * dataSetTerm.setUserOpen(fileDef.userOpen()); } }
	 * 
	 * if(arguments.size()>0) { try { Class<QDataStruct> klassArg =
	 * (Class<QDataStruct>) arguments.get(0); QDataStructDef dataStructDef =
	 * (QDataStructDef) dataFactory.createDataDef(klassArg, null);
	 * dataSetTerm.setRecord(dataStructDef); } catch(Exception e) {
	 * System.err.println(e.getMessage()); } }
	 * 
	 * return dataSetTerm; }
	 */
	public Table getTable(String container, String name) throws SQLException {

		QCatalogMetaData catalogMetaData = connection.getCatalogMetaData();

		if (container == null) {
			QConnectionDescription connectionDescription = connection.getConnectionDescription();
			return catalogMetaData.getTable(connectionDescription, name);
		} else {
			return catalogMetaData.getTable(container, name);
		}
	}
}
