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
import org.antlr.runtime.tree.Tree;
import org.asup.dk.parser.ibmi.cl.antlr.CLParameterLexer;
import org.asup.dk.parser.ibmi.cl.antlr.CLParameterParser;
import org.asup.dk.parser.ibmi.cl.exceptions.CLScriptException;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmAbstractComponent;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmFunction;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmFunction.CLParmFunctionType;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmList;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmSpecial;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmString;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmStringOperator;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmStringOperator.CLParmStringOperatorType;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmValue;
import org.asup.dk.parser.ibmi.cl.model.parm.CLParmVariable;

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


	private CLParmAbstractComponent buildAST(String parameter, CommonTree tree) {
		
		// The response is always a list of values, so return an object of this type		
		Tree antlrNode = tree.getChild(0);
		
		return build(null, antlrNode);

	}
	
	CLParmAbstractComponent build(CLParmAbstractComponent father, Tree antlrNode) {
		
		CLParmAbstractComponent buildNode = null; 
		switch (father.getComponentType()) {
		case LIST:
			
			buildNode = new CLParmList();
			
			for (int i = 0; i < antlrNode.getChildCount(); i++) {
				buildNode.addChild(build(buildNode, antlrNode.getChild(i)));
			}
			
			break;
		
		case TOKEN:
			
			buildNode = new CLParmValue();
			buildNode.setText(antlrNode.getText());
			
			break;
		
		case VARIABLE:
			
			buildNode = new CLParmVariable();
			buildNode.setText(antlrNode.getText());
			
			break;
			
		case SPECIAL:
			
			buildNode = new CLParmSpecial();
			buildNode.setText(antlrNode.getText());
			
			break;	

		case STRING:
			
			buildNode = new CLParmString();
			buildNode.setText(antlrNode.getText());
			
			break;	
			
		case FUNCTION:
			
			buildNode = new CLParmFunction();
			
			if ("%SST".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.SST);
			} else if ("%SWITCH".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.SWITCH);
			} else if ("%BINARY".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.BINARY);
			} else if ("%BIN".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.BIN);
			}
			
			for (int i = 0; i < antlrNode.getChildCount(); i++) {
				buildNode.addChild(build(buildNode, antlrNode.getChild(i)));
			}
			
			break;	
		
		case STR_OPERATOR:
			
			buildNode = new CLParmStringOperator();
			
			if ("*CAT".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmStringOperator)buildNode).setOperatorType(CLParmStringOperatorType.CAT);
			} else if ("*BCAT".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmStringOperator)buildNode).setOperatorType(CLParmStringOperatorType.BCAT);
			} else if ("*TCAT".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmStringOperator)buildNode).setOperatorType(CLParmStringOperatorType.TCAT);
			} 
						
			for (int i = 0; i < antlrNode.getChildCount(); i++) {
				buildNode.addChild(build(buildNode, antlrNode.getChild(i)));
			}
			
			break;
			
		default:
			break;
		}
		
		// Set father node
		buildNode.setFather(father);
				
		return buildNode;
	}
		
}
