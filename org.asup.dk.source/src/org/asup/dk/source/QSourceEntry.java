/**
 */
package org.asup.dk.source;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.asup.os.omac.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QSource Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.dk.source.QSourceEntry#getLocation <em>Location</em>}</li>
 *   <li>{@link org.asup.dk.source.QSourceEntry#getParent <em>Parent</em>}</li>
 *   <li>{@link org.asup.dk.source.QSourceEntry#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.dk.source.QDevelopmentKitSourcePackage#getSourceEntry()
 * @model
 * @generated
 */
public interface QSourceEntry extends QObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(URI)
	 * @see org.asup.dk.source.QDevelopmentKitSourcePackage#getSourceEntry_Location()
	 * @model dataType="org.asup.fw.java.JavaURI"
	 * @generated
	 */
	URI getLocation();

	/**
	 * Sets the value of the '{@link org.asup.dk.source.QSourceEntry#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(URI value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(QSourceEntry)
	 * @see org.asup.dk.source.QDevelopmentKitSourcePackage#getSourceEntry_Parent()
	 * @model
	 * @generated
	 */
	QSourceEntry getParent();

	/**
	 * Sets the value of the '{@link org.asup.dk.source.QSourceEntry#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(QSourceEntry value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see org.asup.dk.source.QDevelopmentKitSourcePackage#getSourceEntry_Root()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	QSourceEntry getRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.asup.fw.java.JavaOutputStream" exceptions="org.asup.fw.java.JavaIOException"
	 * @generated
	 */
	OutputStream getOutputStream() throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.asup.fw.java.JavaInputStream" exceptions="org.asup.fw.java.JavaIOException"
	 * @generated
	 */
	InputStream getInputStream() throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRoot();

} // QSourceEntry
