package org.asup.dk.compiler.rpj.visitor;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.il.core.QOverlay;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataTerm;

public class RPJDataOverlayRefactor extends RPJAbstractDataRefactor {

	@Inject
	public RPJDataOverlayRefactor(QCompilationContext compilationContext) {
		super(compilationContext);
	}

	@Override
	public boolean visit(QUnaryAtomicDataTerm<?> term) {
		
		// overlay
		QOverlay overlay = term.getFacet(QOverlay.class);
		if(overlay != null) {
			QDataTerm<?> overlayTerm = getCompilationContext().getDataTerm(overlay.getName(), true);
			if(overlayTerm == null)
				throw new RuntimeException("Unexpected condition: 57asdftgasd8764xm04372");
			
			if(overlayTerm.getDataType().isMultiple())
				setDataTerm(buildMultipleDataTerm(term, overlayTerm));
			else
				super.visit(term);
			
		}
		else
			super.visit(term);
		
		return false;
	}

	@Override
	public boolean visit(QUnaryCompoundDataTerm<?> term) {
		
		// overlay
		QOverlay overlay = term.getFacet(QOverlay.class);
		if(overlay != null) {
			QDataTerm<?> overlayTerm = getCompilationContext().getDataTerm(overlay.getName(), true);
			if(overlayTerm == null)
				throw new RuntimeException("Unexpected condition: 57asdftgasd8764xm04372");			
			
			if(overlayTerm.getDataType().isMultiple())
				setDataTerm(buildMultipleDataTerm(term, overlayTerm));
			else
				super.visit(term);

		}
		else
			super.visit(term);

		return false;
	}


	@Override
	public RPJAbstractDataRefactor copy() {
		return new RPJDataOverlayRefactor(getCompilationContext());
	}
}