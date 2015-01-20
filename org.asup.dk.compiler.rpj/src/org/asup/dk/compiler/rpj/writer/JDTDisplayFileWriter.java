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

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.isam.QIntegratedLanguageIsamFactory;
import org.asup.il.isam.QRecordDef;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QFileFormat;
import org.asup.os.type.file.QFileFormatField;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTDisplayFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTDisplayFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		// writeFieldSerializer();

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDisplayFile(QDisplayFile displayFile) throws IOException {
		
		for (QFileFormat<?> fileFormat : displayFile.getFileFormats()) {

			QCompoundDataTerm<QRecordDef> formatTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
			formatTerm.setName(fileFormat.getName());
							
			QRecordDef formatDef = QIntegratedLanguageIsamFactory.eINSTANCE.createRecordDef();
			for (QFileFormatField field : fileFormat.getFields()) {
				formatDef.getElements().add((QDataTerm<?>) EcoreUtil.copy((EObject)field));
			}
			formatTerm.setDefinition(formatDef);
			
			writePublicField(formatTerm, false);
			writeInnerTerm(formatTerm);
			
//			JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), getCompilationSetup(), displayFile.getName(), QRecordWrapper.class, false);
//			dataStructureWriter.writeDataStructure(displayDef);
		}

	}
}
