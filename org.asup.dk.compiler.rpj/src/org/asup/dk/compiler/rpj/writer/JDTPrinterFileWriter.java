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
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QDataTerm;
import org.asup.os.type.file.QPrinterFile;
import org.asup.os.type.file.QPrinterFileFormat;
import org.eclipse.jdt.core.dom.Modifier;

public class JDTPrinterFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTPrinterFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		// writeFieldSerializer();

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writerPrinterFile(QPrinterFile printerFile) throws IOException {

		for (QPrinterFileFormat printerFileFormat : printerFile.getPrinterFormats()) {

			List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
			elements.addAll(printerFileFormat.getFields());

			JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), getCompilationSetup(), printerFileFormat.getName(), QDataStructWrapper.class, true);
			dataStructureWriter.writeElements(elements);
		}

	}
}
