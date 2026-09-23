package project1_AlgorithmPerformance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a permutation generator
 * for provided small int create a base array of 0 - n-1
 *
 *
 * @author Gustavo C
 */
public class PermutationGenerator {

    /**
     * Creates a base array from n
     * This array is what all other permutations
     * will be based on
     * @param n integer
     * @return array of integers 0 through n − 1
     */
    public int[] createBaseArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        return array;
    }

    /**
     * Computes next lexicographical permutation of an int array
     * @param nArray int array
     * @return boolean
     */
    static boolean nextPermutation(int[] nArray) {
        int n = nArray.length;

        // Find the rightmost number which is
        // smaller than the next number
        int i = n - 2;
        while (i >= 0 && nArray[i] >= nArray[i + 1]) {
            i--;
        }

        // If no such number found, all permutations are done
        if (i < 0) {
            return false;
        }

        // Find the ceiling of nArray[i]
        int j = n - 1;
        while (j > i && nArray[j] <= nArray[i]) {
            j--;
        }

        // Swap the found numbers
        int temp = nArray[i];
        nArray[i] = nArray[j];
        nArray[j] = temp;

        // Sort (reverse) the suffix after index i
        reverse(nArray, i + 1, n - 1);

        return true;
    }

    /**
     * Quick reverse method for TODO finish method doc comment
     * @param n
     * @param left
     * @param right
     */
    static void reverse(int[] n, int left, int right) {
        while (left < right) {
            int temp = n[left];
            n[left] = n[right];
            n[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Helper method to swap two elements in an array
     *
     * @param nums the array containing elements to swap
     * @param i first index
     * @param j second index
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public List<int[]> findAllPermutations(int[] nArray) {
        Arrays.sort(nArray);
        List<int[]> result = new ArrayList<>();

        result.add(Arrays.copyOf(nArray, nArray.length));

        while (nextPermutation(nArray)) {
            result.add(Arrays.copyOf(nArray, nArray.length));
        }

        return result;
    }

    static void main(String[] args) {

    }
}
