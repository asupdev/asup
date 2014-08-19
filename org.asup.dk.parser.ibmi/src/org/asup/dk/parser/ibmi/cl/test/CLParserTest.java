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

import java.io.File;
import java.util.Enumeration;

import org.asup.dk.parser.ibmi.cl.ParserFactory;
import org.asup.dk.parser.ibmi.cl.ParserInterface;
import org.asup.dk.parser.ibmi.cl.model.CLMonitorMessage;
import org.asup.dk.parser.ibmi.cl.model.CLObject;
import org.asup.dk.parser.ibmi.cl.model.CLParameter;
import org.asup.dk.parser.ibmi.cl.model.CLPositionalParameter;
import org.asup.dk.parser.ibmi.cl.model.CLRow;
import org.asup.dk.parser.ibmi.cl.util.CLParserUtil;

public class CLParserTest {

	private boolean onlyError = false;
	private ParserInterface<CLObject> clParser;
	private File input;

	@SuppressWarnings("unchecked")
	public CLParserTest(String filePath, boolean onlyError) {
		
		clParser = ParserFactory.getInstance().getParser(ParserFactory.ScriptType.CL);		
		
		input = new File(filePath);
		this.onlyError = onlyError;
	}


	private void doTest() {
		
		if (input.isDirectory()) {
			File[] files = input.listFiles();
			for (File tmpFile: files) {
				doParse(tmpFile);
			}
		} else {
			doParse(input);
		}
	}
				
		
	private void doParse(File file){

		CLObject result = null;
		try
		{
			result = clParser.parse(file);
			result = CLParserUtil.manageMonMsg(result);
		}
		catch(Exception exc)
		{
			System.out.println("File: " + file.toString());
			exc.printStackTrace();
		}
		
		if (result != null && onlyError == false) {

			StringBuffer rowlog = new StringBuffer();
	
			for (CLRow row : result.getRows()) {
	
				rowlog.append("Riga: " + row.getLine());
				rowlog.append(" Label: " + (row.getLabel() != null?row.getLabel().getText(): "no label"));
				if (row.getCommand() != null)
				{
					rowlog.append(" Cmd: " + row.getCommand().getName());
	
					if (row.getCommand().getPositionalParms().size() > 0)
					{
						for (CLPositionalParameter posPar: row.getCommand().getPositionalParms())
						{
							rowlog.append( " PosParm: " + posPar.getText());
						}
					}
	
					if (row.getCommand().getParms().size() > 0)
					{
						Enumeration<String> e = row.getCommand().getParms().keys();
						CLParameter parm = null;
						while(e.hasMoreElements())
						{
							parm = row.getCommand().getParm(e.nextElement().toUpperCase());
							rowlog.append( " Parm: " + parm.getText());
						}	
					}
					
					if (row.getCommand().getMonMessages().size() > 0)
					{
						for (CLMonitorMessage monMsg: row.getCommand().getMonMessages())
						{
							rowlog.append( " MONMSG(" + monMsg.getMsgID() +": " + monMsg.getExec() +")");
						}
					}
				}
	
				rowlog.append("\n");
			}
	
			System.out.println(rowlog.toString());
		}

	}

	public static void main(String[] args) {	
		
		CLParserTest test;
		
		if (args.length == 2 && args[1].equalsIgnoreCase("--errors")) {		
			test = new CLParserTest(args[0], true);
		} else {
			test = new CLParserTest(args[0], false);
		}
		
		test.doTest();	

	}

}
