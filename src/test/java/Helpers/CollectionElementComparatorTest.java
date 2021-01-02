package Helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;;

class CollectionElementComparatorTest {

	@Test
	void givenFirstElementSmallerThanSecondThenIsFirstLessThanSecondShouldReturnTrue() {
		List<Integer> collection = Arrays.asList(8, 100);
		assertThat(CollectionElementComparator.isFirstLessThanSecond(collection, 0, 1), is(true));
	}

	@Test
	void givenFirstElementBiggerThanSecondThenIsFirstLessThanSecondShouldReturnFalse() {
		List<Integer> collection = Arrays.asList(100, 8);
		assertThat(CollectionElementComparator.isFirstLessThanSecond(collection, 0, 1), is(false));
	}

	@Test
	void givenFirstElementSmallerThanSecondThenIsFirstMoreThanSecondShouldReturnFalse() {
		List<Integer> collection = Arrays.asList(8, 100);
		assertThat(CollectionElementComparator.isFirstGreaterThanSecond(collection, 0, 1), is(false));
	}

	@Test
	void givenFirstElementBiggerThanSecondThenIsFirstMoreThanSecondShouldReturnTrue() {
		List<Integer> collection = Arrays.asList(100, 8);
		assertThat(CollectionElementComparator.isFirstGreaterThanSecond(collection, 0, 1), is(true));
	}

}
