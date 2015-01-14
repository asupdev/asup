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

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.fw.core.FrameworkCoreUnexpectedConditionException;
import org.asup.il.core.QFacet;
import org.asup.il.data.QBufferedDataDef;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QListDef;
import org.asup.il.data.QMultipleAtomicBufferedDataDef;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class RPJAbstractDataRefactor extends DataTermVisitorImpl {

	private QCompilationUnit compilationUnit;
	private QDataTerm<?> dataTerm;

	@Inject
	public RPJAbstractDataRefactor(QCompilationUnit compilationUnit) {
		this.compilationUnit = compilationUnit;
	}

	protected QCompilationUnit getCompilationContext() {
		return this.compilationUnit;
	}

	public abstract RPJAbstractDataRefactor copy();

	public void reset() {
		this.dataTerm = null;
	}

	public QDataTerm<?> getDataTerm() {
		return dataTerm;
	}

	protected void setDataTerm(QDataTerm<?> dataTerm) {
		this.dataTerm = dataTerm;
	}

	protected QDataTerm<?> buildUnaryDataTerm(QDataTerm<?> termTo, QDataTerm<?> termFrom) {

		if (termFrom.getDataTermType().isAtomic()) {

			// term
			QUnaryAtomicDataTerm<QUnaryAtomicDataDef<?>> unaryAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryAtomicDataTerm();
			copyDataTerm(termTo, unaryAtomicDataTerm);

			// unary definition
			if (termFrom.getDataTermType().isUnary()) {
				QUnaryAtomicBufferedDataDef<?> unaryAtomicBufferedDataDef = (QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition());
				unaryAtomicDataTerm.setDefinition(unaryAtomicBufferedDataDef);
			}
			// multiple definition
			else {
				QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) termFrom.getDefinition();
				unaryAtomicDataTerm.setDefinition((QUnaryAtomicDataDef<?>) EcoreUtil.copy((EObject) multipleAtomicBufferedDataDef.getArgument()));
			}

			return unaryAtomicDataTerm;
		} else {

			// term
			QUnaryCompoundDataTerm<QUnaryCompoundDataDef<?>> unaryCompoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
			copyDataTerm(termTo, unaryCompoundDataTerm);

			// definition
			QUnaryCompoundDataDef<?> unaryCompoundDataDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
			copyCompoundDataDef((QCompoundDataDef<?>) termFrom.getDefinition(), unaryCompoundDataDef);
			unaryCompoundDataTerm.setDefinition(unaryCompoundDataDef);

			return unaryCompoundDataTerm;
		}
	}

	protected QDataTerm<?> buildMultipleDataTerm(QDataTerm<?> termTo, QDataTerm<?> termFrom) {

		QDataTerm<?> dataTerm = null;
		
		if (termFrom.getDataTermType().isAtomic()) {

			// term
			QMultipleAtomicDataTerm<QMultipleAtomicDataDef<?>> multipleAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleAtomicDataTerm();
			copyDataTerm(termTo, multipleAtomicDataTerm);

			// buffered definition
			if (termFrom.getDefinition() instanceof QBufferedDataDef) {

				// unary
				if (termFrom.getDataTermType().isUnary()) {
					QMultipleAtomicBufferedDataDef<?> multipleAtomicDataDef = (QMultipleAtomicBufferedDataDef<?>) termTo.getDefinition();
					multipleAtomicDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition()));
					multipleAtomicDataTerm.setDefinition(multipleAtomicDataDef);
				}
				// multiple
				else {
					
					if (termTo.getDefinition() != null) {
						
						switch (termTo.getDataTermType()) {
						case MULTIPLE_ATOMIC:
							QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition());
							QMultipleAtomicBufferedDataDef<?> multipleDataDef = (QMultipleAtomicBufferedDataDef<?>) termTo.getDefinition();
							multipleAtomicBufferedDataDef.setArgument(multipleDataDef.getArgument());
							multipleAtomicDataTerm.setDefinition(multipleAtomicBufferedDataDef);
							break;
						case UNARY_ATOMIC:
							multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition());
							multipleAtomicBufferedDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) termTo.getDefinition());
							multipleAtomicDataTerm.setDefinition(multipleAtomicBufferedDataDef);
							break;
						case UNARY_COMPOUND:
							throw new FrameworkCoreUnexpectedConditionException("gfsd779sfff79q4375v");							
							
						case MULTIPLE_COMPOUND:
							throw new FrameworkCoreUnexpectedConditionException("bt7v8q45q4v5bq4375v");
						}						
					}
					
				}
			} else {
				QListDef<?> listDef = (QListDef<?>) EcoreUtil.copy((EObject) termTo.getDefinition());
				listDef.setArgument((QUnaryAtomicDataDef<?>) EcoreUtil.copy((EObject) termFrom.getDefinition()));
				multipleAtomicDataTerm.setDefinition(listDef);
			}

		} else {

			// term
			QMultipleCompoundDataTerm<QMultipleCompoundDataDef<?>> multipleCompoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleCompoundDataTerm();
			copyDataTerm(termTo, multipleCompoundDataTerm);

			// definition
			QMultipleCompoundDataDef<?> multipleCompoundDataDef = QIntegratedLanguageDataFactory.eINSTANCE.createStrollerDef();
			copyCompoundDataDef((QCompoundDataDef<?>) termFrom.getDefinition(), multipleCompoundDataDef);
			multipleCompoundDataTerm.setDefinition(multipleCompoundDataDef);

		}

		return dataTerm;
	}

	private void copyDataTerm(QDataTerm<?> dataTerm, QDataTerm<?> dataTermTo) {

		dataTermTo.setName(dataTerm.getName());
		dataTermTo.setConstant(dataTerm.isConstant());
		dataTermTo.setInitialized(dataTerm.isInitialized());
		dataTermTo.setRestricted(dataTerm.isRestricted());
		dataTermTo.setText(dataTerm.getText());

		for (QFacet facet : dataTerm.getFacets()) {

			if (dataTermTo.getFacet(facet.getClass()) == null) {
				dataTermTo.getFacets().add((QFacet) EcoreUtil.copy((EObject) facet));
			}
		}

	}

	private void copyCompoundDataDef(QCompoundDataDef<?> compoundDataDef, QCompoundDataDef<?> compoundDataDefTo) {

		compoundDataDefTo.setClassDelegator(compoundDataDef.getClassDelegator());
		compoundDataDefTo.setPrefix(compoundDataDef.getPrefix());
		compoundDataDefTo.setQualified(compoundDataDef.isQualified());

		RPJAbstractDataRefactor elementVisitor = this.copy();
		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(compoundDataDef.getElements());
		for (QDataTerm<?> element : dataTerms) {
			elementVisitor.reset();
			element.accept(elementVisitor);
			compoundDataDefTo.getElements().add((QDataTerm<?>) EcoreUtil.copy((EObject) elementVisitor.getDataTerm()));
		}

		copyDataDef(compoundDataDef, compoundDataDefTo);
	}

	private void copyDataDef(QDataDef<?> dataDef, QDataDef<?> dataDefTo) {
		dataDefTo.getFormulas().addAll(EcoreUtil.copyAll(dataDef.getFormulas()));
	}

	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {

		dataTerm = term;

		return false;
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		dataTerm = term;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(term.getDefinition().getElements());

		RPJAbstractDataRefactor visitor = this.copy();
		for (QDataTerm<?> dataTerm : dataTerms) {
			visitor.reset();

			dataTerm.accept(visitor);
			term.getDefinition().getElements().remove(dataTerm);
			term.getDefinition().getElements().add(visitor.getDataTerm());
		}

		return false;
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		dataTerm = term;

		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		dataTerm = term;

		List<QDataTerm<?>> dataTerms = new ArrayList<QDataTerm<?>>(term.getDefinition().getElements());

		RPJAbstractDataRefactor visitor = this.copy();
		for (QDataTerm<?> dataTerm : dataTerms) {
			visitor.reset();

			dataTerm.accept(visitor);
			term.getDefinition().getElements().remove(dataTerm);
			
			if(visitor.getDataTerm() != null)
				term.getDefinition().getElements().add(visitor.getDataTerm());
		}

		return false;
	}

}
