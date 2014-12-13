/**
 */
package fopramodel.impl;

import fopramodel.Associate;
import fopramodel.Auxiliary;
import fopramodel.AuxiliaryKind;
import fopramodel.Course;
import fopramodel.ExternalAdvisor;
import fopramodel.FoPra;
import fopramodel.FoPraManagementSystem;
import fopramodel.FopramodelFactory;
import fopramodel.FopramodelPackage;
import fopramodel.Person;
import fopramodel.Professor;
import fopramodel.ResearchGroup;
import fopramodel.Status;
import fopramodel.Student;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FopramodelPackageImpl extends EPackageImpl implements FopramodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foPraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foPraManagementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalAdvisorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auxiliaryKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fopramodel.FopramodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FopramodelPackageImpl() {
		super(eNS_URI, FopramodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FopramodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FopramodelPackage init() {
		if (isInited) return (FopramodelPackage)EPackage.Registry.INSTANCE.getEPackage(FopramodelPackage.eNS_URI);

		// Obtain or create and register package
		FopramodelPackageImpl theFopramodelPackage = (FopramodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FopramodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FopramodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFopramodelPackage.createPackageContents();

		// Initialize created meta-data
		theFopramodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFopramodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FopramodelPackage.eNS_URI, theFopramodelPackage);
		return theFopramodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoPra() {
		return foPraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoPra_Title() {
		return (EAttribute)foPraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoPra_Description() {
		return (EAttribute)foPraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoPra_Status() {
		return (EAttribute)foPraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoPra_MaxNumberOfStudents() {
		return (EAttribute)foPraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoPra_Start() {
		return (EAttribute)foPraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoPra_End() {
		return (EAttribute)foPraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPra_Students() {
		return (EReference)foPraEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPra_Rg() {
		return (EReference)foPraEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPra_Supervisor() {
		return (EReference)foPraEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPra_Advisor() {
		return (EReference)foPraEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPra_Auxiliaries() {
		return (EReference)foPraEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoPraManagementSystem() {
		return foPraManagementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPraManagementSystem_Fopras() {
		return (EReference)foPraManagementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPraManagementSystem_Persons() {
		return (EReference)foPraManagementSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoPraManagementSystem_Auxiliaries() {
		return (EReference)foPraManagementSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Matrikel() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Course() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Fopras() {
		return (EReference)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Forename() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_Rg() {
		return (EReference)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchGroup() {
		return researchGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResearchGroup_Name() {
		return (EAttribute)researchGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchGroup_Fopras() {
		return (EReference)researchGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchGroup_Professor() {
		return (EReference)researchGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchGroup_Associate() {
		return (EReference)researchGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociate() {
		return associateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociate_Rg() {
		return (EReference)associateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociate_Fopras() {
		return (EReference)associateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalAdvisor() {
		return externalAdvisorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalAdvisor_Information() {
		return (EAttribute)externalAdvisorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalAdvisor_Fopras() {
		return (EReference)externalAdvisorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliary() {
		return auxiliaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliary_Description() {
		return (EAttribute)auxiliaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliary_Kind() {
		return (EAttribute)auxiliaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliary_Fopras() {
		return (EReference)auxiliaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourse() {
		return courseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuxiliaryKind() {
		return auxiliaryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FopramodelFactory getFopramodelFactory() {
		return (FopramodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		foPraEClass = createEClass(FO_PRA);
		createEAttribute(foPraEClass, FO_PRA__TITLE);
		createEAttribute(foPraEClass, FO_PRA__DESCRIPTION);
		createEAttribute(foPraEClass, FO_PRA__STATUS);
		createEAttribute(foPraEClass, FO_PRA__MAX_NUMBER_OF_STUDENTS);
		createEAttribute(foPraEClass, FO_PRA__START);
		createEAttribute(foPraEClass, FO_PRA__END);
		createEReference(foPraEClass, FO_PRA__STUDENTS);
		createEReference(foPraEClass, FO_PRA__RG);
		createEReference(foPraEClass, FO_PRA__SUPERVISOR);
		createEReference(foPraEClass, FO_PRA__ADVISOR);
		createEReference(foPraEClass, FO_PRA__AUXILIARIES);

		foPraManagementSystemEClass = createEClass(FO_PRA_MANAGEMENT_SYSTEM);
		createEReference(foPraManagementSystemEClass, FO_PRA_MANAGEMENT_SYSTEM__FOPRAS);
		createEReference(foPraManagementSystemEClass, FO_PRA_MANAGEMENT_SYSTEM__PERSONS);
		createEReference(foPraManagementSystemEClass, FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__MATRIKEL);
		createEAttribute(studentEClass, STUDENT__COURSE);
		createEReference(studentEClass, STUDENT__FOPRAS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FORENAME);
		createEAttribute(personEClass, PERSON__LASTNAME);

		professorEClass = createEClass(PROFESSOR);
		createEReference(professorEClass, PROFESSOR__RG);

		researchGroupEClass = createEClass(RESEARCH_GROUP);
		createEAttribute(researchGroupEClass, RESEARCH_GROUP__NAME);
		createEReference(researchGroupEClass, RESEARCH_GROUP__FOPRAS);
		createEReference(researchGroupEClass, RESEARCH_GROUP__PROFESSOR);
		createEReference(researchGroupEClass, RESEARCH_GROUP__ASSOCIATE);

		associateEClass = createEClass(ASSOCIATE);
		createEReference(associateEClass, ASSOCIATE__RG);
		createEReference(associateEClass, ASSOCIATE__FOPRAS);

		externalAdvisorEClass = createEClass(EXTERNAL_ADVISOR);
		createEAttribute(externalAdvisorEClass, EXTERNAL_ADVISOR__INFORMATION);
		createEReference(externalAdvisorEClass, EXTERNAL_ADVISOR__FOPRAS);

		auxiliaryEClass = createEClass(AUXILIARY);
		createEAttribute(auxiliaryEClass, AUXILIARY__DESCRIPTION);
		createEAttribute(auxiliaryEClass, AUXILIARY__KIND);
		createEReference(auxiliaryEClass, AUXILIARY__FOPRAS);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		courseEEnum = createEEnum(COURSE);
		auxiliaryKindEEnum = createEEnum(AUXILIARY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		studentEClass.getESuperTypes().add(this.getPerson());
		professorEClass.getESuperTypes().add(this.getPerson());
		associateEClass.getESuperTypes().add(this.getPerson());
		externalAdvisorEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(foPraEClass, FoPra.class, "FoPra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoPra_Title(), ecorePackage.getEString(), "title", null, 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoPra_Description(), ecorePackage.getEString(), "description", null, 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoPra_Status(), this.getStatus(), "status", null, 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoPra_MaxNumberOfStudents(), ecorePackage.getEInt(), "maxNumberOfStudents", "1", 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoPra_Start(), ecorePackage.getEDate(), "start", null, 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoPra_End(), ecorePackage.getEDate(), "end", null, 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPra_Students(), this.getStudent(), this.getStudent_Fopras(), "students", null, 1, -1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPra_Rg(), this.getResearchGroup(), this.getResearchGroup_Fopras(), "rg", null, 1, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPra_Supervisor(), this.getAssociate(), this.getAssociate_Fopras(), "supervisor", null, 0, 1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPra_Advisor(), this.getExternalAdvisor(), this.getExternalAdvisor_Fopras(), "advisor", null, 0, -1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPra_Auxiliaries(), this.getAuxiliary(), this.getAuxiliary_Fopras(), "auxiliaries", null, 1, -1, FoPra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foPraManagementSystemEClass, FoPraManagementSystem.class, "FoPraManagementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoPraManagementSystem_Fopras(), this.getFoPra(), null, "fopras", null, 0, -1, FoPraManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPraManagementSystem_Persons(), this.getPerson(), null, "persons", null, 0, -1, FoPraManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoPraManagementSystem_Auxiliaries(), this.getAuxiliary(), null, "auxiliaries", null, 0, -1, FoPraManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_Matrikel(), ecorePackage.getEString(), "matrikel", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Course(), this.getCourse(), "course", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Fopras(), this.getFoPra(), this.getFoPra_Students(), "fopras", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Forename(), ecorePackage.getEString(), "forename", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfessor_Rg(), this.getResearchGroup(), this.getResearchGroup_Professor(), "rg", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(researchGroupEClass, ResearchGroup.class, "ResearchGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResearchGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearchGroup_Fopras(), this.getFoPra(), this.getFoPra_Rg(), "fopras", null, 0, -1, ResearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearchGroup_Professor(), this.getProfessor(), this.getProfessor_Rg(), "professor", null, 1, 1, ResearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearchGroup_Associate(), this.getAssociate(), this.getAssociate_Rg(), "associate", null, 0, -1, ResearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associateEClass, Associate.class, "Associate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociate_Rg(), this.getResearchGroup(), this.getResearchGroup_Associate(), "rg", null, 1, 1, Associate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociate_Fopras(), this.getFoPra(), this.getFoPra_Supervisor(), "fopras", null, 0, -1, Associate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalAdvisorEClass, ExternalAdvisor.class, "ExternalAdvisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalAdvisor_Information(), ecorePackage.getEString(), "information", null, 0, 1, ExternalAdvisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalAdvisor_Fopras(), this.getFoPra(), this.getFoPra_Advisor(), "fopras", null, 0, -1, ExternalAdvisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auxiliaryEClass, Auxiliary.class, "Auxiliary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuxiliary_Description(), ecorePackage.getEString(), "description", null, 0, 1, Auxiliary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuxiliary_Kind(), this.getAuxiliaryKind(), "kind", null, 0, 1, Auxiliary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliary_Fopras(), this.getFoPra(), this.getFoPra_Auxiliaries(), "fopras", null, 0, -1, Auxiliary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.PENDING);
		addEEnumLiteral(statusEEnum, Status.INPROCESS);
		addEEnumLiteral(statusEEnum, Status.COMPLETED);
		addEEnumLiteral(statusEEnum, Status.CANCELLED);

		initEEnum(courseEEnum, Course.class, "Course");
		addEEnumLiteral(courseEEnum, Course.INFO_BSC);
		addEEnumLiteral(courseEEnum, Course.INFO_MSC);
		addEEnumLiteral(courseEEnum, Course.INFO_DIPLOM);
		addEEnumLiteral(courseEEnum, Course.INFO_MINOR_SUBJECT);
		addEEnumLiteral(courseEEnum, Course.INFO_POST_GRADUATE);

		initEEnum(auxiliaryKindEEnum, AuxiliaryKind.class, "AuxiliaryKind");
		addEEnumLiteral(auxiliaryKindEEnum, AuxiliaryKind.PROGRAMMING_LANGUAGE);
		addEEnumLiteral(auxiliaryKindEEnum, AuxiliaryKind.TOOL);
		addEEnumLiteral(auxiliaryKindEEnum, AuxiliaryKind.METHOD);

		// Create resource
		createResource(eNS_URI);
	}

} //FopramodelPackageImpl
