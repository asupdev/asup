/**
 */
package org.asup.dk.source.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URLConnection;

import org.asup.dk.source.QDevelopmentKitSourcePackage;
import org.asup.dk.source.QSourceEntry;
import org.asup.os.omac.impl.ObjectImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QSource Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.dk.source.impl.SourceEntryImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.asup.dk.source.impl.SourceEntryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.asup.dk.source.impl.SourceEntryImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceEntryImpl extends ObjectImpl implements QSourceEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected URI location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected QSourceEntry parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitSourcePackage.Literals.SOURCE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(URI newLocation) {
		URI oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitSourcePackage.SOURCE_ENTRY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSourceEntry getParent() {
		if (parent != null && ((EObject)parent).eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (QSourceEntry)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDevelopmentKitSourcePackage.SOURCE_ENTRY__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSourceEntry basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(QSourceEntry newParent) {
		QSourceEntry oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitSourcePackage.SOURCE_ENTRY__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QSourceEntry getRoot() {
		if(getParent() != null) 
			return  parent.getRoot();
		
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSourceEntry basicGetRoot() {
		// TODO: implement this method to return the 'Root' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputStream getOutputStream() throws IOException {
		if (isFile(getLocation())) {
			return new FileOutputStream(getLocation().getRawPath());
		}

		URLConnection connection = getLocation().toURL().openConnection();
		connection.setDoOutput(true);
		return connection.getOutputStream();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputStream getInputStream() throws IOException {
		if (isFile(getLocation())) 
			return new FileInputStream(getLocation().getRawPath());

		URLConnection connection = getLocation().toURL().openConnection();
		connection.setDoInput(true);
		return connection.getInputStream();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoot() {
		return this == getRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__LOCATION:
				return getLocation();
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__LOCATION:
				setLocation((URI)newValue);
				return;
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__PARENT:
				setParent((QSourceEntry)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__PARENT:
				setParent((QSourceEntry)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__PARENT:
				return parent != null;
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY__ROOT:
				return basicGetRoot() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

    private boolean isFile(URI uri) {    	
    	return ("file".equals(uri.getScheme()));
    }
} //QSourceEntryImpl
