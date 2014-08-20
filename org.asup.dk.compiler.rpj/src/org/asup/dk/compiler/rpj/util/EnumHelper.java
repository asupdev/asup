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

import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.data.QAtomicDataTerm;
import org.asup.il.data.annotation.Special;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;

public class EnumHelper {

	@SuppressWarnings("unchecked")
	public static void writeEnum(EnumDeclaration target, QAtomicDataTerm<?> dataTerm) {
		AST ast = target.getAST();

		QSpecial special = dataTerm.getFacet(QSpecial.class);
		
		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		target.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
		
		// elements
		int num = 0;
		
		if(special != null) {
			for (QSpecialElement element : special.getElements()) {

				EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
				constantDeclaration.setName(ast.newSimpleName(normalizeEnumName(element.getName())));				
				writeEnumField(constantDeclaration, element);
				target.enumConstants().add(num, constantDeclaration);
				num++;
			}
		}
		
		// restricted
		if (dataTerm.isRestricted()) {
			EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
			QSpecialElement elemDef = QIntegratedLanguageCoreFactory.eINSTANCE.createSpecialElement();
			elemDef.setName("OTHER");
			writeEnumField(constantDeclaration, elemDef);
			target.enumConstants().add(num, constantDeclaration);
		}

	}

	@SuppressWarnings("unchecked")
	private static void writeEnumField(EnumConstantDeclaration enumField, QSpecialElement elem) {
		AST ast = enumField.getAST();
		NormalAnnotation normalAnnotation = ast.newNormalAnnotation();
		if (elem.getValue() != null) {
			normalAnnotation.setTypeName(ast.newSimpleName(Special.class.getSimpleName()));
			MemberValuePair memberValuePair = ast.newMemberValuePair();
			memberValuePair.setName(ast.newSimpleName("value"));
			StringLiteral stringLiteral = ast.newStringLiteral();
			stringLiteral.setLiteralValue(elem.getValue());
			memberValuePair.setValue(stringLiteral);
			normalAnnotation.values().add(memberValuePair);
			
			enumField.modifiers().add(normalAnnotation);
		}
	}


	private static String normalizeEnumName(String s) {

		// String a = s;
		// if(!s.startsWith("*"))
		// System.err.println("Termine speciale " + s);

		switch (s) {
		case "*":
			s = "TERM_STAR";
			break;
		case "'/'":
			s = "TERM_SLASH";
			break;
		case "'-'":
			s = "TERM_MINUS";
			break;
		case "'+'":
			s = "TERM_PLUS";
			break;
		case "'.'":
			s = "TERM_POINT";
			break;
		case "','":
			s = "TERM_COMMA";
			break;
		case "X''":
			s = "TERM_HEX";
			break;
		}
		// Se inizia con "*" tolgo il primo carattere;
		if (s.startsWith("*")) {
			s = s.substring(1);
		}

		if (isNumeric(s)) {
			s = "NUM_" + s.replace(".", "_");
		} else {
		}

		// if(!a.equals(s)){
		// System.err.println("Variabile " + a + " rinominata in " + s);
		// }

		return s;
	}
	
	private static boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}