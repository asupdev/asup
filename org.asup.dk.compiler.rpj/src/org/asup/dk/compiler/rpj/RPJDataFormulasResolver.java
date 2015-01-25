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
import org.asup.fw.core.FrameworkCoreUnexpectedConditionException;
import org.asup.il.data.IntegratedLanguageDataRuntimeException;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QPointer;
import org.asup.il.data.QPointerDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.il.expr.ExpressionType;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QBlockExpression;
import org.asup.il.expr.QCompoundTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QTermExpression;

public class RPJDataFormulasResolver extends RPJAbstractDataRefactor {

	private QExpressionParser expressionParser;
	private QDataFactory dataFactory;
	
	@Inject
	public RPJDataFormulasResolver(QCompilationUnit compilationUnit, QExpressionParser expressionParser, QDataFactory dataFactory) {
		super(compilationUnit);
		this.expressionParser = expressionParser;
		this.dataFactory = dataFactory;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataFormulasResolver(getCompilationUnit(), expressionParser, dataFactory);
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

			if (setProperty(dataTerm, property.getValue(), value))
				dataTerm.getDefinition().getFormulas().remove(formula);
		}

		// analyze initialization function
		if (dataTerm.getDataTermType().isUnary()) {
			QUnaryDataTerm<?> unaryDataTerm = (QUnaryDataTerm<?>) dataTerm;
			if (unaryDataTerm.getDefault() != null && !unaryDataTerm.getDefault().isEmpty()) {

				QExpression value = null;
				// TODO
				if (unaryDataTerm.getDefault().trim().equals("*Allx'00'"))
					value = expressionParser.parseExpression(unaryDataTerm.getDefault().trim().toUpperCase());
				else
					value = expressionParser.parseExpression(unaryDataTerm.getDefault());

				if (value.getExpressionType() == ExpressionType.COMPOUND) {

					QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;
					if (compoundTermExpression.getValue().toLowerCase().equals("%addr")) {

						if (!dataTerm.getDefinition().getDataClass().equals(QPointer.class))
							throw new FrameworkCoreUnexpectedConditionException("d9q6r35xcvbcvb40956");

						QPointerDef pointerDef = (QPointerDef) dataTerm.getDefinition();
						if (pointerDef.getTarget() != null)
							throw new FrameworkCoreUnexpectedConditionException("90mvqsdgdfag79fa");

						QDataTerm<?> dataValue = getDataValue(value);
						if (dataValue == null)
							throw new FrameworkCoreUnexpectedConditionException("90mvqsdgdfag79fasgfsdfg");

						pointerDef.setTarget(dataValue.getName());

						unaryDataTerm.setDefault(null);
					} 
					/*
					else if (compoundTermExpression.getValue().toLowerCase().equals("%size")) {
						
						
						
						// TODO calculate on @PostConstruct
					}*/ 					
					else if (compoundTermExpression.getValue().toUpperCase().equals("*ALL")) {
						// TODO calculate on @PostConstruct
					} else {
						QDataTerm<?> dataValue = getDataValue(value);
						switch (compoundTermExpression.getValue().toLowerCase()) {
						case "%elem":

							if (dataValue.getDataTermType().isUnary())
								throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsfwergds09f8s0d9");

							String stringValue = null;
							try {
								stringValue = Integer.toString(((QMultipleDataTerm<?>) dataValue).getDefinition().getDimension());
							} catch (Exception e) {
								throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgesdfsafdsf26sd", e);
							}

							unaryDataTerm.setDefault(stringValue);
							break;
						case "%size":
							if (dataValue.getDataTermType().isAtomic())
								throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsfwergds09f82343");

							QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>) dataValue;
							QCompoundDataDef<?> compoundDataDef = compoundDataTerm.getDefinition();
							
							QDataStruct dataStruct = dataFactory.createDataStruct(compoundDataDef.getElements(), 0, false);
							unaryDataTerm.setDefault(Integer.toString(dataStruct.getSize()));
							
							break;
						default:
							System.err.println(value);
							break;
						}
					}
				}
			}
		}
	}

	private boolean setProperty(QDataTerm<?> target, String propertyName, QExpression value) {

		boolean resolved = false;

		switch (value.getExpressionType()) {

		case ATOMIC:

			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) value;

			QDataTerm<?> dataValue = getCompilationUnit().getDataTerm(atomicTermExpression.getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr9q");

			switch (propertyName.toLowerCase()) {
			case "dimension":

				if (target.getDataTermType().isUnary())
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr123");

				QMultipleDataTerm<?> multipleTarget = (QMultipleDataTerm<?>) target;

				if (dataValue.getDataTermType().isUnary()) {
					if (!dataValue.isConstant())
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbt23423");

					QUnaryDataTerm<?> unaryValue = (QUnaryDataTerm<?>) dataValue;
					String defaultValue = unaryValue.getDefault();

					try {
						multipleTarget.getDefinition().setDimension(Integer.parseInt(defaultValue));
					} catch (Exception e) {
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgetg8rr5wq", e);
					}
				} else {
					QMultipleDataTerm<?> multipleValue = (QMultipleDataTerm<?>) dataValue;

					if (multipleTarget.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n69854n5687");

					if (multipleValue.getDefinition() == null)
						throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cvnbn53n6985sdfghsdfg");

					multipleTarget.getDefinition().setDimension(multipleValue.getDefinition().getDimension());
				}

				resolved = true;

				break;
			default:
				System.out.println(getCompilationUnit().getRoot().getName() + "." + target.getName() + "." + propertyName + "=" + value);
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
				resolved = setProperty(target, propertyName, parameterExpression);

				break;

			default:
				System.out.println(getCompilationUnit().getRoot().getName() + "." + target.getName() + "." + propertyName + "=" + compoundTermExpression.getValue());
				break;
			}

			break;

		case BLOCK:
			QBlockExpression blockValue = (QBlockExpression) value;
			setProperty(target, propertyName, blockValue.getExpression());
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

	private QDataTerm<?> getDataValue(QExpression value) {

		QDataTerm<?> dataValue = null;

		switch (value.getExpressionType()) {

		case ATOMIC:

			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) value;

			dataValue = getCompilationUnit().getDataTerm(atomicTermExpression.getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdget9qbtr9q");

			break;

		case COMPOUND:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) value;

			if (compoundTermExpression.getElements().size() != 1)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsf66df6agdsa99");

			QExpression parameterExpression = compoundTermExpression.getElements().get(0);
			if (!(parameterExpression instanceof QAtomicTermExpression))
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdsfwergw8r8wsa99");

			dataValue = getCompilationUnit().getDataTerm(((QAtomicTermExpression) parameterExpression).getValue(), true);
			if (dataValue == null)
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564sxdgwefw9def9q");

			break;

		case BLOCK:
			QBlockExpression blockValue = (QBlockExpression) value;
			dataValue = getDataValue(blockValue.getExpression());
			break;

		case ASSIGNMENT:
		case BOOLEAN:
		case ARITHMETIC:
		case LOGICAL:
		case RELATIONAL:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cb564q56pbdn7d6srre33r");
		}

		return dataValue;

	}
}