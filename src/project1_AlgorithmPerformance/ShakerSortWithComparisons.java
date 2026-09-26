package project1_AlgorithmPerformance;

/**
 * ShakerSort implementation for Programming Project 1.
 *
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 * Primary Author: Camilla Feitosa Nunes
 */
public class ShakerSortWithComparisons {

	private int comparisons; // Tracks the number of element-to-element comparisons made during sorting

	/**
	 * Sorts the given array using shaker sort and returns the number of
	 * element-to-element comparisons performed.
	 *
	 * @param array the array to sort
	 * @return the number of comparisons made during the sort
	 */
	
	public int sort(int[] array) {
		comparisons = 0;

		// Check for a null, empty, or single-element array (nothing to sort)
		if (array == null || array.length < 2) return comparisons;

		boolean swapped = true;
		int start = 0;
		int end = array.length;

		while (swapped) {
			swapped = false;

			// Move through the array from left to right
			for (int i = start; i < end - 1; i++) {
				comparisons++;

				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

					swapped = true;
				}
			}

			// If no swaps were made, the array is already sorted
			if (!swapped) break;

			swapped = false;

			// The last element is now in the correct position
			end--;

			// Move through the array from right to left
			for (int i = end - 1; i >= start; i--) {
				comparisons++;

				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

					swapped = true;
				}
			}

			// The first element is now in the correct position
			start++;
		}

		return comparisons;
	}
}