/**
 */
package fopramodel.impl;

import fopramodel.ExternalAdvisor;
import fopramodel.FoPra;
import fopramodel.FopramodelPackage;

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
 * An implementation of the model object '<em><b>External Advisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.ExternalAdvisorImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link fopramodel.impl.ExternalAdvisorImpl#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalAdvisorImpl extends PersonImpl implements ExternalAdvisor {
	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

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
	protected ExternalAdvisorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.EXTERNAL_ADVISOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.EXTERNAL_ADVISOR__INFORMATION, oldInformation, information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoPra> getFopras() {
		if (fopras == null) {
			fopras = new EObjectWithInverseResolvingEList.ManyInverse<FoPra>(FoPra.class, this, FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS, FopramodelPackage.FO_PRA__ADVISOR);
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
			case FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS:
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
			case FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS:
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
			case FopramodelPackage.EXTERNAL_ADVISOR__INFORMATION:
				return getInformation();
			case FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS:
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
			case FopramodelPackage.EXTERNAL_ADVISOR__INFORMATION:
				setInformation((String)newValue);
				return;
			case FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS:
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
			case FopramodelPackage.EXTERNAL_ADVISOR__INFORMATION:
				setInformation(INFORMATION_EDEFAULT);
				return;
			case FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS:
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
			case FopramodelPackage.EXTERNAL_ADVISOR__INFORMATION:
				return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
			case FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS:
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
		result.append(" (information: ");
		result.append(information);
		result.append(')');
		return result.toString();
	}

} //ExternalAdvisorImpl
