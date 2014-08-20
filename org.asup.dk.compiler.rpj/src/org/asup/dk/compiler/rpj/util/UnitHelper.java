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

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;

public class UnitHelper {


	public static void writePackage(CompilationUnit unit, String packageName) {
		AST ast = unit.getAST();
		
		PackageDeclaration packageDeclaration = ast.newPackageDeclaration();
		packageDeclaration.setName(ast.newName(packageName.split("\\.")));
		unit.setPackage(packageDeclaration);
		
	}
	
	@SuppressWarnings("unchecked")
	public static void writeJavadoc(CompilationUnit unit, PackageDeclaration target, String text) {
		AST ast = unit.getAST();
		
/*		String text = "";
		try {
			File copyright = new File("./asup_input/txtfile/copyright.txt");
			InputStream is = new FileInputStream(copyright);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				text = text + "\n" + strLine;
			}
			br.close();
		} catch (Exception e) {
//			e.printStackTrace();
		}*/
		
		Javadoc javaDoc = ast.newJavadoc();
		TagElement tag = ast.newTagElement();
		TextElement te = ast.newTextElement();
		tag.fragments().add(te);
		te.setText(text);
		javaDoc.tags().add(tag);
		tag = ast.newTagElement();
		// tag.setTagName(TagElement.TAG_AUTHOR);
		javaDoc.tags().add(tag);
		
		target.setJavadoc(javaDoc);
	}

	@SuppressWarnings("unchecked")
	public static void writeImport(CompilationUnit unit, Class<?> klass) {
		AST ast = unit.getAST();
		
		ImportDeclaration importDeclaration = ast.newImportDeclaration();
		importDeclaration.setName(ast.newName(klass.getName().split("\\.")));
//		importDeclaration.setOnDemand(false);
		unit.imports().add(importDeclaration);
	}

}
