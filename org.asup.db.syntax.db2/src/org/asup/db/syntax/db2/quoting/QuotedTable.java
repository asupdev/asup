package org.asup.db.syntax.db2.quoting;

import java.util.*;

import org.asup.db.core.*;

public class QuotedTable implements QTable {

	private final QTable implementer;
	private final Quoter quoter;

	public QuotedTable(QTable implementer, Quoter quoter) {
		this.implementer = implementer;
		this.quoter = quoter;
	}
	
	public String getName() {
		return quoter.quote(implementer.getName());
	}

	public String getFullName() {
		return quoter.quoteFullName(getSchema(), implementer.getName());
	}
	
	public void setName(String value) {
		implementer.setName(value);
	}

	public List<QTableColumn> getColumns() {
		List<QTableColumn> result = new ArrayList<QTableColumn>();
		for (QTableColumn column : implementer.getColumns()) {
			result.add(new QuotedColumn(column, quoter));
		}
		return result;
	}



	public QSchema getSchema() {
		return implementer.getSchema();
	}

	public void setSchema(QSchema value) {
		implementer.setSchema(value);
	}

}
