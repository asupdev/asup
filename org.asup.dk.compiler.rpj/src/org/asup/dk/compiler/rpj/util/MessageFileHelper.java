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

import java.io.OutputStream;
import java.util.List;

import org.asup.os.type.msgf.QMessageDescription;
import org.asup.os.type.msgf.QMessageFile;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;

public class MessageFileHelper {

	@SuppressWarnings("unchecked")
	public static void writeMessageFile(OutputStream outputStream,
			QMessageFile messageFile, String packageName, String name) {

		AST ast = AST.newAST(AST.JLS8);
		CompilationUnit unit = ast.newCompilationUnit();

		// package
		if (packageName != null)
			UnitHelper.writePackage(unit, packageName);

		EnumDeclaration enumDeclaration = buildEnumDeclaration(ast, name, messageFile.getMessages());
		unit.types().add(enumDeclaration);				
				
		// write file output
		try {
			byte[] contentInBytes = unit.toString().getBytes();

			outputStream.write(contentInBytes);
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private static EnumDeclaration buildEnumDeclaration(AST ast, String name, List<QMessageDescription> messageDescriptions) {

		// write AST
		EnumDeclaration enumDeclaration = ast.newEnumDeclaration();
		enumDeclaration.setName(ast.newSimpleName(name));

		enumDeclaration.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		
		for (QMessageDescription messageDescription : messageDescriptions) {
			EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
			constantDeclaration.setName(ast.newSimpleName(messageDescription.getName()));
			enumDeclaration.enumConstants().add(constantDeclaration);			
			
/*			Javadoc javadoc = ast.newJavadoc();
			TagElement tag = javadoc.getAST().newTagElement();
			TextElement textElement = javadoc.getAST().newTextElement();
			textElement.setText(messageDescription.getMessageText());
			tag.fragments().add(textElement);
			javadoc.tags().add(tag);
			
			constantDeclaration.setJavadoc(javadoc);*/
		}
		
		return enumDeclaration;
	}
}