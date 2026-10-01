package project1_AlgorithmPerformance.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import project1_AlgorithmPerformance.QuickSort;

/**
 * JUnit tests for the QuickSort implementation.
 * Tests sorting correctness and comparison counting.
 *
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 * Primary Author: Paulina Cruz
 */
class QuickSortTest {

	private final QuickSort quickSort = new QuickSort();

	// = = = = = Sorting Tests = = = = =

	@Test
	void typicalUnsortedArray() {
		int[] array = { 5, 2, 8, 1, 3 };
		int[] expected = { 1, 2, 3, 5, 8 };

		quickSort.sort(array);

		assertArrayEquals(expected, array);
	}

	@Test
	void alreadySortedArray() {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] expected = { 1, 2, 3, 4, 5 };

		quickSort.sort(array);

		assertArrayEquals(expected, array);
	}

	@Test
	void reverseSortedArray() {
		int[] array = { 5, 4, 3, 2, 1 };
		int[] expected = { 1, 2, 3, 4, 5 };

		quickSort.sort(array);

		assertArrayEquals(expected, array);
	}

	@Test
	void singleElementArray() {
		int[] array = { 5 };
		int[] expected = { 5 };

		quickSort.sort(array);

		assertArrayEquals(expected, array);
	}

	@Test
	void emptyArray() {
		int[] array = {};
		int[] expected = {};

		quickSort.sort(array);

		assertArrayEquals(expected, array);
	}

	// = = = = = Comparison Counting Tests = = = = =

	@Test
	void comparisonCountTypicalUnsortedArray() {
		int[] array = { 5, 2, 8, 1, 3 };
		int expectedCount = 6;

		assertEquals(expectedCount, quickSort.sort(array));
	}

	@Test
	void comparisonCountAlreadySortedArray() {
		int[] array = { 1, 2, 3, 4, 5 };
		int expectedCount = 10;

		assertEquals(expectedCount, quickSort.sort(array));
	}

	@Test
	void comparisonCountReverseSortedArray() {
		int[] array = { 5, 4, 3, 2, 1 };
		int expectedCount = 10;

		assertEquals(expectedCount, quickSort.sort(array));
	}

	@Test
	void comparisonCountSingleElementArray() {
		int[] array = { 5 };
		int expectedCount = 0;

		assertEquals(expectedCount, quickSort.sort(array));
	}

	@Test
	void comparisonCountEmptyArray() {
		int[] array = {};
		int expectedCount = 0;

		assertEquals(expectedCount, quickSort.sort(array));
	}

}
