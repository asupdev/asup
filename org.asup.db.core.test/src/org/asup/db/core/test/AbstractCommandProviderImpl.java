package org.asup.db.core.test;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.asup.db.core.QConnectionConfig;
import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public abstract class AbstractCommandProviderImpl extends ServiceImpl implements CommandProvider {

	public enum DBType {
		MSSQL, DB2;
	}

	protected QConnectionConfig loadConfig(String name) {
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		
		URL url = bundle.getEntry("/config/connection/"+name+".xmi");
		System.out.println(URI.createURI(url.toString()));

		
		return (QConnectionConfig) load(url);
	}

	protected EObject load(URL url) {

		ResourceSet resourceSet = new ResourceSetImpl();
    	Resource resource = resourceSet.createResource(URI.createURI(url.toString()));    	
        try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

        return resource.getContents().get(0);

	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}