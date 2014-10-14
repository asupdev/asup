package org.asup.fw.core.e4;

import org.asup.fw.core.QApplicationManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class E4Activator implements BundleActivator {

	private ServiceRegistration<QApplicationManager> applicationManagerRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		this.applicationManagerRegistration = context.registerService(QApplicationManager.class, new E4ApplicationManagerImpl(), null);
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if(this.applicationManagerRegistration != null)
			context.ungetService(applicationManagerRegistration.getReference());
		
	}

}
