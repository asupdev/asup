/**
 */
package org.asup.os.core.base.api;

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QString;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.data.ds.TypedReference;

@Program(name = "QUSROBJD")
public class ObjectDescriptionRetriever {

	@Entry
	public void main(QString receiver, @DataDef QBinary receiverLength,
			@DataDef(length = 8) QCharacter format, TypedReference<?> object,
			@DataDef(length = 10) QCharacter type) {
		/*
		 * // qusec qusec qusec = new qusec(16);
		 * ((BufferedVariable)getQEntry()[5]).overlay(qusec);
		 * 
		 * qusd0100 basicInformation = new qusd0100(90); qusd0200
		 * advancedInformation = new qusd0200(180);
		 * 
		 * 
		 * qusd0300 qusd0300 = new qusd0300(460); qusd0400 qusd0400 = new
		 * qusd0400(527);
		 * 
		 * qusm0100 qusm0100 = new qusm0100(135); data.overlay(qusm0100);
		 * 
		 * if(format.equals("OBJD0100")) { data.overlay(basicInformation); }
		 * else if(format.equals("OBJD0200")) {
		 * data.overlay(advancedInformation); } else
		 * if(format.equals("OBJD0300")) { data.overlay(qusd0300); } else
		 * if(format.equals("OBJD0400")) { data.overlay(qusd0400); }
		 * 
		 * // check object qusec.clear();
		 * 
		 * // check object QType<? extends QTypedObject> qType =
		 * typeRegistry.lookup(typeName.trimR()); QResourceReader<? extends
		 * QTypedObject> resource = resourceFactory.getResourceReader(getJob(),
		 * qType, library.trimR());
		 * 
		 * QTypedObject object = resource.lookup(name.trimR());
		 * 
		 * // object not found if(object == null) { qusec.qusbavl.eval(100);
		 * return; }
		 * 
		 * // set values qusm0100.qusdfill.eval(object.getLibrary());
		 * qusm0100.qustd03.eval(object.getText());
		 * 
		 * basicInformation.setBytesReturned(value);
		 * 
		 * advancedInformation.getLibraryName().eval(object.getLibrary());
		 * 
		 * 
		 * 
		 * 
		 * advancedInformation.qustd12.eval(object.getText());
		 * advancedInformation.qusobjt01.eval(qType.getName());
		 * 
		 * getQEntry()[0] = data;
		 */
	}
}
