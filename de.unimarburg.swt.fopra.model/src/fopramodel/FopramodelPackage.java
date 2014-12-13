/**
 */
package fopramodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fopramodel.FopramodelFactory
 * @model kind="package"
 * @generated
 */
public interface FopramodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fopramodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fopramodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fopramodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FopramodelPackage eINSTANCE = fopramodel.impl.FopramodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fopramodel.impl.FoPraImpl <em>Fo Pra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.FoPraImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getFoPra()
	 * @generated
	 */
	int FO_PRA = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Max Number Of Students</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__MAX_NUMBER_OF_STUDENTS = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__START = 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__END = 5;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__STUDENTS = 6;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__RG = 7;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__SUPERVISOR = 8;

	/**
	 * The feature id for the '<em><b>Advisor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__ADVISOR = 9;

	/**
	 * The feature id for the '<em><b>Auxiliaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA__AUXILIARIES = 10;

	/**
	 * The number of structural features of the '<em>Fo Pra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Fo Pra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.FoPraManagementSystemImpl <em>Fo Pra Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.FoPraManagementSystemImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getFoPraManagementSystem()
	 * @generated
	 */
	int FO_PRA_MANAGEMENT_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Fopras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_MANAGEMENT_SYSTEM__FOPRAS = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_MANAGEMENT_SYSTEM__PERSONS = 1;

	/**
	 * The feature id for the '<em><b>Auxiliaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES = 2;

	/**
	 * The number of structural features of the '<em>Fo Pra Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_MANAGEMENT_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fo Pra Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_PRA_MANAGEMENT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.PersonImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Forename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FORENAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.StudentImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Forename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FORENAME = PERSON__FORENAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__LASTNAME = PERSON__LASTNAME;

	/**
	 * The feature id for the '<em><b>Matrikel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRIKEL = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COURSE = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fopras</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FOPRAS = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.ProfessorImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 4;

	/**
	 * The feature id for the '<em><b>Forename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__FORENAME = PERSON__FORENAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__LASTNAME = PERSON__LASTNAME;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__RG = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.ResearchGroupImpl <em>Research Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.ResearchGroupImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getResearchGroup()
	 * @generated
	 */
	int RESEARCH_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fopras</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP__FOPRAS = 1;

	/**
	 * The feature id for the '<em><b>Professor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP__PROFESSOR = 2;

	/**
	 * The feature id for the '<em><b>Associate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP__ASSOCIATE = 3;

	/**
	 * The number of structural features of the '<em>Research Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Research Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.AssociateImpl <em>Associate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.AssociateImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getAssociate()
	 * @generated
	 */
	int ASSOCIATE = 6;

	/**
	 * The feature id for the '<em><b>Forename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE__FORENAME = PERSON__FORENAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE__LASTNAME = PERSON__LASTNAME;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE__RG = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fopras</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE__FOPRAS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Associate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Associate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.ExternalAdvisorImpl <em>External Advisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.ExternalAdvisorImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getExternalAdvisor()
	 * @generated
	 */
	int EXTERNAL_ADVISOR = 7;

	/**
	 * The feature id for the '<em><b>Forename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ADVISOR__FORENAME = PERSON__FORENAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ADVISOR__LASTNAME = PERSON__LASTNAME;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ADVISOR__INFORMATION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fopras</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ADVISOR__FOPRAS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Advisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ADVISOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Advisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ADVISOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fopramodel.impl.AuxiliaryImpl <em>Auxiliary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.impl.AuxiliaryImpl
	 * @see fopramodel.impl.FopramodelPackageImpl#getAuxiliary()
	 * @generated
	 */
	int AUXILIARY = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Fopras</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__FOPRAS = 2;

	/**
	 * The number of structural features of the '<em>Auxiliary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Auxiliary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fopramodel.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.Status
	 * @see fopramodel.impl.FopramodelPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 9;

	/**
	 * The meta object id for the '{@link fopramodel.Course <em>Course</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.Course
	 * @see fopramodel.impl.FopramodelPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 10;

	/**
	 * The meta object id for the '{@link fopramodel.AuxiliaryKind <em>Auxiliary Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fopramodel.AuxiliaryKind
	 * @see fopramodel.impl.FopramodelPackageImpl#getAuxiliaryKind()
	 * @generated
	 */
	int AUXILIARY_KIND = 11;


	/**
	 * Returns the meta object for class '{@link fopramodel.FoPra <em>Fo Pra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fo Pra</em>'.
	 * @see fopramodel.FoPra
	 * @generated
	 */
	EClass getFoPra();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.FoPra#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fopramodel.FoPra#getTitle()
	 * @see #getFoPra()
	 * @generated
	 */
	EAttribute getFoPra_Title();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.FoPra#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fopramodel.FoPra#getDescription()
	 * @see #getFoPra()
	 * @generated
	 */
	EAttribute getFoPra_Description();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.FoPra#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fopramodel.FoPra#getStatus()
	 * @see #getFoPra()
	 * @generated
	 */
	EAttribute getFoPra_Status();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.FoPra#getMaxNumberOfStudents <em>Max Number Of Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Students</em>'.
	 * @see fopramodel.FoPra#getMaxNumberOfStudents()
	 * @see #getFoPra()
	 * @generated
	 */
	EAttribute getFoPra_MaxNumberOfStudents();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.FoPra#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see fopramodel.FoPra#getStart()
	 * @see #getFoPra()
	 * @generated
	 */
	EAttribute getFoPra_Start();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.FoPra#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see fopramodel.FoPra#getEnd()
	 * @see #getFoPra()
	 * @generated
	 */
	EAttribute getFoPra_End();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.FoPra#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students</em>'.
	 * @see fopramodel.FoPra#getStudents()
	 * @see #getFoPra()
	 * @generated
	 */
	EReference getFoPra_Students();

	/**
	 * Returns the meta object for the reference '{@link fopramodel.FoPra#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rg</em>'.
	 * @see fopramodel.FoPra#getRg()
	 * @see #getFoPra()
	 * @generated
	 */
	EReference getFoPra_Rg();

	/**
	 * Returns the meta object for the reference '{@link fopramodel.FoPra#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see fopramodel.FoPra#getSupervisor()
	 * @see #getFoPra()
	 * @generated
	 */
	EReference getFoPra_Supervisor();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.FoPra#getAdvisor <em>Advisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Advisor</em>'.
	 * @see fopramodel.FoPra#getAdvisor()
	 * @see #getFoPra()
	 * @generated
	 */
	EReference getFoPra_Advisor();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.FoPra#getAuxiliaries <em>Auxiliaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliaries</em>'.
	 * @see fopramodel.FoPra#getAuxiliaries()
	 * @see #getFoPra()
	 * @generated
	 */
	EReference getFoPra_Auxiliaries();

	/**
	 * Returns the meta object for class '{@link fopramodel.FoPraManagementSystem <em>Fo Pra Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fo Pra Management System</em>'.
	 * @see fopramodel.FoPraManagementSystem
	 * @generated
	 */
	EClass getFoPraManagementSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fopramodel.FoPraManagementSystem#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fopras</em>'.
	 * @see fopramodel.FoPraManagementSystem#getFopras()
	 * @see #getFoPraManagementSystem()
	 * @generated
	 */
	EReference getFoPraManagementSystem_Fopras();

	/**
	 * Returns the meta object for the containment reference list '{@link fopramodel.FoPraManagementSystem#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see fopramodel.FoPraManagementSystem#getPersons()
	 * @see #getFoPraManagementSystem()
	 * @generated
	 */
	EReference getFoPraManagementSystem_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link fopramodel.FoPraManagementSystem#getAuxiliaries <em>Auxiliaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliaries</em>'.
	 * @see fopramodel.FoPraManagementSystem#getAuxiliaries()
	 * @see #getFoPraManagementSystem()
	 * @generated
	 */
	EReference getFoPraManagementSystem_Auxiliaries();

	/**
	 * Returns the meta object for class '{@link fopramodel.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see fopramodel.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.Student#getMatrikel <em>Matrikel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrikel</em>'.
	 * @see fopramodel.Student#getMatrikel()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Matrikel();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.Student#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see fopramodel.Student#getCourse()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Course();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.Student#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fopras</em>'.
	 * @see fopramodel.Student#getFopras()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Fopras();

	/**
	 * Returns the meta object for class '{@link fopramodel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see fopramodel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.Person#getForename <em>Forename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forename</em>'.
	 * @see fopramodel.Person#getForename()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Forename();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see fopramodel.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for class '{@link fopramodel.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see fopramodel.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the containment reference '{@link fopramodel.Professor#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rg</em>'.
	 * @see fopramodel.Professor#getRg()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Rg();

	/**
	 * Returns the meta object for class '{@link fopramodel.ResearchGroup <em>Research Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Group</em>'.
	 * @see fopramodel.ResearchGroup
	 * @generated
	 */
	EClass getResearchGroup();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.ResearchGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fopramodel.ResearchGroup#getName()
	 * @see #getResearchGroup()
	 * @generated
	 */
	EAttribute getResearchGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.ResearchGroup#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fopras</em>'.
	 * @see fopramodel.ResearchGroup#getFopras()
	 * @see #getResearchGroup()
	 * @generated
	 */
	EReference getResearchGroup_Fopras();

	/**
	 * Returns the meta object for the container reference '{@link fopramodel.ResearchGroup#getProfessor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Professor</em>'.
	 * @see fopramodel.ResearchGroup#getProfessor()
	 * @see #getResearchGroup()
	 * @generated
	 */
	EReference getResearchGroup_Professor();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.ResearchGroup#getAssociate <em>Associate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associate</em>'.
	 * @see fopramodel.ResearchGroup#getAssociate()
	 * @see #getResearchGroup()
	 * @generated
	 */
	EReference getResearchGroup_Associate();

	/**
	 * Returns the meta object for class '{@link fopramodel.Associate <em>Associate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associate</em>'.
	 * @see fopramodel.Associate
	 * @generated
	 */
	EClass getAssociate();

	/**
	 * Returns the meta object for the reference '{@link fopramodel.Associate#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rg</em>'.
	 * @see fopramodel.Associate#getRg()
	 * @see #getAssociate()
	 * @generated
	 */
	EReference getAssociate_Rg();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.Associate#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fopras</em>'.
	 * @see fopramodel.Associate#getFopras()
	 * @see #getAssociate()
	 * @generated
	 */
	EReference getAssociate_Fopras();

	/**
	 * Returns the meta object for class '{@link fopramodel.ExternalAdvisor <em>External Advisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Advisor</em>'.
	 * @see fopramodel.ExternalAdvisor
	 * @generated
	 */
	EClass getExternalAdvisor();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.ExternalAdvisor#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see fopramodel.ExternalAdvisor#getInformation()
	 * @see #getExternalAdvisor()
	 * @generated
	 */
	EAttribute getExternalAdvisor_Information();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.ExternalAdvisor#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fopras</em>'.
	 * @see fopramodel.ExternalAdvisor#getFopras()
	 * @see #getExternalAdvisor()
	 * @generated
	 */
	EReference getExternalAdvisor_Fopras();

	/**
	 * Returns the meta object for class '{@link fopramodel.Auxiliary <em>Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary</em>'.
	 * @see fopramodel.Auxiliary
	 * @generated
	 */
	EClass getAuxiliary();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.Auxiliary#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fopramodel.Auxiliary#getDescription()
	 * @see #getAuxiliary()
	 * @generated
	 */
	EAttribute getAuxiliary_Description();

	/**
	 * Returns the meta object for the attribute '{@link fopramodel.Auxiliary#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fopramodel.Auxiliary#getKind()
	 * @see #getAuxiliary()
	 * @generated
	 */
	EAttribute getAuxiliary_Kind();

	/**
	 * Returns the meta object for the reference list '{@link fopramodel.Auxiliary#getFopras <em>Fopras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fopras</em>'.
	 * @see fopramodel.Auxiliary#getFopras()
	 * @see #getAuxiliary()
	 * @generated
	 */
	EReference getAuxiliary_Fopras();

	/**
	 * Returns the meta object for enum '{@link fopramodel.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see fopramodel.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link fopramodel.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course</em>'.
	 * @see fopramodel.Course
	 * @generated
	 */
	EEnum getCourse();

	/**
	 * Returns the meta object for enum '{@link fopramodel.AuxiliaryKind <em>Auxiliary Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auxiliary Kind</em>'.
	 * @see fopramodel.AuxiliaryKind
	 * @generated
	 */
	EEnum getAuxiliaryKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FopramodelFactory getFopramodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fopramodel.impl.FoPraImpl <em>Fo Pra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.FoPraImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getFoPra()
		 * @generated
		 */
		EClass FO_PRA = eINSTANCE.getFoPra();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO_PRA__TITLE = eINSTANCE.getFoPra_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO_PRA__DESCRIPTION = eINSTANCE.getFoPra_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO_PRA__STATUS = eINSTANCE.getFoPra_Status();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Students</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO_PRA__MAX_NUMBER_OF_STUDENTS = eINSTANCE.getFoPra_MaxNumberOfStudents();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO_PRA__START = eINSTANCE.getFoPra_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO_PRA__END = eINSTANCE.getFoPra_End();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA__STUDENTS = eINSTANCE.getFoPra_Students();

		/**
		 * The meta object literal for the '<em><b>Rg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA__RG = eINSTANCE.getFoPra_Rg();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA__SUPERVISOR = eINSTANCE.getFoPra_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Advisor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA__ADVISOR = eINSTANCE.getFoPra_Advisor();

		/**
		 * The meta object literal for the '<em><b>Auxiliaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA__AUXILIARIES = eINSTANCE.getFoPra_Auxiliaries();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.FoPraManagementSystemImpl <em>Fo Pra Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.FoPraManagementSystemImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getFoPraManagementSystem()
		 * @generated
		 */
		EClass FO_PRA_MANAGEMENT_SYSTEM = eINSTANCE.getFoPraManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Fopras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA_MANAGEMENT_SYSTEM__FOPRAS = eINSTANCE.getFoPraManagementSystem_Fopras();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA_MANAGEMENT_SYSTEM__PERSONS = eINSTANCE.getFoPraManagementSystem_Persons();

		/**
		 * The meta object literal for the '<em><b>Auxiliaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_PRA_MANAGEMENT_SYSTEM__AUXILIARIES = eINSTANCE.getFoPraManagementSystem_Auxiliaries();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.StudentImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Matrikel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MATRIKEL = eINSTANCE.getStudent_Matrikel();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__COURSE = eINSTANCE.getStudent_Course();

		/**
		 * The meta object literal for the '<em><b>Fopras</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__FOPRAS = eINSTANCE.getStudent_Fopras();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.PersonImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Forename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FORENAME = eINSTANCE.getPerson_Forename();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.ProfessorImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Rg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__RG = eINSTANCE.getProfessor_Rg();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.ResearchGroupImpl <em>Research Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.ResearchGroupImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getResearchGroup()
		 * @generated
		 */
		EClass RESEARCH_GROUP = eINSTANCE.getResearchGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESEARCH_GROUP__NAME = eINSTANCE.getResearchGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Fopras</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCH_GROUP__FOPRAS = eINSTANCE.getResearchGroup_Fopras();

		/**
		 * The meta object literal for the '<em><b>Professor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCH_GROUP__PROFESSOR = eINSTANCE.getResearchGroup_Professor();

		/**
		 * The meta object literal for the '<em><b>Associate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCH_GROUP__ASSOCIATE = eINSTANCE.getResearchGroup_Associate();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.AssociateImpl <em>Associate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.AssociateImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getAssociate()
		 * @generated
		 */
		EClass ASSOCIATE = eINSTANCE.getAssociate();

		/**
		 * The meta object literal for the '<em><b>Rg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATE__RG = eINSTANCE.getAssociate_Rg();

		/**
		 * The meta object literal for the '<em><b>Fopras</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATE__FOPRAS = eINSTANCE.getAssociate_Fopras();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.ExternalAdvisorImpl <em>External Advisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.ExternalAdvisorImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getExternalAdvisor()
		 * @generated
		 */
		EClass EXTERNAL_ADVISOR = eINSTANCE.getExternalAdvisor();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ADVISOR__INFORMATION = eINSTANCE.getExternalAdvisor_Information();

		/**
		 * The meta object literal for the '<em><b>Fopras</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ADVISOR__FOPRAS = eINSTANCE.getExternalAdvisor_Fopras();

		/**
		 * The meta object literal for the '{@link fopramodel.impl.AuxiliaryImpl <em>Auxiliary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.impl.AuxiliaryImpl
		 * @see fopramodel.impl.FopramodelPackageImpl#getAuxiliary()
		 * @generated
		 */
		EClass AUXILIARY = eINSTANCE.getAuxiliary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY__DESCRIPTION = eINSTANCE.getAuxiliary_Description();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY__KIND = eINSTANCE.getAuxiliary_Kind();

		/**
		 * The meta object literal for the '<em><b>Fopras</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY__FOPRAS = eINSTANCE.getAuxiliary_Fopras();

		/**
		 * The meta object literal for the '{@link fopramodel.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.Status
		 * @see fopramodel.impl.FopramodelPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link fopramodel.Course <em>Course</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.Course
		 * @see fopramodel.impl.FopramodelPackageImpl#getCourse()
		 * @generated
		 */
		EEnum COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '{@link fopramodel.AuxiliaryKind <em>Auxiliary Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fopramodel.AuxiliaryKind
		 * @see fopramodel.impl.FopramodelPackageImpl#getAuxiliaryKind()
		 * @generated
		 */
		EEnum AUXILIARY_KIND = eINSTANCE.getAuxiliaryKind();

	}

} //FopramodelPackage
