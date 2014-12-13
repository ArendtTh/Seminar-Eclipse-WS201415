/**
 */
package fopramodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fopramodel.FopramodelPackage#getCourse()
 * @model
 * @generated
 */
public enum Course implements Enumerator {
	/**
	 * The '<em><b>Info BSc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_BSC_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_BSC(0, "InfoBSc", "InfoBSc"),

	/**
	 * The '<em><b>Info MSc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_MSC_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_MSC(0, "InfoMSc", "InfoMSc"),

	/**
	 * The '<em><b>Info Diplom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_DIPLOM_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_DIPLOM(0, "InfoDiplom", "InfoDiplom"),

	/**
	 * The '<em><b>Info Minor Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_MINOR_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_MINOR_SUBJECT(0, "InfoMinorSubject", "InfoMinorSubject"),

	/**
	 * The '<em><b>Info Post Graduate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_POST_GRADUATE_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_POST_GRADUATE(0, "InfoPostGraduate", "InfoPostGraduate");

	/**
	 * The '<em><b>Info BSc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Info BSc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO_BSC
	 * @model name="InfoBSc"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_BSC_VALUE = 0;

	/**
	 * The '<em><b>Info MSc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Info MSc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO_MSC
	 * @model name="InfoMSc"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_MSC_VALUE = 0;

	/**
	 * The '<em><b>Info Diplom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Info Diplom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO_DIPLOM
	 * @model name="InfoDiplom"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_DIPLOM_VALUE = 0;

	/**
	 * The '<em><b>Info Minor Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Info Minor Subject</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO_MINOR_SUBJECT
	 * @model name="InfoMinorSubject"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_MINOR_SUBJECT_VALUE = 0;

	/**
	 * The '<em><b>Info Post Graduate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Info Post Graduate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO_POST_GRADUATE
	 * @model name="InfoPostGraduate"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_POST_GRADUATE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Course</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Course[] VALUES_ARRAY =
		new Course[] {
			INFO_BSC,
			INFO_MSC,
			INFO_DIPLOM,
			INFO_MINOR_SUBJECT,
			INFO_POST_GRADUATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Course</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Course> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Course get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Course result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Course getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Course result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Course get(int value) {
		switch (value) {
			case INFO_BSC_VALUE: return INFO_BSC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Course(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Course
