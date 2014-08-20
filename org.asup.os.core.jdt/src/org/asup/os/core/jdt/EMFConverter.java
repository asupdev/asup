package org.asup.os.core.jdt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class EMFConverter {
	
	private ResourceSet resourceSet;
	private URI uri;
	
	public EMFConverter(ResourceSet resourceSet, String uri) {
		this.resourceSet = resourceSet;
		this.uri = URI.createURI(uri);
	}
	
    public EObject convertToEObject(InputStream stream) throws IOException {
        
    	Resource resource = resourceSet.createResource(this.uri);    	
        resource.load(stream, Collections.EMPTY_MAP);

        return resource.getContents().get(0);
    }
    
    public void writeToStream(EObject object, OutputStream stream) throws IOException {

    	Resource resource = resourceSet.createResource(this.uri);
        resource.getContents().add(object);
        
        resource.save(stream, Collections.EMPTY_MAP);
    }
}