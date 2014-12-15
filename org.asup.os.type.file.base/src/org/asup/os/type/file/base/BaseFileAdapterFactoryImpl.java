package org.asup.os.type.file.base;

import java.sql.SQLException;

import org.asup.db.core.DatabaseDataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QConnection;
import org.asup.db.core.QConnectionManager;
import org.asup.db.core.QDatabaseCoreFactory;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.QTableDef;
import org.asup.db.core.QViewDef;
import org.asup.db.syntax.QDefinitionParseResult;
import org.asup.db.syntax.QDefinitionParser;
import org.asup.db.syntax.ddl.QCreateViewStatement;
import org.asup.fw.core.QAdapterFactory;
import org.asup.fw.core.QContext;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QFloatingDef;
import org.asup.il.data.QStringDef;
import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QDatabaseFileField;
import org.asup.os.type.file.QDatabaseFileFormat;
import org.asup.os.type.file.QFileFormatKey;
import org.asup.os.type.file.QLogicalFile;

public class BaseFileAdapterFactoryImpl implements QAdapterFactory {

	private QConnectionManager connectionManager;

	public BaseFileAdapterFactoryImpl(QConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public <T> T getAdapter(QContext context, Object adaptableObject, Class<T> adapterType) {

		T adaptee = null;

		if (adaptableObject instanceof QJob) {
			QJob job = (QJob) adaptableObject;
			if (QConnection.class.isAssignableFrom(adapterType)) {
				adaptee = (T) adaptJobToConnection(job);
			}
		} else if (adaptableObject instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile) adaptableObject;

			if (QViewDef.class.isAssignableFrom(adapterType) && databaseFile instanceof QLogicalFile)
				adaptee = (T) adaptDatabaseFileToViewDef(context, (QLogicalFile) databaseFile);

			else if (QTableDef.class.isAssignableFrom(adapterType))
				adaptee = (T) adaptDatabaseFileToTableDef(databaseFile);

			else if (QIndexDef.class.isAssignableFrom(adapterType))
				adaptee = (T) adaptDatabaseFileToIndexDef(databaseFile);
		}

		return adaptee;
	}

	private QConnection adaptJobToConnection(QJob job) {

		QConnection connection = job.getContext().get(QConnection.class);
		if (connection == null) {
			synchronized (job) {
				connection = job.getContext().get(QConnection.class);
				if (connection == null) {
					try {
						// TODO credentials
						connection = connectionManager.createConnection();
						job.getContext().set(QConnection.class, connection);
					} catch (SQLException e) {
						throw new OperatingSystemRuntimeException(e);
					}
				}
			}
		}

		return connection;
	}

	private QTableDef adaptDatabaseFileToTableDef(QDatabaseFile file) {

		QTableDef tableDef = QDatabaseCoreFactory.eINSTANCE.createTableDef();

		QDatabaseFileFormat databaseFileFormat = file.getDatabaseFormat();

		for (QDatabaseFileField field : databaseFileFormat.getFields()) {

			QUnaryAtomicBufferedDataDef<?> dataDef = field.getDefinition();
			QTableColumnDef tableColumnDef = adaptDataDefToTableColumnDef(dataDef);
			if (tableColumnDef == null)
				return null;

			tableColumnDef.setName(field.getName());
			tableDef.getColumns().add(tableColumnDef);
		}

		return tableDef;
	}

	private QViewDef adaptDatabaseFileToViewDef(QContext context, QLogicalFile file) {

		QViewDef viewDef = QDatabaseCoreFactory.eINSTANCE.createViewDef();

		/*
		 * QDatabaseFileFormat databaseFileFormat = file.getDatabaseFormat();
		 * for (QDatabaseFileField field : databaseFileFormat.getFields()) {
		 * 
		 * QUnaryAtomicBufferedDataDef<?> dataDef = field.getDefinition();
		 * QTableColumnDef tableColumnDef =
		 * adaptDataDefToTableColumnDef(dataDef); if (tableColumnDef == null)
		 * return null;
		 * 
		 * viewDef.getColumns().add(tableColumnDef); }
		 */

		try {
			QDefinitionParser definitionParser = context.get(QDefinitionParser.class);
			QDefinitionParseResult definitionParseResult = definitionParser.parseDefinition(file.getCreationStatement().trim());

			QCreateViewStatement createViewStatement = (QCreateViewStatement) definitionParseResult.getDefinitionStatement();
			viewDef.setQuerySelect(createViewStatement.getQuery());

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return viewDef;
	}

	private QIndexDef adaptDatabaseFileToIndexDef(QDatabaseFile file) {

		QDatabaseFileFormat databaseFileFormat = file.getDatabaseFormat();
		if (databaseFileFormat.getKeys().isEmpty())
			return null;

		// logicalFile without physical reference
		if (file instanceof QLogicalFile && (file.getDictionary() == null || file.getDictionary().isEmpty()))
			return null;

		QIndexDef indexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();
		indexDef.setUnique(databaseFileFormat.isUnique());

		int i = 1;
		for (QFileFormatKey fileFormatKey : databaseFileFormat.getKeys()) {
			QIndexColumnDef indexColumnDef = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
			indexColumnDef.setName(fileFormatKey.getName());
			indexColumnDef.setSequence(i);
			if (fileFormatKey.isDescend())
				indexColumnDef.setOrdering(OrderingType.DESCEND);
			else
				indexColumnDef.setOrdering(OrderingType.ASCEND);

			indexDef.getColumns().add(indexColumnDef);
			i++;
		}

		return indexDef;
	}

	private QTableColumnDef adaptDataDefToTableColumnDef(QDataDef<?> dataDef) {

		QTableColumnDef tableColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();

		switch (dataDef.getDataDefType()) {
		case ADAPTER:
			return null;
		case ARRAY:
			return null;
		case BINARY:
			QBinaryDef binaryDef = (QBinaryDef) dataDef;
			switch (binaryDef.getType()) {
			case BYTE:
				tableColumnDef.setDataType(DatabaseDataType.INTEGER);
				break;
			case INTEGER:
				tableColumnDef.setDataType(DatabaseDataType.INTEGER);
				break;
			case LONG:
				return null;
			case SHORT:
				tableColumnDef.setDataType(DatabaseDataType.INTEGER);
				break;
			}
			return null;
		case BUFFER:
			return null;
		case CHARACTER:
			QCharacterDef characterDef = (QCharacterDef) dataDef;
			if (characterDef.isVarying())
				tableColumnDef.setDataType(DatabaseDataType.VARCHAR);
			else
				tableColumnDef.setDataType(DatabaseDataType.CHARACTER);
			tableColumnDef.setLength(characterDef.getLength());
			break;
		case DATA_STRUCT:
			return null;
		case DATETIME:
			QDatetimeDef datetimeDef = (QDatetimeDef) dataDef;
			switch (datetimeDef.getType()) {
			case DATE:
				tableColumnDef.setDataType(DatabaseDataType.DATE);
				break;
			case TIME:
				tableColumnDef.setDataType(DatabaseDataType.TIME);
				break;
			case TIME_STAMP:
				tableColumnDef.setDataType(DatabaseDataType.TIME_STAMP);
				break;
			default:
				break;
			}
			break;
		case DECIMAL:
			QDecimalDef decimalDef = (QDecimalDef) dataDef;
			tableColumnDef.setDataType(DatabaseDataType.DECIMAL);
			tableColumnDef.setLength(decimalDef.getPrecision());
			tableColumnDef.setScale(decimalDef.getScale());
			break;
		case FLOATING:
			QFloatingDef floatingDef = (QFloatingDef) dataDef;
			switch (floatingDef.getType()) {
			case DOUBLE:
				tableColumnDef.setDataType(DatabaseDataType.FLOAT);
				break;
			case SINGLE:
				tableColumnDef.setDataType(DatabaseDataType.FLOAT);
				break;
			}
			break;
		case HEXADECIMAL:
			return null;
		case INDICATOR:
			tableColumnDef.setDataType(DatabaseDataType.CHARACTER);
			tableColumnDef.setLength(1);
			break;
		case LIST:
			return null;
		case POINTER:
			return null;
		case SCROLLER:
			return null;
		case STRING:
			QStringDef stringDef = (QStringDef) dataDef;
			tableColumnDef.setDataType(DatabaseDataType.VARCHAR);
			tableColumnDef.setLength(stringDef.getLength());
			break;
		case STROLLER:
			return null;
		}

		return tableColumnDef;
	}

}