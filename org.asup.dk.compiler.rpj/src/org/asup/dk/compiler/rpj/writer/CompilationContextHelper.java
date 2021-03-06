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
 *   Mattia Rocchi			 - Implementation
 */
package org.asup.dk.compiler.rpj.writer;

import java.util.Date;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QPointerDef;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QBlockExpression;
import org.asup.il.expr.QBooleanExpression;
import org.asup.il.expr.QCompoundTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QPrototype;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QKeyListTerm;
import org.asup.os.type.file.QExternalFile;

public class CompilationContextHelper {

	public static boolean isPrimitive(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ARITHMETIC:
			return true;
		case ASSIGNMENT:
			break;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
			case DATETIME:
			case FLOATING:
			case HEXADECIMAL:
			case INTEGER:
			case STRING:
				return true;
			case SPECIAL:
				return false;
			case INDICATOR:
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm == null)
					return true;

				break;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;

			return isPrimitive(compilationUnit, blockExpression.getExpression());
		case COMPOUND:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm == null)
				return true;

			break;
		case LOGICAL:
			return true;
		case RELATIONAL:
			return true;
		case BOOLEAN:
			QBooleanExpression booleanExpression = (QBooleanExpression) expression;

			return isPrimitive(compilationUnit, booleanExpression.getOperand());
		}

		return false;
	}

	public static boolean isSpecial(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ARITHMETIC:
		case ASSIGNMENT:
		case COMPOUND:
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
			return false;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
			case DATETIME:
			case FLOATING:
			case HEXADECIMAL:
			case INTEGER:
			case STRING:
			case INDICATOR:
			case NAME:
				return false;
			case SPECIAL:
				return true;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;
			return isSpecial(compilationUnit, blockExpression.getExpression());
		}

		return false;
	}

	public static boolean isPointer(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
			case DATETIME:
			case FLOATING:
			case HEXADECIMAL:
			case INTEGER:
			case SPECIAL:
			case STRING:
				return false;
			case INDICATOR:
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm == null)
					return false;

				return dataTerm.getDefinition() instanceof QPointerDef;
			}
		case COMPOUND:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm == null)
				return true;

			return dataTerm.getDefinition() instanceof QPointerDef;
		default:
			return false;
		}
	}

	public static Class<?> getJavaClass(QCompilationUnit compilationUnit, QExpression expression) {

		switch (expression.getExpressionType()) {
		case ARITHMETIC:
			return Integer.class;
		case ASSIGNMENT:
			break;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression;

			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
				return Boolean.class;
			case DATETIME:
				return Date.class;
			case FLOATING:
				return Float.class;
			case HEXADECIMAL:
				return Byte.class;
			case INTEGER:
				return Integer.class;
			case SPECIAL:
				return Enum.class;
			case STRING:
				return String.class;
			case INDICATOR:
				return Boolean.class;
			case NAME:

				QNamedNode namedNode = compilationUnit.getNamedNode(atomicTermExpression.getValue(), true);
				QDataTerm<?> dataTerm = getDataTerm(namedNode);
				if (dataTerm != null) {

					if(dataTerm instanceof QMultipleAtomicDataTerm) {
						QMultipleAtomicDataTerm<?> multipleDataTerm = (QMultipleAtomicDataTerm<?>) dataTerm;
						return multipleDataTerm.getDefinition().getArgument().getJavaClass();
					}
					else
						return dataTerm.getDefinition().getJavaClass();

				}

				
				break;
			}
			break;
		case BLOCK:
			QBlockExpression blockExpression = (QBlockExpression) expression;

			return getJavaClass(compilationUnit, blockExpression.getExpression());
		case COMPOUND:
			QCompoundTermExpression compoundTermExpression = (QCompoundTermExpression) expression;

			QNamedNode namedNode = compilationUnit.getNamedNode(compoundTermExpression.getValue(), true);
			QDataTerm<?> dataTerm = getDataTerm(namedNode);
			if (dataTerm != null) {
				
				if(dataTerm instanceof QMultipleAtomicDataTerm) {
					QMultipleAtomicDataTerm<?> multipleDataTerm = (QMultipleAtomicDataTerm<?>) dataTerm;
					return multipleDataTerm.getDefinition().getArgument().getJavaClass();
				}
				else
					return dataTerm.getDefinition().getJavaClass();
			}

			break;
		case LOGICAL:
			return Boolean.class;
		case RELATIONAL:
			return Boolean.class;
		case BOOLEAN:
			QBooleanExpression booleanExpression = (QBooleanExpression) expression;

			return getJavaClass(compilationUnit, booleanExpression.getOperand());
		}

		return null;
	}

	private static QDataTerm<?> getDataTerm(QNamedNode namedNode) {

		QDataTerm<?> dataTerm = null;

		if (namedNode instanceof QPrototype) {
			QPrototype<?> prototype = (QPrototype<?>) namedNode;
			dataTerm = prototype.getDelegate();
		} else if (namedNode instanceof QDataTerm<?>) {
			dataTerm = (QDataTerm<?>) namedNode;
		} else
			return null;

		return dataTerm;
	}
	

	public static boolean containsArray(QExpressionParser expressionParser, QKeyListTerm keyList) {
		
//		boolean result = false;
		boolean result = true;

		for (String keyField : keyList.getKeyFields()) {

			QExpression expression = expressionParser.parseExpression(keyField);
			if(expression instanceof QCompoundTermExpression) {
				result = true;
				break;
			}
		}

		return result;
	}
	
	public static QTerm getPrimaryRecord(QCallableUnit callableUnit, QDataSetTerm dataSetTerm) {
		
		if(dataSetTerm.getFacet(QExternalFile.class) == null)
			System.out.println("Unexpected condition: pxnqt9r87webr87we");
		
		QTerm primaryRecord = null;
		
		// search on external dataStructure
		if(callableUnit.getDataSection() != null) {
			
			for(QDataTerm<?> dataTerm: callableUnit.getDataSection().getDatas()) {
				if(dataTerm.getFacet(QExternalFile.class) != null) {
					QExternalFile externalFile = dataTerm.getFacet(QExternalFile.class);
					
					if(dataSetTerm.getFacet(QExternalFile.class).getFormat().equalsIgnoreCase(externalFile.getFormat())) {
						primaryRecord = dataTerm;
						break;
					}
					else
						continue;
				}				
			}
		}
		
		if(primaryRecord != null)
			return primaryRecord;

		// search on dataSet
		if(callableUnit.getFileSection() != null) {
			for(QDataSetTerm dst: callableUnit.getFileSection().getDataSets()) {
		
				if(dst.getFacet(QExternalFile.class) != null) {
					QExternalFile externalFile = dst.getFacet(QExternalFile.class);
					if(dataSetTerm.getFacet(QExternalFile.class).getFormat().equalsIgnoreCase(externalFile.getFormat())) {
						primaryRecord = dst;
						break;
					}
					else
						continue;				}
				else
					System.out.println("Unexpected condition: pxnqt9r87x93q46t");
			}
		}
				
		if(primaryRecord != null)
			return primaryRecord;
		
		
		return primaryRecord;
	}
}
