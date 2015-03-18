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
package org.asup.dk.source.jdt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.asup.dk.source.QDevelopmentKitSourceFactory;
import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.impl.SourceManagerImpl;
import org.asup.os.core.jobs.QJob;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.lib.QLibrary;
import org.asup.os.type.lib.QOperatingSystemLibraryFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class JDTSourceManagerImpl extends SourceManagerImpl {

	public static int EVENT_CREATE_ENTRY = 30;
	public static int EVENT_BUILD_ENTRY = 40;
	public static int EVENT_INSTALL_ENTRY = 60;

	private String bundlePath;
	private ResourceSet resourceSet;

	public JDTSourceManagerImpl() {
		this("asup-src");
	}

	public JDTSourceManagerImpl(String bundlePath) {
		ResourcesPlugin.getWorkspace().getDescription().setAutoBuilding(false);
		this.bundlePath = bundlePath;
		this.resourceSet = new ResourceSetImpl();
	}

	@Override
	public void refreshEntry(QJob job, QSourceEntry entry) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IContainer container : root.findContainersForLocationURI(entry.getLocation())) {
			try {
				container.refreshLocal(IContainer.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void removeEntry(QJob job, QSourceEntry entry) throws IOException {
		assert entry != null;

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(URIUtil.lastSegment(entry.getRoot().getLocation()));

		java.net.URI location = entry.getLocation(); // URIUtil.removeFileExtension(entry.getLocation());
		location = URIUtil.makeRelative(location, entry.getRoot().getLocation());

		IFile file = project.getFile(location.getRawPath());

		if (file.exists()) {
			try {
				file.delete(true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}
	}

	@Override
	public QSourceEntry createLibraryEntry(QJob job, QLibrary library, boolean replace) throws IOException {

		QSourceEntry entry = getLibraryEntry(job, library.getName());
		if (entry != null)
			return entry;

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(library.getName());
		if (project.exists() && !replace)
			throw new IOException("Source container already exists: " + library.getName());

		if (project.exists() && replace)
			try {
				project.delete(true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}

		try {
			JDTProjectUtil.createAsupProject(project, library.getName(), library.getText());
		} catch (CoreException e) {
			throw new IOException(e);
		}

		try {
			entry = QDevelopmentKitSourceFactory.eINSTANCE.createSourceEntry();
			entry.setLocation(project.getLocationURI());
			// entry.setLibrary(adapt(job, project));

			return entry;
		} catch (Exception e) {
			throw new IOException(e);
		}
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QJob job, String library, Class<T> type, String name, boolean replace, T content) throws IOException {

		QSourceEntry sourceEntry = createObjectEntry(job, library, type, name, replace);

		OutputStream stream = sourceEntry.getOutputStream();
		writeToStream((EObject) content, stream);
		stream.close();

		return sourceEntry;
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QJob job, String library, Class<T> type, String name, boolean replace) throws IOException {
		QSourceEntry libraryEntry = getLibraryEntry(job, library);
		return createEntry(libraryEntry, type, name + ".XMI", replace);
	}

	@Override
	public QSourceEntry createChildEntry(QJob job, QSourceEntry parent, String name, boolean replace) throws IOException {
		return createEntry(parent, null, name, replace);
	}

	@Override
	public QSourceEntry getLibraryEntry(QJob job, String library) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		IResource resource = root.findMember(library);
		if (resource == null || !resource.exists() || !(resource instanceof IProject))
			return null;

		IProject project = (IProject) resource;

		try {
			// project.refreshLocal(IContainer.DEPTH_INFINITE, null);
			QSourceEntry entry = QDevelopmentKitSourceFactory.eINSTANCE.createSourceEntry();
			entry.setLocation(resource.getLocationURI());
			QLibrary lib = adapt(job, project);
			if (lib == null) {
				try {
					project.refreshLocal(IContainer.DEPTH_INFINITE, null);
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lib = adapt(job, project);
			}
			if (lib == null)
				return null;

			// entry.setLibrary(lib);
			// entry.setName(library);

			return entry;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry getObjectEntry(QJob job, String library, Class<T> type, String name) {

		QSourceEntry libraryEntry = getLibraryEntry(job, library);
		if (libraryEntry == null)
			return null;
		return getChildEntry(job, libraryEntry, type, name + ".XMI");
	}

	@Override
	public QSourceEntry getChildEntry(QJob job, QSourceEntry parent, String name) {
		return getChildEntry(job, parent, null, name);
	}

	@Override
	public List<QSourceEntry> listLibraries(QJob job) {

		List<QSourceEntry> libraries = new ArrayList<QSourceEntry>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IProject project : root.getProjects()) {
			QLibrary qLibrary = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			qLibrary.setName(project.getName());
			qLibrary.setLibrary(job.getSystem().getSystemLibrary());
			libraries.add(getLibraryEntry(job, project.getName()));
		}
		return libraries;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> List<QSourceEntry> listObjectEntries(QJob job, String library, Class<T> type, String nameFilter) {
		QSourceEntry libraryEntry = getLibraryEntry(job, library);
		if (libraryEntry == null)
			return (List<QSourceEntry>) Collections.EMPTY_LIST;

		return listChildEntries(job, libraryEntry, type, nameFilter);
	}

	@Override
	public List<QSourceEntry> listChildEntries(QJob job, QSourceEntry parent) {
		return listChildEntries(job, parent, null, null);
	}

	private QLibrary adapt(QJob job, IProject project) {

		try {
			if (!project.isOpen())
				project.open(null);

			IFile file = project.getFile("META-INF/MANIFEST.MF");
			InputStream is = file.getContents();

			Manifest manifest = new Manifest(is);
			Attributes attributes = manifest.getMainAttributes();
			QLibrary lib = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			lib.setLibrary(job.getSystem().getSystemLibrary());
			lib.setName(URIUtil.lastSegment(project.getLocationURI()));
			lib.setText(attributes.getValue("Bundle-Name"));

			is.close();

			return lib;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unused")
	private <T extends QObjectNameable> QSourceEntry createEntry(QSourceEntry parent, Class<T> type, String name, boolean replace) throws IOException {

		IFolder folder = getFolder(parent, type, true);
		IFile file = folder.getFile(name);
		if (file.exists() && !replace)
			throw new IOException("Source entry already exists: " + file.getLocation());

		if (file.exists() && replace) {
			try {
				file.delete(true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}

		if (!file.exists()) {
			try {
				mkDirs(file);
				file.create(null, true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}

		QSourceEntry qEntry = QDevelopmentKitSourceFactory.eINSTANCE.createSourceEntry();
		// qEntry.setLibrary(parent.getLibrary());
		qEntry.setParent(parent);
		qEntry.setLocation(file.getRawLocationURI());

		String messageName = "MU00500";
		String messageText = "Build source " + URIUtil.lastSegment(qEntry.getLocation());
		int messageSeverity = 00;

		// getNotifier().notifyListeners(new SourceEvent(EVENT_CREATE_ENTRY,
		// qEntry,
		// messageName, messageText, messageSeverity));

		return qEntry;
	}

	private <T extends QObjectNameable> QSourceEntry getChildEntry(QJob job, QSourceEntry parent, Class<T> type, String name) {
		IFolder folder = getFolder(parent, type, true);
		if (folder == null)
			return null;

		IFile file = folder.getFile(name);
		if (!file.exists())
			return null;

		QSourceEntry qEntry = QDevelopmentKitSourceFactory.eINSTANCE.createSourceEntry();
		// qEntry.setLibrary(parent.getLibrary());
		qEntry.setParent(parent);
		qEntry.setLocation(file.getRawLocationURI());

		return qEntry;
	}

	private <T extends QObjectNameable> List<QSourceEntry> listChildEntries(QJob job, QSourceEntry parent, Class<T> type, String nameFilter) {

		List<QSourceEntry> entries = new ArrayList<QSourceEntry>();
		IFolder folder = getFolder(parent, type, false);
		if (folder == null)
			return entries;

		try {
			for (IResource resource : folder.members()) {

				// file type
				if (!(resource instanceof IFile))
					continue;

				String resourceName = resource.getName();

				// XMI extension
				if (!resourceName.toUpperCase().endsWith(".XMI"))
					continue;

				// remove extension
				resourceName = resourceName.substring(0, resourceName.length() - 4);

				// filter by name
				if (nameFilter != null) {

					// starts
					if (nameFilter.endsWith("*")) {

						if (!resourceName.startsWith(nameFilter.substring(0, nameFilter.length() - 1)))
							continue;

					}
					// equals
					else if (!resourceName.equals(nameFilter))
						continue;

				}

				QSourceEntry qEntry = QDevelopmentKitSourceFactory.eINSTANCE.createSourceEntry();
				qEntry.setParent(parent);
				qEntry.setLocation(resource.getRawLocationURI());
				entries.add(qEntry);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return entries;
	}

	private <T extends QObjectNameable> IFolder getFolder(QSourceEntry parent, Class<T> type, boolean create) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(URIUtil.lastSegment(parent.getRoot().getLocation()));

		// TODO da eliminare
		if (parent.isRoot() && type == null)
			return project.getFolder("src");

		java.net.URI location = URIUtil.removeFileExtension(parent.getLocation());

		if (type != null) {
			location = URIUtil.append(location, bundlePath);
			location = URIUtil.append(location, getFolderName(type));
		}

		location = URIUtil.makeRelative(location, parent.getRoot().getLocation());

		IFolder folder = project.getFolder(location.toString());
		if (!folder.exists() && create) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				return null;
			}
		}
		if (!folder.exists())
			return null;

		return folder;
	}

	private void writeToStream(EObject object, OutputStream stream) throws IOException {

		// String uri =
		// "asup://"+job.getSystem().getName()+"/"+container+"/"+klass.getSimpleName().toLowerCase().substring(1);
		URI uri = EcoreUtil.getURI(object);

		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(object);

		resource.save(stream, Collections.EMPTY_MAP);
		
	}

	private <T extends QObjectNameable> String getFolderName(Class<T> type) {
		return type.getSimpleName().substring(1);
	}

	private void mkDirs(IFile file) throws CoreException {

		IContainer parent = file.getParent();
		if (parent != null && parent instanceof IFolder && !parent.exists()) {

			Stack<IFolder> parents = new Stack<>();
			while (parent != null && parent instanceof IFolder && !parent.exists()) {
				parents.push((IFolder) parent);
				parent = parent.getParent();
			}

			while (!parents.isEmpty()) {
				IFolder folder = parents.pop();
				folder.create(true, true, null);
			}
		}
	}
}