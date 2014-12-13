/**
 */
package fopramodel.impl;

import fopramodel.Course;
import fopramodel.FoPra;
import fopramodel.FopramodelPackage;
import fopramodel.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.StudentImpl#getMatrikel <em>Matrikel</em>}</li>
 *   <li>{@link fopramodel.impl.StudentImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link fopramodel.impl.StudentImpl#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The default value of the '{@link #getMatrikel() <em>Matrikel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrikel()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRIKEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatrikel() <em>Matrikel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrikel()
	 * @generated
	 * @ordered
	 */
	protected String matrikel = MATRIKEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourse() <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected static final Course COURSE_EDEFAULT = Course.INFO_BSC;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course = COURSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFopras() <em>Fopras</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFopras()
	 * @generated
	 * @ordered
	 */
	protected EList<FoPra> fopras;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatrikel() {
		return matrikel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrikel(String newMatrikel) {
		String oldMatrikel = matrikel;
		matrikel = newMatrikel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.STUDENT__MATRIKEL, oldMatrikel, matrikel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse == null ? COURSE_EDEFAULT : newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.STUDENT__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoPra> getFopras() {
		if (fopras == null) {
			fopras = new EObjectWithInverseResolvingEList.ManyInverse<FoPra>(FoPra.class, this, FopramodelPackage.STUDENT__FOPRAS, FopramodelPackage.FO_PRA__STUDENTS);
		}
		return fopras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FopramodelPackage.STUDENT__FOPRAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFopras()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FopramodelPackage.STUDENT__FOPRAS:
				return ((InternalEList<?>)getFopras()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FopramodelPackage.STUDENT__MATRIKEL:
				return getMatrikel();
			case FopramodelPackage.STUDENT__COURSE:
				return getCourse();
			case FopramodelPackage.STUDENT__FOPRAS:
				return getFopras();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FopramodelPackage.STUDENT__MATRIKEL:
				setMatrikel((String)newValue);
				return;
			case FopramodelPackage.STUDENT__COURSE:
				setCourse((Course)newValue);
				return;
			case FopramodelPackage.STUDENT__FOPRAS:
				getFopras().clear();
				getFopras().addAll((Collection<? extends FoPra>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FopramodelPackage.STUDENT__MATRIKEL:
				setMatrikel(MATRIKEL_EDEFAULT);
				return;
			case FopramodelPackage.STUDENT__COURSE:
				setCourse(COURSE_EDEFAULT);
				return;
			case FopramodelPackage.STUDENT__FOPRAS:
				getFopras().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FopramodelPackage.STUDENT__MATRIKEL:
				return MATRIKEL_EDEFAULT == null ? matrikel != null : !MATRIKEL_EDEFAULT.equals(matrikel);
			case FopramodelPackage.STUDENT__COURSE:
				return course != COURSE_EDEFAULT;
			case FopramodelPackage.STUDENT__FOPRAS:
				return fopras != null && !fopras.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (matrikel: ");
		result.append(matrikel);
		result.append(", course: ");
		result.append(course);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
