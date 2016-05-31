/**
 */
package org.akitta.snomed.ecl.model.ecl.impl;

import org.akitta.snomed.ecl.model.ecl.ConstraintOperator;
import org.akitta.snomed.ecl.model.ecl.EclPackage;
import org.akitta.snomed.ecl.model.ecl.FocusConcept;
import org.akitta.snomed.ecl.model.ecl.SimpleExpressionConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.SimpleExpressionConstraintImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.akitta.snomed.ecl.model.ecl.impl.SimpleExpressionConstraintImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleExpressionConstraintImpl extends ExpressionConstraintImpl implements SimpleExpressionConstraint {
	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintOperator OP_EDEFAULT = ConstraintOperator.SELF;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ConstraintOperator op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected FocusConcept concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleExpressionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclPackage.Literals.SIMPLE_EXPRESSION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintOperator getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(ConstraintOperator newOp) {
		ConstraintOperator oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FocusConcept getConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcept(FocusConcept newConcept, NotificationChain msgs) {
		FocusConcept oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT, oldConcept, newConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(FocusConcept newConcept) {
		if (newConcept != concept) {
			NotificationChain msgs = null;
			if (concept != null)
				msgs = ((InternalEObject)concept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT, null, msgs);
			if (newConcept != null)
				msgs = ((InternalEObject)newConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT, null, msgs);
			msgs = basicSetConcept(newConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT, newConcept, newConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT:
				return basicSetConcept(null, msgs);
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
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__OP:
				return getOp();
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT:
				return getConcept();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__OP:
				setOp((ConstraintOperator)newValue);
				return;
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT:
				setConcept((FocusConcept)newValue);
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
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__OP:
				setOp(OP_EDEFAULT);
				return;
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT:
				setConcept((FocusConcept)null);
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
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__OP:
				return op != OP_EDEFAULT;
			case EclPackage.SIMPLE_EXPRESSION_CONSTRAINT__CONCEPT:
				return concept != null;
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
		result.append(" (op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //SimpleExpressionConstraintImpl
