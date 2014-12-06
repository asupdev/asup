package org.asup.db.core.base;

import org.asup.db.core.QDatabaseManager;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;

public class BaseDatabaseActivatorHook extends ServiceImpl {

	@LevelStarted
	public void init(QDatabaseManager databaseManager) {
		if(databaseManager instanceof BaseDatabaseManagerImpl)
			((BaseDatabaseManagerImpl)databaseManager).start();
	}
}