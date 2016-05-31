/**
 */
package org.akitta.snomed.ecl.model.ecl;

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
 * <!-- begin-model-doc -->
 * Meta-model for the SNOMED&nbsp;CT Expression Constraint Language.
 * This meta model contains high level, abstract AST elements that help traversing and
 * processing the AST. Also provides basic operations and properties to avoid boilerplate code.
 * 
 * @author akitta
 * <!-- end-model-doc -->
 * @see org.akitta.snomed.ecl.model.ecl.EclFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.akitta.snomed.ecl.model'"
 * @generated
 */
public interface EclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.akitta.snomed.ecl.model.ecl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclPackage eINSTANCE = org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ScriptImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AstElementImpl <em>Ast Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AstElementImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAstElement()
	 * @generated
	 */
	int AST_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Ast Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ast Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getExpressionConstraint()
	 * @generated
	 */
	int EXPRESSION_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONSTRAINT_FEATURE_COUNT = AST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONSTRAINT_OPERATION_COUNT = AST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ParenthesizedExpressionConstraintImpl <em>Parenthesized Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ParenthesizedExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getParenthesizedExpressionConstraint()
	 * @generated
	 */
	int PARENTHESIZED_EXPRESSION_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Current</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesized Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesized Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_CONSTRAINT_OPERATION_COUNT = EXPRESSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundElementImpl <em>Compound Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundElementImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundElement()
	 * @generated
	 */
	int COMPOUND_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__OP = AST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__LEFT = AST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__RIGHT = AST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compound Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT_FEATURE_COUNT = AST_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compound Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT_OPERATION_COUNT = AST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundExpressionConstraintImpl <em>Compound Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundExpressionConstraint()
	 * @generated
	 */
	int COMPOUND_EXPRESSION_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_EXPRESSION_CONSTRAINT__OP = COMPOUND_ELEMENT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_EXPRESSION_CONSTRAINT__LEFT = COMPOUND_ELEMENT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_EXPRESSION_CONSTRAINT__RIGHT = COMPOUND_ELEMENT__RIGHT;

	/**
	 * The number of structural features of the '<em>Compound Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_EXPRESSION_CONSTRAINT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compound Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_EXPRESSION_CONSTRAINT_OPERATION_COUNT = COMPOUND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConjunctionExpressionConstraintImpl <em>Conjunction Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ConjunctionExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConjunctionExpressionConstraint()
	 * @generated
	 */
	int CONJUNCTION_EXPRESSION_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_EXPRESSION_CONSTRAINT__OP = COMPOUND_EXPRESSION_CONSTRAINT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_EXPRESSION_CONSTRAINT__LEFT = COMPOUND_EXPRESSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_EXPRESSION_CONSTRAINT__RIGHT = COMPOUND_EXPRESSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Conjunction Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_EXPRESSION_CONSTRAINT_FEATURE_COUNT = COMPOUND_EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conjunction Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_EXPRESSION_CONSTRAINT_OPERATION_COUNT = COMPOUND_EXPRESSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.DisjunctionExpressionConstraintImpl <em>Disjunction Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.DisjunctionExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getDisjunctionExpressionConstraint()
	 * @generated
	 */
	int DISJUNCTION_EXPRESSION_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_EXPRESSION_CONSTRAINT__OP = COMPOUND_EXPRESSION_CONSTRAINT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_EXPRESSION_CONSTRAINT__LEFT = COMPOUND_EXPRESSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_EXPRESSION_CONSTRAINT__RIGHT = COMPOUND_EXPRESSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Disjunction Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_EXPRESSION_CONSTRAINT_FEATURE_COUNT = COMPOUND_EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disjunction Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_EXPRESSION_CONSTRAINT_OPERATION_COUNT = COMPOUND_EXPRESSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ExclusionExpressionConstraintImpl <em>Exclusion Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ExclusionExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getExclusionExpressionConstraint()
	 * @generated
	 */
	int EXCLUSION_EXPRESSION_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_EXPRESSION_CONSTRAINT__OP = COMPOUND_EXPRESSION_CONSTRAINT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_EXPRESSION_CONSTRAINT__LEFT = COMPOUND_EXPRESSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT = COMPOUND_EXPRESSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Exclusion Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_EXPRESSION_CONSTRAINT_FEATURE_COUNT = COMPOUND_EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusion Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_EXPRESSION_CONSTRAINT_OPERATION_COUNT = COMPOUND_EXPRESSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.RefinedExpressionConstraintImpl <em>Refined Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.RefinedExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getRefinedExpressionConstraint()
	 * @generated
	 */
	int REFINED_EXPRESSION_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_EXPRESSION_CONSTRAINT__TARGET = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_EXPRESSION_CONSTRAINT__REFINEMENT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refined Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refined Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_EXPRESSION_CONSTRAINT_OPERATION_COUNT = EXPRESSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.SimpleExpressionConstraintImpl <em>Simple Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.SimpleExpressionConstraintImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getSimpleExpressionConstraint()
	 * @generated
	 */
	int SIMPLE_EXPRESSION_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPRESSION_CONSTRAINT__OP = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPRESSION_CONSTRAINT_OPERATION_COUNT = EXPRESSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.RefinementImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 11;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = AST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = AST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundRefinementImpl <em>Compound Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundRefinementImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundRefinement()
	 * @generated
	 */
	int COMPOUND_REFINEMENT = 12;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REFINEMENT__OP = COMPOUND_ELEMENT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REFINEMENT__LEFT = COMPOUND_ELEMENT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REFINEMENT__RIGHT = COMPOUND_ELEMENT__RIGHT;

	/**
	 * The number of structural features of the '<em>Compound Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REFINEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compound Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REFINEMENT_OPERATION_COUNT = COMPOUND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConjunctionRefinementSetImpl <em>Conjunction Refinement Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ConjunctionRefinementSetImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConjunctionRefinementSet()
	 * @generated
	 */
	int CONJUNCTION_REFINEMENT_SET = 13;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_REFINEMENT_SET__OP = COMPOUND_REFINEMENT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_REFINEMENT_SET__LEFT = COMPOUND_REFINEMENT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_REFINEMENT_SET__RIGHT = COMPOUND_REFINEMENT__RIGHT;

	/**
	 * The number of structural features of the '<em>Conjunction Refinement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_REFINEMENT_SET_FEATURE_COUNT = COMPOUND_REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conjunction Refinement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_REFINEMENT_SET_OPERATION_COUNT = COMPOUND_REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.DisjunctionRefinementSetImpl <em>Disjunction Refinement Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.DisjunctionRefinementSetImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getDisjunctionRefinementSet()
	 * @generated
	 */
	int DISJUNCTION_REFINEMENT_SET = 14;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_REFINEMENT_SET__OP = COMPOUND_REFINEMENT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_REFINEMENT_SET__LEFT = COMPOUND_REFINEMENT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_REFINEMENT_SET__RIGHT = COMPOUND_REFINEMENT__RIGHT;

	/**
	 * The number of structural features of the '<em>Disjunction Refinement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_REFINEMENT_SET_FEATURE_COUNT = COMPOUND_REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disjunction Refinement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_REFINEMENT_SET_OPERATION_COUNT = COMPOUND_REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupRefinementImpl <em>Attribute Group Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupRefinementImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeGroupRefinement()
	 * @generated
	 */
	int ATTRIBUTE_GROUP_REFINEMENT = 15;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Group Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Group Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_REFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeSetRefinementImpl <em>Attribute Set Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeSetRefinementImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeSetRefinement()
	 * @generated
	 */
	int ATTRIBUTE_SET_REFINEMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Set Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Set Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_REFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeSetImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeSet()
	 * @generated
	 */
	int ATTRIBUTE_SET = 17;

	/**
	 * The number of structural features of the '<em>Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_FEATURE_COUNT = AST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_OPERATION_COUNT = AST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundAttributeSetImpl <em>Compound Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundAttributeSetImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundAttributeSet()
	 * @generated
	 */
	int COMPOUND_ATTRIBUTE_SET = 18;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ATTRIBUTE_SET__OP = COMPOUND_ELEMENT__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ATTRIBUTE_SET__LEFT = COMPOUND_ELEMENT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ATTRIBUTE_SET__RIGHT = COMPOUND_ELEMENT__RIGHT;

	/**
	 * The number of structural features of the '<em>Compound Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ATTRIBUTE_SET_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compound Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ATTRIBUTE_SET_OPERATION_COUNT = COMPOUND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConjunctionAttributeSetImpl <em>Conjunction Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ConjunctionAttributeSetImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConjunctionAttributeSet()
	 * @generated
	 */
	int CONJUNCTION_ATTRIBUTE_SET = 19;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_ATTRIBUTE_SET__OP = COMPOUND_ATTRIBUTE_SET__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_ATTRIBUTE_SET__LEFT = COMPOUND_ATTRIBUTE_SET__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_ATTRIBUTE_SET__RIGHT = COMPOUND_ATTRIBUTE_SET__RIGHT;

	/**
	 * The number of structural features of the '<em>Conjunction Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_ATTRIBUTE_SET_FEATURE_COUNT = COMPOUND_ATTRIBUTE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conjunction Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_ATTRIBUTE_SET_OPERATION_COUNT = COMPOUND_ATTRIBUTE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.DisjunctionAttributeSetImpl <em>Disjunction Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.DisjunctionAttributeSetImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getDisjunctionAttributeSet()
	 * @generated
	 */
	int DISJUNCTION_ATTRIBUTE_SET = 20;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_ATTRIBUTE_SET__OP = COMPOUND_ATTRIBUTE_SET__OP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_ATTRIBUTE_SET__LEFT = COMPOUND_ATTRIBUTE_SET__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_ATTRIBUTE_SET__RIGHT = COMPOUND_ATTRIBUTE_SET__RIGHT;

	/**
	 * The number of structural features of the '<em>Disjunction Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_ATTRIBUTE_SET_FEATURE_COUNT = COMPOUND_ATTRIBUTE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disjunction Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_ATTRIBUTE_SET_OPERATION_COUNT = COMPOUND_ATTRIBUTE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>Reversed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REVERSED = ATTRIBUTE_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__WILDCARD = ATTRIBUTE_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OP = ATTRIBUTE_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CARDINALITY = ATTRIBUTE_SET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concept Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONCEPT_REF = ATTRIBUTE_SET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = ATTRIBUTE_SET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_SET_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeValueImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__OP = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ExpressionValueImpl <em>Expression Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ExpressionValueImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getExpressionValue()
	 * @generated
	 */
	int EXPRESSION_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VALUE__OP = ATTRIBUTE_VALUE__OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VALUE__VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VALUE_OPERATION_COUNT = ATTRIBUTE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.NumericValueImpl <em>Numeric Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.NumericValueImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getNumericValue()
	 * @generated
	 */
	int NUMERIC_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE__OP = ATTRIBUTE_VALUE__OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE__VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_OPERATION_COUNT = ATTRIBUTE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.StringValueImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__OP = ATTRIBUTE_VALUE__OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = ATTRIBUTE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConceptReferenceImpl <em>Concept Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.ConceptReferenceImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConceptReference()
	 * @generated
	 */
	int CONCEPT_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE__TERM = 1;

	/**
	 * The number of structural features of the '<em>Concept Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concept Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl <em>Focus Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getFocusConcept()
	 * @generated
	 */
	int FOCUS_CONCEPT = 27;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_CONCEPT__MEMBER_OF = 0;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_CONCEPT__WILDCARD = 1;

	/**
	 * The feature id for the '<em><b>Concept Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_CONCEPT__CONCEPT_REF = 2;

	/**
	 * The number of structural features of the '<em>Focus Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_CONCEPT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Focus Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeGroup()
	 * @generated
	 */
	int ATTRIBUTE_GROUP = 28;

	/**
	 * The feature id for the '<em><b>Attribute Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ATTRIBUTE_SET = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.impl.CardinalityImpl
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 29;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__TO = 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MANY = 2;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.BinaryOperator
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 30;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.AttributeOperator <em>Attribute Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeOperator
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeOperator()
	 * @generated
	 */
	int ATTRIBUTE_OPERATOR = 31;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.ConstraintOperator <em>Constraint Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.ConstraintOperator
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConstraintOperator()
	 * @generated
	 */
	int CONSTRAINT_OPERATOR = 32;

	/**
	 * The meta object id for the '{@link org.akitta.snomed.ecl.model.ecl.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.akitta.snomed.ecl.model.ecl.ComparisonOperator
	 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 33;


	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.Script#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Script#getConstraint()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Constraint();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.AstElement <em>Ast Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ast Element</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AstElement
	 * @generated
	 */
	EClass getAstElement();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ExpressionConstraint <em>Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ExpressionConstraint
	 * @generated
	 */
	EClass getExpressionConstraint();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint <em>Parenthesized Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint
	 * @generated
	 */
	EClass getParenthesizedExpressionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ParenthesizedExpressionConstraint#getCurrent()
	 * @see #getParenthesizedExpressionConstraint()
	 * @generated
	 */
	EReference getParenthesizedExpressionConstraint_Current();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement <em>Compound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Element</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundElement
	 * @generated
	 */
	EClass getCompoundElement();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundElement#getOp()
	 * @see #getCompoundElement()
	 * @generated
	 */
	EAttribute getCompoundElement_Op();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundElement#getLeft()
	 * @see #getCompoundElement()
	 * @generated
	 */
	EReference getCompoundElement_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.CompoundElement#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundElement#getRight()
	 * @see #getCompoundElement()
	 * @generated
	 */
	EReference getCompoundElement_Right();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.CompoundExpressionConstraint <em>Compound Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundExpressionConstraint
	 * @generated
	 */
	EClass getCompoundExpressionConstraint();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ConjunctionExpressionConstraint <em>Conjunction Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConjunctionExpressionConstraint
	 * @generated
	 */
	EClass getConjunctionExpressionConstraint();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.DisjunctionExpressionConstraint <em>Disjunction Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.DisjunctionExpressionConstraint
	 * @generated
	 */
	EClass getDisjunctionExpressionConstraint();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ExclusionExpressionConstraint <em>Exclusion Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ExclusionExpressionConstraint
	 * @generated
	 */
	EClass getExclusionExpressionConstraint();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint <em>Refined Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint
	 * @generated
	 */
	EClass getRefinedExpressionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getTarget()
	 * @see #getRefinedExpressionConstraint()
	 * @generated
	 */
	EReference getRefinedExpressionConstraint_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refinement</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.RefinedExpressionConstraint#getRefinement()
	 * @see #getRefinedExpressionConstraint()
	 * @generated
	 */
	EReference getRefinedExpressionConstraint_Refinement();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint <em>Simple Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Expression Constraint</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint
	 * @generated
	 */
	EClass getSimpleExpressionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getOp()
	 * @see #getSimpleExpressionConstraint()
	 * @generated
	 */
	EAttribute getSimpleExpressionConstraint_Op();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concept</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint#getConcept()
	 * @see #getSimpleExpressionConstraint()
	 * @generated
	 */
	EReference getSimpleExpressionConstraint_Concept();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.CompoundRefinement <em>Compound Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Refinement</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundRefinement
	 * @generated
	 */
	EClass getCompoundRefinement();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ConjunctionRefinementSet <em>Conjunction Refinement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction Refinement Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConjunctionRefinementSet
	 * @generated
	 */
	EClass getConjunctionRefinementSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.DisjunctionRefinementSet <em>Disjunction Refinement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction Refinement Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.DisjunctionRefinementSet
	 * @generated
	 */
	EClass getDisjunctionRefinementSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement <em>Attribute Group Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Group Refinement</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement
	 * @generated
	 */
	EClass getAttributeGroupRefinement();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Group</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroupRefinement#getAttributeGroup()
	 * @see #getAttributeGroupRefinement()
	 * @generated
	 */
	EReference getAttributeGroupRefinement_AttributeGroup();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement <em>Attribute Set Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Set Refinement</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement
	 * @generated
	 */
	EClass getAttributeSetRefinement();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement#getAttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeSetRefinement#getAttributeSet()
	 * @see #getAttributeSetRefinement()
	 * @generated
	 */
	EReference getAttributeSetRefinement_AttributeSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.AttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeSet
	 * @generated
	 */
	EClass getAttributeSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.CompoundAttributeSet <em>Compound Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Attribute Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.CompoundAttributeSet
	 * @generated
	 */
	EClass getCompoundAttributeSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ConjunctionAttributeSet <em>Conjunction Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction Attribute Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConjunctionAttributeSet
	 * @generated
	 */
	EClass getConjunctionAttributeSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.DisjunctionAttributeSet <em>Disjunction Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction Attribute Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.DisjunctionAttributeSet
	 * @generated
	 */
	EClass getDisjunctionAttributeSet();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.Attribute#isReversed <em>Reversed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversed</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute#isReversed()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Reversed();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.Attribute#isWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildcard</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute#isWildcard()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Wildcard();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute#getOp()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Op();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute#getCardinality()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getConceptRef <em>Concept Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concept Ref</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute#getConceptRef()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ConceptRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.AttributeValue#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeValue#getOp()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Op();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ExpressionValue
	 * @generated
	 */
	EClass getExpressionValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.ExpressionValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ExpressionValue#getValue()
	 * @see #getExpressionValue()
	 * @generated
	 */
	EReference getExpressionValue_Value();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.NumericValue
	 * @generated
	 */
	EClass getNumericValue();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.NumericValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.NumericValue#getValue()
	 * @see #getNumericValue()
	 * @generated
	 */
	EAttribute getNumericValue_Value();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.ConceptReference <em>Concept Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Reference</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConceptReference
	 * @generated
	 */
	EClass getConceptReference();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.ConceptReference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConceptReference#getId()
	 * @see #getConceptReference()
	 * @generated
	 */
	EAttribute getConceptReference_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.ConceptReference#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConceptReference#getTerm()
	 * @see #getConceptReference()
	 * @generated
	 */
	EAttribute getConceptReference_Term();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept <em>Focus Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus Concept</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.FocusConcept
	 * @generated
	 */
	EClass getFocusConcept();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#isMemberOf <em>Member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Of</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.FocusConcept#isMemberOf()
	 * @see #getFocusConcept()
	 * @generated
	 */
	EAttribute getFocusConcept_MemberOf();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#isWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildcard</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.FocusConcept#isWildcard()
	 * @see #getFocusConcept()
	 * @generated
	 */
	EAttribute getFocusConcept_Wildcard();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.FocusConcept#getConceptRef <em>Concept Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concept Ref</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.FocusConcept#getConceptRef()
	 * @see #getFocusConcept()
	 * @generated
	 */
	EReference getFocusConcept_ConceptRef();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Group</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroup
	 * @generated
	 */
	EClass getAttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup#getAttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Set</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroup#getAttributeSet()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AttributeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.akitta.snomed.ecl.model.ecl.AttributeGroup#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeGroup#getCardinality()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.akitta.snomed.ecl.model.ecl.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.Cardinality#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Cardinality#getFrom()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_From();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.Cardinality#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Cardinality#getTo()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_To();

	/**
	 * Returns the meta object for the attribute '{@link org.akitta.snomed.ecl.model.ecl.Cardinality#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.Cardinality#isMany()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Many();

	/**
	 * Returns the meta object for enum '{@link org.akitta.snomed.ecl.model.ecl.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.akitta.snomed.ecl.model.ecl.AttributeOperator <em>Attribute Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Operator</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.AttributeOperator
	 * @generated
	 */
	EEnum getAttributeOperator();

	/**
	 * Returns the meta object for enum '{@link org.akitta.snomed.ecl.model.ecl.ConstraintOperator <em>Constraint Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Operator</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ConstraintOperator
	 * @generated
	 */
	EEnum getConstraintOperator();

	/**
	 * Returns the meta object for enum '{@link org.akitta.snomed.ecl.model.ecl.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see org.akitta.snomed.ecl.model.ecl.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EclFactory getEclFactory();

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
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ScriptImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__CONSTRAINT = eINSTANCE.getScript_Constraint();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AstElementImpl <em>Ast Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AstElementImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAstElement()
		 * @generated
		 */
		EClass AST_ELEMENT = eINSTANCE.getAstElement();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getExpressionConstraint()
		 * @generated
		 */
		EClass EXPRESSION_CONSTRAINT = eINSTANCE.getExpressionConstraint();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ParenthesizedExpressionConstraintImpl <em>Parenthesized Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ParenthesizedExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getParenthesizedExpressionConstraint()
		 * @generated
		 */
		EClass PARENTHESIZED_EXPRESSION_CONSTRAINT = eINSTANCE.getParenthesizedExpressionConstraint();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_EXPRESSION_CONSTRAINT__CURRENT = eINSTANCE.getParenthesizedExpressionConstraint_Current();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundElementImpl <em>Compound Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundElementImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundElement()
		 * @generated
		 */
		EClass COMPOUND_ELEMENT = eINSTANCE.getCompoundElement();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_ELEMENT__OP = eINSTANCE.getCompoundElement_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ELEMENT__LEFT = eINSTANCE.getCompoundElement_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ELEMENT__RIGHT = eINSTANCE.getCompoundElement_Right();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundExpressionConstraintImpl <em>Compound Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundExpressionConstraint()
		 * @generated
		 */
		EClass COMPOUND_EXPRESSION_CONSTRAINT = eINSTANCE.getCompoundExpressionConstraint();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConjunctionExpressionConstraintImpl <em>Conjunction Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ConjunctionExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConjunctionExpressionConstraint()
		 * @generated
		 */
		EClass CONJUNCTION_EXPRESSION_CONSTRAINT = eINSTANCE.getConjunctionExpressionConstraint();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.DisjunctionExpressionConstraintImpl <em>Disjunction Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.DisjunctionExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getDisjunctionExpressionConstraint()
		 * @generated
		 */
		EClass DISJUNCTION_EXPRESSION_CONSTRAINT = eINSTANCE.getDisjunctionExpressionConstraint();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ExclusionExpressionConstraintImpl <em>Exclusion Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ExclusionExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getExclusionExpressionConstraint()
		 * @generated
		 */
		EClass EXCLUSION_EXPRESSION_CONSTRAINT = eINSTANCE.getExclusionExpressionConstraint();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.RefinedExpressionConstraintImpl <em>Refined Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.RefinedExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getRefinedExpressionConstraint()
		 * @generated
		 */
		EClass REFINED_EXPRESSION_CONSTRAINT = eINSTANCE.getRefinedExpressionConstraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_EXPRESSION_CONSTRAINT__TARGET = eINSTANCE.getRefinedExpressionConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_EXPRESSION_CONSTRAINT__REFINEMENT = eINSTANCE.getRefinedExpressionConstraint_Refinement();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.SimpleExpressionConstraintImpl <em>Simple Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.SimpleExpressionConstraintImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getSimpleExpressionConstraint()
		 * @generated
		 */
		EClass SIMPLE_EXPRESSION_CONSTRAINT = eINSTANCE.getSimpleExpressionConstraint();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_EXPRESSION_CONSTRAINT__OP = eINSTANCE.getSimpleExpressionConstraint_Op();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT = eINSTANCE.getSimpleExpressionConstraint_Concept();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.RefinementImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundRefinementImpl <em>Compound Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundRefinementImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundRefinement()
		 * @generated
		 */
		EClass COMPOUND_REFINEMENT = eINSTANCE.getCompoundRefinement();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConjunctionRefinementSetImpl <em>Conjunction Refinement Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ConjunctionRefinementSetImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConjunctionRefinementSet()
		 * @generated
		 */
		EClass CONJUNCTION_REFINEMENT_SET = eINSTANCE.getConjunctionRefinementSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.DisjunctionRefinementSetImpl <em>Disjunction Refinement Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.DisjunctionRefinementSetImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getDisjunctionRefinementSet()
		 * @generated
		 */
		EClass DISJUNCTION_REFINEMENT_SET = eINSTANCE.getDisjunctionRefinementSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupRefinementImpl <em>Attribute Group Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupRefinementImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeGroupRefinement()
		 * @generated
		 */
		EClass ATTRIBUTE_GROUP_REFINEMENT = eINSTANCE.getAttributeGroupRefinement();

		/**
		 * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_GROUP_REFINEMENT__ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroupRefinement_AttributeGroup();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeSetRefinementImpl <em>Attribute Set Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeSetRefinementImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeSetRefinement()
		 * @generated
		 */
		EClass ATTRIBUTE_SET_REFINEMENT = eINSTANCE.getAttributeSetRefinement();

		/**
		 * The meta object literal for the '<em><b>Attribute Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SET_REFINEMENT__ATTRIBUTE_SET = eINSTANCE.getAttributeSetRefinement_AttributeSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeSetImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeSet()
		 * @generated
		 */
		EClass ATTRIBUTE_SET = eINSTANCE.getAttributeSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CompoundAttributeSetImpl <em>Compound Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.CompoundAttributeSetImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCompoundAttributeSet()
		 * @generated
		 */
		EClass COMPOUND_ATTRIBUTE_SET = eINSTANCE.getCompoundAttributeSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConjunctionAttributeSetImpl <em>Conjunction Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ConjunctionAttributeSetImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConjunctionAttributeSet()
		 * @generated
		 */
		EClass CONJUNCTION_ATTRIBUTE_SET = eINSTANCE.getConjunctionAttributeSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.DisjunctionAttributeSetImpl <em>Disjunction Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.DisjunctionAttributeSetImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getDisjunctionAttributeSet()
		 * @generated
		 */
		EClass DISJUNCTION_ATTRIBUTE_SET = eINSTANCE.getDisjunctionAttributeSet();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Reversed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REVERSED = eINSTANCE.getAttribute_Reversed();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__WILDCARD = eINSTANCE.getAttribute_Wildcard();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__OP = eINSTANCE.getAttribute_Op();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CARDINALITY = eINSTANCE.getAttribute_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Concept Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONCEPT_REF = eINSTANCE.getAttribute_ConceptRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeValueImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__OP = eINSTANCE.getAttributeValue_Op();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ExpressionValueImpl <em>Expression Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ExpressionValueImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getExpressionValue()
		 * @generated
		 */
		EClass EXPRESSION_VALUE = eINSTANCE.getExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_VALUE__VALUE = eINSTANCE.getExpressionValue_Value();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.NumericValueImpl <em>Numeric Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.NumericValueImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getNumericValue()
		 * @generated
		 */
		EClass NUMERIC_VALUE = eINSTANCE.getNumericValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_VALUE__VALUE = eINSTANCE.getNumericValue_Value();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.StringValueImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.ConceptReferenceImpl <em>Concept Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.ConceptReferenceImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConceptReference()
		 * @generated
		 */
		EClass CONCEPT_REFERENCE = eINSTANCE.getConceptReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_REFERENCE__ID = eINSTANCE.getConceptReference_Id();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_REFERENCE__TERM = eINSTANCE.getConceptReference_Term();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl <em>Focus Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.FocusConceptImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getFocusConcept()
		 * @generated
		 */
		EClass FOCUS_CONCEPT = eINSTANCE.getFocusConcept();

		/**
		 * The meta object literal for the '<em><b>Member Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS_CONCEPT__MEMBER_OF = eINSTANCE.getFocusConcept_MemberOf();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS_CONCEPT__WILDCARD = eINSTANCE.getFocusConcept_Wildcard();

		/**
		 * The meta object literal for the '<em><b>Concept Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOCUS_CONCEPT__CONCEPT_REF = eINSTANCE.getFocusConcept_ConceptRef();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.AttributeGroupImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeGroup()
		 * @generated
		 */
		EClass ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Attribute Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_GROUP__ATTRIBUTE_SET = eINSTANCE.getAttributeGroup_AttributeSet();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_GROUP__CARDINALITY = eINSTANCE.getAttributeGroup_Cardinality();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.impl.CardinalityImpl
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__FROM = eINSTANCE.getCardinality_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__TO = eINSTANCE.getCardinality_To();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MANY = eINSTANCE.getCardinality_Many();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.BinaryOperator
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.AttributeOperator <em>Attribute Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.AttributeOperator
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getAttributeOperator()
		 * @generated
		 */
		EEnum ATTRIBUTE_OPERATOR = eINSTANCE.getAttributeOperator();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.ConstraintOperator <em>Constraint Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.ConstraintOperator
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getConstraintOperator()
		 * @generated
		 */
		EEnum CONSTRAINT_OPERATOR = eINSTANCE.getConstraintOperator();

		/**
		 * The meta object literal for the '{@link org.akitta.snomed.ecl.model.ecl.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.akitta.snomed.ecl.model.ecl.ComparisonOperator
		 * @see org.akitta.snomed.ecl.model.ecl.impl.EclPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //EclPackage
