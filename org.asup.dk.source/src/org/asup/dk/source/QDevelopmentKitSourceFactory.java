/**
 */
package org.asup.dk.source;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.dk.source.QDevelopmentKitSourcePackage
 * @generated
 */
public interface QDevelopmentKitSourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitSourceFactory eINSTANCE = org.asup.dk.source.impl.DevelopmentKitSourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Entry</em>'.
	 * @generated
	 */
	QSourceEntry createSourceEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDevelopmentKitSourcePackage getDevelopmentKitSourcePackage();

} //DKSourceFactory
