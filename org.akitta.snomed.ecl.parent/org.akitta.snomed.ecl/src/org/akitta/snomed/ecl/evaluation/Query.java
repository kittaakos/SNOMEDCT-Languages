package org.akitta.snomed.ecl.evaluation;

/**
 * Representation of query.
 *
 * @param <C>
 *            type of the query criteria.
 * @param <T>
 *            type of the result after the evaluation of the query.
 */
public interface Query<C, T> {

	/**
	 * Returns with a new query instance that represents the logical {@code AND}
	 * of the current query and the argument.
	 * 
	 * @param other
	 *            the other query.
	 * @return a new query instance as the logical AND of the current instance
	 *         and the argument.
	 */
	Query<C, T> and(Query<C, T> other);

	/**
	 * Returns with a new query representing the logical {@code OR} of this
	 * query and the argument.
	 * 
	 * @param other
	 *            the other query.
	 * @return a new query as the logical OR of this and the argument.
	 */
	Query<C, T> or(Query<C, T> other);

	/**
	 * Returns with a new query that is equivalent with this and NOT the
	 * argument.
	 * 
	 * @param other
	 *            the other query.
	 * @return a query that represents this but NOT the argument.
	 */
	Query<C, T> not(Query<C, T> other);

	/**
	 * Returns with the query criteria.
	 * 
	 * @return the query criteria itself.
	 */
	C getQueryConstraint();

	/**
	 * Evaluates the query and returns with the result.
	 * 
	 * @return the result of the query after evaluating it.
	 */
	T evaluate();

}
