/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.asup.dk.parser.ibmi.cl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.asup.dk.parser.ibmi.cl.ParserFactory;
import org.asup.dk.parser.ibmi.cl.ParserInterface;
import org.asup.il.expr.QExpression;

public class CLExpressionParserTest {

	private boolean onlyError = false;
	private ParserInterface<QExpression> expressionParser;
	private File input;

	@SuppressWarnings("unchecked")
	public CLExpressionParserTest(String filePath, boolean onlyError) {
		
		expressionParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL_EXPRESSION);		
		
		input = new File(filePath);
		this.onlyError = onlyError;
	}


	private void doTest() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(input));
			String expression = null;
			while(true) {
				expression = reader.readLine();
				if (expression != null && expression.length() > 0) {
					doParse(expression);
				}
				else break;
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}			
		
	private void doParse(String expression){
		
		System.out.println("Parse: " + expression);

		QExpression result = null;
		try
		{
			result = expressionParser.parse(expression);			
		}
		catch(Exception exc)
		{
			System.out.println("Expression: " + expression);
			exc.printStackTrace();
		}
		
		if (result != null && onlyError == false) {

			StringBuffer rowlog = new StringBuffer();
			System.out.println(rowlog.toString());
		}

	}

	public static void main(String[] args) {	
		
		CLExpressionParserTest test;
		
		if (args.length == 2 && args[1].equalsIgnoreCase("--errors")) {		
			test = new CLExpressionParserTest(args[0], true);
		} else {
			test = new CLExpressionParserTest(args[0], false);
		}
		
		test.doTest();	

	}

}
