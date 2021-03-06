/**
 */
package org.asup.os.type.dtaq.impl;

import org.asup.os.type.dtaq.*;
import org.asup.os.type.dtaq.DataQueueSearchType;
import org.asup.os.type.dtaq.DataQueueType;
import org.asup.os.type.dtaq.QDataQueue;
import org.asup.os.type.dtaq.QDataQueueEntry;
import org.asup.os.type.dtaq.QOperatingSystemDataQueueFactory;
import org.asup.os.type.dtaq.QOperatingSystemDataQueuePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemDataQueueFactoryImpl extends EFactoryImpl implements QOperatingSystemDataQueueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemDataQueueFactory init() {
		try {
			QOperatingSystemDataQueueFactory theOperatingSystemDataQueueFactory = (QOperatingSystemDataQueueFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemDataQueuePackage.eNS_URI);
			if (theOperatingSystemDataQueueFactory != null) {
				return theOperatingSystemDataQueueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemDataQueueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemDataQueueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemDataQueuePackage.DATA_QUEUE: return (EObject)createDataQueue();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE_CONTENT: return (EObject)createDataQueueContent();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE_ENTRY: return (EObject)createDataQueueEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemDataQueuePackage.DATA_QUEUE_TYPE:
				return createDataQueueTypeFromString(eDataType, initialValue);
			case QOperatingSystemDataQueuePackage.DATA_QUEUE_SEARCH_TYPE:
				return createDataQueueSearchTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemDataQueuePackage.DATA_QUEUE_TYPE:
				return convertDataQueueTypeToString(eDataType, instanceValue);
			case QOperatingSystemDataQueuePackage.DATA_QUEUE_SEARCH_TYPE:
				return convertDataQueueSearchTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataQueue createDataQueue() {
		DataQueueImpl dataQueue = new DataQueueImpl();
		return dataQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataQueueContent createDataQueueContent() {
		DataQueueContentImpl dataQueueContent = new DataQueueContentImpl();
		return dataQueueContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataQueueEntry createDataQueueEntry() {
		DataQueueEntryImpl dataQueueEntry = new DataQueueEntryImpl();
		return dataQueueEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataQueueType createDataQueueTypeFromString(EDataType eDataType, String initialValue) {
		DataQueueType result = DataQueueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataQueueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataQueueSearchType createDataQueueSearchTypeFromString(EDataType eDataType, String initialValue) {
		DataQueueSearchType result = DataQueueSearchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataQueueSearchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemDataQueuePackage getOperatingSystemDataQueuePackage() {
		return (QOperatingSystemDataQueuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemDataQueuePackage getPackage() {
		return QOperatingSystemDataQueuePackage.eINSTANCE;
	}

} //OSDataQueueCoreFactoryImpl
