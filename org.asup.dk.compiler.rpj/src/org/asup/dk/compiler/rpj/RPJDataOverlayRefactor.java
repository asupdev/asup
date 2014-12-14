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
import org.asup.il.core.QOverlay;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;

public class RPJDataOverlayRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataOverlayRefactor(QCompilationUnit compilationUnit) {
		super(compilationUnit);
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		// overlay
		QOverlay overlay = term.getFacet(QOverlay.class);
		if (overlay != null) {
			QDataTerm<?> overlayTerm = getCompilationContext().getDataTerm(overlay.getName(), true);
			if (overlayTerm == null)
				throw new RuntimeException("Unexpected condition: 57asdftgasd8764xm04372");

			if (overlayTerm.getDataTermType().isMultiple())
				setDataTerm(buildMultipleDataTerm(term, overlayTerm));
			else
				super.visit(term);

		} else
			super.visit(term);

		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		// overlay
		QOverlay overlay = term.getFacet(QOverlay.class);
		if (overlay != null) {
			QDataTerm<?> overlayTerm = getCompilationContext().getDataTerm(overlay.getName(), true);
			if (overlayTerm == null)
				throw new RuntimeException("Unexpected condition: 57asdftgasd8764xm04372");

			if (overlayTerm.getDataTermType().isMultiple())
				setDataTerm(buildMultipleDataTerm(term, overlayTerm));
			else
				super.visit(term);

		} else
			super.visit(term);

		return false;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataOverlayRefactor(getCompilationContext());
	}
}