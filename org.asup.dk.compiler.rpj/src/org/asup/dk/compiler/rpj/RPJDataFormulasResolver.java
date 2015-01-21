/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi 			 - Initial API and implementation 
 *   Giuliano Giancristofaro - Implementation
 */
package org.asup.dk.compiler.rpj;

import java.util.ArrayList;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.data.IntegratedLanguageDataRuntimeException;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QBlockExpression;
import org.asup.il.expr.QCompoundTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QTermExpression;

public class RPJDataFormulasResolver extends RPJAbstractDataRefactor {

	private QExpressionParser expressionParser;

	@Inject
	public RPJDataFormulasResolver(QCompilationUnit compilationUnit, QExpressionParser expressionParser) {
		super(compilationUnit);
		this.expressionParser = expressionParser;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataFormulasResolver(getCompilationUnit(), expressionParser);
	}

	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {

		resolveFormula(term);

		return super.visit(term);
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		resolveFormula(term);

		return super.visit(term);
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		resolveFormula(term);

		return super.visit(term);
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		resolveFormula(term);

		return super.visit(term);
	}

	private void resolveFormula(QDataTerm<?> dataTerm) {

		for (String formula : new ArrayList<String>(dataTerm.getDefinition().getFormulas())) {

			QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(formula);

			QTermExpression property = assignmentExpression.getLeftOperand();
			QExpression value = assignmentExpression.getRightOperand();

			if(setProperty(dataTerm, property, value))
				dataTerm.getDefinition().getFormulas().remove(formula);
		}
	}

	private boolean setProperty(QDataTerm<?> target, QTermExpression property, QExpression value) {

		boolean resolved = false;
		
		switch (value.getExpressionType()) {

		case ATOMIC:

			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) value;

			QDataTerm<?> dataValue = getCompilationUnit().getDataTerm(atomicTermExpression.getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr9q");

			switch (property.getValue().toLowerCase()) {
			case "dimension":

				if(target.getDataTermType().isUnary())
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr123");

				QMultipleDataTerm<?> multipleTarget = (QMultipleDataTerm<?>) target;
				
				if(dataValue.getDataTermType().isUnary()) {
					if(!dataValue.isConstant())
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbt23423");
					
					QUnaryDataTerm<?> unaryValue = (QUnaryDataTerm<?>) dataValue;
					String defaultValue = unaryValue.getDefault();
					
					try {
						multipleTarget.getDefinition().setDimension(Integer.parseInt(defaultValue));
					}
					catch(Exception e) {
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgetg8rr5wq", e);
					}
				}
				else {
					QMultipleDataTerm<?> multipleValue = (QMultipleDataTerm<?>) dataValue;
					
					if(multipleTarget.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n69854n5687");
					
					if(multipleValue.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n6985sdfghsdfg");
					
					multipleTarget.getDefinition().setDimension(multipleValue.getDefinition().getDimension());										
				}

				resolved = true;
				
				break;
			default:
				System.out.println(getCompilationUnit().getRoot().getName() + "." + target.getName() + "." + property + "=" + value);
				break;
			}

			break;

		case COMPOUND:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;
			switch (compoundTermExpression.getValue().toLowerCase()) {
			case "%elem":

				if (compoundTermExpression.getElements().size() != 1)
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9dsagdsa99");

				QExpression parameterExpression = compoundTermExpression.getElements().get(0);
				resolved = setProperty(target, property, parameterExpression);

				break;

			default:
				System.out.println(getCompilationUnit().getRoot().getName() + "." + target.getName() + "." + property + "=" + compoundTermExpression.getValue());
				break;
			}

			break;

		case BLOCK:
			QBlockExpression blockValue = (QBlockExpression) value;
			setProperty(target, property, blockValue.getExpression());
			break;

		case ASSIGNMENT:
		case BOOLEAN:
		case ARITHMETIC:
		case LOGICAL:
		case RELATIONAL:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564q56pbdn7d6srre8r");
		}

		
		return resolved;
	}
}