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

import java.io.OutputStream;

import org.asup.il.data.QCompoundDataDef;
import org.asup.os.type.file.QRecordDelegator;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class RecordHelper {

	@SuppressWarnings("unchecked")
	public static void writeRecord(OutputStream outputStream, QCompoundDataDef<?> dataDef, String packageName, String name) {

		AST ast = AST.newAST(AST.JLS8);
		CompilationUnit unit = ast.newCompilationUnit();

		// package
		if (packageName != null)
			UnitHelper.writePackage(unit, packageName);

		// import
		UnitHelper.writeImport(unit, QRecordDelegator.class);

		// write AST
		TypeDeclaration typeDec = ast.newTypeDeclaration();
		typeDec.setName(ast.newSimpleName(name));
		CompoundHelper.writeStruct(unit, typeDec, dataDef, QRecordDelegator.class, false);
		unit.types().add(typeDec);

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
}