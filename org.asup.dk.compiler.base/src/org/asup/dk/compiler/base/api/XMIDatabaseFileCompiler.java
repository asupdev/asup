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
package org.asup.dk.compiler.base.api;

import java.io.IOException;
import java.io.OutputStream;

import javax.inject.Inject;

import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.QCompilationContext;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilerFactory;
import org.asup.dk.compiler.QCompilerManager;
import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceFactory;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.data.ds.TypedReference;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.type.file.QDatabaseFile;
import org.asup.os.type.file.QFile;
import org.asup.os.type.file.QPhysicalFile;

@Program(name="QASCRTXB")
public class XMIDatabaseFileCompiler {

	@Inject
	private QCompilerManager compilerManager;
	@Inject
	private QResourceFactory resourceFactory;
	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QJob job;
	
	@Entry
	public void main(TypedReference<QPhysicalFile> file) throws IOException {
		
		// file
		QResourceReader<QFile> fileReader = null;
		Scope scope = Scope.get(file.library.trimR());
		if (scope != null)
			fileReader = resourceFactory.getResourceReader(job, QFile.class, scope);
		else
			fileReader = resourceFactory.getResourceReader(job,	QFile.class, file.library.trimR());
		
		QObjectIterator<QFile> files = null;		
		if(file.name.trimR().equals("*ALL"))
			files = fileReader.find(null);
		else
			files = fileReader.find(file.name.trimR());
		
		while(files.hasNext()) {
			QFile qFile = files.next();
			if(!(qFile instanceof QDatabaseFile))
				continue;

			QDatabaseFile databaseFile = (QDatabaseFile) qFile;
			if(databaseFile.getDatabaseFormat().isEmpty())
				continue;
			
			try {
				createJavaFile(databaseFile);
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}

	}
	
	private void createJavaFile(QDatabaseFile file) throws IOException, OperatingSystemException {
		
		// create java source
		QSourceEntry libraryEntry = sourceManager.getLibraryEntry(job, file.getLibrary());
		String packageName = null;
		if(file.getApplication() != null)
			packageName = file.getApplication()+"/file";
		else
			throw new OperatingSystemException("Invalid file application: "+file);
		
		String javaName = packageName+"/"+file.getName()+".java";
		QSourceEntry javaEntry = sourceManager.createChildEntry(job, libraryEntry, javaName, true);

		OutputStream output = javaEntry.getOutputStream();

		// compilation context
		QCompilationContext compilationContext = compilerManager.createCompilationContext(job, file, CaseSensitiveType.LOWER);

		// compilation setup			
		QCompilationSetup setup = QCompilerFactory.eINSTANCE.createCompilationSetup();		
		setup.setBasePackage(packageName.replaceAll("/", "."));
		
		compilerManager.writeDatabaseFile(compilationContext, setup, output);
		
		
		output.close();		
	}
}