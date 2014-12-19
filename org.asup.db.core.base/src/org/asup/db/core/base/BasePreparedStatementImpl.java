package org.asup.db.core.base;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

import org.asup.db.core.QConnection;
import org.asup.db.core.QPreparedStatement;

public class BasePreparedStatementImpl extends BaseStatementImpl implements QPreparedStatement, PreparedStatement {

	private PreparedStatement rawStatement;
	
	protected BasePreparedStatementImpl(QConnection connection, PreparedStatement statement, boolean native_) {
		super(connection, statement, native_);
		
		this.rawStatement = statement;
	}

	public void setArray(int parameterIndex, Array x) throws SQLException {
		rawStatement.setArray(parameterIndex, x);
	}

	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		rawStatement.setAsciiStream(parameterIndex, x, length);
	}

	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
		rawStatement.setAsciiStream(parameterIndex, x, length);
	}

	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
		rawStatement.setAsciiStream(parameterIndex, x);
	}

	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		rawStatement.setBigDecimal(parameterIndex, x);
	}

	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
		rawStatement.setBinaryStream(parameterIndex, x, length);
	}

	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
		rawStatement.setBinaryStream(parameterIndex, x, length);
	}

	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
		rawStatement.setBinaryStream(parameterIndex, x);
	}

	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		rawStatement.setBlob(parameterIndex, x);
	}

	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
		rawStatement.setBlob(parameterIndex, inputStream, length);
	}

	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
		rawStatement.setBlob(parameterIndex, inputStream);
	}

	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		rawStatement.setBoolean(parameterIndex, x);
	}

	public void setByte(int parameterIndex, byte x) throws SQLException {
		rawStatement.setByte(parameterIndex, x);
	}

	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		rawStatement.setBytes(parameterIndex, x);
	}

	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		rawStatement.setCharacterStream(parameterIndex, reader, length);
	}

	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
		rawStatement.setCharacterStream(parameterIndex, reader, length);
	}

	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
		rawStatement.setCharacterStream(parameterIndex, reader);
	}

	public void setClob(int parameterIndex, Clob x) throws SQLException {
		rawStatement.setClob(parameterIndex, x);
	}

	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
		rawStatement.setClob(parameterIndex, reader, length);
	}

	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		rawStatement.setClob(parameterIndex, reader);
	}

	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		rawStatement.setDate(parameterIndex, x, cal);
	}

	public void setDate(int parameterIndex, Date x) throws SQLException {
		rawStatement.setDate(parameterIndex, x);
	}

	public void setDouble(int parameterIndex, double x) throws SQLException {
		rawStatement.setDouble(parameterIndex, x);
	}

	public void setFloat(int parameterIndex, float x) throws SQLException {
		rawStatement.setFloat(parameterIndex, x);
	}

	public void setInt(int parameterIndex, int x) throws SQLException {
		rawStatement.setInt(parameterIndex, x);
	}

	public void setLong(int parameterIndex, long x) throws SQLException {
		rawStatement.setLong(parameterIndex, x);
	}

	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
		rawStatement.setNCharacterStream(parameterIndex, value, length);
	}

	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
		rawStatement.setNCharacterStream(parameterIndex, value);
	}

	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		rawStatement.setNClob(parameterIndex, value);
	}

	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
		rawStatement.setNClob(parameterIndex, reader, length);
	}

	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		rawStatement.setNClob(parameterIndex, reader);
	}

	public void setNString(int parameterIndex, String value) throws SQLException {
		rawStatement.setNString(parameterIndex, value);
	}

	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
		rawStatement.setNull(parameterIndex, sqlType, typeName);
	}

	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		rawStatement.setNull(parameterIndex, sqlType);
	}

	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
		rawStatement.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
	}

	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		rawStatement.setObject(parameterIndex, x, targetSqlType);
	}

	public void setObject(int parameterIndex, Object x) throws SQLException {
		rawStatement.setObject(parameterIndex, x);
	}

	public void setRef(int parameterIndex, Ref x) throws SQLException {
		rawStatement.setRef(parameterIndex, x);
	}

	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		rawStatement.setRowId(parameterIndex, x);
	}

	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
		rawStatement.setSQLXML(parameterIndex, xmlObject);
	}

	public void setShort(int parameterIndex, short x) throws SQLException {
		rawStatement.setShort(parameterIndex, x);
	}

	public void setString(int parameterIndex, String x) throws SQLException {
		rawStatement.setString(parameterIndex, x);
	}

	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		rawStatement.setTime(parameterIndex, x, cal);
	}

	public void setTime(int parameterIndex, Time x) throws SQLException {
		rawStatement.setTime(parameterIndex, x);
	}

	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		rawStatement.setTimestamp(parameterIndex, x, cal);
	}

	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		rawStatement.setTimestamp(parameterIndex, x);
	}

	public void setURL(int parameterIndex, URL x) throws SQLException {
		rawStatement.setURL(parameterIndex, x);
	}

	@SuppressWarnings("deprecation")
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
		rawStatement.setUnicodeStream(parameterIndex, x, length);
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return rawStatement.getMetaData();
	}

	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		return rawStatement.getParameterMetaData();
	}

	@Override
	public void addBatch() throws SQLException {
		rawStatement.addBatch();		
	}

	@Override
	public void clearParameters() throws SQLException {
		rawStatement.clearParameters();
	}

	@Override
	public boolean execute() throws SQLException {
		return rawStatement.execute();
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		return rawStatement.executeQuery();
	}

	@Override
	public int executeUpdate() throws SQLException {
		return rawStatement.executeUpdate();
	}
}
