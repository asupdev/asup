package org.asup.db.syntax.db2.quoting;

import org.asup.db.core.*;

public class QuotedIndexColumn implements QIndexColumn {

	private Quoter quoter;
	private QIndexColumn implementer;

	public QuotedIndexColumn(QIndexColumn column, Quoter quoter) {
		this.implementer = column;
		this.quoter = quoter;
	}

	public String getName() {
		return quoter.quote(implementer.getName());
	}

	public void setName(String value) {
		implementer.setName(value);
	}

	public OrderingType getOrdering() {
		return implementer.getOrdering();
	}

	public void setOrdering(OrderingType value) {
		implementer.setOrdering(value);
	}

	public int getSequence() {
		return implementer.getSequence();
	}

	public void setSequence(int value) {
		implementer.setSequence(value);
	}

	public QIndex getIndex() {
		return implementer.getIndex();
	}

	public void setIndex(QIndex value) {
		implementer.setIndex(value);
	}
}
