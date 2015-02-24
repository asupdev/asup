package org.asup.il.isam.test.file.dbf;

import org.asup.il.isam.annotation.Format;
import org.asup.il.isam.annotation.Index;
import org.asup.il.isam.annotation.Query;

@Format(value = "MUTESTR")
@Query(value = "SELECT   MTCATE ,   MTOGGE ,   MTERRO ,   MTMESS ,   MTTIME ,   MTUSES ,   MTDTES ,   MTORES ,   MTJOES   FROM MUTEST0F   ;")
public class MUTEST0L extends MUTEST0F {
	private static final long serialVersionUID = 1L;

	@Index(unique = false)
	public static enum INDEX_COLUMNS {
		mtcate, mtogge
	}
}
