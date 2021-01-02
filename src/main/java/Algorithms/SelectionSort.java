package Algorithms;

import java.util.List;

import Helpers.CollectionElementComparator;
import Helpers.CollectionElementSwapper;

public class SelectionSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		for (int index = 0; index < collectionToSort.size() - 1; ++index) {
			int minIndex = index;
			for (int nextIndex = index + 1; nextIndex < collectionToSort.size(); ++nextIndex) {

				if (CollectionElementComparator.isFirstLessThanSecond(collectionToSort, nextIndex, minIndex)) {
					minIndex = nextIndex;
				}
			}
			CollectionElementSwapper.swap(collectionToSort, index, minIndex);
		}
		return collectionToSort;
	}
}
