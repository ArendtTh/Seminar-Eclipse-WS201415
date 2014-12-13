/**
 */
package fopramodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fopramodel.FopramodelPackage
 * @generated
 */
public interface FopramodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FopramodelFactory eINSTANCE = fopramodel.impl.FopramodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fo Pra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fo Pra</em>'.
	 * @generated
	 */
	FoPra createFoPra();

	/**
	 * Returns a new object of class '<em>Fo Pra Management System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fo Pra Management System</em>'.
	 * @generated
	 */
	FoPraManagementSystem createFoPraManagementSystem();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Research Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Group</em>'.
	 * @generated
	 */
	ResearchGroup createResearchGroup();

	/**
	 * Returns a new object of class '<em>Associate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associate</em>'.
	 * @generated
	 */
	Associate createAssociate();

	/**
	 * Returns a new object of class '<em>External Advisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Advisor</em>'.
	 * @generated
	 */
	ExternalAdvisor createExternalAdvisor();

	/**
	 * Returns a new object of class '<em>Auxiliary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auxiliary</em>'.
	 * @generated
	 */
	Auxiliary createAuxiliary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FopramodelPackage getFopramodelPackage();

} //FopramodelFactory
