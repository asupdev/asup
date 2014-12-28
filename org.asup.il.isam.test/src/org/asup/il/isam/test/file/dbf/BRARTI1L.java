package org.asup.il.isam.test.file.dbf;

import org.asup.il.isam.annotation.Index;

public class BRARTI1L extends BRARTI0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		açdear, açarti
	}
}
