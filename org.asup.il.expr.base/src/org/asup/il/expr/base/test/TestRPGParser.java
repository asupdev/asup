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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.asup.il.expr.base.antlr.rpg.RPGExprLexer;
import org.asup.il.expr.base.antlr.rpg.RPGExprParser;

public class TestRPGParser {
	public static void main(String[] args) {

		File vTestFile = new File(args[0]);
		int count = 0;
		int parsed = 0;
		int not_parsed = 0;
		try {

			  FileInputStream fstream = new FileInputStream(vTestFile);
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String expr;

			  //Read File Line By Line
			  while ((expr = br.readLine()) != null)   {
				  	count++;
					System.out.println(count + " Expr: " + expr);

					RPGExprLexer lex = new RPGExprLexer(new ANTLRStringStream(expr));
					CommonTokenStream tokens = new CommonTokenStream(lex);
					RPGExprParser parser = new RPGExprParser(tokens);

					CommonTree tree = parser.expression().getTree();
					System.out.println(tree.toStringTree());



					parsed++;

				}

			  //Close the input stream
			  in.close();
		}

		catch (Exception vExc) {
			// TODO Auto-generated catch block
			vExc.printStackTrace();
			not_parsed++;
		}

		System.out.println("Results. Parsed: " + parsed + " Not parsed: " + not_parsed);

	}
}