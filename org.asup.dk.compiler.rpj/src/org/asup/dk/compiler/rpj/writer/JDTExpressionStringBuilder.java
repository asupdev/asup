/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.dk.compiler.rpj.writer;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.fw.core.FrameworkCoreUnexpectedConditionException;
import org.asup.fw.util.QStringUtil;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QTerm;
import org.asup.il.data.QArray;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QData;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.expr.ArithmeticOperator;
import org.asup.il.expr.AssignmentOperator;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.LogicalOperator;
import org.asup.il.expr.QArithmeticExpression;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QBlockExpression;
import org.asup.il.expr.QBooleanExpression;
import org.asup.il.expr.QCompoundTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QLogicalExpression;
import org.asup.il.expr.QRelationalExpression;
import org.asup.il.expr.RelationalOperator;
import org.asup.il.expr.impl.ExpressionVisitorImpl;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QPrototype;
import org.asup.il.isam.QDataSetTerm;
import org.asup.il.isam.QDisplayTerm;
import org.asup.il.isam.QFileTerm;
import org.asup.il.isam.QKeyListTerm;
import org.asup.il.isam.QPrint;

public class JDTExpressionStringBuilder extends ExpressionVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QStringUtil stringUtil;
	@Inject
	private QExpressionParser expressionParser;

	private StringBuffer buffer = new StringBuffer();
	private Class<?> target;

	public void setTarget(Class<?> target) {
		this.target = target;
	}

	public String getResult() {
		return buffer.toString();
	}

	public void clear() {
		buffer = new StringBuffer();
	}

	@Override
	public boolean visit(QAtomicTermExpression expression) {

		Class<?> source = null;

		String value = null;

		switch (expression.getType()) {
		case BOOLEAN:
			value = expression.getValue();
			source = Boolean.class;
			break;
		case DATETIME:
			value = expression.getValue();
			source = Date.class;
			break;
		case INTEGER:
			value = Integer.toString(Integer.parseInt(expression.getValue()));
			source = Integer.class;
			break;
		case FLOATING:
			value = expression.getValue();
			value = value.replaceAll("\\,", "\\.");
			break;
		case HEXADECIMAL:
			value = expression.getValue();

			if (value.startsWith("X'") || value.startsWith("x'")) {
				value = value.substring(2);
				value = value.substring(0, value.length() - 1);
				source = QHexadecimal.class;
				value = "(byte) 0x" + value;
			} else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid hexadecimal: " + expression.getValue());

			break;
		case SPECIAL:
			source = Enum.class;
			if (expression.getValue().equalsIgnoreCase("*OMIT"))
				value = "null";
			else
				value = "qRPJ.qSP." + stringUtil.removeFirstChar(expression.getValue()).toUpperCase();
			break;
		case STRING:

			value = expression.getValue().replaceAll("\\\\", "\\\\\\\\");
			value = value.replaceAll("\\\"", "\\\\\"");
			value = "\"" + value + "\"";

			source = String.class;
			break;
		case INDICATOR:
		case NAME:

			QNamedNode namedNode = null;
			String nodeName = null;
			String indicatorIndex = null;

			String expressionValue = expression.getValue();
			if (expressionValue.toUpperCase().startsWith("*IN")) {
				if (!(compilationUnit.getDataTerm(expressionValue, true).getParent() instanceof QCompoundDataTerm<?>))
					nodeName = expressionValue;
				else {
					int i = expressionValue.indexOf("(");
					if (i > 0)
						throw new FrameworkCoreUnexpectedConditionException("wstt9rewtb043b5t9072349");

					nodeName = expressionValue.substring(0, 3);
					indicatorIndex = expressionValue.substring(3, 5);
				}

			} else
				nodeName = expressionValue;

			namedNode = compilationUnit.getNamedNode(nodeName, true);
			if (namedNode == null)
				throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + expression.getValue());

			value = compilationUnit.getQualifiedName(namedNode);

			if (namedNode instanceof QMultipleAtomicDataTerm<?>) {
				QMultipleAtomicDataTerm<?> multipleAtomicDataTerm = (QMultipleAtomicDataTerm<?>) namedNode;

				if (this.target != null) {
					if (this.target.isAssignableFrom(QArray.class))
						source = multipleAtomicDataTerm.getDefinition().getDataClass();
					else
						source = multipleAtomicDataTerm.getDefinition().getArgument().getDataClass();
				} else
					source = multipleAtomicDataTerm.getDefinition().getDataClass();

				if (indicatorIndex != null) {
					try {
						value = value + ".get(" + Integer.parseInt(indicatorIndex) + ")";
					} catch (NumberFormatException e) {
						value = value + ".get(" + indicatorIndex + ")";
					}
				}

			} else if (indicatorIndex != null) {

				source = QIndicator.class;

				if (indicatorIndex != null) {
					try {
						value = value + ".get(" + Integer.parseInt(indicatorIndex) + ")";
					} catch (NumberFormatException e) {
						value = value + ".get(" + indicatorIndex + ")";
					}
				}

			} else if (namedNode instanceof QDataTerm) {
				QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;
				source = dataTerm.getDefinition().getDataClass();
			} else if (namedNode instanceof QKeyListTerm) {
				QKeyListTerm keyListTerm = (QKeyListTerm) namedNode;

				if (CompilationContextHelper.containsArray(expressionParser, keyListTerm)) {
					this.buffer.append(buildExpression(keyListTerm));
					return false;
				} 
			}

			break;
		}

		writeValue(source, target, value);

		return false;
	}

	@SuppressWarnings("unused")
	@Override
	public boolean visit(QCompoundTermExpression expression) {

		QNamedNode namedNode = compilationUnit.getNamedNode(expression.getValue(), true);
		if (namedNode == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid term: " + expression.getValue());

		// datSrtuct
		if (namedNode instanceof QUnaryCompoundDataTerm) {
			if (this.target != null)
				System.out.println(namedNode);

			// TODO remove
			if (namedNode.getName().toString().equalsIgnoreCase("*IN")) {

				StringBuffer value = new StringBuffer();
				value.append(compilationUnit.getQualifiedName(namedNode));
				value.append(".get");
				value.append("(");

				JDTExpressionStringBuilder indexBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
				indexBuilder.setTarget(null);
				for (QExpression element : expression.getElements()) {
					element.accept(indexBuilder);
				}
				value.append(indexBuilder.getResult());

				value.append(")");

				QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

				if (this.target == null)
					writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());
				else if (this.target != null && Integer.class.isAssignableFrom(this.target))
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
				else if (this.target != null && String.class.isAssignableFrom(this.target))
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
				else if (this.target != null && Boolean.class.isAssignableFrom(this.target))
					writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
				else
					writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());

				return false;
			} else {
				this.buffer.append(compilationUnit.getQualifiedName(namedNode));
				return true;
			}
		}
		// array
		else if (namedNode instanceof QMultipleDataTerm) {

			StringBuffer value = new StringBuffer();
			value.append(compilationUnit.getQualifiedName(namedNode));
			value.append(".get");
			value.append("(");

			JDTExpressionStringBuilder indexBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
			indexBuilder.setTarget(null);
			for (QExpression element : expression.getElements()) {
				element.accept(indexBuilder);
			}
			value.append(indexBuilder.getResult());

			value.append(")");

			QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

			if (this.target == null)
				writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());
			else if (this.target != null && Integer.class.isAssignableFrom(this.target))
				writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
			else if (this.target != null && String.class.isAssignableFrom(this.target))
				writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
			else if (this.target != null && Boolean.class.isAssignableFrom(this.target))
				writeValue(dataTerm.getDefinition().getDataClass(), this.target, value.toString());
			else
				writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());

		}
		// dataSet
		else if (namedNode instanceof QDataSetTerm) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// display
		else if (namedNode instanceof QDisplayTerm) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// print
		else if (namedNode instanceof QPrint) {
			this.buffer.append(compilationUnit.getQualifiedName(namedNode));
			this.buffer.append(".get");
			this.buffer.append("(");
			this.buffer.append(")");
		}
		// prototype
		else if (namedNode instanceof QPrototype) {
			QPrototype<?> prototype = (QPrototype<?>) namedNode;

			StringBuffer value = new StringBuffer();

			value.append(compilationUnit.getQualifiedName(namedNode));
			value.append("(");

			if (prototype.getEntry() != null) {
				Iterator<QEntryParameter<?>> entryParameters = prototype.getEntry().getParameters().iterator();

				// parameters
				JDTExpressionStringBuilder parameterBuilder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
				boolean first = true;
				for (QExpression element : expression.getElements()) {

					if (!entryParameters.hasNext())
						throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: " + namedNode.getName());

					QEntryParameter<?> entryParameter = entryParameters.next();
					QTerm parameterDelegate = entryParameter.getDelegate();

					parameterBuilder.clear();
					if (parameterDelegate instanceof QDataTerm) {
						QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;
						if (dataTerm.isConstant())
							parameterBuilder.setTarget(dataTerm.getDefinition().getJavaClass());
						else
							parameterBuilder.setTarget(dataTerm.getDefinition().getDataClass());
					} else if (parameterDelegate instanceof QFileTerm) {
						parameterBuilder.setTarget(QFileTerm.class);
					}

					element.accept(parameterBuilder);

					if (!first)
						value.append(", ");

					value.append(parameterBuilder.getResult());

					first = false;
				}

				while (entryParameters.hasNext()) {
					QEntryParameter<?> entryParameter = entryParameters.next();
					if (!first)
						value.append(", ");
					value.append("null");
					first = false;
				}
			} else {
				if (!expression.getElements().isEmpty())
					throw new IntegratedLanguageExpressionRuntimeException("Invalid parameters number binding  procedure: " + namedNode.getName());
			}

			value.append(")");

			writeValue(prototype.getDelegate().getDefinition().getDataClass(), this.target, value.toString());
		} else if (namedNode instanceof QUnaryAtomicDataTerm<?>) {

			QUnaryAtomicDataTerm<?> unaryAtomicDataTerm = (QUnaryAtomicDataTerm<?>) namedNode;

			if (unaryAtomicDataTerm.getDefinition() == null)
				System.out.println(unaryAtomicDataTerm);

			writeValue(unaryAtomicDataTerm.getDefinition().getDataClass(), this.target, compilationUnit.getQualifiedName(namedNode));

		} else
			System.err.println("Unexpected condition: xm4t609543m487mxz");

		return false;
	}

	@Override
	public boolean visit(QAssignmentExpression expression) {

		expression.getLeftOperand().accept(this);
		buffer.append(toJavaPrimitive(expression.getOperator()));
		expression.getRightOperand().accept(this);

		return false;
	}

	@Override
	public boolean visit(QArithmeticExpression expression) {

		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);

		// pointer
		if (CompilationContextHelper.isPointer(compilationUnit, expression.getLeftOperand())) {

			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append("." + toJavaMethod(expression));
			buffer.append("(");

			// right
			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

			buffer.append(")");

		}
		// plus, minus, multiple, cat ..
		else if (expression.getRightOperand() != null) {

			Class<?> target = CompilationContextHelper.getJavaClass(compilationUnit, expression.getLeftOperand());
			builder.setTarget(target);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			buffer.append(toJavaPrimitive(expression.getOperator()));

			target = CompilationContextHelper.getJavaClass(compilationUnit, expression.getRightOperand());
			builder.setTarget(target);
			builder.clear();
			expression.getRightOperand().accept(builder);

			buffer.append(builder.getResult());
		}
		// negate
		else {

			buffer.append(toJavaPrimitive(expression.getOperator()));

			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(Integer.class);
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

		}

		return false;
	}

	@Override
	public boolean visit(QBooleanExpression expression) {

		if (expression.getOperand() != null) {

			if (expression.getOperand() instanceof QAtomicTermExpression) {

				QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) expression.getOperand();
				if (atomicTermExpression.isSpecial() && !atomicTermExpression.isFunction()) {
					if (atomicTermExpression.getValue().equalsIgnoreCase("*ON")) {
						buffer.append("true");
						return false;
					} else if (atomicTermExpression.getValue().equalsIgnoreCase("*OFF")) {
						buffer.append("false");
						return false;
					}
				}
			}

			JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
			builder.setTarget(Boolean.class);
			/*
			 * if(!CompilationContextHelper.isPrimitive(compilationUnit,
			 * expression.getOperand())) builder.setTarget(Boolean.class); else
			 * builder.setTarget(null);
			 */

			expression.getOperand().accept(builder);
			buffer.append(builder.getResult());
		}

		return false;

	}

	@Override
	public boolean visit(QLogicalExpression expression) {

		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);

		// and/or
		if (expression.getRightOperand() != null) {

			// left
			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getLeftOperand()));
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// right
			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getRightOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getRightOperand()));
			else
				builder.setTarget(null);

			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

		}
		// negate
		else {

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// left
			if (!CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getLeftOperand()));
			else
				builder.setTarget(null);

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

		}

		return false;
	}

	@Override
	public boolean visit(QRelationalExpression expression) {
		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);

		if (CompilationContextHelper.isPrimitive(compilationUnit, expression.getLeftOperand())) {

			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));

			// right
			if (CompilationContextHelper.isPrimitive(compilationUnit, expression.getRightOperand()))
				builder.setTarget(null);
			else
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationUnit, expression.getRightOperand()));

			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

		} else {

			// left
			builder.setTarget(null);
			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());

			// operator
			buffer.append("." + toJavaMethod(expression));
			buffer.append("(");

			// right
			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());

			buffer.append(")");
		}

		return false;
	}

	@Override
	public boolean visit(QBlockExpression expression) {

		buffer.append("(");
		expression.getExpression().accept(this);
		buffer.append(")");

		return false;
	}

	private String toJavaPrimitive(AssignmentOperator assignOperator) {

		String result = null;

		switch (assignOperator) {
		case ASSIGN:
			result = "=";
			break;
		case DIVIDE_ASSIGN:
			result = "/";
			break;
		case MINUS_ASSIGN:
			result = "-";
			break;
		case PLUS_ASSIGN:
			result = "+";
			break;
		case POWER_ASSIGN:
			result = "^";
			break;
		case TIMES_ASSIGN:
			result = "*";
			break;
		}

		return result;
	}

	private String toJavaPrimitive(ArithmeticOperator operator) {

		String result = null;

		switch (operator) {
		case DIVIDE:
			result = "/";
			break;
		case MINUS:
			result = "-";
			break;
		case MULT:
			result = "*";
			break;
		case NEGATE:
			result = "-";
			break;
		case PLUS:
			result = "+";
			break;
		case POWER:
			result = "^";
			break;
		case MODULAR:
			break;
		}

		return result;
	}

	private String toJavaPrimitive(LogicalOperator operator) {

		String result = null;

		switch (operator) {
		case AND:
			result = " && ";
			break;
		case NOT:
			result = " !";
			break;
		case OR:
			result = " || ";
			break;
		}

		return result;
	}

	private String toJavaPrimitive(RelationalOperator operator) {

		String result = null;

		switch (operator) {
		case EQUAL:
			result = "==";
			break;
		case GREATER_THAN:
			result = ">";
			break;
		case GREATER_THAN_EQUAL:
			result = ">=";
			break;
		case LESS_THAN:
			result = "<";
			break;
		case LESS_THAN_EQUAL:
			result = "<=";
			break;
		case NOT_EQUAL:
			result = "!=";
			break;
		default:
			break;
		}

		return result;
	}

	private String toJavaMethod(QExpression expression) {

		String result = null;

		switch (expression.getExpressionType()) {
		case ARITHMETIC:
			result = ((QArithmeticExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case ASSIGNMENT:
			result = ((QAssignmentExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case COMPOUND:
			break;
		case LOGICAL:
			result = ((QLogicalExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case RELATIONAL:
			result = ((QRelationalExpression) expression).getOperator().getLiteral().toLowerCase();
			break;
		case ATOMIC:
			break;
		case BLOCK:
			break;
		case BOOLEAN:
			break;
		}

		return result;
	}

	public void writeValue(Class<?> source, Class<?> target, String value) {

		if (value == null)
			return;

		if (source == null || target == null) {
			buffer.append(value);
			return;
		}

		if (target.isAssignableFrom(source)) {
			buffer.append(value);
			return;
		}

		// TODO remove?
		// Hexadecimal
		if (source.isAssignableFrom(QHexadecimal.class)) {
			buffer.append(value);
		} else if (source.isAssignableFrom(Enum.class) && !this.target.isAssignableFrom(Boolean.class)) {
			buffer.append(value);
		}

		else if (target.isAssignableFrom(String.class)) {
			buffer.append(value);
			buffer.append(".s()");
		} else if (target.isAssignableFrom(Integer.class)) {
			buffer.append(value);
			buffer.append(".i()");
		} else if (target.isAssignableFrom(Boolean.class)) {
			buffer.append(value);
			buffer.append(".b()");
		} else if (target.isAssignableFrom(Long.class)) {
			buffer.append(value);
			buffer.append(".l()");
		} else if (target.isAssignableFrom(Double.class)) {
			buffer.append(value);
			buffer.append(".d()");
		} else if (target.isAssignableFrom(Date.class)) {
			buffer.append(value);
			buffer.append(".t()");
		} else if (target.isAssignableFrom(Byte.class)) {
			buffer.append(value);
			buffer.append(".i()");
		} else if (target.isAssignableFrom(Object.class)) {
			buffer.append(value);
			buffer.append(".asObject()");
		} else if (target.isAssignableFrom(List.class)) {
			buffer.append(value);
			buffer.append(".asObject()");
		} else if (QDatetime.class.isAssignableFrom(target)) {
			buffer.append("qRPJ.qBox(" + value + ")");
			buffer.append(value);
			buffer.append(".asDatetime()");
		} else if (QData.class.isAssignableFrom(target)) {
			buffer.append("qRPJ.qBox(" + value + ")");
		} else
			throw new IntegratedLanguageExpressionRuntimeException("Invalid unboxing: " + value);
	}

	public String buildExpression(QKeyListTerm keyList) {

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("new QBufferedData[] {");
		
		JDTExpressionStringBuilder fieldBuilder = this.compilationUnit.getContext().make(JDTExpressionStringBuilder.class);

		int i = 0;
		for (String keyField : keyList.getKeyFields()) {

			QExpression fieldExpression = expressionParser.parseExpression(keyField);

			fieldBuilder.clear();
			fieldBuilder.setTarget(null);
			fieldExpression.accept(fieldBuilder);

			if (i > 0)
				stringBuffer.append(", ");

			stringBuffer.append(fieldBuilder.getResult());

			i++;
		}

		stringBuffer.append("}");
		
		return stringBuffer.toString();
	}
}
