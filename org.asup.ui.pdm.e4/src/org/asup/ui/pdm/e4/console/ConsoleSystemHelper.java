/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.ui.pdm.e4.console;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;

public class ConsoleSystemHelper {

	public static ConsoleSystem findConsole(String name) {
	    ConsolePlugin plugin = ConsolePlugin.getDefault();
	    IConsoleManager conMan = plugin.getConsoleManager();
	    IConsole[] existing = conMan.getConsoles();
	    for (int i = 0; i < existing.length; i++)
	        if (name.equals(existing[i].getName()))
	            return (ConsoleSystem) existing[i];
	    
	    
	    return null;
	}

	public static ConsoleSystem createConsole(String name) {

	    ConsolePlugin plugin = ConsolePlugin.getDefault();
	    IConsoleManager conMan = plugin.getConsoleManager();
	    ConsoleSystem console = new ConsoleSystem("As.UP", null);	    
	    conMan.addConsoles(new IConsole[] { console });
	    
	    return console;
	}
}
