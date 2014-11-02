package org.asup.dk.compiler.rpj;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;

public class RPJDataLikeRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataLikeRefactor(QCompilationContext compilationContext) {
		super(compilationContext);
	}

	@Override
	public boolean visit(QMultipleAtomicDataTerm<?> term) {

		// like
		if(term.getLike() != null) {
			
			QDataTerm<?> like = getCompilationContext().getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04370");
			
			setDataTerm(buildMultipleDataTerm(term, like));
		}
		else
			super.visit(term);

		
		return false;
	}

	@Override
	public boolean visit(QMultipleCompoundDataTerm<?> term) {

		// like
		if(term.getLike() != null) {
			
			QDataTerm<?> like = getCompilationContext().getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04371");
			
			setDataTerm(buildMultipleDataTerm(term, like));
		}
		else 	
			super.visit(term);

		return false;
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {
		
		// like
		if(term.getLike() != null) {
			QDataTerm<?> like = getCompilationContext().getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04372");
			
			setDataTerm(buildUnaryDataTerm(term, like));
		}
		else
			super.visit(term);
		
		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {
		
		// like
		if(term.getLike() != null) {
			QDataTerm<?> like = getCompilationContext().getDataTerm(term.getLike(), true);
			if(like == null)
				throw new RuntimeException("Unexpected condition: 4m8x7t8764xm04373");
			
			setDataTerm(buildUnaryDataTerm(term, like));
		}
		else
			super.visit(term);

		return false;
	}

	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataLikeRefactor(getCompilationContext());
	}
}