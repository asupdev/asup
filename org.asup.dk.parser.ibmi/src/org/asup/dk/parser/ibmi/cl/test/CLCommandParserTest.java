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
import java.util.Enumeration;

import org.asup.dk.parser.ibmi.cl.ParserFactory;
import org.asup.dk.parser.ibmi.cl.ParserInterface;
import org.asup.dk.parser.ibmi.cl.model.CLCommand;
import org.asup.dk.parser.ibmi.cl.model.CLParameter;
import org.asup.dk.parser.ibmi.cl.model.CLPositionalParameter;

public class CLCommandParserTest {

	private boolean onlyError = false;
	private ParserInterface<CLCommand> commandParser;
	private File input;
	private StringBuffer log;

	@SuppressWarnings("unchecked")
	public CLCommandParserTest(String filePath, boolean onlyError) {
		
		commandParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL);		
		
		input = new File(filePath);
		this.onlyError = onlyError;
	}


	private void doTest() {
		
		try {
			
			log = new StringBuffer();
			
			BufferedReader reader = new BufferedReader(new FileReader(input));
			String command = null;
			while(true) {
				command = reader.readLine();
				if (command != null) {
					if (command.length() > 0){
						doParse(command);
					}
				}
				else break;
			}
			
			System.out.println(log.toString());
			
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}			
				
		
	private void doParse(String commandStr){

		CLCommand command = null;
		try
		{
			command = commandParser.parse(commandStr);			
		}
		catch(Exception exc)
		{
			System.out.println("Command: " + commandStr);
			exc.printStackTrace();
		}
		
		if (command != null && onlyError == false) {

			System.out.print(" Cmd: " + command.getName());

			if (command.getPositionalParms().size() > 0)
			{
				for (CLPositionalParameter posPar: command.getPositionalParms())
				{
					System.out.print( " PosParm: " + posPar.getText());
				}
			}

			if (command.getParms().size() > 0)
			{
				Enumeration<String> e = command.getParms().keys();
				CLParameter parm = null;
				while(e.hasMoreElements())
				{
					parm = command.getParm(e.nextElement().toUpperCase());
					System.out.print( " Parm: " + parm.getText());
				}	
			}

			System.out.println("");

		}

	}

	public static void main(String[] args) {	
		
		CLCommandParserTest test;
		
		if (args.length == 2 && args[1].equalsIgnoreCase("--errors")) {		
			test = new CLCommandParserTest(args[0], true);
		} else {
			test = new CLCommandParserTest(args[0], false);
		}
		
		test.doTest();	

	}

}
