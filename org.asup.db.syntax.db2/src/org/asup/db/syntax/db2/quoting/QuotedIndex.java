package org.asup.db.syntax.db2.quoting;

import java.util.*;

import org.asup.db.core.*;

public class QuotedIndex implements QIndex {

	private final QIndex implementer;
	private final Quoter quoter;

	public QuotedIndex(QIndex implementer, Quoter quoter) {
		this.implementer = implementer;
		this.quoter = quoter;
	}


	public String getName() {
		return quoter.quote(implementer.getName());
	}

	public String getFullName() {
		return quoter.quoteFullName(implementer.getSchema(), implementer.getName());
	}

	public void setName(String value) {
		implementer.setName(value);
	}

	public List<QIndexColumn> getColumns() {
		List<QIndexColumn> result = new ArrayList<QIndexColumn>();
		for (QIndexColumn column : implementer.getColumns()) {
			result.add(new QuotedIndexColumn(column, quoter));
		}
		return result;
	}

	public boolean isUnique() {
		return implementer.isUnique();
	}

	public void setUnique(boolean value) {
		implementer.setUnique(value);
	}

	public QSchema getSchema() {
		return new QuotedSchema(implementer.getSchema(), quoter);
	}

	public void setSchema(QSchema value) {
		implementer.setSchema(value);
	}

	public String getObject() {
		return quoter.quote(implementer.getObject());
	}

	public void setObject(String value) {
		implementer.setObject(value);
	}

}
