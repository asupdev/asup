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
import java.net.URI;

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
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QLibraryManager;

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
	@Inject
	private QLibraryManager libraryManager;
	
	@Entry
	public void main(TypedReference<QDatabaseFile> file) throws IOException {
		
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

		QResourceReader<QLibrary> libraryReader = libraryManager.getLibraryReader(job); 
		QLibrary library = libraryReader.lookup(file.library.trimR());
		
		while(files.hasNext()) {
			QFile qFile = files.next();
			if(!(qFile instanceof QDatabaseFile))
				continue;

			QDatabaseFile databaseFile = (QDatabaseFile) qFile;
			if(databaseFile.getDatabaseFormat().isEmpty())
				continue;
			
			try {
				createJavaFile(databaseFile, library);
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}

	}
	
	private void createJavaFile(QDatabaseFile file, QLibrary library) throws IOException, OperatingSystemException {

		if(file.getApplication() == null)
			throw new OperatingSystemException("Invalid file application: "+file);

		// create java source
		QSourceEntry libraryEntry = sourceManager.getLibraryEntry(job, file.getLibrary());

		String javaName = library.getPackageURI().resolve(file.getClassURI()) + ".java";
		QSourceEntry javaEntry = sourceManager.createChildEntry(job, libraryEntry, javaName, true);

		OutputStream output = javaEntry.getOutputStream();

		// compilation context
		QCompilationContext compilationContext = compilerManager.createCompilationContext(job, file, CaseSensitiveType.LOWER);

		// compilation setup			
		QCompilationSetup setup = QCompilerFactory.eINSTANCE.createCompilationSetup();		
		URI packageURI = library.getPackageURI().resolve(file.getPackageInfoURI());
		setup.setBasePackage(packageURI.toString().replaceAll("/", "."));
		
		compilerManager.writeDatabaseFile(compilationContext, setup, output);

		output.close();		
	}
}