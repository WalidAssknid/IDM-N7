/**
 */
package simplepdl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simplepdl.ProcessElement;
import simplepdl.SimplepdlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessElementTest extends TestCase {

	/**
	 * The fixture for this Process Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessElementTest.class);
	}

	/**
	 * Constructs a new Process Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Process Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Process Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElement getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createProcessElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProcessElementTest
