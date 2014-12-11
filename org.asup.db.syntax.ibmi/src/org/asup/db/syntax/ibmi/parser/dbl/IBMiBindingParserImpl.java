package org.asup.db.syntax.ibmi.parser.dbl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.asup.db.syntax.QBindingParseResult;
import org.asup.db.syntax.impl.BindingParserImpl;

public class IBMiBindingParserImpl extends BindingParserImpl {
	
	private DBLModelBuilder bindingBuilder;

	public IBMiBindingParserImpl() {
		bindingBuilder = new DBLModelBuilder();
	}

	@Override
	public QBindingParseResult parseBinding(InputStream bindingStream) throws SQLException {
		
		return super.parseBinding(toString(bindingStream));
	}

	@Override
	public QBindingParseResult parseBinding(String bindingString) throws SQLException {
		
		QBindingParseResult parseResult = bindingBuilder.parseBinding(bindingString);
		return parseResult;
	}
	
	public static String toString(InputStream is) {
        try {
    		BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringBuffer message = new StringBuffer();
            while (true) {
            	String input = in.readLine();
                if(input == null) break;
                message.append(input);
            }
            return message.toString();
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        	return "";
        }
	}
}
