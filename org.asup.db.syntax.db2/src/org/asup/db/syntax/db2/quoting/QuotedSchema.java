package org.asup.db.syntax.db2.quoting;

import java.util.List;

import org.asup.db.core.*;

public class QuotedSchema implements QSchema {

	private final QSchema schema;
	private final Quoter quoter;

	public String getName() {
		return quoter.quote(schema.getName());
	}
	
	public QuotedSchema(QSchema schema, Quoter quoter) {
		this.schema = schema;
		this.quoter = quoter;
	}
	
	public QDatabase getDatabase() {
		return schema.getDatabase();
	}

	public void setDatabase(QDatabase value) {
		schema.setDatabase(value);
	}

	public List<QTable> getTables() {
		return schema.getTables();
	}

	public List<QView> getViews() {
		return schema.getViews();
	}

	public List<QIndex> getIndexes() {
		return schema.getIndexes();
	}

	public void setName(String value) {
		schema.setName(value);
	}

}
