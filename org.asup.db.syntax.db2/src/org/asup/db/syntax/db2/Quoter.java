package org.asup.db.syntax.db2;

import org.asup.db.core.QSchema;

public class Quoter {

	private final String startQuote;
	private final String endQuote;

	public Quoter(String quoteString) {
		this(quoteString, quoteString);
	}

	public Quoter(String startQuote, String endQuote) {
		this.startQuote = startQuote;
		this.endQuote = endQuote;
	}

	public String quote(String name) {
		if (needsQuoting(name)) {
			return startQuote + name + endQuote;
		} else {
			return name;
		}
	}
	
	private boolean needsQuoting(String name) {
		return name.contains(" ");
	}

	public String quoteFullName(QSchema schema, String objName) {
		return quote(schema.getName()) + "." + quote(objName);
	}
}
