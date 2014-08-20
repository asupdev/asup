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

import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Entry;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class EntryHelper {

	@SuppressWarnings("unchecked")
	public static void writeMain(MethodDeclaration target, List<QDataTerm<?>> terms) {
		AST ast = target.getAST();
		
		target.setName(ast.newSimpleName("main"));
		target.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		
		MarkerAnnotation entryAnnotation = ast.newMarkerAnnotation();
		entryAnnotation.setTypeName(ast.newSimpleName(Entry.class.getSimpleName()));
		target.modifiers().add(entryAnnotation);

		for (QDataTerm<?> dataTerm: terms) {
			SingleVariableDeclaration singleVar = ast.newSingleVariableDeclaration();
			FieldHelper.writeMethodParameter(singleVar, dataTerm);
			target.parameters().add(singleVar);
		}

		Block block = ast.newBlock();
		target.setBody(block);

		// methodDeclaration.setConstructor(constructor);

	}

	/*
	@SuppressWarnings("unchecked")
	public static void writeFields(CompilationUnit unit, TypeDeclaration target, List<QDataTerm<?>> terms) {
		AST ast = target.getAST();
		
		for (QDataTerm<?> dataTerm: terms) {
			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);
			FieldHelper.writePublicField(unit, field, dataTerm, true, false);
						
			target.bodyDeclarations().add(field);
		}
	}
	*/
	

	@SuppressWarnings("unchecked")
	public static void writePList(TypeDeclaration target, List<QDataTerm<?>> terms) {
		AST ast = target.getAST();

		target.setInterface(false);
		MarkerAnnotation markerAnnotation = ast.newMarkerAnnotation();
		markerAnnotation.setTypeName(ast.newSimpleName(Entry.class.getSimpleName()));
		target.modifiers().add(markerAnnotation);
		target.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		target.setName(ast.newSimpleName("qEN"));
		target.setSuperclassType(ast.newSimpleType(ast.newName(QDataStructDelegator.class.getSimpleName())));

		for (QDataTerm<?> dataTerm: terms) {

			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);
			FieldHelper.writePublicField(field, dataTerm, false, false);
			
			target.bodyDeclarations().add(field);
		}

	}

}
