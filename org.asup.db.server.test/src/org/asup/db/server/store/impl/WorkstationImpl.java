/**
 */
package org.asup.db.server.store.impl;

import org.asup.db.server.store.OperatingSystem;
import org.asup.db.server.store.QStorePackage;
import org.asup.db.server.store.QWorkstation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workstation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.db.server.store.impl.WorkstationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.asup.db.server.store.impl.WorkstationImpl#getOperatingSystem <em>Operating System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkstationImpl extends MinimalEObjectImpl.Container implements QWorkstation {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final OperatingSystem OPERATING_SYSTEM_EDEFAULT = OperatingSystem.WINDOWS;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem operatingSystem = OPERATING_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QStorePackage.Literals.WORKSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QStorePackage.WORKSTATION__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSystem(OperatingSystem newOperatingSystem) {
		OperatingSystem oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem == null ? OPERATING_SYSTEM_EDEFAULT : newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QStorePackage.WORKSTATION__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QStorePackage.WORKSTATION__MODEL:
				return getModel();
			case QStorePackage.WORKSTATION__OPERATING_SYSTEM:
				return getOperatingSystem();
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
			case QStorePackage.WORKSTATION__MODEL:
				setModel((String)newValue);
				return;
			case QStorePackage.WORKSTATION__OPERATING_SYSTEM:
				setOperatingSystem((OperatingSystem)newValue);
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
			case QStorePackage.WORKSTATION__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case QStorePackage.WORKSTATION__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
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
			case QStorePackage.WORKSTATION__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case QStorePackage.WORKSTATION__OPERATING_SYSTEM:
				return operatingSystem != OPERATING_SYSTEM_EDEFAULT;
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
		result.append(" (model: ");
		result.append(model);
		result.append(", operatingSystem: ");
		result.append(operatingSystem);
		result.append(')');
		return result.toString();
	}

} //WorkstationImpl
