/**
 */
package org.asup.os.type.base.api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructureHandler;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
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
	
	public @Entry void main(@ToDo @DataDef(qualified = true) Object object,
			@ToDo @DataDef(length = 7) QCharacter objectType,
			@ToDo @DataDef(length = 50) QCharacter text,
			@ToDo @DataDef(length = 2) QCharacter application) {
		
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
			switch (object.library.asEnum()) {
			case ALL:
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), Scope.ALL);
				break;
			case ALLUSR:
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), Scope.ALL_USER);
				break;
			case CURLIB:
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), Scope.CURRENT_LIBRARY);
				break;
			case LIBL:
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), Scope.LIBRARY_LIST);
				break;
			case USRLIBL:
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), Scope.USER_LIBRARY_LIST);
				break;
			case OTHER:
				resourceReader = resourceFactory.getResourceReader(job,	qType.getTypedClass(), object.library.asData().trimR());
				break;
			}
			

			QObjectIterator<?> objectIterator = null;
			
			switch (object.nameGeneric.asEnum()) {
				case ALL:
					objectIterator = resourceReader.find(null);					
					break;
	
				case OTHER:
					objectIterator = resourceReader.find(object.nameGeneric.asData().trimR());					
					break;

			}
			
			QTypedObject qObject = null;
			while (objectIterator.hasNext()) {
				try {
					qObject = (QTypedObject)objectIterator.next();
					
					// text
					if(!text.isNull() && !text.isEmpty()) {
						if(qObject.getText() == null ||
						   qObject.getText().toUpperCase().indexOf(text.trimR().toUpperCase())<0)
							continue;
					}
					
					// application
					if(!application.isNull() && !application.isEmpty()) {
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


	public static class Object extends QDataStructureHandler {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGenericEnum, QCharacter> nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameGenericEnum {
			ALL, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}
}