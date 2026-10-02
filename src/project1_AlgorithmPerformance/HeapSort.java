package project1_AlgorithmPerformance;

/**
 * HeapSort implements the Heap sort algorithm to sort an array. It has 4
 * methods two of them are public and another two is private there is also a
 * constructor that calls one of the two methods. The public methods are
 * getComparisonCount and getArr which gets the comparison count and the other
 * is to get the sorted array. The private methods are sort and heapify. The
 * sort method sorts the array given and it does that by the help of the heapify
 * method that it calls a few times to help sort.
 *
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 *
 * @author Benjamin Shaw
 */
public class HeapSort {

	private int arr[];
	private int comparisonCount;

	/**
	 * HeapSort is the constructor that hands off the array that is given to be
	 * sorted it then assigns that sorted array to this arr value
	 * 
	 * @param arr the array given
	 */
	public HeapSort(int[] arr) {
		this.arr = sort(arr);
	}

	/**
	 * returns the comparison count
	 * 
	 * @return comparisonCount
	 */
	public int getComparisonCount() {
		return comparisonCount;
	}

	/**
	 * returns the sorted array
	 * 
	 * @return arr
	 */
	public int[] getArr() {
		return arr;
	}

	/*
	 * the sort function takes in the parameter of a which is an array and follows
	 * through with the Heap sort algorithm
	 */
	private int[] sort(int[] arr) {

		// Getting the size of the array.
		int sortedSize = arr.length;

		// Build heap (rearrange vector)
		for (int i = sortedSize / 2 - 1; i >= 0; i--) {
			heapify(arr, sortedSize, i);
		}

		// One by one extract an element from heap
		for (int i = sortedSize - 1; i > 0; i--) {

			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Call max heapify on the reduced heap
			heapify(arr, i, 0);
		}

		return arr;
	}

	/**
	 * heapify makes the given array into a heap.
	 * 
	 * @param arr the array
	 * @param n   array length
	 * @param index   what part of the array we are in
	 */
	private void heapify(int[] arr, int n, int index) {
		// The largest is the current index.
		int largest = index;

		// Finding the left index.
		int left = 2 * index + 1;

		// Finding the right index.
		int right = 2 * index + 2;

		// If left child is larger than root
		if (left < n) {
			comparisonCount++; // actual comparison
			if (arr[left] > arr[largest]) {
				largest = left;
			}
		}

		// If right child is larger than largest so far
		if (right < n) {
			comparisonCount++; // actual comparison
			if (arr[right] > arr[largest]) {
				largest = right;
			}
		}

		// If largest is not root
		if (largest != index) {
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}
}