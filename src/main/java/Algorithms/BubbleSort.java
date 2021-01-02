package Algorithms;

import java.util.List;

import Helpers.CollectionElementComparator;
import Helpers.CollectionElementSwapper;

public class BubbleSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		for (int lastIndexToCheck = collectionToSort.size() - 1; lastIndexToCheck > 0; --lastIndexToCheck) {
			for (int index = 0; index < lastIndexToCheck; ++index) {
				if (CollectionElementComparator.isFirstGreaterThanSecond(collectionToSort, index, index + 1)) {
					CollectionElementSwapper.swap(collectionToSort, index, index + 1);
				}
			}
		}
		return collectionToSort;
	}
}
