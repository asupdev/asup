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
package org.asup.ui.pdm.e4.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.asup.fw.core.QContext;
import org.asup.ui.pdm.e4.console.ConsoleRequestHandler;
import org.asup.ui.pdm.e4.console.ConsoleSystem;
import org.asup.ui.pdm.e4.console.ConsoleSystemHelper;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;


public class ShellCommandView extends ViewPart {

	private List<String> commands;
	private int commands_pointer = 0;
	public static final String ID 	= "org.asup.ui.pdm.e4.view.ShellCommandView";
	
	
	@Override
	public void createPartControl(Composite parent) {
		buildControl(parent);
		this.commands = new ArrayList<String>();
		
		try {
			File command_file = new File("./command.txt");
			FileReader fr = new FileReader(command_file);
			BufferedReader br = new BufferedReader(fr); 
			String s; 
			while((s = br.readLine()) != null) { 
				this.commands.add(s);
			} 
			fr.close();
		}
		catch(IOException e){
//			e.printStackTrace();
		}		
	}

	@Override
	public void setFocus() {
		
	} 

	private void buildControl(final Composite parent) {
		
		GridLayout layout = new GridLayout(1,false);
		parent.setLayout(layout);
/*		Label label = new Label(parent, SWT.NONE);
		label.setText("Command");*/
		final Text text = new Text(parent, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		text.setLayoutData(data);
		text.addListener(SWT.DefaultSelection, new Listener() {

			private ConsoleRequestHandler consoleHandler = null;
			
		    public void handleEvent(Event event) {

				try {
					ConsoleSystem consoleSystem = ConsoleSystemHelper.findConsole("As.UP");
					if(consoleSystem == null) {
						MessageDialog.openWarning(parent.getShell(), "Console System", "Unactive system");
						return;
					}
					if(consoleHandler == null) {						
					
						consoleHandler = new ConsoleRequestHandler(consoleSystem.newOutputStream());

						// TODO delete me
					    BundleContext bundleContext = FrameworkUtil.getBundle(QContext.class).getBundleContext();
					    ServiceReference<QContext> serviceReference = bundleContext.getServiceReference(QContext.class);
					    QContext context = bundleContext.getService(serviceReference);
					    context.inject(consoleHandler);
					    
					}
					
					consoleHandler.handle(text.getText());							
				} catch (IOException e) {
					MessageDialog.openWarning(parent.getShell(), "Console System", "Error on command execution: " + e.getMessage());
				}
				finally {

					commands.add(text.getText());
					commands_pointer = commands.size();
					try {
						File command_file = new File("./command.txt");
						BufferedWriter bw = new BufferedWriter(new FileWriter(command_file, true));
						bw.write(text.getText());
						bw.newLine();
						bw.close();
					}
					catch(IOException e){
						e.printStackTrace();
					}
					text.setText("");
				}
				
		    }
		});
		text.addKeyListener(new KeyAdapter(){ 
			public void keyPressed(KeyEvent e)  {
				
				// previous
				if(e.keyCode == SWT.ARROW_UP ||
				   e.keyCode == SWT.F9)
					text.setText(getPrevious());
				
				// next
				else if(e.keyCode == SWT.ARROW_DOWN)
					text.setText(getNext());
			
				// wizard
				else if(e.keyCode == SWT.F4) {
					
					if (text.getText().length() > 0) {
												
						BundleContext bundleContext = FrameworkUtil.getBundle(QContext.class).getBundleContext();
						ServiceReference<ShellCommandWizard> serviceReference = bundleContext.getServiceReference(ShellCommandWizard.class);
						
						if (serviceReference != null) {
							ShellCommandWizard shellCommandVizard = bundleContext.getService(serviceReference);
							String response = text.getText();
							try {
								response= shellCommandVizard.requestCommand(text.getText().toUpperCase());
							} catch (Exception exc) {
								MessageDialog.openWarning(parent.getShell(), "Console System", "Error in command execution: " + exc.getMessage());
								exc.printStackTrace();
							}
							
							text.setText(response);
						} else
							MessageDialog.openWarning(parent.getShell(), "Console System", "Unactive system. Cannot display command Wizard");
					}
				}
				
				// history
				else if(e.keyCode == SWT.F5) {
					List<String> distinctCommands = new ArrayList<>();						
					for(String command: commands) {
						if(distinctCommands.contains(command))
							continue;							
						distinctCommands.add(command);
					}
					
					ElementListSelectionDialog dialog = new ElementListSelectionDialog(parent.getShell(), new LabelProvider());						
					dialog.setElements(distinctCommands.toArray());
					dialog.setTitle("Command History");
					dialog.setIgnoreCase(true);
					dialog.setStatusLineAboveButtons(true);

					if(text.getText().contains("*"))
						dialog.setFilter(text.getText());
					else
						dialog.setFilter("*"+text.getText()+"*");
					
					// user response
					if (dialog.open() == Window.OK) {
						Object[] result = dialog.getResult();
						text.setText(result[0].toString());
						e.keyCode = SWT.DEFAULT; 
					}						
				}

			}
		});
	}

	private String getPrevious() {
		if(commands_pointer == 0 && commands.isEmpty())
			return "";
		if(commands_pointer == 0)
			commands_pointer = commands.size();
		
		String text = commands.get(commands_pointer-1);
		commands_pointer = commands_pointer -1;
		return text;
	}
	

	private String getNext() {
		if(commands_pointer == 0 && commands.isEmpty())
			return "";
		
		if(commands_pointer+1 == commands.size())
			commands_pointer = -1;
		
		String text = commands.get(commands_pointer+1);
		commands_pointer = commands_pointer +1;
		return text;
	}
}