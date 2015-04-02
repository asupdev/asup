package org.asup.il.core.e4;

import org.asup.il.core.QCardinality;
import org.eclipse.emf.ecore.EStructuralFeature;

public class E4CardinalityAdapter implements QCardinality {

	private static final long serialVersionUID = 1L;
	
	private EStructuralFeature structuralFeature;

	public E4CardinalityAdapter(EStructuralFeature structuralFeature) {
		this.structuralFeature = structuralFeature;
	}
	
	@Override
	public int getMin() {
		return this.structuralFeature.getLowerBound();
	}

	@Override
	public void setMin(int value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isMandatory() {
		return this.structuralFeature.getLowerBound() > 0;
	}

	@Override
	public boolean isMultiple() {
		return this.structuralFeature.getUpperBound() > 1;
	}

	@Override
	public int getMax() {
		return this.structuralFeature.getUpperBound();
	}

	@Override
	public void setMax(int value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() {
		return "carinality";
	}
}