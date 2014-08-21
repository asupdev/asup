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
package org.asup.ui.pdm.e4.perspective;

import org.asup.ui.pdm.e4.view.ShellCommandView;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


public class Perspective implements IPerspectiveFactory {
	
	public static String ID = "org.asup.ui.perspective";
	
	public Perspective() {
	}
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		
		String editorArea = layout.getEditorArea();			
		layout.setEditorAreaVisible(false);
		
		layout.addView("org.eclipse.jdt.ui.PackageExplorer", IPageLayout.LEFT, 0.15f, editorArea);
		layout.addView(ShellCommandView.ID, IPageLayout.BOTTOM, 0.90f, editorArea);
		layout.addView("org.eclipse.ui.console.ConsoleView", IPageLayout.BOTTOM, 0.10f, editorArea);
	}
}