package Algorithms;

import java.util.List;

import Helpers.CollectionElementComparator;

public class InsertionSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		for (int index = 1; index < collectionToSort.size(); ++index) {
			for (int otherIndex = index; otherIndex > 0 && CollectionElementComparator
					.isFirstGreaterThanSecond(collectionToSort, otherIndex - 1, otherIndex); --otherIndex)
				swapElements(collectionToSort, otherIndex - 1, otherIndex);
		}

		return collectionToSort;
	}

	private void swapElements(List<Element> collection, int firstIdx, int secondIdx) {
		Element tmp = collection.get(firstIdx);
		collection.set(firstIdx, collection.get(secondIdx));
		collection.set(secondIdx, tmp);
	}
}
