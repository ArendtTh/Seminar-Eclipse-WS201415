/**
 */
package fopramodel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fo Pra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.FoPra#getTitle <em>Title</em>}</li>
 *   <li>{@link fopramodel.FoPra#getDescription <em>Description</em>}</li>
 *   <li>{@link fopramodel.FoPra#getStatus <em>Status</em>}</li>
 *   <li>{@link fopramodel.FoPra#getMaxNumberOfStudents <em>Max Number Of Students</em>}</li>
 *   <li>{@link fopramodel.FoPra#getStart <em>Start</em>}</li>
 *   <li>{@link fopramodel.FoPra#getEnd <em>End</em>}</li>
 *   <li>{@link fopramodel.FoPra#getStudents <em>Students</em>}</li>
 *   <li>{@link fopramodel.FoPra#getRg <em>Rg</em>}</li>
 *   <li>{@link fopramodel.FoPra#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link fopramodel.FoPra#getAdvisor <em>Advisor</em>}</li>
 *   <li>{@link fopramodel.FoPra#getAuxiliaries <em>Auxiliaries</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getFoPra()
 * @model
 * @generated
 */
public interface FoPra extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fopramodel.FopramodelPackage#getFoPra_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see fopramodel.FopramodelPackage#getFoPra_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fopramodel.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see fopramodel.Status
	 * @see #setStatus(Status)
	 * @see fopramodel.FopramodelPackage#getFoPra_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see fopramodel.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Students</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Students</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Students</em>' attribute.
	 * @see #setMaxNumberOfStudents(int)
	 * @see fopramodel.FopramodelPackage#getFoPra_MaxNumberOfStudents()
	 * @model default="1"
	 * @generated
	 */
	int getMaxNumberOfStudents();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getMaxNumberOfStudents <em>Max Number Of Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Students</em>' attribute.
	 * @see #getMaxNumberOfStudents()
	 * @generated
	 */
	void setMaxNumberOfStudents(int value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see fopramodel.FopramodelPackage#getFoPra_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see fopramodel.FopramodelPackage#getFoPra_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.Student}.
	 * It is bidirectional and its opposite is '{@link fopramodel.Student#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getFoPra_Students()
	 * @see fopramodel.Student#getFopras
	 * @model opposite="fopras" required="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fopramodel.ResearchGroup#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rg</em>' reference.
	 * @see #setRg(ResearchGroup)
	 * @see fopramodel.FopramodelPackage#getFoPra_Rg()
	 * @see fopramodel.ResearchGroup#getFopras
	 * @model opposite="fopras" required="true"
	 * @generated
	 */
	ResearchGroup getRg();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getRg <em>Rg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rg</em>' reference.
	 * @see #getRg()
	 * @generated
	 */
	void setRg(ResearchGroup value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fopramodel.Associate#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Associate)
	 * @see fopramodel.FopramodelPackage#getFoPra_Supervisor()
	 * @see fopramodel.Associate#getFopras
	 * @model opposite="fopras"
	 * @generated
	 */
	Associate getSupervisor();

	/**
	 * Sets the value of the '{@link fopramodel.FoPra#getSupervisor <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Associate value);

	/**
	 * Returns the value of the '<em><b>Advisor</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.ExternalAdvisor}.
	 * It is bidirectional and its opposite is '{@link fopramodel.ExternalAdvisor#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advisor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advisor</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getFoPra_Advisor()
	 * @see fopramodel.ExternalAdvisor#getFopras
	 * @model opposite="fopras"
	 * @generated
	 */
	EList<ExternalAdvisor> getAdvisor();

	/**
	 * Returns the value of the '<em><b>Auxiliaries</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.Auxiliary}.
	 * It is bidirectional and its opposite is '{@link fopramodel.Auxiliary#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliaries</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getFoPra_Auxiliaries()
	 * @see fopramodel.Auxiliary#getFopras
	 * @model opposite="fopras" required="true"
	 * @generated
	 */
	EList<Auxiliary> getAuxiliaries();

} // FoPra
