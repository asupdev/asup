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
package org.asup.dk.compiler.rpj.visitor;

import java.util.Date;
import java.util.Iterator;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.rpj.helper.CompilationContextHelper;
import org.asup.fw.util.QStringUtil;
import org.asup.il.core.QNamedNode;
import org.asup.il.core.QTerm;
import org.asup.il.data.QData;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QHexadecimal;
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
import org.asup.il.expr.QLogicalExpression;
import org.asup.il.expr.QRelationalExpression;
import org.asup.il.expr.RelationalOperator;
import org.asup.il.expr.impl.ExpressionVisitorImpl;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QPrototype;
import org.asup.il.isam.QDataSet;
import org.asup.il.isam.QDataSetTerm;

public class JDTExpressionStringBuilder extends ExpressionVisitorImpl {

	@Inject
	private QCompilationContext compilationContext; 
	@Inject
	private QStringUtil stringUtil;
	
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
			if(value.startsWith("X'")) {
				value = value.substring(2);
				value = "0x"+value.substring(0, value.length()-1);
			}
				
			source = QHexadecimal.class;
			break;
		case SPECIAL:
			source = Enum.class;
			value = "qRPJ.qSP."+stringUtil.removeFirstChar(expression.getValue()).toUpperCase();
			break;
		case STRING:
			
			value = expression.getValue().replaceAll("\\\\", "\\\\\\\\");
			value = value.replaceAll("\\\"", "\\\\\"");			
			value = "\""+value+"\"";
			
			source = String.class;
			break;
		case INDICATOR:			
		case NAME:
			QNamedNode namedNode = compilationContext.getNamedNode(expression.getValue(), true);
			if(namedNode == null)  
				throw new IntegratedLanguageExpressionRuntimeException("Invalid term: "+expression.getValue());
			
			value = compilationContext.getQualifiedName(namedNode);
			
			if(namedNode instanceof QDataTerm) {
				QDataTerm<?> dataTerm = (QDataTerm<?>)namedNode;
				source = dataTerm.getDefinition().getDataClass();
			}

			break;
		}

		writeValue(source, target, value);
		
		return false;
	}

	@SuppressWarnings("unused")
	@Override
	public boolean visit(QCompoundTermExpression expression) {
		
		QNamedNode namedNode = compilationContext.getNamedNode(expression.getValue(), true);
		if(namedNode == null) 
			throw new IntegratedLanguageExpressionRuntimeException("Invalid term: "+expression.getValue());

		// datSrtuct
		if(namedNode instanceof QUnaryCompoundDataTerm) {
			buffer.append(compilationContext.getQualifiedName(namedNode));
		}
		// array
		else if(namedNode instanceof QMultipleDataTerm) {
			
			StringBuffer value = new StringBuffer(); 
			value.append(compilationContext.getQualifiedName(namedNode));
			value.append(".get");
			value.append("(");
			
			JDTExpressionStringBuilder indexBuilder = compilationContext.make(JDTExpressionStringBuilder.class);
			indexBuilder.setTarget(null);				
			for(QExpression element: expression.getElements()) {
				element.accept(indexBuilder);
			}				
			value.append(indexBuilder.getResult());
			
			value.append(")");		

			QDataTerm<?> dataTerm = (QDataTerm<?>)namedNode;
			
			writeValue(dataTerm.getDefinition().getDataClass(), null, value.toString());

		}
		// dataSet
		else if(namedNode instanceof QDataSetTerm) {
			buffer.append(compilationContext.getQualifiedName(namedNode));
			buffer.append(".get");
			buffer.append("(");
			buffer.append(")");
		}
		// prototype
		else if(namedNode instanceof QPrototype) {
			QPrototype<?> prototype = (QPrototype<?>)namedNode;

			StringBuffer value = new StringBuffer();
			
			value.append(compilationContext.getQualifiedName(namedNode));								
			value.append("(");
			
			if(prototype.getEntry() != null) {
				Iterator<QEntryParameter<?>> entryParameters = prototype.getEntry().getParameters().iterator();		
				
				// parameters
				boolean first = true;
				for(QExpression element: expression.getElements()) {
					
					if(!entryParameters.hasNext())
						throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: "+namedNode.getName());

					QEntryParameter<?> entryParameter = entryParameters.next();
					QTerm parameterDelegate = entryParameter.getDelegate();
					
					JDTExpressionStringBuilder parameterBuilder = compilationContext.make(JDTExpressionStringBuilder.class);
					
					if(parameterDelegate instanceof QDataTerm) {
						QDataTerm<?> dataTerm = (QDataTerm<?>)parameterDelegate;
						if(dataTerm.isConstant())
							parameterBuilder.setTarget(dataTerm.getDefinition().getJavaClass());
						else
							parameterBuilder.setTarget(dataTerm.getDefinition().getDataClass());						
					}
					else if(parameterDelegate instanceof QDataSetTerm) {
						parameterBuilder.setTarget(QDataSet.class);
					}
					
					element.accept(parameterBuilder);
					
					if(!first)
						value.append(", ");
					
					value.append(parameterBuilder.getResult());
					
					first = false;							
				}
				
				while(entryParameters.hasNext()) {
					QEntryParameter<?> entryParameter = entryParameters.next();
					if(!first)
						value.append(", ");					
					value.append("null");
					first = false;
				}
			}
			else {
				if(!expression.getElements().isEmpty())
					throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: "+namedNode.getName());
			}
			
			value.append(")");
			
			writeValue(prototype.getDelegate().getDefinition().getDataClass(), target, value.toString());
		}
		else if(namedNode instanceof QUnaryAtomicDataTerm<?>) {
			buffer.append(compilationContext.getQualifiedName(namedNode));
		}
		else
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

		JDTExpressionStringBuilder builder = compilationContext.make(JDTExpressionStringBuilder.class);
		
		// plus, minus, multiple ..
		if(expression.getRightOperand() != null) {				

			builder.setTarget(CompilationContextHelper.getJavaClass(compilationContext, expression.getLeftOperand()));
			builder.clear();			
			expression.getLeftOperand().accept(builder);			
			buffer.append(builder.getResult());
			
			buffer.append(toJavaPrimitive(expression.getOperator()));
			
			builder.setTarget(CompilationContextHelper.getJavaClass(compilationContext, expression.getRightOperand()));
			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());
		}
		// negate
		else {

			buffer.append(toJavaPrimitive(expression.getOperator()));

			if(!CompilationContextHelper.isPrimitive(compilationContext, expression.getLeftOperand()))
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

		if(expression.getOperand() != null) {
			JDTExpressionStringBuilder builder = compilationContext.make(JDTExpressionStringBuilder.class);
			builder.setTarget(Boolean.class);
/*			if(!CompilationContextHelper.isPrimitive(compilationContext, expression.getOperand()))
				builder.setTarget(Boolean.class);
			else
				builder.setTarget(null);*/
			
			expression.getOperand().accept(builder);			
			buffer.append(builder.getResult());
		}
		
		return false;
		
	}
	
	@Override
	public boolean visit(QLogicalExpression expression) {

		JDTExpressionStringBuilder builder = compilationContext.make(JDTExpressionStringBuilder.class);

		// and/or
		if(expression.getRightOperand() != null) {
			
			// left
			if(!CompilationContextHelper.isPrimitive(compilationContext, expression.getLeftOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationContext, expression.getLeftOperand()));
			else
				builder.setTarget(null);				

			builder.clear();
			expression.getLeftOperand().accept(builder);
			buffer.append(builder.getResult());


			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));
			
			// right
			if(!CompilationContextHelper.isPrimitive(compilationContext, expression.getRightOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationContext, expression.getRightOperand()));
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
			if(!CompilationContextHelper.isPrimitive(compilationContext, expression.getLeftOperand()))
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationContext, expression.getLeftOperand()));
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
		JDTExpressionStringBuilder builder = compilationContext.make(JDTExpressionStringBuilder.class);
		
		if(CompilationContextHelper.isPrimitive(compilationContext, expression.getLeftOperand())) {
		
			// left
			builder.setTarget(null);
			builder.clear();			
			expression.getLeftOperand().accept(builder);			
			buffer.append(builder.getResult());
	
			// operator
			buffer.append(toJavaPrimitive(expression.getOperator()));
			
			// right
			if(CompilationContextHelper.isPrimitive(compilationContext, expression.getRightOperand())) 			
				builder.setTarget(null);
			else
				builder.setTarget(CompilationContextHelper.getJavaClass(compilationContext, expression.getRightOperand()));
			
			builder.clear();
			expression.getRightOperand().accept(builder);
			buffer.append(builder.getResult());				

		}
		else {

			// left
			builder.setTarget(null);
			builder.clear();			
			expression.getLeftOperand().accept(builder);			
			buffer.append(builder.getResult());

			// operator
			buffer.append("."+toJavaMethod(expression));
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
		case BCAT:
			break;
		case MODULAR:
			break;
		case TCAT:
			break;
		default:
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
			result =  ((QArithmeticExpression)expression).getOperator().getLiteral().toLowerCase();
			break;
		case ASSIGNMENT:
			result = ((QAssignmentExpression)expression).getOperator().getLiteral().toLowerCase();
			break;
		case COMPOUND:			
			break;
		case LOGICAL:
			result = ((QLogicalExpression)expression).getOperator().getLiteral().toLowerCase();
			break;
		case RELATIONAL:
			result = ((QRelationalExpression)expression).getOperator().getLiteral().toLowerCase();
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
		
		if(value == null)
			return;
		
		if(source == null || target == null) {
			buffer.append(value);
			return;
		}
		
		if(target.isAssignableFrom(source)) {
			buffer.append(value);
			return;
		}
		if(source.isAssignableFrom(QHexadecimal.class)) {
			buffer.append(value);			
		}
		else if(target.isAssignableFrom(String.class)) {
			buffer.append(value);
			buffer.append(".asString()");
		}
		else if(target.isAssignableFrom(Byte.class)) {
			buffer.append(value);
			buffer.append(".asInteger()");
		}
		else if(target.isAssignableFrom(Integer.class)) {
			buffer.append(value);
			buffer.append(".asInteger()");
		}
		else if(target.isAssignableFrom(Boolean.class)) {
			buffer.append(value);
			buffer.append(".asBoolean()");
		}
		else if(target.isAssignableFrom(Short.class)) {
			buffer.append(value);
			buffer.append(".asShort()");
		}
		else if(target.isAssignableFrom(Long.class)) {
			buffer.append(value);
			buffer.append(".asLong()");
		}
		else if(target.isAssignableFrom(Float.class)) {
			buffer.append(value);
			buffer.append(".asFloat()");
		}
		else if(target.isAssignableFrom(Double.class)) {
			buffer.append(value);
			buffer.append(".asDouble()");
		}
		else if(target.isAssignableFrom(Object.class)) {
			buffer.append(value);
			buffer.append(".asObject()");					
		}
		else if(QData.class.isAssignableFrom(target)) {
			buffer.append("qRPJ.qBox("+value+")");
		}
		else
			value.toCharArray();
	}
}