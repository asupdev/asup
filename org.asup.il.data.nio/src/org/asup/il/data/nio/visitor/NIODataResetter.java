package org.asup.il.data.nio.visitor;

import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.data.QData;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QList;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QStruct;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;

public class NIODataResetter extends DataTermVisitorImpl {

	private QData data;
	private QDataEvaluator evaluator = QIntegratedLanguageDataFactory.eINSTANCE.createDataEvaluator();
	
	public NIODataResetter(QData data) {
		this.data = data;
	}

	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {

		if(term.getDefault() == null || term.getDefault().isEmpty()) {
			data.clear();
			return true;
		}
		
		QList<?> list = (QList<?>)data;
		
		int i = 1;
		for(String value: term.getDefault()) {

			QSpecialElement specialElement = getSpecialElement(term, value);
			if(specialElement != null) {
				
				// set default at current index
				if(specialElement.isUnary()) {
					list.get(i).accept(evaluator.set(specialElement));
				}
				else {
					// set default from current index to remaining
					for(int e=i; e<=list.capacity(); e++) {
						list.get(e).accept(evaluator.set(specialElement));
					}
				}
			}
			else
				data.accept(evaluator.set(value));

			i++;
		}
		
		return true;
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		@SuppressWarnings("unchecked")
		QList<QStruct> list = (QList<QStruct>)data;
		
		boolean _return = true;
		
		int i = 1;
		for(String value: term.getDefault()) { 
			
			QSpecialElement specialElement = getSpecialElement(term, value);
			if(specialElement != null) {
				if(specialElement.isUnary()) {
					list.get(i).accept(evaluator.set(specialElement));
				}
				else {
					for(int e=i; e<=list.capacity(); e++) {
						list.get(e).accept(evaluator.set(specialElement));
					}
				}
				_return = false;
			}
			else
				data.accept(evaluator.set(value));
			
			i++;
		}

		if(_return) {

			for(QStruct struct: list) {
				// childs
				for(QDataTerm<?> child: term.getDefinition().getElements()) {
					NIODataResetter childResetter = new NIODataResetter(struct.getElement(child.getName()));
					child.accept(childResetter);
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		if(term.getDefault() == null) {
			data.clear();
			return true;
		}
		
		QSpecialElement specialElement = getSpecialElement(term, term.getDefault());
		if(specialElement != null) 
			data.accept(evaluator.set(specialElement));
		else
			data.accept(evaluator.set(term.getDefault()));
		
		return true;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		QStruct struct = (QStruct)data;
		
		boolean _return = true;

		if(term.getDefault() != null) {
			QSpecialElement specialElement = getSpecialElement(term, term.getDefault());
			if(specialElement != null) { 
				struct.accept(evaluator.set(specialElement));
				_return = false;
			}
			else
				data.accept(evaluator.set(term.getDefault()));
		}
		
		if(_return) {

			// childs
			for(QDataTerm<?> child: term.getDefinition().getElements()) {
				NIODataResetter childResetter = new NIODataResetter(struct.getElement(child.getName()));
				child.accept(childResetter);
			}

		}		
		
		return false;
	}
	
	private QSpecialElement getSpecialElement(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null) { 
			for (QSpecialElement specialElem : special.getElements()) {
				if (specialElem.getName().equals(value)) 
					return specialElem;
			}
		}
		
		return null;
	}

}
