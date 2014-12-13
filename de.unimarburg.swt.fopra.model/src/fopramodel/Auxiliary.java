/**
 */
package fopramodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.Auxiliary#getDescription <em>Description</em>}</li>
 *   <li>{@link fopramodel.Auxiliary#getKind <em>Kind</em>}</li>
 *   <li>{@link fopramodel.Auxiliary#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getAuxiliary()
 * @model
 * @generated
 */
public interface Auxiliary extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fopramodel.FopramodelPackage#getAuxiliary_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fopramodel.Auxiliary#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fopramodel.AuxiliaryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fopramodel.AuxiliaryKind
	 * @see #setKind(AuxiliaryKind)
	 * @see fopramodel.FopramodelPackage#getAuxiliary_Kind()
	 * @model
	 * @generated
	 */
	AuxiliaryKind getKind();

	/**
	 * Sets the value of the '{@link fopramodel.Auxiliary#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fopramodel.AuxiliaryKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AuxiliaryKind value);

	/**
	 * Returns the value of the '<em><b>Fopras</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.FoPra}.
	 * It is bidirectional and its opposite is '{@link fopramodel.FoPra#getAuxiliaries <em>Auxiliaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fopras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fopras</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getAuxiliary_Fopras()
	 * @see fopramodel.FoPra#getAuxiliaries
	 * @model opposite="auxiliaries"
	 * @generated
	 */
	EList<FoPra> getFopras();

} // Auxiliary
