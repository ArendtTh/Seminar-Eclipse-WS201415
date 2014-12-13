/**
 */
package fopramodel.impl;

import fopramodel.Associate;
import fopramodel.FoPra;
import fopramodel.FopramodelPackage;
import fopramodel.Professor;
import fopramodel.ResearchGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.ResearchGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link fopramodel.impl.ResearchGroupImpl#getFopras <em>Fopras</em>}</li>
 *   <li>{@link fopramodel.impl.ResearchGroupImpl#getProfessor <em>Professor</em>}</li>
 *   <li>{@link fopramodel.impl.ResearchGroupImpl#getAssociate <em>Associate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResearchGroupImpl extends MinimalEObjectImpl.Container implements ResearchGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAssociate() <em>Associate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociate()
	 * @generated
	 * @ordered
	 */
	protected EList<Associate> associate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.RESEARCH_GROUP;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.RESEARCH_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FoPra> getFopras() {
		if (fopras == null) {
			fopras = new EObjectWithInverseResolvingEList<FoPra>(FoPra.class, this, FopramodelPackage.RESEARCH_GROUP__FOPRAS, FopramodelPackage.FO_PRA__RG);
		}
		return fopras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor getProfessor() {
		if (eContainerFeatureID() != FopramodelPackage.RESEARCH_GROUP__PROFESSOR) return null;
		return (Professor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfessor(Professor newProfessor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProfessor, FopramodelPackage.RESEARCH_GROUP__PROFESSOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfessor(Professor newProfessor) {
		if (newProfessor != eInternalContainer() || (eContainerFeatureID() != FopramodelPackage.RESEARCH_GROUP__PROFESSOR && newProfessor != null)) {
			if (EcoreUtil.isAncestor(this, newProfessor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProfessor != null)
				msgs = ((InternalEObject)newProfessor).eInverseAdd(this, FopramodelPackage.PROFESSOR__RG, Professor.class, msgs);
			msgs = basicSetProfessor(newProfessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.RESEARCH_GROUP__PROFESSOR, newProfessor, newProfessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Associate> getAssociate() {
		if (associate == null) {
			associate = new EObjectWithInverseResolvingEList<Associate>(Associate.class, this, FopramodelPackage.RESEARCH_GROUP__ASSOCIATE, FopramodelPackage.ASSOCIATE__RG);
		}
		return associate;
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
			case FopramodelPackage.RESEARCH_GROUP__FOPRAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFopras()).basicAdd(otherEnd, msgs);
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProfessor((Professor)otherEnd, msgs);
			case FopramodelPackage.RESEARCH_GROUP__ASSOCIATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociate()).basicAdd(otherEnd, msgs);
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
			case FopramodelPackage.RESEARCH_GROUP__FOPRAS:
				return ((InternalEList<?>)getFopras()).basicRemove(otherEnd, msgs);
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				return basicSetProfessor(null, msgs);
			case FopramodelPackage.RESEARCH_GROUP__ASSOCIATE:
				return ((InternalEList<?>)getAssociate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				return eInternalContainer().eInverseRemove(this, FopramodelPackage.PROFESSOR__RG, Professor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FopramodelPackage.RESEARCH_GROUP__NAME:
				return getName();
			case FopramodelPackage.RESEARCH_GROUP__FOPRAS:
				return getFopras();
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				return getProfessor();
			case FopramodelPackage.RESEARCH_GROUP__ASSOCIATE:
				return getAssociate();
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
			case FopramodelPackage.RESEARCH_GROUP__NAME:
				setName((String)newValue);
				return;
			case FopramodelPackage.RESEARCH_GROUP__FOPRAS:
				getFopras().clear();
				getFopras().addAll((Collection<? extends FoPra>)newValue);
				return;
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				setProfessor((Professor)newValue);
				return;
			case FopramodelPackage.RESEARCH_GROUP__ASSOCIATE:
				getAssociate().clear();
				getAssociate().addAll((Collection<? extends Associate>)newValue);
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
			case FopramodelPackage.RESEARCH_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FopramodelPackage.RESEARCH_GROUP__FOPRAS:
				getFopras().clear();
				return;
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				setProfessor((Professor)null);
				return;
			case FopramodelPackage.RESEARCH_GROUP__ASSOCIATE:
				getAssociate().clear();
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
			case FopramodelPackage.RESEARCH_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FopramodelPackage.RESEARCH_GROUP__FOPRAS:
				return fopras != null && !fopras.isEmpty();
			case FopramodelPackage.RESEARCH_GROUP__PROFESSOR:
				return getProfessor() != null;
			case FopramodelPackage.RESEARCH_GROUP__ASSOCIATE:
				return associate != null && !associate.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResearchGroupImpl
