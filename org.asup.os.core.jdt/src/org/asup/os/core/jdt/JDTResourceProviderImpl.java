package org.asup.os.core.jdt;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.dk.source.jdt.JDTSourceManagerImpl;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.impl.ResourceProviderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.lib.QLibrary;

public class JDTResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private QResourceFactory resourceFactory;
	
	private JDTSourceManagerImpl sourceManager;
	
	public JDTResourceProviderImpl() {
		super();
		this.sourceManager = new JDTSourceManagerImpl("asup-obj");

	}
	
	@PostConstruct
	public void init() {
		resourceFactory.registerProvider(QTypedObject.class, this);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {
			
		QResourceReader<T> resourceReader = new JDTResourceReaderImpl<T>(job, sourceManager, container, klass);
		
		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		
		List<String> containers = new ArrayList<>();
		
		// set scope libraries
		switch (scope) {
			case ALL:
				QResourceReader<QLibrary> libraryReader = getResourceReader(job, QLibrary.class, job.getSystem().getSystemLibrary());
					
				QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
				while(libraryIterator.hasNext()) {
					QLibrary library = libraryIterator.next();
					containers.add(library.getName());
				}
				break;
			case LIBRARY_LIST:
				
				for(String libraryName: job.getLibraries()) {
					containers.add(libraryName);					
				}

				break;
			default:
				throw new OperatingSystemRuntimeException("Unsupported scope "+scope);
		}

		QResourceSetReader<T> resourceReader = new JDTResourceSetReaderImpl<T>(job, sourceManager, containers, klass);		
		
		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {
		
		QResourceWriter<T> resourceWriter = new JDTResourceWriterImpl<T>(job, sourceManager, container, klass);
		
		return resourceWriter;
	}

}