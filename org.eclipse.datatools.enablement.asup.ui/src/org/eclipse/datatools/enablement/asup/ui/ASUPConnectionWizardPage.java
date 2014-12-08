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

import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.ui.wizards.ConnectionProfileDetailsPage;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ASUPConnectionWizardPage extends ConnectionProfileDetailsPage implements IWizardPage {

	Properties properties;
	
	public ASUPConnectionWizardPage(String name, Properties properties) {
		super(name);
		
		this.properties = properties;
		
		setTitle("As.UP Connection Wizard");
		setDescription("As.UP Connection Wizard bla bla bla");
	}

	@Override
	public void createCustomControl(Composite parent) {
		buildControl(parent); 
	}

	private void buildControl(final Composite parent) {
		
		GridLayout layout = new GridLayout(1,false);
		parent.setLayout(layout);

		Label labelVendor = new Label(parent, SWT.NONE);
		labelVendor.setText("Vendor");
		Text textVendor = new Text(parent, SWT.BORDER);
		textVendor.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textVendor.setText(properties.getProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID));

		Label labelVersion = new Label(parent, SWT.NONE);
		labelVersion.setText("Version");
		Text textVersion = new Text(parent, SWT.BORDER);
		textVersion.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textVersion.setText(properties.getProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID));

		Label labelUrl = new Label(parent, SWT.NONE);
		labelUrl.setText("Connection URL");
		Text textUrl = new Text(parent, SWT.BORDER);
		textUrl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textUrl.setText(properties.getProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID));
		
		Label labelUser = new Label(parent, SWT.NONE);
		labelUser.setText("User ID");
		Text textUser = new Text(parent, SWT.BORDER);
		textUser.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textUser.setText(properties.getProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID));
		
		Label labelPassword = new Label(parent, SWT.NONE);
		labelPassword.setText("Password");
		Text textPassword = new Text(parent, SWT.PASSWORD | SWT.BORDER);
		textPassword.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if(properties.getProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID) != null)
			textPassword.setText(properties.getProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID));
	}
}
