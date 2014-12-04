package org.asup.fw.core.e4;

import java.io.OutputStream;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.QApplicationManager;
import org.asup.fw.core.QContext;

public class E4ApplicationManagerImpl implements QApplicationManager {

	@Override
	public QContext start(QApplication application, OutputStream output) {

	    try {
			// Start application
			E4ApplicationStarter applicationStarter = new E4ApplicationStarter(application, output);
			return applicationStarter.start();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	 
	}

}
