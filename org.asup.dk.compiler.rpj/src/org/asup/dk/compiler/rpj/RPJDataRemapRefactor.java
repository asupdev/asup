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
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.core.QOverlay;
import org.asup.il.core.QRemap;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;

public class RPJDataRemapRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataRemapRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		// remap
		QRemap remap = term.getFacet(QRemap.class);
		if (remap == null)
			return super.visit(term);

		QDataTerm<?> remapTerm = getCompilationContext().getDataTerm(remap.getName(), true);
		if (remapTerm == null)
			throw new RuntimeException("Unexpected condition: 57as43aa34df45678sd8764xm0437");

		if (remapTerm.getDataTermType().isMultiple()) {

			if (term.getParent() instanceof QCompoundDataTerm<?>) {
				QCompoundDataTerm<?> compoundDataTerm = (QCompoundDataTerm<?>) term.getParent();

				if (compoundDataTerm.getDefinition().getElements().get(0) == remapTerm) {
					// TODO check compatibility
				} else {
					QOverlay qOverlay = QIntegratedLanguageCoreFactory.eINSTANCE.createOverlay();
					qOverlay.setName(term.getName());
					remapTerm.getFacets().add(qOverlay);
					compoundDataTerm.getDefinition().getElements().add(0, remapTerm);
				}
			} else
				throw new RuntimeException("Unexpected condition: qsz49898t49q8sd8764xm0437");

			setDataTerm(null);
		} else
			throw new RuntimeException("Unexpected condition: nv45403nvq00678sd8764xm0437");

		return false;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataRemapRefactor(getCompilationContext());
	}
}