package org.asup.il.isam.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.il.isam.QIsamFactory;
import org.asup.il.isam.QRRDataSet;
import org.asup.il.isam.test.file.dbf.BRARTI0F;
import org.asup.il.isam.test.file.dbf.BRENTI0F;

@Test(category = "ILISAM", object = "RRDS")
public class RRDS_read {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;

	@TestStarted
	public void doTest() throws SQLException, IOException {


		testBRARTI();
		
		testBRENTI();
	}

	private void testBRARTI() {

		QRRDataSet<BRARTI0F> brarti0f = isamFactory.createRelativeRecordDataSet(null, BRARTI0F.class);

		brarti0f.open();

		testAsserter.resetTime();
		int count = 0;
		while (brarti0f.read())
			count++;
		testAsserter.assertEquals("Items count", 9574, count);

		brarti0f.close();
	}
	
	private void testBRENTI() {

		QRRDataSet<BRENTI0F> brenti0f = isamFactory.createRelativeRecordDataSet(null, BRENTI0F.class);

		brenti0f.open();

		testAsserter.resetTime();
		int count = 0;
		while (brenti0f.read())
			count++;
		testAsserter.assertEquals("Customers count", 33198, count);

		brenti0f.close();
		
	}
}
