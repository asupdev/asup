package org.asup.dk.compiler.rpj.visitor;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
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

public class RPJDataLikeVisitor extends DataTermVisitorImpl {


	private QCompilationContext compilationContext;
	
	private QDataTerm<?> dataTerm;

	@Inject
	public RPJDataLikeVisitor(QCompilationContext compilationContext) {
		this.compilationContext = compilationContext;
	}
	
	public void reset() {
		dataTerm = null;
	}
	
	public QDataTerm<?> getDataTerm() {
		return dataTerm;
	}

	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {

		// like
		if(term.getLike() != null) {
			
			QDataTerm<?> like = compilationContext.getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04370");
			
			dataTerm = buildMultipleDataTerm(term, like);
		}
		else
			dataTerm = (QDataTerm<?>) EcoreUtil.copy((EObject)term);

		
		return false;
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		// like
		if(term.getLike() != null) {
			
			QDataTerm<?> like = compilationContext.getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04371");
			
			dataTerm = buildMultipleDataTerm(term, like);
		}
		else 	
			dataTerm = (QDataTerm<?>) EcoreUtil.copy((EObject)term);

		return false;
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {
		
		// like
		if(term.getLike() != null) {
			QDataTerm<?> like = compilationContext.getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04372");
			
			dataTerm = buildUnaryDataTerm(term, like);
		}
		else
			dataTerm = (QDataTerm<?>) EcoreUtil.copy((EObject)term);

		// overlay
/*		QOverlay overlay = term.getFacet(QOverlay.class);
		if(overlay != null) {
			QDataTerm<?> overlaid = compilationContext.getData(overlay.getName(), true);
			if(overlaid == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04374");

			if(overlaid.getDataType().isMultiple()) {

				// multiple term
				QMultipleAtomicDataTerm<QArrayDef<?>> multipleAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleAtomicDataTerm();
				copyDataTerm(term, multipleAtomicDataTerm);

				// definition
				QArrayDef<?> arrayDataDef = QIntegratedLanguageDataFactory.eINSTANCE.createArrayDef();
				arrayDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject)dataTerm.getDefinition()));
				multipleAtomicDataTerm.setDefinition(arrayDataDef);				

				dataTerm = multipleAtomicDataTerm;
			}
		}*/
		
		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {
		
		// like
		if(term.getLike() != null) {
			QDataTerm<?> like = compilationContext.getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04373");
			
			dataTerm = buildUnaryDataTerm(term, like);
		}
		else
			dataTerm = (QDataTerm<?>) EcoreUtil.copy((EObject)term);

		return false;
	}

	private QDataTerm<?> buildUnaryDataTerm(QDataTerm<?> term, QDataTerm<?> like) {

		if(like.getDataType().isAtomic()) {
		
			// term
			QUnaryAtomicDataTerm<QUnaryAtomicDataDef<?>> unaryAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryAtomicDataTerm();
			copyDataTerm(term, unaryAtomicDataTerm);
						
			// definition
			if(term.getDefinition() instanceof QBufferedDataDef) {
				QUnaryAtomicBufferedDataDef<?> unaryAtomicBufferedDataDef = (QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject)like.getDefinition());
				unaryAtomicDataTerm.setDefinition(unaryAtomicBufferedDataDef);
			}
			else
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04384");
			
			return unaryAtomicDataTerm;
		}
		else {
			
			// term
			QUnaryCompoundDataTerm<?> unaryCompoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createUnaryCompoundDataTerm();
			copyDataTerm(term, unaryCompoundDataTerm);

			// definition
			QUnaryCompoundDataDef<?> unaryCompoundDataDef = QIntegratedLanguageDataFactory.eINSTANCE.createDataStructDef();
			copyCompoundDataDef((QCompoundDataDef<?>) like.getDefinition(), unaryCompoundDataDef);

			return unaryCompoundDataTerm;
		}
	}

	private QDataTerm<?> buildMultipleDataTerm(QDataTerm<?> termTo, QDataTerm<?> termFrom) {
		
		if(termFrom.getDataType().isAtomic()) {
			
			// term
			QMultipleAtomicDataTerm<QMultipleAtomicDataDef<?>> multipleAtomicDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleAtomicDataTerm();
			copyDataTerm(termTo, multipleAtomicDataTerm);

			// definition
			if(termTo.getDefinition() instanceof QBufferedDataDef) {
				QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject)termTo.getDefinition());				
				multipleAtomicBufferedDataDef.setArgument((QUnaryAtomicBufferedDataDef<?>) EcoreUtil.copy((EObject)termFrom.getDefinition()));				
				multipleAtomicDataTerm.setDefinition(multipleAtomicBufferedDataDef);
			}
			else {
				QListDef<?> listDef = (QListDef<?>) EcoreUtil.copy((EObject)termTo.getDefinition());
				listDef.setArgument((QUnaryAtomicDataDef<?>) EcoreUtil.copy((EObject)termFrom.getDefinition()));
				multipleAtomicDataTerm.setDefinition(listDef);
			}

			return multipleAtomicDataTerm;
		}
		else {
			
			// term
			QMultipleCompoundDataTerm<QMultipleCompoundDataDef<?>> multipleCompoundDataTerm = QIntegratedLanguageDataFactory.eINSTANCE.createMultipleCompoundDataTerm();
			copyDataTerm(termTo, multipleCompoundDataTerm);

			// definition
			QMultipleCompoundDataDef<?> multipleCompoundDataDef = QIntegratedLanguageDataFactory.eINSTANCE.createStrollerDef();
			copyCompoundDataDef((QCompoundDataDef<?>) termFrom.getDefinition(), multipleCompoundDataDef);
			multipleCompoundDataTerm.setDefinition(multipleCompoundDataDef);
			
			return multipleCompoundDataTerm;
		}

	}
	
	private void copyDataTerm(QDataTerm<?> dataTerm, QDataTerm<?> dataTermTo) {

		dataTermTo.setName(dataTerm.getName());
		dataTermTo.setConstant(dataTerm.isConstant());
		dataTermTo.setInitialized(dataTerm.isInitialized());
		dataTermTo.setRestricted(dataTerm.isRestricted());
		dataTermTo.setText(dataTerm.getText());
		
		
		for(QFacet facet: dataTerm.getFacets()) {
			
			if(dataTermTo.getFacet(facet.getClass()) == null) {
				dataTermTo.getFacets().add((QFacet) EcoreUtil.copy((EObject)facet));
			}
		}

	}
	
	private void copyCompoundDataDef(QCompoundDataDef<?> compoundDataDef, QCompoundDataDef<?> compoundDataDefTo) {

		compoundDataDefTo.setClassDelegator(compoundDataDef.getClassDelegator());
		compoundDataDefTo.setPrefix(compoundDataDef.getPrefix());
		compoundDataDefTo.setQualified(compoundDataDef.isQualified());
		
		RPJDataLikeVisitor elementVisitor = new RPJDataLikeVisitor(compilationContext);
		for(QDataTerm<?> element: compoundDataDef.getElements()) {
			element.accept(elementVisitor);
			compoundDataDefTo.getElements().add(elementVisitor.getDataTerm());
		}
		
		copyDataDef(compoundDataDef, compoundDataDefTo);
	}	
	
	private void copyDataDef(QDataDef<?> dataDef, QDataDef<?> dataDefTo) {
		dataDefTo.getFormulas().addAll(EcoreUtil.copyAll(dataDef.getFormulas()));
	}

}