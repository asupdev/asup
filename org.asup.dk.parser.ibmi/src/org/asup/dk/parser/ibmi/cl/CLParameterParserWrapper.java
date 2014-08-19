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
package org.asup.dk.parser.ibmi.cl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.asup.dk.parser.ibmi.cl.antlr.CLParameterLexer;
import org.asup.dk.parser.ibmi.cl.antlr.CLParameterParser;
import org.asup.dk.parser.ibmi.cl.exceptions.CLScriptException;

public class CLParameterParserWrapper implements ParserInterface <Object> {


	@Override
	public Object parse(InputStream in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRInputStream(in, "UTF-8"));
		} catch (IOException e) {
            throw new CLScriptException(e);
		}
	}

	@Override
	public Object parse(Reader in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRReaderStream(in));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public Object parse(File f) throws CLScriptException {

		try {
			return invokeParser(new ANTLRFileStream(f.getCanonicalPath(), "UTF-8"));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public Object parse(String script) throws CLScriptException {
		return invokeParser(new ANTLRStringStream(script.trim() + "\n"));
	}



	private Object invokeParser(CharStream charstream) throws CLScriptException {
		try {

			// create a lexer & parser
		    CLParameterLexer lexer = new CLParameterLexer(charstream);
		    CLParameterParser parser = new CLParameterParser(new CommonTokenStream(lexer));

		    CommonTree tree = (CommonTree)parser.parse().getTree();
            return buildAST(tree.getText(), tree);

        } catch (RecognitionException ex) {
            ex.printStackTrace();
            throw new CLScriptException(ex);
        }
	}


	private Object buildAST(String parameter, CommonTree tree) {

		return new Object();

	}
}
