package Algorithms;

import java.util.List;

import Helpers.CollectionElementComparator;

public class OptimizedBubbleSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		boolean didSwap = false;
		for (int lastIndexToCheck = collectionToSort.size() - 1; lastIndexToCheck > 0; --lastIndexToCheck) {
			for (int index = 0; index < lastIndexToCheck; ++index)
				if (CollectionElementComparator.isFirstGreaterThanSecond(collectionToSort, index, index + 1)) {
					swapElements(collectionToSort, index, index + 1);
					didSwap = true;
				}
			if (!didSwap)
				break;

		}
		return collectionToSort;
	}

	private void swapElements(List<Element> collection, int firstIdx, int secondIdx) {
		Element tmp = collection.get(firstIdx);
		collection.set(firstIdx, collection.get(secondIdx));
		collection.set(secondIdx, tmp);
	}
}
