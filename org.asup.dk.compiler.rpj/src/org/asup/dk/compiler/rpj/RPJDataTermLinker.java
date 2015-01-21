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

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;
import org.asup.os.type.file.QExternalFile;

public class RPJDataTermLinker extends DataTermVisitorImpl {

	private RPJCallableUnitLinker callableUnitLinker;

	@Inject
	public RPJDataTermLinker(QCompilationUnit compilationUnit) {
		this.callableUnitLinker = compilationUnit.getContext().get(RPJCallableUnitLinker.class);
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		QExternalFile externalFile = term.getFacet(QExternalFile.class);
		if (externalFile != null)
			callableUnitLinker.linkExternalFile(term, term.getDefinition().getElements(), externalFile);

		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		QExternalFile externalFile = term.getFacet(QExternalFile.class);
		if (externalFile != null)
			callableUnitLinker.linkExternalFile(term, term.getDefinition().getElements(), externalFile);

		return false;
	}
}
