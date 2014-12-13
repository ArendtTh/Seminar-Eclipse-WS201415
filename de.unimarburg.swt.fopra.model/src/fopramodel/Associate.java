/**
 */
package fopramodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.Associate#getRg <em>Rg</em>}</li>
 *   <li>{@link fopramodel.Associate#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getAssociate()
 * @model
 * @generated
 */
public interface Associate extends Person {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fopramodel.ResearchGroup#getAssociate <em>Associate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rg</em>' reference.
	 * @see #setRg(ResearchGroup)
	 * @see fopramodel.FopramodelPackage#getAssociate_Rg()
	 * @see fopramodel.ResearchGroup#getAssociate
	 * @model opposite="associate" required="true"
	 * @generated
	 */
	ResearchGroup getRg();

	/**
	 * Sets the value of the '{@link fopramodel.Associate#getRg <em>Rg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rg</em>' reference.
	 * @see #getRg()
	 * @generated
	 */
	void setRg(ResearchGroup value);

	/**
	 * Returns the value of the '<em><b>Fopras</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.FoPra}.
	 * It is bidirectional and its opposite is '{@link fopramodel.FoPra#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fopras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fopras</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getAssociate_Fopras()
	 * @see fopramodel.FoPra#getSupervisor
	 * @model opposite="supervisor"
	 * @generated
	 */
	EList<FoPra> getFopras();

} // Associate
