/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @see petrinet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Node {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' attribute.
	 * @see #setMarking(int)
	 * @see petrinet.PetriNetPackage#getPlace_Marking()
	 * @model
	 * @generated
	 */
	int getMarking();

	/**
	 * Sets the value of the '{@link petrinet.Place#getMarking <em>Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' attribute.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(int value);

} // Place
