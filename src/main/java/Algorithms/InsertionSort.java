package Algorithms;

import java.util.List;

import Helpers.CollectionElementComparator;
import Helpers.CollectionElementSwapper;

public class InsertionSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		for (int index = 1; index < collectionToSort.size(); ++index) {
			for (int otherIndex = index; otherIndex > 0 && CollectionElementComparator
					.isFirstGreaterThanSecond(collectionToSort, otherIndex - 1, otherIndex); --otherIndex) {
				CollectionElementSwapper.swap(collectionToSort, otherIndex - 1, otherIndex);
			}
		}

		return collectionToSort;
	}
}
