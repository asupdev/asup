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
package org.asup.co.shell;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

import org.asup.co.core.ConnectorCoreHelper;
import org.asup.co.core.QServerSocketConfig;
import org.asup.fw.core.QContext;

public class ShellServerSocketImpl implements Runnable {

	private QContext context;
	private QServerSocketConfig config;
	
	public ShellServerSocketImpl(QContext context, QServerSocketConfig config) {
		this.context = context;
		this.config = config;
	}
	
	public void run() {

		ServerSocket serverSocket = null;
		try {
			String systemAddress = ConnectorCoreHelper.resolveVariables(config.getAddress());
			InetAddress inetAddress = InetAddress.getByName(systemAddress);
			SocketAddress socketAddress = new InetSocketAddress(inetAddress, config.getPort());
			System.out.println("Start shell on " + socketAddress);
			serverSocket = new ServerSocket();
			serverSocket.bind(socketAddress);

			while (!Thread.currentThread().isInterrupted()) {
				Socket socket = serverSocket.accept();

				// start thread handler
				QContext threadContext = context.createChild();
				ShellSocketHandler shellThread = new ShellSocketHandler(socket);
				threadContext.inject(shellThread);

				shellThread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			serverSocket = null;
		}
	}
}