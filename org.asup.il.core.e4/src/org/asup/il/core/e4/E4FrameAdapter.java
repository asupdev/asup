package org.asup.il.core.e4;

import org.asup.il.core.QFrame;
import org.eclipse.emf.ecore.EClass;

public class E4FrameAdapter implements QFrame {

	private EClass eClass;
	
	public E4FrameAdapter(EClass eClass) {
		this.eClass = eClass;
	}

	@Override
	public String getName() {
		return this.eClass.getName();
	}
	
}
