package Algorithms;

import java.util.List;

public class BubbleSort {
	public List<Integer> run(List<Integer> toSort) {
		for(int lastIndexToCheck = toSort.size() - 1; lastIndexToCheck > 0; --lastIndexToCheck)
			for(int index = 0; index < lastIndexToCheck; ++index)
				if(toSort.get(index) > toSort.get(index + 1))
					swapElements(toSort, index, index + 1);
		return toSort;
	}
	
	private void swapElements(List<Integer> collection, Integer firstIdx, Integer secondIdx) {
		Integer tmp = collection.get(firstIdx);
		collection.set(firstIdx, collection.get(secondIdx));
		collection.set(secondIdx, tmp);
	}
}
