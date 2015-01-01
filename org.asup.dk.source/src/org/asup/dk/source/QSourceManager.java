/**
 */
package org.asup.dk.source;

import java.io.IOException;
import java.util.List;

import org.asup.fw.core.QService;
import org.asup.os.core.jobs.QJob;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.type.lib.QLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QSource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.dk.source.QDevelopmentKitSourcePackage#getSourceManager()
 * @model abstract="true"
 * @generated
 */
public interface QSourceManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.java.JavaIOException" jobRequired="true" libraryRequired="true"
	 * @generated
	 */
	QSourceEntry createLibraryEntry(QJob job, QLibrary library, boolean replace) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.java.JavaIOException" jobRequired="true" libraryRequired="true" typeRequired="true" nameRequired="true" replaceRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QSourceEntry createObjectEntry(QJob job, String library, Class<T> type, String name, boolean replace) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.java.JavaIOException" jobRequired="true" libraryRequired="true" typeRequired="true" nameRequired="true" replaceRequired="true" contentRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QSourceEntry createObjectEntry(QJob job, String library, Class<T> type, String name, boolean replace, T content) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.java.JavaIOException" jobRequired="true" parentRequired="true" nameRequired="true"
	 * @generated
	 */
	QSourceEntry createChildEntry(QJob job, QSourceEntry parent, String name, boolean replace) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" libraryRequired="true"
	 * @generated
	 */
	QSourceEntry getLibraryEntry(QJob job, String library);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" libraryRequired="true" typeRequired="true" nameRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QSourceEntry getObjectEntry(QJob job, String library, Class<T> type, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" parentRequired="true" nameRequired="true"
	 * @generated
	 */
	QSourceEntry getChildEntry(QJob job, QSourceEntry parent, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	List<QSourceEntry> listLibraries(QJob job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" libraryRequired="true" typeRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> List<QSourceEntry> listObjectEntries(QJob job, String library, Class<T> type, String nameFilter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" parentRequired="true"
	 * @generated
	 */
	List<QSourceEntry> listChildEntries(QJob job, QSourceEntry parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" entryRequired="true"
	 * @generated
	 */
	void refreshEntry(QJob job, QSourceEntry entry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException" jobRequired="true" entryRequired="true"
	 * @generated
	 */
	void removeEntry(QJob job, QSourceEntry entry) throws IOException;

} // QSourceManager
