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
public class ReadKSDS_read {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;
	
	@TestStarted
	public void doTest() throws SQLException, IOException {

		testBRARTI();

	}

	private void testBRARTI() {

		QKSDataSet<BRARTI2L> brarti0f = isamFactory.createKeySequencedDataSet(null, BRARTI2L.class);

		brarti0f.open();

		testAsserter.resetTime();
		int count = 0;
		brarti0f.setll("ART");
		while (brarti0f.reade("ART"))
			count++;
		testAsserter.assertEquals("Items ART count", 827, count);

		count = 0;
		brarti0f.setll("BPP");
		while (brarti0f.reade("BPP"))
			count++;
		testAsserter.assertEquals("Items BPP count", 171, count);

		brarti0f.close();
	}
}
