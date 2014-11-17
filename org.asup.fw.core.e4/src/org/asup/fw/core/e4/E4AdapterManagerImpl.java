package org.asup.fw.core.e4;

import org.asup.fw.core.impl.AdapterManagerImpl;
import org.eclipse.core.internal.runtime.AdapterManager;

@SuppressWarnings("restriction")
public class E4AdapterManagerImpl extends AdapterManagerImpl {

	@SuppressWarnings({"unchecked" })
	@Override
	public <T> T getAdapter(Object source, Class<T> target) {
		
		AdapterManager adapterManager = AdapterManager.getDefault(); 
		return (T) adapterManager.getAdapter(source, target);
	}

}
