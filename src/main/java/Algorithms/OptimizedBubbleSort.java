package Algorithms;

import java.util.List;

import Helpers.CollectionElementComparator;
import Helpers.CollectionElementSwapper;

public class OptimizedBubbleSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		boolean didSwap = false;
		for (int lastIndexToCheck = collectionToSort.size() - 1; lastIndexToCheck > 0; --lastIndexToCheck) {
			for (int index = 0; index < lastIndexToCheck; ++index) {
				if (CollectionElementComparator.isFirstGreaterThanSecond(collectionToSort, index, index + 1)) {
					CollectionElementSwapper.swap(collectionToSort, index, index + 1);
					didSwap = true;
				}
			}
			if (!didSwap) {
				break;
			}

		}
		return collectionToSort;
	}
}
