/**
 */
package org.asup.os.type.base.api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.jobs.QJobLogManager;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.type.QTypeRegistry;
import org.asup.os.type.QTypedManager;
import org.asup.os.type.QTypedObject;

@Command(name = "WRKOBJ")
@Program(name = "QMNWRKXX")
public class ObjectWorker {

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	@Entry
	public void main(Object object,
					 @DataDef(length = 7) QCharacter objectType,
					 @DataDef(length=50, varying=true) QCharacter text,
					 @DataDef(length=2) QCharacter application) {
	
		List<QTypedManager<?>> types = new ArrayList<QTypedManager<?>>();
		if (objectType.trimR().equals("*ALL"))
			types.addAll(typeRegistry.list());
		else
			types.add(typeRegistry.lookup(objectType.trimR()));

		QObjectWriter objectWriter = outputManager.getDefaultWriter(job);
		objectWriter.initialize();
		for (QTypedManager<?> qType : types) {

//			System.out.println(qType);
			
			QResourceReader<?> resourceReader = null;
			Scope scope = Scope.get(object.library.trimR());
			if (scope != null)
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), scope);
			else
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), object.library.trimR());

			QObjectIterator<?> objectIterator = null;
			
			switch (object.name.asEnum()) {
				case ALL:
					objectIterator = resourceReader.find(null);					
					break;
	
				case OTHER:
					objectIterator = resourceReader.find(object.name.asData().trimR());					
					break;

			}
			
			QTypedObject qObject = null;
			while (objectIterator.hasNext()) {
				try {
					qObject = (QTypedObject)objectIterator.next();
					
					// text
					if(!text.isEmpty()) {
						if(qObject.getText() == null ||
						   qObject.getText().toUpperCase().indexOf(text.trimR().toUpperCase())<0)
							continue;
					}
					
					// application
					if(!application.isEmpty()) {
						if(qObject.getApplication() == null ||
						   qObject.getApplication().toUpperCase().indexOf(application.trimR().toUpperCase())<0)
							continue;
					}
					
					objectWriter.write(qObject);
						
				} catch (Exception e) {
					jobLogManager.error(job, qObject + " " + e.getMessage());
				}
			}
			objectIterator.close();
		}
		objectWriter.flush();
	}

	public static class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QEnum<Name, QCharacter> name;
		
		@DataDef(length = 10)
		public QCharacter library;

		public static enum Name {
			@Special(value = "*ALL")
			ALL, OTHER
		}
	}
}