/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.eclipse.datatools.enablement.asup.ui;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.eclipse.datatools.connectivity.ui.wizards.NewConnectionProfileWizard;
import org.eclipse.datatools.enablement.asup.ASUPPlugin;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;

public class ASUPConnectionWizard extends NewConnectionProfileWizard implements IWizard {

//	private ExtensibleProfileDetailsWizardPage wizardPage = null;
	
	private Properties properties;
	
	@PostConstruct
	private void init() {
		System.err.println("init wizard");
	}
	
	public ASUPConnectionWizard() {
		super();
		
		ASUPPlugin plugin = ASUPPlugin.getInstance();

		properties = plugin.createPropertiesByVendorVersion("As.UP", "V0.5");
	}

	@Override
	public void addCustomPages() {
		IWizardPage wizardPage = new ASUPConnectionWizardPage("As.UP Connection Wizard", properties);		
		addPage(wizardPage);
	}

	@Override
	public Properties getProfileProperties() {
		return properties;
	}
}
