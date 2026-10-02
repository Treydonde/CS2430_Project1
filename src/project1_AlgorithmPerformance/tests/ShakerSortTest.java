
package project1_AlgorithmPerformance.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import project1_AlgorithmPerformance.ShakerSort;

class ShakerSortTest {

    /*
     * Tests a mixed array with the numbers in a random order.
     * This helps make sure Shaker Sort can correctly sort
     * a normal unsorted array.
     */
    @Test
    void testMixedArray() {
        ShakerSort shaker = new ShakerSort();

        int[] array = {8, 3, 6, 1, 7, 2, 5, 4};
        int comparisons = shaker.sort(array);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expected, array);
        assertEquals(30, comparisons);
    }

    /*
     * Tests an array that is already sorted.
     * Since everything is already in the correct order,
     * Shaker Sort should not need to make any swaps.
     */
    @Test
    void testSortedArray() {
        ShakerSort shaker = new ShakerSort();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int comparisons = shaker.sort(array);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expected, array);
        assertEquals(7, comparisons);
    }

    /*
     * Tests an array that is completely reversed.
     * This makes Shaker Sort do more work because
     * all the numbers start far from their correct position.
     */
    @Test
    void testReverseArray() {
        ShakerSort shaker = new ShakerSort();

        int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
        int comparisons = shaker.sort(array);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expected, array);
        assertEquals(32, comparisons);
    }

    /*
     * Tests an array with only one number.
     * Since there is only one element, the array is already sorted
     * and no comparisons should be needed.
     */
    @Test
    void testSingleElementArray() {
        ShakerSort shaker = new ShakerSort();

        int[] array = {9};
        int comparisons = shaker.sort(array);

        int[] expected = {9};

        assertArrayEquals(expected, array);
        assertEquals(0, comparisons);
    }

    /*
     * Tests an empty array.
     * Since there is nothing to sort, the method should return
     * zero comparisons and should not cause an error.
     */
    @Test
    void testEmptyArray() {
        ShakerSort shaker = new ShakerSort();

        int[] array = {};
        int comparisons = shaker.sort(array);

        int[] expected = {};

        assertArrayEquals(expected, array);
        assertEquals(0, comparisons);
    }

    /*
     * Tests a null array.
     * The sort method checks for null, so this test makes sure
     * the program does not crash and returns zero comparisons.
     */
    @Test
    void testNullArray() {
        ShakerSort shaker = new ShakerSort();

        int[] array = null;
        int comparisons = shaker.sort(array);

        assertNull(array);
        assertEquals(0, comparisons);
    }

    /*
     * Tests the comparison counter with a bigger unsorted array.
     * This checks that the array is sorted correctly and that
     * the number of comparisons is also being counted correctly.
     */
    @Test
    void testComparisonCount() {
        ShakerSort shaker = new ShakerSort();

        int[] array = {6, 2, 5, 1, 4, 0, 3};
        int comparisons = shaker.sort(array);

        int[] expected = {0, 1, 2, 3, 4, 5, 6};

        assertArrayEquals(expected, array);
        assertEquals(22, comparisons);
    }
}