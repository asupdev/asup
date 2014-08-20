package org.asup.os.core.jdt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QOperatingSystemResourcesFactory;
import org.asup.os.core.resources.QResourceEvent;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.core.resources.impl.ResourceReaderImpl;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class JDTResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	protected QSourceManager sourceManager;
	protected Class<T> klass;
	protected QResourceEvent<T> resourceEvent;
	protected EMFConverter emfConverter;
	
	public JDTResourceReaderImpl(QJob job, QSourceManager sourceManager, String container, Class<T> klass) {
		setJob(job);
		setContainer(container);
		this.sourceManager = sourceManager;
		this.klass = klass;
		this.resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);
		String uri = "asup://"+job.getSystem().getName()+"/"+container+"/"+klass.getSimpleName().toLowerCase().substring(1);
		this.emfConverter = new EMFConverter(new ResourceSetImpl(), uri);
		
//		sourceManager.refreshEntry(job, sourceManager.getLibraryEntry(job, container));
	}
	
	@Override
	public boolean exists(String name) {
		return sourceManager.getObjectEntry(getJob(), getContainer(), klass, name) != null;		
	}


	@Override
	public QObjectIterator<T> find(String nameFilter) {
		
		List<QSourceEntry> entries = sourceManager.listObjectEntries(getJob(), getContainer(), klass);
		if(entries == null)
			entries = new ArrayList<>();
		
		return new JDTObjectIteratorImpl<T>(klass, new JDTSourceIterator(emfConverter, entries.iterator()), nameFilter, resourceEvent);
	}
	
	@Override
	public T lookup(String name) {

		
		QSourceEntry entry = sourceManager.getObjectEntry(getJob(), getContainer(), klass, name);
		if(entry == null)
			return null;
		
		T object = null;
		try {
			object = (T) emfConverter.convertToEObject(entry.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		if(object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}
}