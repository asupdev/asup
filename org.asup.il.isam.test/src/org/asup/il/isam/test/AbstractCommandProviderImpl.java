package org.asup.il.isam.test;


import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.asup.fw.core.impl.ServiceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.framework.console.CommandProvider;

public abstract class AbstractCommandProviderImpl extends ServiceImpl implements CommandProvider {

	public EObject load(URL url) {

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