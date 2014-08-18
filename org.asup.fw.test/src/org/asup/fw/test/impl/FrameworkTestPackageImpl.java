/**
 */
package org.asup.fw.test.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.test.AssertionState;
import org.asup.fw.test.QAsserter;
import org.asup.fw.test.QAssertionFailed;
import org.asup.fw.test.QAssertionResult;
import org.asup.fw.test.QAssertionSuccess;
import org.asup.fw.test.QFrameworkTestFactory;
import org.asup.fw.test.QFrameworkTestPackage;
import org.asup.fw.test.QSuiteTestRunner;
import org.asup.fw.test.QTestContainer;
import org.asup.fw.test.QTestListener;
import org.asup.fw.test.QTestManager;
import org.asup.fw.test.QTestResult;
import org.asup.fw.test.QTestRunner;
import org.asup.fw.test.QUnitTestRunner;
import org.asup.fw.test.FrameworkTestFailureError;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkTestPackageImpl extends EPackageImpl implements QFrameworkTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asserterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionSuccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suiteTestRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frameworkTestFaillureErrorEDataType = null;

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
	 * @see org.asup.fw.test.QFrameworkTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrameworkTestPackageImpl() {
		super(eNS_URI, QFrameworkTestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QFrameworkTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QFrameworkTestPackage init() {
		if (isInited) return (QFrameworkTestPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkTestPackage.eNS_URI);

		// Obtain or create and register package
		FrameworkTestPackageImpl theFrameworkTestPackage = (FrameworkTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FrameworkTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FrameworkTestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFrameworkTestPackage.createPackageContents();

		// Initialize created meta-data
		theFrameworkTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrameworkTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QFrameworkTestPackage.eNS_URI, theFrameworkTestPackage);
		return theFrameworkTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsserter() {
		return asserterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionFailed() {
		return assertionFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionResult() {
		return assertionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertionResult_Message() {
		return (EAttribute)assertionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionSuccess() {
		return assertionSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuiteTestRunner() {
		return suiteTestRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestListener() {
		return testListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestManager() {
		return testManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestResult() {
		return testResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestResult_Failed() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestResult_Time() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestResult_AssertResults() {
		return (EReference)testResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunner() {
		return testRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRunner_TestListeners() {
		return (EReference)testRunnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTestRunner() {
		return unitTestRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitTestRunner_ClassName() {
		return (EAttribute)unitTestRunnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestContainer() {
		return testContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestContainer_Tests() {
		return (EReference)testContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionState() {
		return assertionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrameworkTestFaillureError() {
		return frameworkTestFaillureErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFrameworkTestFactory getFrameworkTestFactory() {
		return (QFrameworkTestFactory)getEFactoryInstance();
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
		asserterEClass = createEClass(ASSERTER);

		assertionFailedEClass = createEClass(ASSERTION_FAILED);

		assertionResultEClass = createEClass(ASSERTION_RESULT);
		createEAttribute(assertionResultEClass, ASSERTION_RESULT__MESSAGE);

		assertionSuccessEClass = createEClass(ASSERTION_SUCCESS);

		suiteTestRunnerEClass = createEClass(SUITE_TEST_RUNNER);

		testListenerEClass = createEClass(TEST_LISTENER);

		testManagerEClass = createEClass(TEST_MANAGER);

		testResultEClass = createEClass(TEST_RESULT);
		createEAttribute(testResultEClass, TEST_RESULT__FAILED);
		createEAttribute(testResultEClass, TEST_RESULT__TIME);
		createEReference(testResultEClass, TEST_RESULT__ASSERT_RESULTS);

		testRunnerEClass = createEClass(TEST_RUNNER);
		createEReference(testRunnerEClass, TEST_RUNNER__TEST_LISTENERS);

		unitTestRunnerEClass = createEClass(UNIT_TEST_RUNNER);
		createEAttribute(unitTestRunnerEClass, UNIT_TEST_RUNNER__CLASS_NAME);

		testContainerEClass = createEClass(TEST_CONTAINER);
		createEReference(testContainerEClass, TEST_CONTAINER__TESTS);

		// Create enums
		assertionStateEEnum = createEEnum(ASSERTION_STATE);

		// Create data types
		frameworkTestFaillureErrorEDataType = createEDataType(FRAMEWORK_TEST_FAILLURE_ERROR);
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
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assertionFailedEClass.getESuperTypes().add(this.getAssertionResult());
		assertionSuccessEClass.getESuperTypes().add(this.getAssertionResult());
		suiteTestRunnerEClass.getESuperTypes().add(this.getTestRunner());
		unitTestRunnerEClass.getESuperTypes().add(this.getTestRunner());

		// Initialize classes and features; add operations and parameters
		initEClass(asserterEClass, QAsserter.class, "Asserter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(asserterEClass, null, "assertTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "fail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameworkTestFaillureError());

		op = addEOperation(asserterEClass, null, "fail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameworkTestFaillureError());

		op = addEOperation(asserterEClass, null, "failNotSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameworkTestFaillureError());

		op = addEOperation(asserterEClass, null, "failNotEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameworkTestFaillureError());

		initEClass(assertionFailedEClass, QAssertionFailed.class, "AssertionFailed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionResultEClass, QAssertionResult.class, "AssertionResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionResult_Message(), ecorePackage.getEString(), "message", null, 0, 1, QAssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(assertionResultEClass, this.getAssertionState(), "getAssertionState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionSuccessEClass, QAssertionSuccess.class, "AssertionSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suiteTestRunnerEClass, QSuiteTestRunner.class, "SuiteTestRunner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testListenerEClass, QTestListener.class, "TestListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testListenerEClass, null, "addAssertionResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssertionResult(), "assertionResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testListenerEClass, null, "startTest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunner(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testListenerEClass, null, "endTest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunner(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testManagerEClass, QTestManager.class, "TestManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testManagerEClass, this.getTestRunner(), "prepareRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "className", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkCorePackage.getFrameworkCoreException());

		op = addEOperation(testManagerEClass, this.getTestResult(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunner(), "runner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkCorePackage.getFrameworkCoreException());

		initEClass(testResultEClass, QTestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestResult_Failed(), ecorePackage.getEBoolean(), "failed", "false", 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestResult_AssertResults(), this.getAssertionResult(), null, "assertResults", null, 0, -1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testRunnerEClass, QTestRunner.class, "TestRunner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRunner_TestListeners(), this.getTestListener(), null, "testListeners", null, 0, -1, QTestRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testRunnerEClass, null, "runTest", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testRunnerEClass, ecorePackage.getEString(), "getTestName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitTestRunnerEClass, QUnitTestRunner.class, "UnitTestRunner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitTestRunner_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, QUnitTestRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testContainerEClass, QTestContainer.class, "TestContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestContainer_Tests(), this.getTestRunner(), null, "tests", null, 0, -1, QTestContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assertionStateEEnum, AssertionState.class, "AssertionState");
		addEEnumLiteral(assertionStateEEnum, AssertionState.SUCCESS);
		addEEnumLiteral(assertionStateEEnum, AssertionState.FAILED);

		// Initialize data types
		initEDataType(frameworkTestFaillureErrorEDataType, FrameworkTestFailureError.class, "FrameworkTestFaillureError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FrameworkTestPackageImpl
