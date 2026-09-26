package project1_AlgorithmPerformance;

/**
 * MergeSort implementation for Programming Project 1. 
 * 
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 * 
 * Primary Author: Paulina Cruz
 */
public class MergeSort {
	
	private int comparisons; // Tracks the number of element-to-element comparisons made during sorting

	/**
	 * Sorts the given array using merge sort and returns the number of
	 * element-to-element comparisons performed.
	 * 
	 * @param array	the array to sort
	 * @return	the number of comparisons made during the sort
	 */
	public int sort(int[] array) {
		comparisons = 0;

		// Check for a null, empty, or single-element array (nothing to sort)
		if (array == null || array.length < 2) return comparisons;
		
		mergeSort(array, 0, array.length - 1);

		return comparisons;
	}

	/**
	 * Recursively divides the specified portion of the array into smaller halves
	 * until each section contains a single element, then merges the sections back
	 * together in sorted order. 
	 * 
	 * @param array	the array being sorted
	 * @param left	the starting index of the section to sort
	 * @param right	the ending index of the section to sort 
	 */
	private void mergeSort(int[] array, int left, int right) {
		if (left < right) { // Base case: only continue if more than one element
			int mid = left + (right - left) / 2;

			// Recursively sort the left and right halves
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			// Merge the sorted halves back together
			merge(array, left, mid, right);
		}
	}

	/**
	 * Merges two sorted sections of the array into one sorted section while
	 * counting the element-to-element comparisons made during the merge. 
	 * 
	 * @param array	the array containing the sections to merge
	 * @param left	the starting index of the left section
	 * @param mid	the ending index of the left section
	 * @param right	the ending index of the right section
	 */
	private void merge(int[] array, int left, int mid, int right) {
		// Calculate sizes of temporary arrays
		int leftSize = mid - left + 1;
		int rightSize = right - mid;

		// Create temporary arrays
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];

		// Copy elements into left temporary array
		for (int i = 0; i < leftSize; i++) {
			leftArray[i] = array[left + i];
		}

		// Copy elements into right temporary array
		for (int j = 0; j < rightSize; j++) {
			rightArray[j] = array[mid + 1 + j];
		}

		// Indexes for merging temporary arrays back into original array
		int i = 0;
		int j = 0;
		int k = left;

		// Compare elements and copy the smaller value into original array
		while (i < leftSize && j < rightSize) {
			comparisons++;

			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		// Copy remaining elements from left temporary array
		while (i < leftSize) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy remaining elements from right temporary array
		while (j < rightSize) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
