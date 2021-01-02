package Helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class CollectionElementSwapperTest {

	@Test
	void givenCollectionWithTwoElementsThenShouldReturnCollectionWithSwappedElements() {
		List<Integer> collection = Arrays.asList(8, 100);
		CollectionElementSwapper.swap(collection, 0, 1);
		assertThat(collection, contains(100, 8));
	}

}
