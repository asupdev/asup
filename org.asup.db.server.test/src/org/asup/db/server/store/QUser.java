/**
 */
package org.asup.db.server.store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.server.store.QUser#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.server.store.QUser#getText <em>Text</em>}</li>
 *   <li>{@link org.asup.db.server.store.QUser#getWorkstation <em>Workstation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.server.store.QStorePackage#getUser()
 * @model
 * @generated
 */
public interface QUser {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.asup.db.server.store.QStorePackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.server.store.QUser#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.asup.db.server.store.QStorePackage#getUser_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.asup.db.server.store.QUser#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Workstation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstation</em>' containment reference.
	 * @see #setWorkstation(QWorkstation)
	 * @see org.asup.db.server.store.QStorePackage#getUser_Workstation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QWorkstation getWorkstation();

	/**
	 * Sets the value of the '{@link org.asup.db.server.store.QUser#getWorkstation <em>Workstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstation</em>' containment reference.
	 * @see #getWorkstation()
	 * @generated
	 */
	void setWorkstation(QWorkstation value);

} // QUser
