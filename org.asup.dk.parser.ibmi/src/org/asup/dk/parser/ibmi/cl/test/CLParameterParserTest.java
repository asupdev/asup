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

public class CLParameterParserTest {

	private boolean onlyError = false;
	private ParserInterface<Object> parameterParser;
	private File input;

	@SuppressWarnings("unchecked")
	public CLParameterParserTest(String filePath, boolean onlyError) {
		
		parameterParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL_PARAMETER);		
		
		input = new File(filePath);
		this.onlyError = onlyError;
	}


	private void doTest() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(input));
			String expression = null;
			while(true) {
				expression = reader.readLine();
				if (expression != null) {
					if (expression.length() > 0){
						doParse(expression);
					}
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
		finally {}
	}			
		
	private void doParse(String expression){
		
		System.out.println("Parse: " + expression);

		Object result = null;
		try
		{
			result = parameterParser.parse(expression);			
		}
		catch(Exception exc)
		{
			System.out.println("Expression: " + expression);
			exc.printStackTrace();
		}
		
		if (result != null && onlyError == false) {

			//TODO: insert test output
		}

	}

	public static void main(String[] args) {	
		
		CLParameterParserTest test;
		
		if (args.length == 2 && args[1].equalsIgnoreCase("--errors")) {		
			test = new CLParameterParserTest(args[0], true);
		} else {
			test = new CLParameterParserTest(args[0], false);
		}
		
		test.doTest();	

	}

}
