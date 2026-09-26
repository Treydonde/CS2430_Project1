package project1_AlgorithmPerformance;

import java.util.Arrays;

public class ShakerSortTest {

	public static void main(String[] args) {

		ShakerSortWithComparisons shaker = new ShakerSortWithComparisons();

		// Test a mixed array
		int[] mixedArray = {5, 3, 4, 1, 2};
		int mixedComparisons = shaker.sort(mixedArray);

		System.out.println("Mixed array test");
		System.out.println("Sorted array: " + Arrays.toString(mixedArray));
		System.out.println("Comparisons: " + mixedComparisons);
		System.out.println();

		// Test an already sorted array
		int[] sortedArray = {1, 2, 3, 4, 5};
		int sortedComparisons = shaker.sort(sortedArray);

		System.out.println("Sorted array test");
		System.out.println("Sorted array: " + Arrays.toString(sortedArray));
		System.out.println("Comparisons: " + sortedComparisons);
		System.out.println();

		// Test a reverse order array
		int[] reverseArray = {5, 4, 3, 2, 1};
		int reverseComparisons = shaker.sort(reverseArray);

		System.out.println("Reverse array test");
		System.out.println("Sorted array: " + Arrays.toString(reverseArray));
		System.out.println("Comparisons: " + reverseComparisons);
	}
}