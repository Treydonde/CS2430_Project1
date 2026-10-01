package project1_AlgorithmPerformance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
 * Primary Author: Paulina Cruz, Gustavo Cabral
 */
public class ExperimentDriver {

	// Store the results from every sorting algorithm run
	static List<ExperimentResult> mergeResults = new ArrayList<>();
	static List<ExperimentResult> quickResults = new ArrayList<>();
	static List<ExperimentResult> shakerResults = new ArrayList<>();
	static List<ExperimentResult> heapResults = new ArrayList<>();

	/**
	 * Generates all permutations for the given input size and runs each sorting
	 * algorithm on every permutation using a separate copy of the original input.
	 * The comparison count for each algorithm is recorded for analysis. 
	 * 
	 * @param n	the number of elements in each generated permutation 
	 */
	public static void runExperiment(int n) {
		// ==================== Permutation Generation ====================
		
		// Create the starting array containing values from 0 through n - 1
		int[] baseArray = PermutationGenerator.createBaseArray(n);
		
		// Generate and store all possible permutations of the base array
		List<int[]> permutations = PermutationGenerator.findAllPermutations(baseArray);

		// Run each sorting algorithm on every generated permutation
		for (int[] permutation : permutations) {
			
			// ==================== MergeSort ====================
			// Use a separate copy so each algorithm receives the same unsorted input
			int[] mergeArray = Arrays.copyOf(permutation, permutation.length);
			
			// Sort the copied array using MergeSort and record its comparison count
			MergeSort mergeSort = new MergeSort();
			int mergeComparisons = mergeSort.sort(mergeArray);
			
			// Store the MergeSort result
			ExperimentResult mergeResult = new ExperimentResult("MergeSort", permutation, mergeComparisons);

			mergeResults.add(mergeResult);
			
			// Temporary print for testing
			System.out.println(mergeResult.getAlgorithm() + " | Input: " + Arrays.toString(mergeResult.getInputArray())
					+ " | Comparisons: " + mergeResult.getComparisons());
			
			// ==================== QuickSort ====================
			int[] quickArray = Arrays.copyOf(permutation, permutation.length);
			
			QuickSort quickSort = new QuickSort();
			int quickComparisons = quickSort.sort(quickArray);
			
			// Store the QuickSort result
			ExperimentResult quickResult = new ExperimentResult("QuickSort", permutation, quickComparisons);

			quickResults.add(quickResult);

			// Temporary print for testing
			System.out.println(quickResult.getAlgorithm() + " | Input: " + Arrays.toString(quickResult.getInputArray())
					+ " | Comparisons: " + quickResult.getComparisons());
			
			// ==================== ShakerSort ====================
			int[] shakerArray = Arrays.copyOf(permutation, permutation.length);
			
			ShakerSort shakerSort = new ShakerSort();
			// TODO: waiting on shakerSort implementation to be completed
			
			// ==================== HeapSort ====================
			int[] heapArray = Arrays.copyOf(permutation, permutation.length);
			
			HeapSort heapSort = new HeapSort(heapArray);
			int heapComparisons = heapSort.getComparisonCount();
			
			// Store the HeapSort result
			ExperimentResult heapResult = new ExperimentResult("HeapSort", permutation, heapComparisons);

			heapResults.add(heapResult);

			// Temporary print for testing
			System.out.println(heapResult.getAlgorithm() + " | Input: " + Arrays.toString(heapResult.getInputArray())
					+ " | Comparisons: " + heapResult.getComparisons());
		}
	}

	/**
	 * Prints the ten permutations that had the least
	 * amount of comparisons
	 */
	public static void returnBestTen() {
		mergeResults.sort(null);
		for (int i = 0; i < 10; i++) {
			System.out.println(mergeResults.get(i).getAlgorithm() + " | Input: "
					+ Arrays.toString(mergeResults.get(i).getInputArray())
					+  " | Comparisons: " + mergeResults.get(i).getComparisons());
		}
		System.out.println();

		quickResults.sort(null);
		for (int i = 0; i < 10; i++) {
			System.out.println(quickResults.get(i).getAlgorithm() + " | Input: "
					+ Arrays.toString(quickResults.get(i).getInputArray())
					+  " | Comparisons: " + quickResults.get(i).getComparisons());
		}
		System.out.println();

		heapResults.sort(null);
		for (int i = 0; i < 10; i++) {
			System.out.println(heapResults.get(i).getAlgorithm() + " | Input: "
					+ Arrays.toString(heapResults.get(i).getInputArray())
					+  " | Comparisons: " + heapResults.get(i).getComparisons());
		}
	}

	/**
	 * Prints the ten permutations that had the most
	 * amounts of comparisons
	 */
	public static void returnWorstTen() {
		mergeResults.sort(Comparator.reverseOrder());
		for (int i = 0; i < 10; i++) {
			System.out.println(mergeResults.get(i).getAlgorithm() + " | Input: "
					+ Arrays.toString(mergeResults.get(i).getInputArray())
					+  " | Comparisons: " + mergeResults.get(i).getComparisons());
		}
		System.out.println();

		quickResults.sort(Comparator.reverseOrder());
		for (int i = 0; i < 10; i++) {
			System.out.println(quickResults.get(i).getAlgorithm() + " | Input: "
					+ Arrays.toString(quickResults.get(i).getInputArray())
					+  " | Comparisons: " + quickResults.get(i).getComparisons());
		}
		System.out.println();

		heapResults.sort(Comparator.reverseOrder());
		for (int i = 0; i < 10; i++) {
			System.out.println(heapResults.get(i).getAlgorithm() + " | Input: "
					+ Arrays.toString(heapResults.get(i).getInputArray())
					+  " | Comparisons: " + heapResults.get(i).getComparisons());
		}
	}

	/**
	 * Prints the average amount of comparisons across
	 * all permutations for each algorithm
	 */
	public static void returnAverage() {
		int mergeAvg = 0;
		for (ExperimentResult r : mergeResults) {
			mergeAvg += r.getComparisons();
		}
		mergeAvg /= mergeResults.size();

		int quickAvg = 0;
		for (ExperimentResult r : quickResults) {
			quickAvg += r.getComparisons();
		}
		quickAvg /= quickResults.size();

//		int shakerAvg = 0;
//		for (ExperimentResult r : shakerResults) {}

		int heapAvg = 0;
		for (ExperimentResult r : heapResults) {
			heapAvg += r.getComparisons();
		}
		heapAvg /= heapResults.size();

		System.out.println("Merge Avg: " + mergeAvg);
		System.out.println("Quick Avg: " + quickAvg);
		//System.out.println("Shaker Avg: " + shakerAvg);
		System.out.println("Heap Avg: " + heapAvg);
	}

	/**
	 * Runs the experiment for each required input size.
	 *
	 * @param args command-line arguments; not used
	 */
	public static void main(String[] args) {
		runExperiment(8);
		System.out.println();
		System.out.println();

		System.out.println("~~~~Best Ten~~~~");
		returnBestTen();
		System.out.println();

		System.out.println("~~~~Worst Ten~~~~");
		returnWorstTen();
		System.out.println();

		System.out.println("~~~~Average ~~~~~");
		returnAverage();
		//runExperiment(6);
		//runExperiment(8);
	}
}
