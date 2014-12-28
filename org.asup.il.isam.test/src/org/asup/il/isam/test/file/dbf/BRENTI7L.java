package org.asup.il.isam.test.file.dbf;

import org.asup.il.isam.annotation.Index;

public class BRENTI7L extends BRENTI0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		eçtrag, eçazie, eçloca, eçcrag, eçscen, eçdinv, eçdfnv, eçidoj
	}
}
