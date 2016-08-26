package org.akitta.snomed.ecl.evaluation;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Iterator;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * A query implemented via an iterable.
 *
 * @param <T>
 *            the type of the elements in the iterable.
 * @see Query
 */
public class IterableQuery<T> implements Query<Iterable<T>, Iterable<T>>, Iterable<T> {

	private Iterable<? extends T> iterable;

	/**
	 * Creates a new query instance with an iterable of elements.
	 * 
	 * @param iterable
	 *            an iterable of elements.
	 */
	public IterableQuery(final Iterable<? extends T> iterable) {
		this.iterable = checkNotNull(iterable, "iterable");
	}

	/**
	 * Sugar for creating a new query instance.
	 * 
	 * @param first
	 *            the first item.
	 * @param rest
	 *            optional items to include in the query.
	 */
	@SafeVarargs
	public IterableQuery(final T first, final T... rest) {
		this(Lists.asList(checkNotNull(first, "first"), checkNotNull(rest, "rest")));
	}

	@Override
	public IterableQuery<T> and(final Query<Iterable<T>, Iterable<T>> other) {
		checkNotNull(other, "other");
		final Predicate<T> predicate = item -> Iterables.contains(other.evaluate(), item);
		return new IterableQuery<>(Iterables.filter(this, predicate));
	}

	@Override
	public IterableQuery<T> or(final Query<Iterable<T>, Iterable<T>> other) {
		checkNotNull(other, "other");
		return new IterableQuery<>(Iterables.concat(this, other.evaluate()));
	}

	@Override
	public IterableQuery<T> not(final Query<Iterable<T>, Iterable<T>> other) {
		checkNotNull(other, "other");
		final Predicate<T> predicate = item -> Iterables.contains(other.evaluate(), item);
		return new IterableQuery<>(Iterables.filter(this, Predicates.not(predicate)));
	}

	@Override
	public Iterable<T> getQueryConstraint() {
		return evaluate();
	}

	@Override
	@SuppressWarnings("unchecked")
	public Iterable<T> evaluate() {
		return (Iterable<T>) iterable;
	}

	@Override
	@SuppressWarnings("unchecked")
	public Iterator<T> iterator() {
		return (Iterator<T>) iterable.iterator();
	}

}
