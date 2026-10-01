package project1_AlgorithmPerformance;

import java.util.Arrays;
import java.util.List;

/**
 * Runs the sorting algorithm performance experiment for Programming Project 1. 
 * 
 * The driver generates all permutations for the required input sizes and runs
 * each sorting algorithm on a separate copy of every permutation. It records 
 * the number of element-to-element comparisons made. 
 * 
 * 
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 * Primary Author: Paulina Cruz
 */
public class ExperimentDriver {

	/**
	 * Runs the experiment for each required input size.
	 *
	 * @param args command-line arguments; not used
	 */
	public static void main(String[] args) {
		runExperiment(4);
		runExperiment(6);
		runExperiment(8);
	}

	/**
	 * Generates all permutations for the given input size and runs each sorting
	 * algorithm on every permutation using a separate copy of the original input.
	 * The comparison count for each algorithm is recorded for analysis. 
	 * 
	 * @param n	the number of elements in each generated permutation 
	 */
	private static void runExperiment(int n) {
		// ==================== Permutation Generation ====================
		// Create a generator to create the input arrays
		PermutationGenerator generator = new PermutationGenerator();
		
		// Create the starting array containing values from 0 through n - 1
		int[] baseArray = generator.createBaseArray(n);
		
		// Generate and store all possible permutations of the base array
		List<int[]> permutations = generator.findAllPermutations(baseArray);
		
		// Run each sorting algorithm on every generated permutation
		for (int[] permutation : permutations) {
			
			// ==================== MergeSort ====================
			// Use a separate copy so each algorithm receives the same unsorted input
			int[] mergeArray = Arrays.copyOf(permutation, permutation.length);
			
			// Sort the copied array using MergeSort and record its comparison count
			MergeSort mergeSort = new MergeSort();
			int mergeComparisons = mergeSort.sort(mergeArray);
			
			// ==================== QuickSort ====================
			int[] quickArray = Arrays.copyOf(permutation, permutation.length);
			
			QuickSort quickSort = new QuickSort();
			int quickComparisons = quickSort.sort(quickArray);
			
			// ==================== ShakerSort ====================
			int[] shakerArray = Arrays.copyOf(permutation, permutation.length);
			
			ShakerSort shakerSort = new ShakerSort();
			// TODO: waiting on shakerSort implementation to be completed
			
			// ==================== HeapSort ====================
			int[] heapArray = Arrays.copyOf(permutation, permutation.length);
			
			HeapSort heapSort = new HeapSort(heapArray);
			int heapComparisons = heapSort.getComparisonCount();
		}
	}
}
