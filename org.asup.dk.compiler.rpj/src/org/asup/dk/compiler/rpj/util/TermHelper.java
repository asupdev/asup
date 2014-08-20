/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 *   Giuliano Giancristofaro	- Implementation
 */
package org.asup.dk.compiler.rpj.util;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.List;

import org.asup.il.core.QSpecial;
import org.asup.il.data.QArray;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataStroller;
import org.asup.il.data.QDataStrollerDef;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QEnum;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.os.data.QExternalFileName;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class TermHelper {

	public static void writeInnerTerms(CompilationUnit unit, TypeDeclaration target, List<QDataTerm<?>> terms) {
		
		for(QDataTerm<?> term: terms)
			writeInnerTerm(unit, target, term);
		
	}	
	
	@SuppressWarnings("unchecked")
	public static void writeInnerTerm(CompilationUnit unit, TypeDeclaration target, QDataTerm<?> term) {
		AST ast = target.getAST();
		
		switch (term.getDataType()) {
		
			case UNARY_ATOMIC:
				QUnaryAtomicDataTerm<?> unaryAtomicDataTerm = (QUnaryAtomicDataTerm<?>)term;
				
				QSpecial special = unaryAtomicDataTerm.getFacet(QSpecial.class);
				if(special != null) {
					EnumDeclaration enumType = ast.newEnumDeclaration();
					enumType.setName(ast.newSimpleName(normalizeInnerName(unaryAtomicDataTerm)));
					EnumHelper.writeEnum(enumType, unaryAtomicDataTerm);
					target.bodyDeclarations().add(enumType);
				}
				
				break;

			case UNARY_COMPOUND:
				QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = (QUnaryCompoundDataTerm<?>)term;
				
				if(unaryCompoundDataTerm.getFacet(QExternalFileName.class) == null ||
				   unaryCompoundDataTerm.getFacet(QExternalFileName.class).getName().equals("*PGM_STATUS")) {
					
					TypeDeclaration innerType = ast.newTypeDeclaration();
					innerType.setName(ast.newSimpleName(normalizeInnerName(unaryCompoundDataTerm)));
	
					CompoundHelper.writeStruct(unit, innerType, unaryCompoundDataTerm.getDefinition(), QDataStructDelegator.class, true);
					target.bodyDeclarations().add(innerType);
				}
				
				break;
				
			case MULTIPLE_ATOMIC:
				QMultipleAtomicDataTerm<?> multipleAtomicDataTerm = (QMultipleAtomicDataTerm<?>)term;

				special = multipleAtomicDataTerm.getFacet(QSpecial.class);
				if(special != null) {
					EnumDeclaration enumType = ast.newEnumDeclaration();
					enumType.setName(ast.newSimpleName(normalizeInnerName(multipleAtomicDataTerm)));
					EnumHelper.writeEnum(enumType, multipleAtomicDataTerm);
					target.bodyDeclarations().add(enumType);
				}
				
				break;
			
			case MULTIPLE_COMPOUND:
				QMultipleCompoundDataTerm<?> multipleCompoundDataTerm = (QMultipleCompoundDataTerm<?>) term;
				
				if(multipleCompoundDataTerm.getFacet(QExternalFileName.class) == null ||
				   multipleCompoundDataTerm.getFacet(QExternalFileName.class).getName().equals("*PGM_STATUS")) {
					TypeDeclaration innerType = ast.newTypeDeclaration();
					innerType.setName(ast.newSimpleName(normalizeInnerName(multipleCompoundDataTerm)));
					CompoundHelper.writeStruct(unit, innerType, multipleCompoundDataTerm.getDefinition(), QDataStructDelegator.class, true);
					target.bodyDeclarations().add(innerType);
				}
				
				break;
		}
	}
		
	@SuppressWarnings({ "unchecked"})
	public static Type getJavaType(AST ast, QDataTerm<?> dataTerm) {
		
		QDataDef<?> dataDef = dataTerm.getDefinition();
//		Class<? extends QDataDef<?>> klassDef = (Class<? extends QDataDef<?>>) dataDef.getClass();
		
		Type type = null;
	
		switch (dataTerm.getDataType()) {
			case MULTIPLE_ATOMIC:
				QMultipleAtomicDataDef<?> multipleAtomicDataDef = (QMultipleAtomicDataDef<?>) dataDef;
				
				QUnaryAtomicDataDef<?> innerDataDefinition = multipleAtomicDataDef.getArgument();
				
				Type array = ast.newSimpleType(ast.newSimpleName(QArray.class.getSimpleName()));
				ParameterizedType parType = ast.newParameterizedType(array);
				
				QSpecial special = dataTerm.getFacet(QSpecial.class);				
				if(special == null) {					
					String argument = "Q"+innerDataDefinition.getClass().getSimpleName().replaceAll("DefImpl", "");
					parType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(argument)));
					type = parType;
				}
				else {
					Type enumerator = ast.newSimpleType(ast.newSimpleName(QEnum.class.getSimpleName()));
					ParameterizedType parEnumType = ast.newParameterizedType(enumerator);
					
					// E
					parEnumType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(TermHelper.normalizeInnerName(dataTerm))));
					
					// D
					String argument = "Q"+innerDataDefinition.getClass().getSimpleName().replaceAll("DefImpl", "");
					parEnumType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(argument)));
					
					parType.typeArguments().add(parEnumType);
					type = parType;
				}			
	
				break;
			case MULTIPLE_COMPOUND:
				@SuppressWarnings("unused")
				QDataStrollerDef<?> dataStrollerDef = (QDataStrollerDef<?>) dataDef;
				
				array = ast.newSimpleType(ast.newSimpleName(QDataStroller.class.getSimpleName()));
				parType = ast.newParameterizedType(array);
				parType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(TermHelper.normalizeInnerName(dataTerm))));
				
				type = parType;
				
				break;
			case UNARY_ATOMIC:
				
				special = dataTerm.getFacet(QSpecial.class);				
				if(special == null || dataTerm.getName() == null) {
//					String argument = "Q"+klassDef.getSimpleName().replaceAll("DefImpl", "");
					String argument = dataDef.getDataClass().getSimpleName();
					type = ast.newSimpleType(ast.newSimpleName(argument));
				} else {
					Type enumerator = ast.newSimpleType(ast.newSimpleName(QEnum.class.getSimpleName()));
					ParameterizedType parEnumType = ast.newParameterizedType(enumerator);
					
					// E
					parEnumType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(TermHelper.normalizeInnerName(dataTerm))));
					
					// D
//					String argument = "Q"+klassDef.getSimpleName().replaceAll("DefImpl", "");
					String argument = dataDef.getDataClass().getSimpleName();
					parEnumType.typeArguments().add(ast.newSimpleType(ast.newSimpleName(argument)));
					
					type = parEnumType;
				}
				
				break;
			case UNARY_COMPOUND:
				
				if(dataTerm.getFacet(QExternalFileName.class) != null) {
					QExternalFileName externalFileName = dataTerm.getFacet(QExternalFileName.class);
					
					if(externalFileName.getName().equals("*PGM_STATUS"))
						type = ast.newSimpleType(ast.newSimpleName(TermHelper.normalizeInnerName(dataTerm)));
					else
						type = ast.newSimpleType(ast.newSimpleName(TermHelper.normalizeInnerName(externalFileName.getName())));					
				}
				else
					type = ast.newSimpleType(ast.newSimpleName(TermHelper.normalizeInnerName(dataTerm)));
	
				break;
		}
		
		return type;
	}

	public static Type getJavaPrimitive(AST ast, QDataTerm<?> dataTerm) {
		
		QDataDef<?> dataDef = dataTerm.getDefinition();
		
		Class<?> klass = dataDef.getJavaClass();
		Type type = ast.newSimpleType(ast.newSimpleName(klass.getSimpleName()));
		
		return type;

	}

	public static String normalizeInnerName(QDataTerm<?> term) {

		
		String name = normalizeInnerName(term.getName());
		
		// multiple
		if(term.getDataType().isMultiple() && name.endsWith("s"))
			name = removeLastChar(name);
		
		return name;
	}
	
	public static String normalizeInnerName(String name) {

		// specials
		if(name.startsWith("*")) {
			name = name.substring(1).toUpperCase();
		}
		else
			name = firstToUpper(name);

		name = name.replaceAll("§", "ç");
		
		return name;
	}
	

	public static String firstToUpper(String str) {
		StringBuffer s = new StringBuffer(str.length());
		CharacterIterator it = new StringCharacterIterator(str);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
			if(it.getIndex()==0) {
				s.append(String.valueOf(ch).toUpperCase());
			} else {
				s.append(ch);
			}
		}
		return s.toString();
	}
	
	
	public static String removeLastChar(String str) {
		if(str.length() == 0)
			return str;
		if(str.length() == 1)
			return "";
		
		return str.substring(0, str.length() - 1);
	}
}