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
 */
package org.asup.dk.compiler.rpj;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public abstract class RPJUnitWriter extends RPJNamedNodeWriter {

	public RPJUnitWriter(RPJNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {		
		super(root, compilationContext, compilationSetup, name);
	}
	
	@SuppressWarnings("unchecked")
	public void writeSuppressWarning(TypeDeclaration target) {
		
		AST ast = target.getAST();
		
		NormalAnnotation annotation = ast.newNormalAnnotation();
		annotation.setTypeName(ast.newSimpleName(SuppressWarnings.class.getSimpleName()));

		MemberValuePair memberValuePair = ast.newMemberValuePair();
		memberValuePair.setName(ast.newSimpleName("value"));
		StringLiteral stringLiteral = ast.newStringLiteral();
		stringLiteral.setLiteralValue("static-access");
		memberValuePair.setValue(stringLiteral);
		annotation.values().add(memberValuePair);		
		target.modifiers().add(annotation);
		
	}

	public void writeSupportFields() {
		
	
/*		VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
		FieldDeclaration field = ast.newFieldDeclaration(variable);
		field.modifiers().add(ast.newModifier(ModifierKeyword.PRIVATE_KEYWORD));
		field.setType(ast.newSimpleType(ast.newName("RPJProgramSupport.Indicators".split("\\."))));
		variable.setName(ast.newSimpleName("qIN"));
		target.bodyDeclarations().add(field);
		
		variable = ast.newVariableDeclarationFragment();
		field = ast.newFieldDeclaration(variable);
		field.modifiers().add(ast.newModifier(ModifierKeyword.PRIVATE_KEYWORD));
		field.setType(ast.newSimpleType(ast.newName("RPJProgramSupport.Specials".split("\\."))));
		variable.setName(ast.newSimpleName("qSP"));
		target.bodyDeclarations().add(field);*/

/*		VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
		FieldDeclaration field = ast.newFieldDeclaration(variable);
		FieldHelper.writeAnnotation(field, ModuleDef.class.getSimpleName(), "name", "*RPJ");
		field.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.setType(ast.newSimpleType(ast.newName(RPJProgramSupport.class.getSimpleName())));
		variable.setName(ast.newSimpleName("qRPJ"));
		target.bodyDeclarations().add(field);*/
		
	}
/*	
	public void writeOutputStream(CompilationUnit compilationUnit, OutputStream outputStream) throws IOException {
		// write file output
		byte[] contentInBytes = compilationUnit.toString().getBytes();

		outputStream.write(contentInBytes);
		outputStream.flush();
		outputStream.close();
	}*/
}