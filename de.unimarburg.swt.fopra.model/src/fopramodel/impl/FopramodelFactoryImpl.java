/**
 */
package fopramodel.impl;

import fopramodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FopramodelFactoryImpl extends EFactoryImpl implements FopramodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FopramodelFactory init() {
		try {
			FopramodelFactory theFopramodelFactory = (FopramodelFactory)EPackage.Registry.INSTANCE.getEFactory(FopramodelPackage.eNS_URI);
			if (theFopramodelFactory != null) {
				return theFopramodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FopramodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FopramodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FopramodelPackage.FO_PRA: return createFoPra();
			case FopramodelPackage.FO_PRA_MANAGEMENT_SYSTEM: return createFoPraManagementSystem();
			case FopramodelPackage.STUDENT: return createStudent();
			case FopramodelPackage.PROFESSOR: return createProfessor();
			case FopramodelPackage.RESEARCH_GROUP: return createResearchGroup();
			case FopramodelPackage.ASSOCIATE: return createAssociate();
			case FopramodelPackage.EXTERNAL_ADVISOR: return createExternalAdvisor();
			case FopramodelPackage.AUXILIARY: return createAuxiliary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FopramodelPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case FopramodelPackage.COURSE:
				return createCourseFromString(eDataType, initialValue);
			case FopramodelPackage.AUXILIARY_KIND:
				return createAuxiliaryKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FopramodelPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case FopramodelPackage.COURSE:
				return convertCourseToString(eDataType, instanceValue);
			case FopramodelPackage.AUXILIARY_KIND:
				return convertAuxiliaryKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoPra createFoPra() {
		FoPraImpl foPra = new FoPraImpl();
		return foPra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoPraManagementSystem createFoPraManagementSystem() {
		FoPraManagementSystemImpl foPraManagementSystem = new FoPraManagementSystemImpl();
		return foPraManagementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchGroup createResearchGroup() {
		ResearchGroupImpl researchGroup = new ResearchGroupImpl();
		return researchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Associate createAssociate() {
		AssociateImpl associate = new AssociateImpl();
		return associate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAdvisor createExternalAdvisor() {
		ExternalAdvisorImpl externalAdvisor = new ExternalAdvisorImpl();
		return externalAdvisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auxiliary createAuxiliary() {
		AuxiliaryImpl auxiliary = new AuxiliaryImpl();
		return auxiliary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourseFromString(EDataType eDataType, String initialValue) {
		Course result = Course.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryKind createAuxiliaryKindFromString(EDataType eDataType, String initialValue) {
		AuxiliaryKind result = AuxiliaryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuxiliaryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FopramodelPackage getFopramodelPackage() {
		return (FopramodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FopramodelPackage getPackage() {
		return FopramodelPackage.eINSTANCE;
	}

} //FopramodelFactoryImpl
