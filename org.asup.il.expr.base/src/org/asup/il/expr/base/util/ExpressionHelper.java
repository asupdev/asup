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
package org.asup.il.expr.base.util;

import org.antlr.runtime.tree.Tree;
import org.asup.il.expr.ArithmeticOperator;
import org.asup.il.expr.AtomicType;
import org.asup.il.expr.ExpressionType;
import org.asup.il.expr.LogicalOperator;
import org.asup.il.expr.RelationalOperator;

public interface ExpressionHelper {

	public ExpressionType getExpressionType (Tree tree);
	
	public AtomicType getTermType(Tree node);
	
	public ArithmeticOperator getArithmeticOperator(Tree node);
	
	public LogicalOperator getLogicalOperator(Tree node);
	
	public RelationalOperator getRelationalOperator(Tree node);

	public boolean isSpecial(Tree node);

	public boolean isFunction(Tree node);
	
	public Tree parse(String expression);
	
	public String normalizeText(String text);
}
