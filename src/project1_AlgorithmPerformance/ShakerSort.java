
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
public class ShakerSort {

    // Keeps track of how many times two elements are compared during the sort
    private int comparisons;

    /**
     * Sorts the given array using Shaker Sort and returns the number of
     * element-to-element comparisons made during the process.
     *
     * Shaker Sort goes through the array in both directions. The forward pass
     * moves larger numbers toward the end, and the backward pass moves smaller
     * numbers toward the beginning.
     *
     * @param array the array that will be sorted.
     * @return the total number of element-to-element comparisons
     */
    public int sort(int[] array) {

        // Reset the counter every time the method is called
        comparisons = 0;

        // If the array is null, empty, or has only one element,
        // there is nothing to sort, so no comparisons are needed
        if (array == null || array.length < 2) {
            return comparisons;
        }

        // Tracks whether at least one swap happened during a pass
        // The loop keeps running while swaps are still being made
        boolean swapped = true;

        // Start and end show the part of the array that still needs to be checked
        int start = 0;
        int end = array.length;

        while (swapped) {

            // Start by assuming no swaps will happen in this pass
            swapped = false;

            /*
             * Forward pass:
             * Move from left to right and compare each number with the one next to it.
             * If the left number is bigger, swap them.
             * This moves larger numbers toward the end of the array.
             */
            for (int i = start; i < end - 1; i++) {

                // Count the comparison between array[i] and array[i + 1]
                comparisons++;

                if (array[i] > array[i + 1]) {

                    // Swap the two values because they are in the wrong order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Mark that a swap happened, so the array may still need more passes
                    swapped = true;
                }
            }

            // If no swaps happened during the forward pass,
            // the array is already sorted and the loop can stop
            if (!swapped) {
                break;
            }

            // Reset swapped before starting the backward pass
            swapped = false;

            // The largest remaining value is now in the correct position,
            // so we can move the end boundary one position to the left
            end--;

            /*
             * Backward pass:
             * Move from right to left and compare neighboring values again.
             * This time, smaller numbers move toward the beginning of the array.
             */
            for (int i = end - 1; i >= start; i--) {

                // Count the comparison between array[i] and array[i + 1]
                comparisons++;

                if (array[i] > array[i + 1]) {

                    // Swap the two values because they are in the wrong order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Mark that a swap happened
                    swapped = true;
                }
            }

            // After the backward pass, the smallest remaining value is now
            // in the correct position, so move the start boundary forward
            start++;
        }

        // The array is now sorted, and this returns the total comparison count
        return comparisons;
    }
}