package project1_AlgorithmPerformance;

/**
 * QuickSort implementation for Programming Project 1.
 *
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 * Primary Author: Paulina Cruz
 */
public class QuickSort {

	private int comparisons; // Tracks the number of element-to-element comparisons made during sorting

	/**
	 * Sorts the given array using quick sort and returns the number of
	 * element-to-element comparisons performed.
	 * 
	 * @param array the array to sort
	 * @return the number of comparisons made during the sort
	 */
	public int sort(int[] array) {
		comparisons = 0;

		// Check for a null, empty, or single-element array (nothing to sort)
		if (array == null || array.length < 2) return comparisons;

		quickSort(array, 0, array.length - 1);

		return comparisons;
	}

	/**
	 * Recursively sorts the specified portion of the array by partitioning
	 * around a pivot and sorting the sections on each side of the pivot.
	 * 
	 * @param array the array being sorted
	 * @param lowIndex the starting index of the section to sort
	 * @param highIndex the ending index of the section to sort
	 */
	private void quickSort(int[] array, int lowIndex, int highIndex) {
		// Continue only if the current section contains more than one element
		if (lowIndex < highIndex) {

			// Partition the section and get the pivot's final index
			int pivotIndex = partition(array, lowIndex, highIndex);

			// Recursively sort the sections to the left and right of the pivot
			quickSort(array, lowIndex, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, highIndex);
		}
	}

	/**
	 * Partitions the specified portion of the array using the last element
	 * as the pivot. Values smaller than the pivot are moved to the left, 
	 * and the pivot is placed in its final sorted position. 
	 * 
	 * @param array the array being partitioned
	 * @param lowIndex the starting index of the section to partition
	 * @param highIndex the ending index of the section and location of the pivot
	 * @return the final index of the pivot
	 */
	private int partition(int[] array, int lowIndex, int highIndex) {
		// Use the last element in the current section as the pivot
		int pivot = array[highIndex];

		// Keeps track of where the smaller-value section ends
		int smallerIndex = lowIndex - 1;

		for (int currentIndex = lowIndex; currentIndex < highIndex; currentIndex++) {
			comparisons++;

			if (array[currentIndex] < pivot) {
				smallerIndex++;

				// Save the value currently in the smallerIndex position before overwriting it
				int savedValue = array[smallerIndex]; 
				
				// Move the current value (that is smaller than pivot) into the next position of the smaller-value section
				array[smallerIndex] = array[currentIndex]; 
												
				// Move the value that was originally at smallerIndex into currentIndex position to complete swap
				array[currentIndex] = savedValue;
			}
		}
		// Save the value where the pivot will be placed
		int swapValue = array[smallerIndex + 1];
		
		// Move the pivot into its final sorted position
		array[smallerIndex + 1] = pivot;
		
		// Move the saved value into the pivot's old position
		array[highIndex] = swapValue;

		// Return the pivot's final index
		return smallerIndex + 1;
	}

}
