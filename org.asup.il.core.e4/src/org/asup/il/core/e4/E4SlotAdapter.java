package org.asup.il.core.e4;

import org.asup.il.core.QCardinality;
import org.asup.il.core.QSlot;
import org.eclipse.emf.ecore.EStructuralFeature;

public class E4SlotAdapter implements QSlot {

	private EStructuralFeature structuralFeature;
	
	public E4SlotAdapter(EStructuralFeature structuralFeature) {
		this.structuralFeature = structuralFeature;
	}
	
	@Override
	public String getName() {
		return structuralFeature.getName();
	}

	@Override
	public QCardinality getCardinality() {	
		return new E4CardinalityAdapter(this.structuralFeature);
	}

	@Override
	public void setCardinality(QCardinality value) {
		throw new UnsupportedOperationException();
	}
}
