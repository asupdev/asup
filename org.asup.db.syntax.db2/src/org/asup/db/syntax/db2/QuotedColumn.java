package org.asup.db.syntax.db2;

import org.asup.db.core.*;

public class QuotedColumn implements QTableColumn {

	private final QTableColumn implementer;
	private final Quoter quoter;

	public QuotedColumn(QTableColumn implementer, Quoter quoter) {
		this.implementer = implementer;
		this.quoter = quoter;
	}
	public String getName() {
		return quoter.quote(implementer.getName());
	}
	
	public QTable getTable() {
		return implementer.getTable();
	}


	public void setTable(QTable value) {
		implementer.setTable(value);
	}

	public void setName(String value) {
		implementer.setName(value);
	}

	public int getPrecision() {
		return implementer.getPrecision();
	}

	public void setPrecision(int value) {
		implementer.setPrecision(value);
	}

	public int getScale() {
		return implementer.getScale();
	}

	public void setScale(int value) {
		implementer.setScale(value);
	}

	public boolean isNullable() {
		return implementer.isNullable();
	}

	public void setNullable(boolean value) {
		implementer.setNullable(value);
	}

	public DataType getDataType() {
		return implementer.getDataType();
	}

	public void setDataType(DataType value) {
		implementer.setDataType(value);
	}



}
