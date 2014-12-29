package org.asup.il.isam.test.file.dbf;

import org.asup.il.isam.annotation.Index;

public class MUTEST0L extends MUTEST0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		mtcate, mtogge
	}
}
