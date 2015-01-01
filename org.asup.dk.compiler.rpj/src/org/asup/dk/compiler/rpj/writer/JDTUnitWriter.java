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

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.dk.compiler.rpj.RPJExpressionNormalizer;
import org.asup.il.data.QData;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QUnit;
import org.asup.os.type.pgm.rpj.RPJDatabaseSupport;
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


	public JDTUnitWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);
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
	public void writeSupportFields(RPJCallableUnitInfo callableUnitInfo) {

		writeImport(QData.class);
		writeImport(RPJProgramSupport.class);
		
		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		writeAnnotation(field, ModuleDef.class, "name", "*RPJ");
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.setType(getAST().newSimpleType(getAST().newName(RPJProgramSupport.class.getSimpleName())));
		variable.setName(getAST().newSimpleName("qRPJ"));
		getTarget().bodyDeclarations().add(field);

		// *SQL
		if(callableUnitInfo.containsSQLStatement()) {
			writeImport(RPJDatabaseSupport.class);
			
			variable = getAST().newVariableDeclarationFragment();
			field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, ModuleDef.class, "name", "*SQL");
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			field.setType(getAST().newSimpleType(getAST().newName(RPJDatabaseSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qSQL"));
			getTarget().bodyDeclarations().add(field);

		}

	}

	public void refactUnit(QUnit unit) {

		RPJExpressionNormalizer expressionNormalizer = getCompilationUnit().getContext().make(RPJExpressionNormalizer.class);

		// main
		if (unit.getMain() != null) 
			unit.getMain().accept(expressionNormalizer);
	}
}