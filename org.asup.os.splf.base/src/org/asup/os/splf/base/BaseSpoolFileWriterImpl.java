package org.asup.os.splf.base;

import org.asup.fw.core.QContextID;
import org.asup.os.splf.QSpoolFile;
import org.asup.os.splf.impl.SpoolFileWriterImpl;

public class BaseSpoolFileWriterImpl extends SpoolFileWriterImpl {

	@Override
	public void writeSpoolFile(QContextID contextID, QSpoolFile spoolFile) {
		
		System.out.println("ecchime");
	}

}
