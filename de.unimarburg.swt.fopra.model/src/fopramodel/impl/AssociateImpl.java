/**
 */
package fopramodel.impl;

import fopramodel.Associate;
import fopramodel.FoPra;
import fopramodel.FopramodelPackage;
import fopramodel.ResearchGroup;

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
 * An implementation of the model object '<em><b>Associate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.AssociateImpl#getRg <em>Rg</em>}</li>
 *   <li>{@link fopramodel.impl.AssociateImpl#getFopras <em>Fopras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociateImpl extends PersonImpl implements Associate {
	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected ResearchGroup rg;

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
	protected AssociateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.ASSOCIATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchGroup getRg() {
		if (rg != null && rg.eIsProxy()) {
			InternalEObject oldRg = (InternalEObject)rg;
			rg = (ResearchGroup)eResolveProxy(oldRg);
			if (rg != oldRg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FopramodelPackage.ASSOCIATE__RG, oldRg, rg));
			}
		}
		return rg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchGroup basicGetRg() {
		return rg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRg(ResearchGroup newRg, NotificationChain msgs) {
		ResearchGroup oldRg = rg;
		rg = newRg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FopramodelPackage.ASSOCIATE__RG, oldRg, newRg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRg(ResearchGroup newRg) {
		if (newRg != rg) {
			NotificationChain msgs = null;
			if (rg != null)
				msgs = ((InternalEObject)rg).eInverseRemove(this, FopramodelPackage.RESEARCH_GROUP__ASSOCIATE, ResearchGroup.class, msgs);
			if (newRg != null)
				msgs = ((InternalEObject)newRg).eInverseAdd(this, FopramodelPackage.RESEARCH_GROUP__ASSOCIATE, ResearchGroup.class, msgs);
			msgs = basicSetRg(newRg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.ASSOCIATE__RG, newRg, newRg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoPra> getFopras() {
		if (fopras == null) {
			fopras = new EObjectWithInverseResolvingEList<FoPra>(FoPra.class, this, FopramodelPackage.ASSOCIATE__FOPRAS, FopramodelPackage.FO_PRA__SUPERVISOR);
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
			case FopramodelPackage.ASSOCIATE__RG:
				if (rg != null)
					msgs = ((InternalEObject)rg).eInverseRemove(this, FopramodelPackage.RESEARCH_GROUP__ASSOCIATE, ResearchGroup.class, msgs);
				return basicSetRg((ResearchGroup)otherEnd, msgs);
			case FopramodelPackage.ASSOCIATE__FOPRAS:
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
			case FopramodelPackage.ASSOCIATE__RG:
				return basicSetRg(null, msgs);
			case FopramodelPackage.ASSOCIATE__FOPRAS:
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
			case FopramodelPackage.ASSOCIATE__RG:
				if (resolve) return getRg();
				return basicGetRg();
			case FopramodelPackage.ASSOCIATE__FOPRAS:
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
			case FopramodelPackage.ASSOCIATE__RG:
				setRg((ResearchGroup)newValue);
				return;
			case FopramodelPackage.ASSOCIATE__FOPRAS:
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
			case FopramodelPackage.ASSOCIATE__RG:
				setRg((ResearchGroup)null);
				return;
			case FopramodelPackage.ASSOCIATE__FOPRAS:
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
			case FopramodelPackage.ASSOCIATE__RG:
				return rg != null;
			case FopramodelPackage.ASSOCIATE__FOPRAS:
				return fopras != null && !fopras.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssociateImpl
