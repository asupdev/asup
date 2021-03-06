/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Giuliano Giancristofaro - Initial API and implementation 
 */
package org.asup.dk.compiler.rpj.writer;

import java.util.Stack;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.core.QAnnotationTest;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QMethodExec;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;

public class JDTStatementTestWriter extends JDTStatementWriter {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;

	private AST ast;
	private Stack<Block> blocks = new Stack<>();

	public void setAST(AST ast) {
		this.ast = ast;
		super.setAST(ast);
	}

	public Stack<Block> getBlocks() {
		blocks = super.getBlocks();
		return blocks;
	}

	public boolean visit(QEval statement) {
		super.visit(statement);
		Block block = blocks.peek();
		
		// Annotation
		if(statement.getFacet(QAnnotationTest.class)!=null){
			JDTAssertionTestWriter assertionTestWriter = new JDTAssertionTestWriter(ast, compilationUnit, expressionParser);
			QAnnotationTest qAnnotationTest = statement.getFacet(QAnnotationTest.class);
			assertionTestWriter.writeAssertion(qAnnotationTest, block, statement.toString());
			// TODO remove facet annotation
//			statement.getFacets().remove(qAnnotationTest);
		}
		return false;
	}

	public boolean visit(QMethodExec statement) {
		super.visit(statement);
		Block block = blocks.peek();
		// Annotation
		if(statement.getFacet(QAnnotationTest.class)!=null){
			JDTAssertionTestWriter assertionTestWriter = new JDTAssertionTestWriter(ast, compilationUnit, expressionParser);
			QAnnotationTest qAnnotationTest = statement.getFacet(QAnnotationTest.class);
			assertionTestWriter.writeAssertion(qAnnotationTest, block, statement.toString());
			// TODO remove facet annotation
//			statement.getFacets().remove(qAnnotationTest);
		}

		return false;
	}
}