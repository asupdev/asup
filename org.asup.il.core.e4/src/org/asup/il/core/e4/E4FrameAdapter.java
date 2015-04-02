package org.asup.il.core.e4;

import java.util.ArrayList;
import java.util.List;

import org.asup.il.core.QFrame;
import org.asup.il.core.QSlot;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class E4FrameAdapter implements QFrame {

	private EClass eClass;
	private List<QSlot> slots;
	
	public E4FrameAdapter(EClass eClass) {
		this.eClass = eClass;
	}

	@Override
	public String getName() {
		return this.eClass.getName();
	}

	@Override
	public List<QSlot> getSlots() {
	
		if(this.slots == null) {
			synchronized (this) {
				if(slots == null) {
					this.slots = new ArrayList<QSlot>();
					
					for(EStructuralFeature structuralFeature: eClass.getEAllStructuralFeatures()) {
						this.slots.add(new E4SlotAdapter(structuralFeature));
					}
				}
			}
		}
		
		return this.slots;
	}	
}