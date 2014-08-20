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
package org.asup.dk.compiler.rpj.util;

import java.util.List;

import org.asup.il.data.QArrayDef;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataStrollerDef;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QFloatingDef;
import org.asup.il.data.QIndicatorDef;
import org.asup.il.data.QPointerDef;
import org.asup.il.data.QScrollerDef;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class FieldHelper {


	@SuppressWarnings("unchecked")
	public static void writeSerializedField(CompilationUnit unit, FieldDeclaration field) {
		AST ast = field.getAST();

		VariableDeclarationFragment variable = (VariableDeclarationFragment) field.fragments().get(0);
		variable.setName(ast.newSimpleName("serialVersionUID"));
		variable.setInitializer(ast.newNumberLiteral("1L"));
		
		// field = ast.newFieldDeclaration(variable);
		field.fragments().clear();
		field.fragments().add(variable);
		field.modifiers().add(ast.newModifier(ModifierKeyword.PRIVATE_KEYWORD));
		field.modifiers().add(ast.newModifier(ModifierKeyword.STATIC_KEYWORD));
		field.modifiers().add(ast.newModifier(ModifierKeyword.FINAL_KEYWORD));
		field.setType(ast.newPrimitiveType(PrimitiveType.LONG));
	}

	@SuppressWarnings("unchecked")
	public static void writePublicField(FieldDeclaration target, QDataTerm<?> dataTerm, boolean annotationEntry, boolean nullInitialization) {

		AST ast = target.getAST();

//		setDomainAnnotation(unit, field, dataTerm.getDomain());

		setDataDefAnnotation(target, dataTerm.getDefinition());

		if (annotationEntry) {
			MarkerAnnotation entryAnnotation = ast.newMarkerAnnotation();
			entryAnnotation.setTypeName(ast.newSimpleName(Entry.class.getSimpleName()));
			target.modifiers().add(entryAnnotation);
		}

		target.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		target.setType(TermHelper.getJavaType(ast, dataTerm));

		VariableDeclarationFragment variable = (VariableDeclarationFragment) target.fragments().get(0);
		variable.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(dataTerm.getName())));

		if (nullInitialization)
			variable.setInitializer(ast.newNullLiteral());
	}


	public static void writeMethodParameter( SingleVariableDeclaration target, QDataTerm<?> dataTerm) {

		AST ast = target.getAST();

		target.setName(ast.newSimpleName(CompilationContextHelper.normalizeTermName(dataTerm.getName())));
		
//		setDomainAnnotation(unit, variable, dataTerm.getDomain());
		
		setDataDefAnnotation(target, dataTerm.getDefinition());
		
		target.setType(TermHelper.getJavaType(ast, dataTerm));
	}

	@SuppressWarnings("unchecked")
	private static void setDataDefAnnotation(ASTNode target, QDataDef<?> dataDef) {
				
		String annotationName = DataDef.class.getSimpleName();
		Class<? extends QDataDef<?>> klassDef = (Class<? extends QDataDef<?>>) dataDef.getClass();
		
		if(QArrayDef.class.isAssignableFrom(klassDef)) {
			QArrayDef<?> arrayDef = (QArrayDef<?>)dataDef;
			
			if (arrayDef.getDimension() != null) 
				writeAnnotation(target, annotationName, "dimension", arrayDef.getDimension());

			setDataDefAnnotation(target, arrayDef.getArgument());
		}
		else if(QScrollerDef.class.isAssignableFrom(klassDef)) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>)dataDef;
			
			if (scrollerDef.getOccurrences() != null) 
				writeAnnotation(target, annotationName, "occurrences", scrollerDef.getOccurrences());

			setDataDefAnnotation(target, scrollerDef.getArgument());			
		}
		else if(QDataStrollerDef.class.isAssignableFrom(klassDef)) {
			QDataStrollerDef<?> strollerDef = (QDataStrollerDef<?>) dataDef;
			if (strollerDef.getOccurrences() != null) 
				writeAnnotation(target, annotationName, "occurrences", strollerDef.getOccurrences());
			
		}
		else if(QBinaryDef.class.isAssignableFrom(klassDef)) {
			
		}
/*		else if(QEnumeratedDataDef.class.isAssignableFrom(klassDef)) {
			QEnumeratedDataDef<?> dataDefinition = (QEnumeratedDataDef<?>) dataDef;
			
			QBufferedDataDef<?> innerDataDefinition = dataDefinition.getArgument();
			writeImport(unit, innerDataDefinition.getClass().getName().split("\\."));
			setElementAnnotation(unit, target, innerDataDefinition);
			
		}*/
		else if(QDataStructDef.class.isAssignableFrom(klassDef)) {
			QDataStructDef dataStructureDef = (QDataStructDef) dataDef;
			
			if (dataStructureDef.isQualified()) 
				writeAnnotation(target, annotationName, "qualified", dataStructureDef.isQualified());
			
		}
		else if(QCharacterDef.class.isAssignableFrom(klassDef)) {
			QCharacterDef charDef = (QCharacterDef) dataDef;

			if (charDef.getLength() > 0)
				writeAnnotation(target, annotationName, "length", charDef.getLength());
			
			if (charDef.isVarying()) 
				writeAnnotation(target, annotationName, "varying", charDef.isVarying());

		}
		else if(QIndicatorDef.class.isAssignableFrom(klassDef)) {
			QIndicatorDef indicatorDef = (QIndicatorDef) dataDef;
			indicatorDef.toString();
		}
		else if(QPointerDef.class.isAssignableFrom(klassDef)) {
			QPointerDef pointerDef = (QPointerDef) dataDef;
			pointerDef.toString();
		}
		else if(QDatetimeDef.class.isAssignableFrom(klassDef)) {
			QDatetimeDef datetimeDef = (QDatetimeDef)dataDef;
			writeAnnotation(target, annotationName, "datetime", datetimeDef.getType());
		}
		else if(QDecimalDef.class.isAssignableFrom(klassDef)) {
			QDecimalDef decimalDef = (QDecimalDef) dataDef;
			
			if (decimalDef.getPrecision() > 0)
				writeAnnotation(target, annotationName, "precision", decimalDef.getPrecision());
			
			if (decimalDef.getScale() > 0) 
				writeAnnotation(target, annotationName, "scale", decimalDef.getScale());
			
		}
		else if(QFloatingDef.class.isAssignableFrom(klassDef)) {
//			QFloatingDef floatDef = (QFloatingDef) dataDef;
//			if (floatDef.getLength() > 0) 
//				writeAnnotation(target, annotationName, "length", floatDef.getLength());
		
		}
		else
			System.err.println("Unknown field type "+dataDef);
	}
	
	@SuppressWarnings("unchecked")
	public static void writeAnnotation(ASTNode target, String annotationName, String key, Object value) {
		AST ast = target.getAST();
		
		NormalAnnotation annotation = null;

		if (target instanceof FieldDeclaration) {
			FieldDeclaration field = (FieldDeclaration) target;
			annotation = findAnnotation(field.modifiers(), annotationName);

			if(annotation == null) {
				annotation = ast.newNormalAnnotation();
				annotation.setTypeName(ast.newSimpleName(annotationName));
				field.modifiers().add(annotation);
			}			
		}
		else if (target instanceof SingleVariableDeclaration) {
			SingleVariableDeclaration field = (SingleVariableDeclaration) target;
			annotation = findAnnotation(field.modifiers(), annotationName);
			
			if(annotation == null) {
				annotation = ast.newNormalAnnotation();
				annotation.setTypeName(ast.newSimpleName(annotationName));
				field.modifiers().add(annotation);
			}
		}
		else
			throw new RuntimeException("Unexpected runtime exception 5k43jwh45j8srkf");		
			
		MemberValuePair memberValuePair = ast.newMemberValuePair();
		memberValuePair.setName(ast.newSimpleName(key));
		if(value instanceof Number) {
			memberValuePair.setValue(ast.newNumberLiteral(value.toString()));
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof Boolean) {
			memberValuePair.setValue(ast.newBooleanLiteral((boolean) value));
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof String) {
			StringLiteral stringLiteral = ast.newStringLiteral();
			stringLiteral.setLiteralValue((String)value);
			memberValuePair.setValue(stringLiteral);
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof Enum) {
			Enum<?> enumValue = (Enum<?>)value;
			String enumName = enumValue.getClass().getSimpleName()+"."+((Enum<?>) value).name();
			memberValuePair.setValue(ast.newName(enumName.split("\\.")));
			annotation.values().add(memberValuePair);
		}
		else if(value instanceof List) {
			List<String> listValues = (List<String>)value;
			
			ArrayInitializer arrayInitializer = ast.newArrayInitializer();
			for(String listValue: listValues) {
				StringLiteral stringLiteral = ast.newStringLiteral();
				stringLiteral.setLiteralValue(listValue);
				arrayInitializer.expressions().add(stringLiteral);
			}
			
			memberValuePair.setValue(arrayInitializer);
			annotation.values().add(memberValuePair);
		}
		else
			throw new RuntimeException("Unexpected runtime exception k7548j4s67vo4kk");		

	}

	private static NormalAnnotation findAnnotation(List<?> modifiers, String annotationName) {
		for(Object modifier: modifiers) {
			if(modifier instanceof NormalAnnotation) {
				NormalAnnotation annotation = (NormalAnnotation)modifier;
				if(annotation.getTypeName().getFullyQualifiedName().equals(annotationName))
					return annotation;
			}
		}
		
		return null;
	}
}
