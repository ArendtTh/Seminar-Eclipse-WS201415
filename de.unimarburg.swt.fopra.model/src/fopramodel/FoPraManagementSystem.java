/**
 */
package fopramodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fo Pra Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.FoPraManagementSystem#getFopras <em>Fopras</em>}</li>
 *   <li>{@link fopramodel.FoPraManagementSystem#getPersons <em>Persons</em>}</li>
 *   <li>{@link fopramodel.FoPraManagementSystem#getAuxiliaries <em>Auxiliaries</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getFoPraManagementSystem()
 * @model
 * @generated
 */
public interface FoPraManagementSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Fopras</b></em>' containment reference list.
	 * The list contents are of type {@link fopramodel.FoPra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fopras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fopras</em>' containment reference list.
	 * @see fopramodel.FopramodelPackage#getFoPraManagementSystem_Fopras()
	 * @model containment="true"
	 * @generated
	 */
	EList<FoPra> getFopras();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link fopramodel.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see fopramodel.FopramodelPackage#getFoPraManagementSystem_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Auxiliaries</b></em>' containment reference list.
	 * The list contents are of type {@link fopramodel.Auxiliary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliaries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliaries</em>' containment reference list.
	 * @see fopramodel.FopramodelPackage#getFoPraManagementSystem_Auxiliaries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Auxiliary> getAuxiliaries();

} // FoPraManagementSystem
