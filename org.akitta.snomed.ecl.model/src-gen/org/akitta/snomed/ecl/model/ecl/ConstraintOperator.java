/**
 */
package org.akitta.snomed.ecl.model.ecl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Enumeration of constraint operators.
 * <!-- end-model-doc -->
 * @see org.akitta.snomed.ecl.model.ecl.EclPackage#getConstraintOperator()
 * @model
 * @generated
 */
public enum ConstraintOperator implements Enumerator {
	/**
	 * The '<em><b>SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_VALUE
	 * @generated
	 * @ordered
	 */
	SELF(0, "SELF", "SELF"),

	/**
	 * The '<em><b>DESCENDANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT(0, "DESCENDANT", "DESCENDANT"),

	/**
	 * The '<em><b>DESCENDANT OR SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_OR_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT_OR_SELF(0, "DESCENDANT_OR_SELF", "DESCENDANT_OR_SELF"),

	/**
	 * The '<em><b>ANCESTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR(0, "ANCESTOR", "ANCESTOR"),

	/**
	 * The '<em><b>ANCESTOR OR SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_OR_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR_OR_SELF(0, "ANCESTOR_OR_SELF", "ANCESTOR_OR_SELF");

	/**
	 * The '<em><b>SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Self, if this is used, then it is not represented in the constraint. This is used by default.
	 * <!-- end-model-doc -->
	 * @see #SELF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELF_VALUE = 0;

	/**
	 * The '<em><b>DESCENDANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * All descendants of a concept.
	 * <!-- end-model-doc -->
	 * @see #DESCENDANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_VALUE = 0;

	/**
	 * The '<em><b>DESCENDANT OR SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The concept itself and all its descendants.
	 * <!-- end-model-doc -->
	 * @see #DESCENDANT_OR_SELF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_OR_SELF_VALUE = 0;

	/**
	 * The '<em><b>ANCESTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * All ancestors of a concept.
	 * <!-- end-model-doc -->
	 * @see #ANCESTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_VALUE = 0;

	/**
	 * The '<em><b>ANCESTOR OR SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The concept itself and its all ancestors.
	 * <!-- end-model-doc -->
	 * @see #ANCESTOR_OR_SELF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_OR_SELF_VALUE = 0;

	/**
	 * An array of all the '<em><b>Constraint Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintOperator[] VALUES_ARRAY =
		new ConstraintOperator[] {
			SELF,
			DESCENDANT,
			DESCENDANT_OR_SELF,
			ANCESTOR,
			ANCESTOR_OR_SELF,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConstraintOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintOperator get(int value) {
		switch (value) {
			case SELF_VALUE: return SELF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConstraintOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConstraintOperator
