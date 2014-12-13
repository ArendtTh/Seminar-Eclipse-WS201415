/**
 */
package fopramodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.ResearchGroup#getName <em>Name</em>}</li>
 *   <li>{@link fopramodel.ResearchGroup#getFopras <em>Fopras</em>}</li>
 *   <li>{@link fopramodel.ResearchGroup#getProfessor <em>Professor</em>}</li>
 *   <li>{@link fopramodel.ResearchGroup#getAssociate <em>Associate</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getResearchGroup()
 * @model
 * @generated
 */
public interface ResearchGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fopramodel.FopramodelPackage#getResearchGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fopramodel.ResearchGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fopras</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.FoPra}.
	 * It is bidirectional and its opposite is '{@link fopramodel.FoPra#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fopras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fopras</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getResearchGroup_Fopras()
	 * @see fopramodel.FoPra#getRg
	 * @model opposite="rg"
	 * @generated
	 */
	EList<FoPra> getFopras();

	/**
	 * Returns the value of the '<em><b>Professor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fopramodel.Professor#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professor</em>' container reference.
	 * @see #setProfessor(Professor)
	 * @see fopramodel.FopramodelPackage#getResearchGroup_Professor()
	 * @see fopramodel.Professor#getRg
	 * @model opposite="rg" required="true" transient="false"
	 * @generated
	 */
	Professor getProfessor();

	/**
	 * Sets the value of the '{@link fopramodel.ResearchGroup#getProfessor <em>Professor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Professor</em>' container reference.
	 * @see #getProfessor()
	 * @generated
	 */
	void setProfessor(Professor value);

	/**
	 * Returns the value of the '<em><b>Associate</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.Associate}.
	 * It is bidirectional and its opposite is '{@link fopramodel.Associate#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associate</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getResearchGroup_Associate()
	 * @see fopramodel.Associate#getRg
	 * @model opposite="rg"
	 * @generated
	 */
	EList<Associate> getAssociate();

} // ResearchGroup
