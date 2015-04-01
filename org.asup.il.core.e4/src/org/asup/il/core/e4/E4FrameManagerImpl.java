package org.asup.il.core.e4;

import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.core.QFrame;
import org.asup.il.core.QFrameManager;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class E4FrameManagerImpl extends ServiceImpl implements QFrameManager {

	@Override
	public QFrame getFrame(Object object) {
		
		if(!EObject.class.isInstance(object))
			return null;
		
		EObject eObject = (EObject)object;
		EClass eClass = eObject.eClass();
		
		E4FrameAdapter frameAdapter = new E4FrameAdapter(eClass); 
		
		return frameAdapter;
	}

}
