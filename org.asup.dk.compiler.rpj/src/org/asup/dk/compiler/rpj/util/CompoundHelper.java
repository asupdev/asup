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

import java.io.Serializable;

import org.asup.il.data.QCompoundDataPart;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.il.data.annotation.DataDef;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class CompoundHelper {

	@SuppressWarnings("unchecked")
	public static void writeStruct(CompilationUnit unit, TypeDeclaration target, QCompoundDataPart dataPart, Class<?> master, boolean statik) {
		AST ast = target.getAST();

		// import
		UnitHelper.writeImport(unit, master);

		// modifiers
		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		if(statik)
			target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		target.setInterface(false);
				
		// super
		target.setSuperclassType(ast.newSimpleType(ast.newName(master.getSimpleName())));

		// serializable
		if(Serializable.class.isAssignableFrom(master)) {
			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);
			FieldHelper.writeSerializedField(unit, field);
			target.bodyDeclarations().add(field);
		}

		// fields
		for (QDataTerm<?> element : dataPart.getElements()) {
			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);

			FieldHelper.writePublicField(field, element, false, false);
			
			StringBuffer value = new StringBuffer();
			
			if(element.getDataType().isUnary()) {
				QUnaryDataTerm<?> unaryDataTerm = (QUnaryDataTerm<?>)element;
				if(unaryDataTerm.getDefault() != null)
					value.append(unaryDataTerm.getDefault());
			}
			else {
				QMultipleDataTerm<?> multipleDataTerm = (QMultipleDataTerm<?>)element;
				for(String child: multipleDataTerm.getDefault()) {
					value.append(child);
				}
			}
			
			if(!value.toString().isEmpty())
				FieldHelper.writeAnnotation(field, DataDef.class.getSimpleName(), "value", value.toString());

			
			target.bodyDeclarations().add(field);
		}

		// elements
		for(QDataTerm<?> element: dataPart.getElements()) 
			TermHelper.writeInnerTerm(unit, target, element);			

	}	
}