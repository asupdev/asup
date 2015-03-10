/**
 */
package org.asup.db.server.store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.server.store.QWorkstation#getModel <em>Model</em>}</li>
 *   <li>{@link org.asup.db.server.store.QWorkstation#getOperatingSystem <em>Operating System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.server.store.QStorePackage#getWorkstation()
 * @model
 * @generated
 */
public interface QWorkstation {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.asup.db.server.store.QStorePackage#getWorkstation_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.asup.db.server.store.QWorkstation#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.server.store.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see org.asup.db.server.store.OperatingSystem
	 * @see #setOperatingSystem(OperatingSystem)
	 * @see org.asup.db.server.store.QStorePackage#getWorkstation_OperatingSystem()
	 * @model required="true"
	 * @generated
	 */
	OperatingSystem getOperatingSystem();

	/**
	 * Sets the value of the '{@link org.asup.db.server.store.QWorkstation#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see org.asup.db.server.store.OperatingSystem
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OperatingSystem value);

} // QWorkstation
