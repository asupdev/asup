package org.asup.il.isam.test.file.dbf;

import org.asup.il.isam.annotation.Index;

public class BRDIST2L extends BRDIST0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = true)
	public static enum INDEX_COLUMNS {
		dçtipd, dçassi, dçsqci, dçusr1, dçcomp, dçusr2
	}
}