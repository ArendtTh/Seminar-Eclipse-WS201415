/**
 */
package fopramodel.impl;

import fopramodel.Auxiliary;
import fopramodel.AuxiliaryKind;
import fopramodel.FoPra;
import fopramodel.FopramodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auxiliary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.AuxiliaryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fopramodel.impl.AuxiliaryImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fopramodel.impl.AuxiliaryImpl#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuxiliaryImpl extends MinimalEObjectImpl.Container implements Auxiliary {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final AuxiliaryKind KIND_EDEFAULT = AuxiliaryKind.PROGRAMMING_LANGUAGE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryKind kind = KIND_EDEFAULT;

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
	protected AuxiliaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.AUXILIARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.AUXILIARY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(AuxiliaryKind newKind) {
		AuxiliaryKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.AUXILIARY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoPra> getFopras() {
		if (fopras == null) {
			fopras = new EObjectWithInverseResolvingEList.ManyInverse<FoPra>(FoPra.class, this, FopramodelPackage.AUXILIARY__FOPRAS, FopramodelPackage.FO_PRA__AUXILIARIES);
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
			case FopramodelPackage.AUXILIARY__FOPRAS:
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
			case FopramodelPackage.AUXILIARY__FOPRAS:
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
			case FopramodelPackage.AUXILIARY__DESCRIPTION:
				return getDescription();
			case FopramodelPackage.AUXILIARY__KIND:
				return getKind();
			case FopramodelPackage.AUXILIARY__FOPRAS:
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
			case FopramodelPackage.AUXILIARY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FopramodelPackage.AUXILIARY__KIND:
				setKind((AuxiliaryKind)newValue);
				return;
			case FopramodelPackage.AUXILIARY__FOPRAS:
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
			case FopramodelPackage.AUXILIARY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FopramodelPackage.AUXILIARY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case FopramodelPackage.AUXILIARY__FOPRAS:
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
			case FopramodelPackage.AUXILIARY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FopramodelPackage.AUXILIARY__KIND:
				return kind != KIND_EDEFAULT;
			case FopramodelPackage.AUXILIARY__FOPRAS:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //AuxiliaryImpl
