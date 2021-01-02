package Helpers;

import java.util.List;

public class CollectionElementSwapper {
	public static <Element extends Comparable<Element>> void swap(List<Element> collection, int firstIdx,
			int secondIdx) {
		Element tmp = collection.get(firstIdx);
		collection.set(firstIdx, collection.get(secondIdx));
		collection.set(secondIdx, tmp);
	}

}
