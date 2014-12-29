package org.asup.il.isam.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.il.isam.AccessMode;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QKSDataSet;
import org.asup.il.isam.test.file.dbf.MUTEST0F;

@Test(category = "ILISAM", object = "RRDS")
public class KSDS_write {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;

	@TestStarted
	public void doTest() throws SQLException, IOException {


		testMUTEST();	
	}

	private void testMUTEST() {

		QKSDataSet<MUTEST0F> mutest0f = isamFactory.createKeySequencedDataSet(null, MUTEST0F.class, AccessMode.UPDATE);

		mutest0f.open();
		testAsserter.resetTime();
		
		MUTEST0F mutestr = mutest0f.get();
		mutestr.clear();
		
		for(int r=1; r <=100; r++) {
			mutestr.mtcate.eval("ILISAM");
			mutestr.mtogge.eval("WRITE");
			mutestr.mterro.eval("RR00"+r);
			mutestr.mtuses.eval("QASUP");
			
			mutest0f.write();
		}
		
/*		int count = 0;
		brarti2l.setgt("MU");
		while (brarti2l.reade("MU"))
			count++;
		testAsserter.assertEquals("Items TIAR=MU count", 100, count);*/

		mutest0f.close();
	}
}
