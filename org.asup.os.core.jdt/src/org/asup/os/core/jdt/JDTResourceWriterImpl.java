package org.asup.os.core.jdt;

import java.io.IOException;

import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.QOperatingSystemCoreHelper;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.core.resources.ResourceEventType;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.lib.QLibrary;
import org.eclipse.emf.ecore.EObject;

public class JDTResourceWriterImpl<T extends QObjectNameable> extends JDTResourceReaderImpl<T> implements QResourceWriter<T> {

	public JDTResourceWriterImpl(QJob job, QSourceManager sourceManager, String container, Class<T> klass) {
		super(job, sourceManager, container, klass);
	}
	
	@Override
	public synchronized void delete(T object) throws OperatingSystemException {
		
		QSourceEntry entry = sourceManager.getObjectEntry(getJob(), getContainer(), klass, object.getName());
		if(entry == null)
			throw new OperatingSystemException("Object "+object.getName()+" not found");
		
		try {
			fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
			sourceManager.removeEntry(getJob(), entry);
			fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);
		} catch (IOException e) {
			throw new OperatingSystemException(e);
		}
	}

	
	@Override
	public synchronized void save(T object) throws OperatingSystemException {
		save(object, false);
	}
	

	@Override
	public synchronized void save(T object, boolean replace) throws OperatingSystemException {
		
		try {
			if(object instanceof QTypedObject) {
				QTypedObject typedObject  = (QTypedObject)object;

				// library
				typedObject.setLibrary(getContainer());
		
				// creation info
				if(typedObject.getCreationInfo() == null)
					typedObject.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
			
			}			
			
			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			
			if(QLibrary.class.isAssignableFrom(klass) && object.getName().equals(getJob().getSystem().getSystemLibrary())) {
				try {
					sourceManager.createLibraryEntry(getJob(), (QLibrary)object, replace);
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			QSourceEntry entry = sourceManager.createObjectEntry(getJob(), getContainer(), klass, object.getName(), replace);
			emfConverter.writeToStream((EObject) object, entry.getOutputStream());
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} 
		catch (IOException e) {
			throw new OperatingSystemException(e);
		}		
	}	
}
