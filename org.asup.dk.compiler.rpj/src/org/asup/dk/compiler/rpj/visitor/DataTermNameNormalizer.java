/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.dk.compiler.rpj.visitor;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;

public class DataTermNameNormalizer extends DataTermVisitorImpl {

	@Inject
	private QCompilationContext compilationContext;
	
	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {

		normalizeDataTerm(term);
		
		return super.visit(term);
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		normalizeDataTerm(term);
		
		return super.visit(term);
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		normalizeDataTerm(term);
		
		return super.visit(term);
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		normalizeDataTerm(term);
		
		return super.visit(term);
	}
	
	private void normalizeDataTerm(QDataTerm<?> dataTerm) {
		
		dataTerm.setLike(compilationContext.normalizeTermName(dataTerm.getLike()));
		dataTerm.setName(compilationContext.normalizeTermName(dataTerm.getName()));

	}
}