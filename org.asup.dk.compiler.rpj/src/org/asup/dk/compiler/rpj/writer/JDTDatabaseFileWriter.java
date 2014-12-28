/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi 			 - Initial API and implementation 
 *   Giuliano Giancristofaro - Implementation
 */
package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.data.QDataTerm;
import org.asup.il.isam.annotation.Descend;
import org.asup.il.isam.annotation.Index;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QFileFormatKey;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTDatabaseFileWriter extends JDTDataStructureWriter {

	@SuppressWarnings("unchecked")
	public JDTDatabaseFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, Class<?> superClass) {
		super(root, compilationUnit, compilationSetup, name, superClass, false);

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}
	
	@SuppressWarnings("unchecked")
	public JDTDatabaseFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, String superClassName) {
		super(root, compilationUnit, compilationSetup, name, superClassName, true, false);

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDatabaseFile(QDatabaseFile databaseFile) throws IOException {

		List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
		elements.addAll(databaseFile.getDatabaseFormat().getFields());

		writeElements(elements);		
		
		writeIndex(databaseFile.getFileFormat().getKeys(), databaseFile.getDatabaseFormat().isUnique());
	}
	

	@SuppressWarnings("unchecked")
	public void writeIndex(List<QFileFormatKey> keys, boolean unique) {

		if (keys.isEmpty())
			return;

		EnumDeclaration enumType = getAST().newEnumDeclaration();
		writeAnnotation(enumType, Index.class, "unique", unique);
		
		enumType.setName(getAST().newSimpleName("INDEX_COLUMNS"));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;

		for (QFileFormatKey key : keys) {

			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(key.getName())));

			if(key.isDescend())
				writeAnnotation(constantDeclaration, Descend.class);
				
			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
	}
}
