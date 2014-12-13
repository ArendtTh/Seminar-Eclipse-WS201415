/**
 */
package fopramodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Advisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.ExternalAdvisor#getInformation <em>Information</em>}</li>
 *   <li>{@link fopramodel.ExternalAdvisor#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getExternalAdvisor()
 * @model
 * @generated
 */
public interface ExternalAdvisor extends Person {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see fopramodel.FopramodelPackage#getExternalAdvisor_Information()
	 * @model
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link fopramodel.ExternalAdvisor#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

	/**
	 * Returns the value of the '<em><b>Fopras</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.FoPra}.
	 * It is bidirectional and its opposite is '{@link fopramodel.FoPra#getAdvisor <em>Advisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fopras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fopras</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getExternalAdvisor_Fopras()
	 * @see fopramodel.FoPra#getAdvisor
	 * @model opposite="advisor"
	 * @generated
	 */
	EList<FoPra> getFopras();

} // ExternalAdvisor
