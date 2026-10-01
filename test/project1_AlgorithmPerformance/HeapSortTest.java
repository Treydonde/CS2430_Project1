package project1_AlgorithmPerformance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * HeapSortTest tests the HeapSort class to see if it passes the select tests.
 */
class HeapSortTest {

	private int[] arr1 = {4,56,74,32,57,232,6343,45,2,5,8,9,2,435};
	private int[] arr2 = {1,2,3,4,5,6,7,8,9};
	private int[] arr3 = {9,8,7,6,5,4,3,2,1};
	private int[] arr4 = {};
	
	
	@Test
	void nonSortedArray () {
		int[] expected = {2,2,4,5,8,9,32,45,56,57,74,232,435,6343};
		
		HeapSort heap = new HeapSort(arr1.clone());
		
		
		assertArrayEquals(expected, heap.getArr());
	}
	
	
	@Test
	void nonSortedArrayComparisonCount () {
		
		HeapSort heap = new HeapSort(arr1.clone());
		
		
		assertEquals(66, heap.getComparisonCount());
	}

	@Test
	void sortedArray() {
		
		HeapSort heap = new HeapSort(arr2.clone());
		
		
		assertArrayEquals(arr2, heap.getArr());
	}
	
	@Test
	void sortedArrayComparisonCount () {
		
		HeapSort heap = new HeapSort(arr2.clone());
		
		
		assertEquals(35, heap.getComparisonCount());
	}
	
	@Test
	void backwardsArray () {
		
		HeapSort heap = new HeapSort(arr3.clone());
		
		
		assertArrayEquals(arr2, heap.getArr());
	}
	
	@Test
	void backwardsArrayComparisonCount () {
		
		HeapSort heap = new HeapSort(arr3.clone());
		
		
		assertEquals(30, heap.getComparisonCount());
	}
	
	@Test
	void emptyArray () {
		
		HeapSort heap = new HeapSort(arr4.clone());
		
		
		assertArrayEquals(arr4, heap.getArr());
	}
	
	
	@Test
	void emptyArrayComparisonCount () {
		
		HeapSort heap = new HeapSort(arr4.clone());
		
		
		assertEquals(0, heap.getComparisonCount());
	}
}
