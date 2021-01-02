package Helpers;

import java.util.List;

public class CollectionElementComparator {
	public static <Element extends Comparable<Element>> boolean isFirstLessThanSecond(List<Element> collectionToSort,
			int firstIdx, int secondIdx) {
		return collectionToSort.get(firstIdx).compareTo(collectionToSort.get(secondIdx)) < 0;
	}

	public static <Element extends Comparable<Element>> boolean isFirstGreaterThanSecond(List<Element> collectionToSort,
			int firstIdx, int secondIdx) {
		return collectionToSort.get(firstIdx).compareTo(collectionToSort.get(secondIdx)) > 0;
	}
}
