/**
 */
package fopramodel.impl;

import fopramodel.Auxiliary;
import fopramodel.FoPra;
import fopramodel.FoPraManagementSystem;
import fopramodel.FopramodelPackage;
import fopramodel.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fo Pra Management System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.FoPraManagementSystemImpl#getFopras <em>Fopras</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraManagementSystemImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraManagementSystemImpl#getAuxiliaries <em>Auxiliaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FoPraManagementSystemImpl extends MinimalEObjectImpl.Container implements FoPraManagementSystem {
	/**
	 * The cached value of the '{@link #getFopras() <em>Fopras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFopras()
	 * @generated
	 * @ordered
	 */
	protected EList<FoPra> fopras;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getAuxiliaries() <em>Auxiliaries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Auxiliary> auxiliaries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoPraManagementSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.FO_PRA_MANAGEMENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoPra> getFopras() {
		if (fopras == null) {
			fopras = new EObjectContainmentEList<FoPra>(FoPra.class, this, FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__FOPRAS);
		}
		return fopras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auxiliary> getAuxiliaries() {
		if (auxiliaries == null) {
			auxiliaries = new EObjectContainmentEList<Auxiliary>(Auxiliary.class, this, FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES);
		}
		return auxiliaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__FOPRAS:
				return ((InternalEList<?>)getFopras()).basicRemove(otherEnd, msgs);
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES:
				return ((InternalEList<?>)getAuxiliaries()).basicRemove(otherEnd, msgs);
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
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__FOPRAS:
				return getFopras();
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__PERSONS:
				return getPersons();
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES:
				return getAuxiliaries();
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
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__FOPRAS:
				getFopras().clear();
				getFopras().addAll((Collection<? extends FoPra>)newValue);
				return;
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES:
				getAuxiliaries().clear();
				getAuxiliaries().addAll((Collection<? extends Auxiliary>)newValue);
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
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__FOPRAS:
				getFopras().clear();
				return;
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__PERSONS:
				getPersons().clear();
				return;
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES:
				getAuxiliaries().clear();
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
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__FOPRAS:
				return fopras != null && !fopras.isEmpty();
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__PERSONS:
				return persons != null && !persons.isEmpty();
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES:
				return auxiliaries != null && !auxiliaries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FoPraManagementSystemImpl
