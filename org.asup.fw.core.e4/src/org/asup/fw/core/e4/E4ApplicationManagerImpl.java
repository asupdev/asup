package org.asup.fw.core.e4;

import java.io.OutputStream;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.QApplicationManager;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public class E4ApplicationManagerImpl implements QApplicationManager {

	@Override
	public QApplication start(QApplication application, OutputStream output) {

	    try {
			// Start application
	    	BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
			E4ApplicationStarter applicationStarter = new E4ApplicationStarter(application, bundleContext, output);
			
			application = applicationStarter.start();
		    bundleContext.registerService(QApplication.class, application, null);
			
			return application;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	 
	}

}
