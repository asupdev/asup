package org.asup.il.data.nio.visitor;

import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.data.QData;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QList;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QStruct;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.impl.DataTermVisitorImpl;

public class NIODataResetter extends DataTermVisitorImpl {

	private QData data;
	
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
				if(specialElement.isUnary()) {
					list.get(i).eval(specialElement);
				}
				else {
					for(int e=i; e<=list.capacity(); e++) {
						list.get(e).eval(specialElement);
					}
				}
			}
			else
				data.eval(value);

			i++;
		}
		
		return true;
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		if(term.getDefault() == null || term.getDefault().isEmpty()) {
			data.clear();
			return true;
		}
		
		@SuppressWarnings("unchecked")
		QList<QStruct> list = (QList<QStruct>)data;
		
		boolean _return = true;
		
		int i = 1;
		for(String value: term.getDefault()) { 
			
			QSpecialElement specialElement = getSpecialElement(term, value);
			if(specialElement != null) {
				if(specialElement.isUnary()) {
					list.get(i).eval(specialElement);
				}
				else {
					for(int e=i; e<=list.capacity(); e++) {
						list.get(e).eval(specialElement);
					}
				}
				_return = false;
			}
			else
				data.eval(value);
			
			i++;
		}
		
		return _return;
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {

		if(term.getDefault() == null) {
			data.clear();
			return true;
		}
		
		QSpecialElement specialElement = getSpecialElement(term, term.getDefault());
		if(specialElement != null) 
			data.eval(specialElement);
		else
			data.eval(term.getDefault());
		
		return true;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {

		if(term.getDefault() == null) {
			data.clear();
			return true;
		}

		QStruct struct = (QStruct)data;
		
		boolean _return = true;
				
		QSpecialElement specialElement = getSpecialElement(term, term.getDefault());
		if(specialElement != null) { 
			struct.eval(specialElement);
			_return = false;
		}
		else
			data.eval(term.getDefault());
		
		return _return;
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
