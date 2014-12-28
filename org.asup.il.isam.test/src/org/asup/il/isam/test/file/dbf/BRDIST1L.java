package org.asup.il.isam.test.file.dbf;

import org.asup.il.isam.annotation.Index;

public class BRDIST1L extends BRDIST0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		dçtipd, dçcomp, dçassi, dçusr1, dçusr2
	}
}
