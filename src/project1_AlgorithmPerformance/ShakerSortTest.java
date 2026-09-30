package project1_AlgorithmPerformance;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShakerSortTest {

	@Test
	void testMixedArray() {
		ShakerSortWithComparisons shaker = new ShakerSortWithComparisons();

		int[] array = {5, 3, 4, 1, 2};
		int comparisons = shaker.sort(array);

		int[] expected = {1, 2, 3, 4, 5};

		assertArrayEquals(expected, array);
		assertEquals(12, comparisons);
	}

	@Test
	void testSortedArray() {
		ShakerSortWithComparisons shaker = new ShakerSortWithComparisons();

		int[] array = {1, 2, 3, 4, 5};
		int comparisons = shaker.sort(array);

		int[] expected = {1, 2, 3, 4, 5};

		assertArrayEquals(expected, array);
		assertEquals(4, comparisons);
	}

	@Test
	void testReverseArray() {
		ShakerSortWithComparisons shaker = new ShakerSortWithComparisons();

		int[] array = {5, 4, 3, 2, 1};
		int comparisons = shaker.sort(array);

		int[] expected = {1, 2, 3, 4, 5};

		assertArrayEquals(expected, array);
		assertEquals(12, comparisons);
	}
}