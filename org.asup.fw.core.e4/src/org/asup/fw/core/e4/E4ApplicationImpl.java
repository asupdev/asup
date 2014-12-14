package org.asup.fw.core.e4;

import java.util.List;

import org.asup.fw.core.QApplication;
import org.asup.fw.core.QApplicationLevel;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QServiceHook;

public class E4ApplicationImpl implements QApplication {

	private QApplication application;
	private QContext context;
	
	
	public E4ApplicationImpl(QApplication application, QContext context) {
		this.application = application;
		this.context = context;
	}

	public List<QServiceHook> getHooks() {
		return application.getHooks();
	}

	public List<QApplicationLevel> getLevels() {
		return application.getLevels();
	}

	public String getText() {
		return application.getText();
	}

	public void setText(String value) {
		application.setText(value);
	}

	public QContext getContext() {
		return this.context;
	}
}
