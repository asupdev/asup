package org.asup.il.isam.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QKSDataSet;
import org.asup.il.isam.test.file.dbf.BRARTI2L;

@Test(category = "ILISAM", object = "KSDS")
public class KSDS_readp {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;
	
	@TestStarted
	public void doTest() throws SQLException, IOException {

		testBRARTI();

	}

	private void testBRARTI() {

		QKSDataSet<BRARTI2L> brarti2l = isamFactory.createKeySequencedDataSet(null, BRARTI2L.class);

		brarti2l.open();
		testAsserter.resetTime();
		
		int count = 0;
		brarti2l.setgt(new Object[] {"ART", "EM-057"});
		while (brarti2l.readpe("ART"))
			count++;
		testAsserter.assertEquals("Items TIAR=ART and ARTI<=EM-057 count", 327, count);

		brarti2l.close();
	}
}
