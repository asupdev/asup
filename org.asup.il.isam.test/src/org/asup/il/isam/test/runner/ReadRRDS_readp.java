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

@Test(category = "ILISAM", object = "RRDS")
public class ReadRRDS_readp {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;

	@TestStarted
	public void doTest() throws SQLException, IOException {

		testBRARTI();
	}

	private void testBRARTI() {

		QRRDataSet<BRARTI0F> brarti0f = isamFactory.createRelativeRecordDataSet(null, BRARTI0F.class);

		brarti0f.open();

		testAsserter.resetTime();
		int count = 0;
		brarti0f.setgt(Integer.MAX_VALUE);
		while (brarti0f.readp())
			count++;
		testAsserter.assertEquals("Items count", 9574, count);

		brarti0f.close();

		brarti0f.open();

		testAsserter.resetTime();
		boolean first = true;
		while (brarti0f.read()) {

			if (first && brarti0f.get().açarti.eq("00104600138")) {
				first = false;

				brarti0f.readp();
				brarti0f.readp();
				brarti0f.readp();

				brarti0f.read();
				testAsserter.assertEquals("Item code", "00104400069", brarti0f.get().açarti.trimR());
			}
		}

		brarti0f.close();
	}

}
