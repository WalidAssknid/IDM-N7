/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.ResourceUsage#getNeeded <em>Needed</em>}</li>
 *   <li>{@link simplepdl.ResourceUsage#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResourceUsage()
 * @model
 * @generated
 */
public interface ResourceUsage extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed</em>' attribute.
	 * @see #setNeeded(int)
	 * @see simplepdl.SimplepdlPackage#getResourceUsage_Needed()
	 * @model
	 * @generated
	 */
	int getNeeded();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceUsage#getNeeded <em>Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed</em>' attribute.
	 * @see #getNeeded()
	 * @generated
	 */
	void setNeeded(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getResourceUsage_Ressource()
	 * @model required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceUsage#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

} // ResourceUsage
