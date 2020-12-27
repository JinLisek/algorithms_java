package Algorithms;

import java.util.List;

public class BubbleSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		for(int lastIndexToCheck = collectionToSort.size() - 1; lastIndexToCheck > 0; --lastIndexToCheck)
			for(int index = 0; index < lastIndexToCheck; ++index)
				if(collectionToSort.get(index).compareTo(collectionToSort.get(index + 1)) > 0)
					swapElements(collectionToSort, index, index + 1);
		return collectionToSort;
	}
	
	private void swapElements(List<Element> collection, int firstIdx, int secondIdx) {
		Element tmp = collection.get(firstIdx);
		collection.set(firstIdx, collection.get(secondIdx));
		collection.set(secondIdx, tmp);
	}
}
