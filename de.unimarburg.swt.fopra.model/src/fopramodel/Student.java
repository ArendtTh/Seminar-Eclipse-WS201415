/**
 */
package fopramodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fopramodel.Student#getMatrikel <em>Matrikel</em>}</li>
 *   <li>{@link fopramodel.Student#getCourse <em>Course</em>}</li>
 *   <li>{@link fopramodel.Student#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @see fopramodel.FopramodelPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Matrikel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrikel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrikel</em>' attribute.
	 * @see #setMatrikel(String)
	 * @see fopramodel.FopramodelPackage#getStudent_Matrikel()
	 * @model
	 * @generated
	 */
	String getMatrikel();

	/**
	 * Sets the value of the '{@link fopramodel.Student#getMatrikel <em>Matrikel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrikel</em>' attribute.
	 * @see #getMatrikel()
	 * @generated
	 */
	void setMatrikel(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' attribute.
	 * The literals are from the enumeration {@link fopramodel.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' attribute.
	 * @see fopramodel.Course
	 * @see #setCourse(Course)
	 * @see fopramodel.FopramodelPackage#getStudent_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link fopramodel.Student#getCourse <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' attribute.
	 * @see fopramodel.Course
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Fopras</b></em>' reference list.
	 * The list contents are of type {@link fopramodel.FoPra}.
	 * It is bidirectional and its opposite is '{@link fopramodel.FoPra#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fopras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fopras</em>' reference list.
	 * @see fopramodel.FopramodelPackage#getStudent_Fopras()
	 * @see fopramodel.FoPra#getStudents
	 * @model opposite="students"
	 * @generated
	 */
	EList<FoPra> getFopras();

} // Student
