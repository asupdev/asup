/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.il.expr.base.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.asup.il.expr.base.antlr.cl.CLExprLexer;
import org.asup.il.expr.base.antlr.cl.CLExprParser;

public class TestCLParser {

	public static void main(String[] args) {
		new TestCLParser().doTest();
	}

	private void doTest() {

		int count = 0;
		int parsed = 0;
		int not_parsed = 0;

		
		try {
			URL entry = this.getClass().getClassLoader().getResource("cl_expressions.txt");
			File vTestFile = new File(entry.toURI());

			FileInputStream fstream = new FileInputStream(vTestFile);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String expr;

			// Read File Line By Line
			while ((expr = br.readLine()) != null) {
				count++;
				try {

					CLExprLexer lex = new CLExprLexer(new ANTLRStringStream(expr));
					CommonTokenStream tokens = new CommonTokenStream(lex);
					CLExprParser parser = new CLExprParser(tokens);
	
					parser.expression().getTree();
	
					parsed++;
				} catch (Exception vExc) {
					System.out.println("Row " + count + " not parsed: " + expr);					
					not_parsed++;
				}
				
			}

			// Close the input stream
			in.close();
		} catch (Exception vExc) {
			// TODO Auto-generated catch block
			vExc.printStackTrace();
			not_parsed++;
		}
		

		System.out.println("Results. Parsed: " + parsed + " Not parsed: " + not_parsed);

	}
}