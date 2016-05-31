/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.CompoundExpressionConstraint;
import org.akitta.snomed.ecl.model.ecl.EclPackage;
import org.akitta.snomed.ecl.model.ecl.ExpressionConstraint;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CompoundExpressionConstraintImpl extends CompoundElementImpl<ExpressionConstraint> implements CompoundExpressionConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundExpressionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.COMPOUND_EXPRESSION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeft(ExpressionConstraint newLeft, NotificationChain msgs) {
		return super.basicSetLeft(newLeft, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRight(ExpressionConstraint newRight, NotificationChain msgs) {
		return super.basicSetRight(newRight, msgs);
	}

} //CompoundExpressionConstraintImpl
