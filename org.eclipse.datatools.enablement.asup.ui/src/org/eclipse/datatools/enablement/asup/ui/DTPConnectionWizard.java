package org.eclipse.datatools.enablement.asup.ui;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.eclipse.datatools.connectivity.ConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.DriverInstance;
import org.eclipse.datatools.connectivity.drivers.DriverManager;
import org.eclipse.datatools.connectivity.drivers.IDriverMgmtConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCConnectionProfileConstants;
import org.eclipse.datatools.connectivity.drivers.jdbc.IJDBCDriverDefinitionConstants;
import org.eclipse.datatools.connectivity.drivers.models.TemplateDescriptor;
import org.eclipse.datatools.connectivity.ui.wizards.NewConnectionProfileWizard;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class DTPConnectionWizard extends NewConnectionProfileWizard implements IWizard {

//	private ExtensibleProfileDetailsWizardPage wizardPage = null;
	
	private Properties properties;
	
	@PostConstruct
	private void init() {
		System.err.println("init wizard");
	}
	
	public DTPConnectionWizard() {
		super();
		properties = buildProperties();
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

	private Properties buildProperties() {

		Properties properties = new Properties();
		for (TemplateDescriptor templateDescriptor : TemplateDescriptor.getDriverTemplateDescriptors()) {

			String vendor = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID);
			String version = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID);
 
			if (vendor != null && vendor.equals("AsUP") && version != null && version.equals("053")) {

				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VENDOR_PROP_ID, vendor);
				properties.setProperty(IJDBCDriverDefinitionConstants.DATABASE_VERSION_PROP_ID, version);

				// System.out.println(templateDescriptor.getId());
				DriverInstance driverInstances[] = DriverManager.getInstance().getDriverInstancesByTemplate(templateDescriptor.getId());
				if (driverInstances.length > 0)
					properties.setProperty(ConnectionProfileConstants.PROP_DRIVER_DEFINITION_ID, driverInstances[0].getId());
				
				String driverClass = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID);
				if(driverClass != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.DRIVER_CLASS_PROP_ID, driverClass);
				
				try {
					properties.setProperty(IDriverMgmtConstants.PROP_DEFN_JARLIST, getJarList(templateDescriptor));
				} catch (IOException e) {
					e.printStackTrace();
				}

				String driverUrl = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.URL_PROP_ID);
				if(driverUrl != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.URL_PROP_ID, driverUrl);
				
				String user = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID);
				if(user != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.USERNAME_PROP_ID, user);
				
				String password = templateDescriptor.getPropertyValueFromId(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID);
				if(password != null)
					properties.setProperty(IJDBCDriverDefinitionConstants.PASSWORD_PROP_ID, password);				
				
				properties.setProperty(IJDBCConnectionProfileConstants.SAVE_PASSWORD_PROP_ID, Boolean.FALSE.toString());

				break;
			}
		}
		
		return properties;
	}
	
	protected String getJarList(TemplateDescriptor templateDescriptor) throws IOException {

		StringBuffer jarList = new StringBuffer();

		Bundle bundle = Platform.getBundle(templateDescriptor.getElement().getDeclaringExtension().getNamespaceIdentifier());

		String paths[] = templateDescriptor.getJarList().split(";");
		for (int i = 0; i < paths.length; i++) {
			if (i > 0)
				jarList.append(System.getProperty("path.separator"));
			URL pathURL = bundle.getEntry(paths[i].trim());
			jarList.append(new Path(FileLocator.toFileURL(pathURL).getFile()).toOSString());
		}

		return jarList.toString();
	}
}
