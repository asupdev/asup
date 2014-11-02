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
package org.asup.dk.compiler.rpj.writer;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.dk.compiler.rpj.RPJExpressionNormalizer;
import org.asup.il.data.QData;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.QUnit;
import org.asup.os.type.pgm.rpj.RPJProgramSupport;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public abstract class JDTUnitWriter extends JDTNamedNodeWriter {
	
	RPJCallableUnitInfo callableUnitInfo;		
	
	public JDTUnitWriter(JDTNamedNodeWriter root, QCompilationContext compilationContext, QCompilationSetup compilationSetup, String name) {		
		super(root, compilationContext, compilationSetup, name);
		
		callableUnitInfo = new RPJCallableUnitInfo();
	}

	public RPJCallableUnitInfo getCallableUnitInfo() {
		return this.callableUnitInfo;
	}
	
	@SuppressWarnings("unchecked")
	public void writeSuppressWarning(BodyDeclaration target) {
		
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

	@SuppressWarnings("unchecked")
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

		writeImport(QData.class);
		writeImport(RPJProgramSupport.class);
		
		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		writeAnnotation(field, ModuleDef.class, "name", "*RPJ");
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.setType(getAST().newSimpleType(getAST().newName(RPJProgramSupport.class.getSimpleName())));
		variable.setName(getAST().newSimpleName("qRPJ"));
		getTarget().bodyDeclarations().add(field);
		
	}
/*	
	public void writeOutputStream(CompilationUnit compilationUnit, OutputStream outputStream) throws IOException {
		// write file output
		byte[] contentInBytes = compilationUnit.toString().getBytes();

		outputStream.write(contentInBytes);
		outputStream.flush();
		outputStream.close();
	}*/
	
	public void refactUnit(QUnit unit) {
		
		RPJExpressionNormalizer expressionNormalizer = getCompilationContext().make(RPJExpressionNormalizer.class);
		
		// main
		if(unit.getMain() != null) {
			for(QStatement statement: unit.getMain().getStatements()) {
				statement.accept(expressionNormalizer);
			}
		}
	}
}