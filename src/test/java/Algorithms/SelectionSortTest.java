package Algorithms;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortTest {
    @Test public void givenEmptyCollectionThenShouldReturnEmptyCollection() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = new ArrayList<Integer>();
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, is(empty()));
    }
    
    @Test public void givenCollectionWithSingleElementThenShouldReturnCollectionSingleElement() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = Arrays.asList(8);
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, hasSize(1));
    }
    
    @Test public void givenCollectionWithSingleElementThenShouldReturnCollectionWithThatElement() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = Arrays.asList(8);
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, contains(8));
    }
    
    @Test public void givenCollectionWithTwoSortedElementsThenShouldReturnTwoElements() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = Arrays.asList(8, 12);
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, hasSize(2));
    }
    
    @Test public void givenCollectionWithTwoSortedElementsThenShouldReturnThoseElementsInOrder() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = Arrays.asList(8, 12);
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, contains(8, 12));
    }
    
    @Test public void givenCollectionWithTwoUnsortedElementsThenShouldReturnTwoElements() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = Arrays.asList(12, 8);
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, hasSize(2));
    }
    
    @Test public void givenCollectionWithTwoUnsortedElementsThenShouldReturnThoseElementsInOrder() {
    	SelectionSort<Integer> bubble = new SelectionSort<>();
    	List<Integer> inputToSort = Arrays.asList(12, 8);
    	List<Integer> output = bubble.run(inputToSort);
    	assertThat(output, contains(8, 12));
    }
}

