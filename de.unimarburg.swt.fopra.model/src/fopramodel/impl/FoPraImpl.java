/**
 */
package fopramodel.impl;

import fopramodel.Associate;
import fopramodel.Auxiliary;
import fopramodel.ExternalAdvisor;
import fopramodel.FoPra;
import fopramodel.FopramodelPackage;
import fopramodel.ResearchGroup;
import fopramodel.Status;
import fopramodel.Student;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Fo Pra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fopramodel.impl.FoPraImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getMaxNumberOfStudents <em>Max Number Of Students</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getRg <em>Rg</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getAdvisor <em>Advisor</em>}</li>
 *   <li>{@link fopramodel.impl.FoPraImpl#getAuxiliaries <em>Auxiliaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FoPraImpl extends MinimalEObjectImpl.Container implements FoPra {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.PENDING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfStudents() <em>Max Number Of Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfStudents()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_OF_STUDENTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxNumberOfStudents() <em>Max Number Of Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfStudents()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberOfStudents = MAX_NUMBER_OF_STUDENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

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
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected Associate supervisor;

	/**
	 * The cached value of the '{@link #getAdvisor() <em>Advisor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvisor()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalAdvisor> advisor;

	/**
	 * The cached value of the '{@link #getAuxiliaries() <em>Auxiliaries</em>}' reference list.
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
	protected FoPraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FopramodelPackage.Literals.FO_PRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberOfStudents() {
		return maxNumberOfStudents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfStudents(int newMaxNumberOfStudents) {
		int oldMaxNumberOfStudents = maxNumberOfStudents;
		maxNumberOfStudents = newMaxNumberOfStudents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__MAX_NUMBER_OF_STUDENTS, oldMaxNumberOfStudents, maxNumberOfStudents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, FopramodelPackage.FO_PRA__STUDENTS, FopramodelPackage.STUDENT__FOPRAS);
		}
		return students;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FopramodelPackage.FO_PRA__RG, oldRg, rg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__RG, oldRg, newRg);
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
				msgs = ((InternalEObject)rg).eInverseRemove(this, FopramodelPackage.RESEARCH_GROUP__FOPRAS, ResearchGroup.class, msgs);
			if (newRg != null)
				msgs = ((InternalEObject)newRg).eInverseAdd(this, FopramodelPackage.RESEARCH_GROUP__FOPRAS, ResearchGroup.class, msgs);
			msgs = basicSetRg(newRg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__RG, newRg, newRg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Associate getSupervisor() {
		if (supervisor != null && supervisor.eIsProxy()) {
			InternalEObject oldSupervisor = (InternalEObject)supervisor;
			supervisor = (Associate)eResolveProxy(oldSupervisor);
			if (supervisor != oldSupervisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FopramodelPackage.FO_PRA__SUPERVISOR, oldSupervisor, supervisor));
			}
		}
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Associate basicGetSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervisor(Associate newSupervisor, NotificationChain msgs) {
		Associate oldSupervisor = supervisor;
		supervisor = newSupervisor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__SUPERVISOR, oldSupervisor, newSupervisor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisor(Associate newSupervisor) {
		if (newSupervisor != supervisor) {
			NotificationChain msgs = null;
			if (supervisor != null)
				msgs = ((InternalEObject)supervisor).eInverseRemove(this, FopramodelPackage.ASSOCIATE__FOPRAS, Associate.class, msgs);
			if (newSupervisor != null)
				msgs = ((InternalEObject)newSupervisor).eInverseAdd(this, FopramodelPackage.ASSOCIATE__FOPRAS, Associate.class, msgs);
			msgs = basicSetSupervisor(newSupervisor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FopramodelPackage.FO_PRA__SUPERVISOR, newSupervisor, newSupervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalAdvisor> getAdvisor() {
		if (advisor == null) {
			advisor = new EObjectWithInverseResolvingEList.ManyInverse<ExternalAdvisor>(ExternalAdvisor.class, this, FopramodelPackage.FO_PRA__ADVISOR, FopramodelPackage.EXTERNAL_ADVISOR__FOPRAS);
		}
		return advisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auxiliary> getAuxiliaries() {
		if (auxiliaries == null) {
			auxiliaries = new EObjectWithInverseResolvingEList.ManyInverse<Auxiliary>(Auxiliary.class, this, FopramodelPackage.FO_PRA__AUXILIARIES, FopramodelPackage.AUXILIARY__FOPRAS);
		}
		return auxiliaries;
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
			case FopramodelPackage.FO_PRA__STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
			case FopramodelPackage.FO_PRA__RG:
				if (rg != null)
					msgs = ((InternalEObject)rg).eInverseRemove(this, FopramodelPackage.RESEARCH_GROUP__FOPRAS, ResearchGroup.class, msgs);
				return basicSetRg((ResearchGroup)otherEnd, msgs);
			case FopramodelPackage.FO_PRA__SUPERVISOR:
				if (supervisor != null)
					msgs = ((InternalEObject)supervisor).eInverseRemove(this, FopramodelPackage.ASSOCIATE__FOPRAS, Associate.class, msgs);
				return basicSetSupervisor((Associate)otherEnd, msgs);
			case FopramodelPackage.FO_PRA__ADVISOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdvisor()).basicAdd(otherEnd, msgs);
			case FopramodelPackage.FO_PRA__AUXILIARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaries()).basicAdd(otherEnd, msgs);
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
			case FopramodelPackage.FO_PRA__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case FopramodelPackage.FO_PRA__RG:
				return basicSetRg(null, msgs);
			case FopramodelPackage.FO_PRA__SUPERVISOR:
				return basicSetSupervisor(null, msgs);
			case FopramodelPackage.FO_PRA__ADVISOR:
				return ((InternalEList<?>)getAdvisor()).basicRemove(otherEnd, msgs);
			case FopramodelPackage.FO_PRA__AUXILIARIES:
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
			case FopramodelPackage.FO_PRA__TITLE:
				return getTitle();
			case FopramodelPackage.FO_PRA__DESCRIPTION:
				return getDescription();
			case FopramodelPackage.FO_PRA__STATUS:
				return getStatus();
			case FopramodelPackage.FO_PRA__MAX_NUMBER_OF_STUDENTS:
				return getMaxNumberOfStudents();
			case FopramodelPackage.FO_PRA__START:
				return getStart();
			case FopramodelPackage.FO_PRA__END:
				return getEnd();
			case FopramodelPackage.FO_PRA__STUDENTS:
				return getStudents();
			case FopramodelPackage.FO_PRA__RG:
				if (resolve) return getRg();
				return basicGetRg();
			case FopramodelPackage.FO_PRA__SUPERVISOR:
				if (resolve) return getSupervisor();
				return basicGetSupervisor();
			case FopramodelPackage.FO_PRA__ADVISOR:
				return getAdvisor();
			case FopramodelPackage.FO_PRA__AUXILIARIES:
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
			case FopramodelPackage.FO_PRA__TITLE:
				setTitle((String)newValue);
				return;
			case FopramodelPackage.FO_PRA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FopramodelPackage.FO_PRA__STATUS:
				setStatus((Status)newValue);
				return;
			case FopramodelPackage.FO_PRA__MAX_NUMBER_OF_STUDENTS:
				setMaxNumberOfStudents((Integer)newValue);
				return;
			case FopramodelPackage.FO_PRA__START:
				setStart((Date)newValue);
				return;
			case FopramodelPackage.FO_PRA__END:
				setEnd((Date)newValue);
				return;
			case FopramodelPackage.FO_PRA__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case FopramodelPackage.FO_PRA__RG:
				setRg((ResearchGroup)newValue);
				return;
			case FopramodelPackage.FO_PRA__SUPERVISOR:
				setSupervisor((Associate)newValue);
				return;
			case FopramodelPackage.FO_PRA__ADVISOR:
				getAdvisor().clear();
				getAdvisor().addAll((Collection<? extends ExternalAdvisor>)newValue);
				return;
			case FopramodelPackage.FO_PRA__AUXILIARIES:
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
			case FopramodelPackage.FO_PRA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FopramodelPackage.FO_PRA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FopramodelPackage.FO_PRA__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case FopramodelPackage.FO_PRA__MAX_NUMBER_OF_STUDENTS:
				setMaxNumberOfStudents(MAX_NUMBER_OF_STUDENTS_EDEFAULT);
				return;
			case FopramodelPackage.FO_PRA__START:
				setStart(START_EDEFAULT);
				return;
			case FopramodelPackage.FO_PRA__END:
				setEnd(END_EDEFAULT);
				return;
			case FopramodelPackage.FO_PRA__STUDENTS:
				getStudents().clear();
				return;
			case FopramodelPackage.FO_PRA__RG:
				setRg((ResearchGroup)null);
				return;
			case FopramodelPackage.FO_PRA__SUPERVISOR:
				setSupervisor((Associate)null);
				return;
			case FopramodelPackage.FO_PRA__ADVISOR:
				getAdvisor().clear();
				return;
			case FopramodelPackage.FO_PRA__AUXILIARIES:
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
			case FopramodelPackage.FO_PRA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FopramodelPackage.FO_PRA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FopramodelPackage.FO_PRA__STATUS:
				return status != STATUS_EDEFAULT;
			case FopramodelPackage.FO_PRA__MAX_NUMBER_OF_STUDENTS:
				return maxNumberOfStudents != MAX_NUMBER_OF_STUDENTS_EDEFAULT;
			case FopramodelPackage.FO_PRA__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case FopramodelPackage.FO_PRA__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case FopramodelPackage.FO_PRA__STUDENTS:
				return students != null && !students.isEmpty();
			case FopramodelPackage.FO_PRA__RG:
				return rg != null;
			case FopramodelPackage.FO_PRA__SUPERVISOR:
				return supervisor != null;
			case FopramodelPackage.FO_PRA__ADVISOR:
				return advisor != null && !advisor.isEmpty();
			case FopramodelPackage.FO_PRA__AUXILIARIES:
				return auxiliaries != null && !auxiliaries.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", status: ");
		result.append(status);
		result.append(", maxNumberOfStudents: ");
		result.append(maxNumberOfStudents);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //FoPraImpl
