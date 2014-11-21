package org.asup.db.syntax.db2.quoting;

import java.util.regex.*;

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
        String nonAlphaRegex = "[\\W&&[^$#@]]"; 
        Pattern patern = Pattern.compile(nonAlphaRegex);
        Matcher matcher = patern.matcher(name);
        return matcher.find();
	}

	public String quoteFullName(QSchema schema, String objName) {
		return quote(schema.getName()) + "." + quote(objName);
	}
	
}
