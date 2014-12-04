/**
 */
package org.asup.dk.source.impl;

import org.asup.dk.source.QDevelopmentKitSourceFactory;
import org.asup.dk.source.QDevelopmentKitSourcePackage;
import org.asup.dk.source.QSourceEntry;
import org.asup.dk.source.QSourceManager;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.lib.QOperatingSystemLibraryPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentKitSourcePackageImpl extends EPackageImpl implements QDevelopmentKitSourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceManagerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.dk.source.QDevelopmentKitSourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitSourcePackageImpl() {
		super(eNS_URI, QDevelopmentKitSourceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDevelopmentKitSourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitSourcePackage init() {
		if (isInited) return (QDevelopmentKitSourcePackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitSourcePackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitSourcePackageImpl theDevelopmentKitSourcePackage = (DevelopmentKitSourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitSourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitSourcePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemLibraryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevelopmentKitSourcePackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitSourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitSourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitSourcePackage.eNS_URI, theDevelopmentKitSourcePackage);
		return theDevelopmentKitSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceEntry() {
		return sourceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceEntry_Location() {
		return (EAttribute)sourceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceEntry_Parent() {
		return (EReference)sourceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceEntry_Root() {
		return (EReference)sourceEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceManager() {
		return sourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitSourceFactory getDevelopmentKitSourceFactory() {
		return (QDevelopmentKitSourceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sourceEntryEClass = createEClass(SOURCE_ENTRY);
		createEAttribute(sourceEntryEClass, SOURCE_ENTRY__LOCATION);
		createEReference(sourceEntryEClass, SOURCE_ENTRY__PARENT);
		createEReference(sourceEntryEClass, SOURCE_ENTRY__ROOT);

		sourceManagerEClass = createEClass(SOURCE_MANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemLibraryPackage theOperatingSystemLibraryPackage = (QOperatingSystemLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemLibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceEntryEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		sourceManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(sourceEntryEClass, QSourceEntry.class, "SourceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceEntry_Location(), theFrameworkJavaPackage.getJavaURI(), "location", null, 0, 1, QSourceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceEntry_Parent(), this.getSourceEntry(), null, "parent", null, 0, 1, QSourceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceEntry_Root(), this.getSourceEntry(), null, "root", null, 1, 1, QSourceEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(sourceEntryEClass, theFrameworkJavaPackage.getJavaOutputStream(), "getOutputStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(sourceEntryEClass, theFrameworkJavaPackage.getJavaInputStream(), "getInputStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		addEOperation(sourceEntryEClass, ecorePackage.getEBoolean(), "isRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceManagerEClass, QSourceManager.class, "SourceManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createLibraryEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemLibraryPackage.getLibrary(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createObjectEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(theOperatingSystemOmacPackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createObjectEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "createChildEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "getLibraryEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "getObjectEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "getChildEntry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "listLibraries", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "listObjectEntries", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObjectNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, this.getSourceEntry(), "listChildEntries", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, null, "refreshEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "entry", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sourceManagerEClass, null, "removeEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSourceEntry(), "entry", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		// Create resource
		createResource(eNS_URI);
	}

} //DKSourcePackageImpl
