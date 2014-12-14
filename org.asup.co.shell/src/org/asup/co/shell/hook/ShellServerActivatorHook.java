/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.co.shell.hook;

import org.asup.co.core.QServerSocketConfig;
import org.asup.co.shell.ShellServerSocketImpl;
import org.asup.fw.core.QApplication;
import org.asup.fw.core.annotation.LevelStarted;
import org.asup.fw.core.impl.ServiceImpl;

public class ShellServerActivatorHook extends ServiceImpl {

	@LevelStarted
	public void init(QApplication application) {
		
		QServerSocketConfig config = (QServerSocketConfig) getConfig();
		ShellServerSocketImpl serverSocket = new ShellServerSocketImpl(application, config);
		
		new Thread(serverSocket).start();
	}

}
