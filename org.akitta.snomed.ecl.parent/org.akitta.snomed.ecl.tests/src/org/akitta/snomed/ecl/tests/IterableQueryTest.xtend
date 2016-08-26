package org.akitta.snomed.ecl.tests

import com.google.common.collect.Sets
import org.junit.Assert
import org.junit.Test
import com.google.common.collect.Lists
import org.akitta.snomed.ecl.evaluation.IterableQuery

/**
 * Some basic tests for {@link IterableQuery}.
 */
class IterableQueryTest {
	
	@Test
	def void andQuery_1() {
		newQuery(1, 2).and(newQuery(2, 3)).evaluate.assertEqualsContent(2);
	}
	
	@Test
	def void andQuery_2() {
		newQuery(1, 2, 3).and(newQuery(2, 3)).and(newQuery(3, 4)).assertEqualsContent(3);
	}

	@Test
	def void orQuery_1() {
		newQuery(1, 2).or(newQuery(3, 4)).or(newQuery(5, 6)).assertEqualsContent(1, 2, 3, 4, 5, 6);
	}
	
	@Test
	def void orQuery_2() {
		newQuery(1, 2).or(newQuery(2, 3)).or(newQuery(3, 4)).assertEqualsContent(1, 2, 3, 4);
	}
	
	@Test
	def void notQuery_1() {
		newQuery(1, 2, 3).not(newQuery(3, 4, 5)).assertEqualsContent(1, 2);
	}
	
	@Test
	def void notQuery_2() {
		newQuery(1, 2, 3).not(newQuery(2, 3)).not(newQuery(3, 4)).assertEqualsContent(1);
	}

	private def <T> assertEqualsContent(Iterable<T> actual, T first, T... rest) {
		assertEqualsContent(actual, Lists.asList(first, rest));
	}  
	
	private def <T> assertEqualsContent(Iterable<T> actual, Iterable<T> expected) {
		Assert.assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
	}  
	
	private def <T> newQuery(T first, T... rest) {
		new IterableQuery<T>(first, rest); 
	}
	
}