package Algorithms;

import java.util.List;

public class SelectionSort<Element extends Comparable<Element>> {

	public List<Element> run(List<Element> collectionToSort) {
		for(int index = 0; index < collectionToSort.size() - 1; ++index)
		{
			int minIndex = index;
			for(int nextIndex = index + 1; nextIndex < collectionToSort.size(); ++nextIndex)
			{
				if(collectionToSort.get(nextIndex).compareTo(collectionToSort.get(minIndex)) < 0)
					minIndex = nextIndex;
			}
			swapElements(collectionToSort, index, minIndex);
		}
		return collectionToSort;
	}
	
	private void swapElements(List<Element> collection, int firstIdx, int secondIdx) {
		Element tmp = collection.get(firstIdx);
		collection.set(firstIdx, collection.get(secondIdx));
		collection.set(secondIdx, tmp);
	}
}
