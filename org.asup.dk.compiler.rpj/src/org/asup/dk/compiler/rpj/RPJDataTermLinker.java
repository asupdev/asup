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
package org.asup.dk.compiler.rpj;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.asup.dk.compiler.DevelopmentKitCompilerRuntimeException;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.dk.compiler.QDevelopmentKitCompilerFactory;
import org.asup.il.core.QDerived;
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QExternalFile;
import org.asup.os.type.file.QFile;

public class RPJDataTermLinker extends DataTermVisitorImpl {

	private RPJCallableUnitLinker callableUnitLinker;

	@Inject
	public RPJDataTermLinker(QCompilationUnit compilationUnit) {
		this.callableUnitLinker = compilationUnit.getContext().get(RPJCallableUnitLinker.class);
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		QExternalFile externalFile = term.getFacet(QExternalFile.class);
		if (externalFile != null) {
			completeCompoundDef(term, externalFile);
		}

		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		QExternalFile externalFile = term.getFacet(QExternalFile.class);
		if (externalFile != null) {
			completeCompoundDef(term, externalFile);
		}

		return false;
	}

	private void completeCompoundDef(QCompoundDataTerm<?> compoundDataTerm, QExternalFile externalFile) {

		if (externalFile.getName().startsWith("*"))
			return;

		QFile file = callableUnitLinker.getFile(externalFile.getName());

		if (file == null)
			throw new OperatingSystemRuntimeException("File not found: " + externalFile.getName());

		QDatabaseFile databaseFile = (QDatabaseFile) file;

		if (externalFile.getFormat() == null)
			externalFile.setFormat(databaseFile.getDatabaseFormat().getName());

		Class<?> linkedClass = callableUnitLinker.loadClass(file);
		if (linkedClass == null)
			throw new DevelopmentKitCompilerRuntimeException("Linked class not found: " + externalFile);

		QCompilerLinker compilerLinker = QDevelopmentKitCompilerFactory.eINSTANCE.createCompilerLinker();
		compilerLinker.setLinkedClass(linkedClass);
		compoundDataTerm.getFacets().add(compilerLinker);

		List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>(databaseFile.getDatabaseFormat().getFields());
		for (QDataTerm<?> element : elements) {
			QDerived derived = QIntegratedLanguageCoreFactory.eINSTANCE.createDerived();
			element.getFacets().add(derived);
			compoundDataTerm.getDefinition().getElements().add(element);
		}

	}
}
