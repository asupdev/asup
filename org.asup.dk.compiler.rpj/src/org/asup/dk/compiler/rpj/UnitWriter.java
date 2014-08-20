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

import java.io.IOException;
import java.io.OutputStream;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilerManager;
import org.asup.dk.compiler.rpj.util.FieldHelper;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QDataSection;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.pgm.rpj.RPJProgramSupport;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public abstract class UnitWriter {

	@Inject
	protected QCompilerManager compilerManager;
	@Inject
	private QCompilationContext compilationContext;
	@Inject
	protected QJob job;
	
	protected QCompilationContext getCompilationContext() {
		return this.compilationContext;
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
	
	@SuppressWarnings("unchecked")
	public void writeSupportFields(TypeDeclaration target) {
		
		AST ast = target.getAST();
		
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

		VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
		FieldDeclaration field = ast.newFieldDeclaration(variable);
		FieldHelper.writeAnnotation(field, ModuleDef.class.getSimpleName(), "name", "*RPJ");
		field.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.setType(ast.newSimpleType(ast.newName(RPJProgramSupport.class.getSimpleName())));
		variable.setName(ast.newSimpleName("qRPJ"));
		target.bodyDeclarations().add(field);
		
	}
	
	@SuppressWarnings("unchecked")
	public void writeDataFields(TypeDeclaration target, QDataSection dataSection) {

		AST ast = target.getAST();
		
		// fields
		for (QDataTerm<?> dataTerm : dataSection.getDatas()) {

			System.out.println(dataTerm);
			if(dataTerm.getName().equalsIgnoreCase("TSTG79"))
				dataTerm.toString();
			
			if(dataTerm.getDefinition() == null)
				continue;
			
			dataTerm = compilationContext.getData(dataTerm.getName(), true);
			
			VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
			FieldDeclaration field = ast.newFieldDeclaration(variable);
			FieldHelper.writePublicField(field, dataTerm, false, false);
			
			if(dataTerm.getDataType().isUnary()) {
				QUnaryDataTerm<?> unaryDataTerm = (QUnaryDataTerm<?>)dataTerm;
				if(unaryDataTerm.getDefault() != null)
					FieldHelper.writeAnnotation(field, DataDef.class.getSimpleName(), "value", unaryDataTerm.getDefault());
			}
			else {
				QMultipleDataTerm<?> multipleDataTerm = (QMultipleDataTerm<?>)dataTerm;
				if(multipleDataTerm.getDefault() != null)
					FieldHelper.writeAnnotation(field, DataDef.class.getSimpleName(), "values", multipleDataTerm.getDefault());
			}
			
				
			
			target.bodyDeclarations().add(field);
		}

	}
	
	public void writeOutputStream(CompilationUnit compilationUnit, OutputStream outputStream) throws IOException {
		// write file output
		byte[] contentInBytes = compilationUnit.toString().getBytes();

		outputStream.write(contentInBytes);
		outputStream.flush();
		outputStream.close();
	}
}