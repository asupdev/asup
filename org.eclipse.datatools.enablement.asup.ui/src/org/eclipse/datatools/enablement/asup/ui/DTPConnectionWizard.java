package org.eclipse.datatools.enablement.asup.ui;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.asup.db.core.util.QConnectionHelper;
import org.eclipse.datatools.connectivity.ui.wizards.NewConnectionProfileWizard;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;

public class DTPConnectionWizard extends NewConnectionProfileWizard implements IWizard {

//	private ExtensibleProfileDetailsWizardPage wizardPage = null;
	
	private Properties properties;
	
	@PostConstruct
	private void init() {
		System.err.println("init wizard");
	}
	
	public DTPConnectionWizard() {
		super();
		properties = QConnectionHelper.buildDTPPropertiesByVendorVersion("AsUP", "053");
	}

	@Override
	public void addCustomPages() {
		IWizardPage wizardPage = new DTPConnectionWizardPage("As.UP Connection Wizard", properties);		
		addPage(wizardPage);
	}

	@Override
	public Properties getProfileProperties() {
		return properties;
	}
}
