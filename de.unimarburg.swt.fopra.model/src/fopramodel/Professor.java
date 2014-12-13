/**
 */
package fopramodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.Professor#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Person {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fopramodel.ResearchGroup#getProfessor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference.
	 * @see #setRg(ResearchGroup)
	 * @see fopramodel.FopramodelPackage#getProfessor_Rg()
	 * @see fopramodel.ResearchGroup#getProfessor
	 * @model opposite="professor" containment="true" required="true"
	 * @generated
	 */
	ResearchGroup getRg();

	/**
	 * Sets the value of the '{@link fopramodel.Professor#getRg <em>Rg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rg</em>' containment reference.
	 * @see #getRg()
	 * @generated
	 */
	void setRg(ResearchGroup value);

} // Professor
