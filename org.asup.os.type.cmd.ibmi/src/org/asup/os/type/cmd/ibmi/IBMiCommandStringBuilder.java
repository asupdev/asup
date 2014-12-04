/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.asup.os.type.cmd.ibmi;

import org.asup.il.data.QDataContext;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;

public class IBMiCommandStringBuilder implements QDataTermVisitor {
	
	private StringBuffer buffer = new StringBuffer();
	
	QDataContext targetDataContext = null;
	
	
	public void setTarget(QDataContext dataContext) {
		targetDataContext = dataContext;
		clear();
	}
	
	public String getResult() {
		return buffer.toString();
	}
	
	public void clear() {
		buffer = new StringBuffer();
	}

	@Override
	public void endVisit(QDataTerm<?> term) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endVisit(QMultipleAtomicDataTerm<?> term) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endVisit(QMultipleCompoundDataTerm<?> term) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endVisit(QUnaryAtomicDataTerm<?> term) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endVisit(QUnaryCompoundDataTerm<?> term) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean visit(QDataTerm<?> term) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {
		// TODO Auto-generated method stub
		return false;
	}

}
