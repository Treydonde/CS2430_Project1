package project1_AlgorithmPerformance.tests;

import org.junit.jupiter.api.Test;
import project1_AlgorithmPerformance.PermutationGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Junit tests for the permutation generator class
 *
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 * Primary author: GustavoC and Claude Sonnet
 */
class PermutationGeneratorTest {

    private final PermutationGenerator generator = new PermutationGenerator();

    @Test
    void createBaseArray_returnsArrayContainingValuesFromZeroToNMinusOne() {
        int[] result = generator.createBaseArray(5);

        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, result);
    }

    @Test
    void createBaseArray_withZero_returnsEmptyArray() {
        int[] result = generator.createBaseArray(0);

        assertArrayEquals(new int[0], result);
    }

    @Test
    void createBaseArray_withOne_returnsArrayContainingZero() {
        int[] result = generator.createBaseArray(1);

        assertArrayEquals(new int[] {0}, result);
    }

    @Test
    void findAllPermutations_handlesDuplicateValues() {
        int[] input = {1, 1, 2};

        List<int[]> permutations = generator.findAllPermutations(input);

        assertEquals(3, permutations.size());

        assertArrayEquals(new int[] {1, 1, 2}, permutations.get(0));
        assertArrayEquals(new int[] {1, 2, 1}, permutations.get(1));
        assertArrayEquals(new int[] {2, 1, 1}, permutations.get(2));
    }

    @Test
    void findAllPermutations_returnsArrayCopies() {
        int[] input = {1, 2, 3};

        List<int[]> permutations = generator.findAllPermutations(input);

        permutations.get(0)[0] = 99;

        assertArrayEquals(new int[] {1, 3, 2}, permutations.get(1));
    }

    @Test
    void findAllPermutations_returnsEmptyPermutationForEmptyArray() {
        int[] input = {};

        List<int[]> permutations = generator.findAllPermutations(input);

        assertEquals(1, permutations.size());
        assertArrayEquals(new int[] {}, permutations.get(0));
    }

    @Test
    void findAllPermutations_returnsAllPermutationsForThreeElements() {
        int[] input = {1, 2, 3};

        List<int[]> permutations = generator.findAllPermutations(input);

        assertEquals(6, permutations.size());

        assertArrayEquals(new int[] {1, 2, 3}, permutations.get(0));
        assertArrayEquals(new int[] {1, 3, 2}, permutations.get(1));
        assertArrayEquals(new int[] {2, 1, 3}, permutations.get(2));
        assertArrayEquals(new int[] {2, 3, 1}, permutations.get(3));
        assertArrayEquals(new int[] {3, 1, 2}, permutations.get(4));
        assertArrayEquals(new int[] {3, 2, 1}, permutations.get(5));
    }

    @Test
    void findAllPermutations_sortsInputBeforeGeneratingPermutations() {
        int[] input = {3, 1, 2};

        List<int[]> permutations = generator.findAllPermutations(input);

        assertEquals(6, permutations.size());
        assertArrayEquals(new int[] {1, 2, 3}, permutations.get(0));
        assertArrayEquals(new int[] {3, 2, 1}, permutations.get(5));
    }

    @Test
    void findAllPermutations_returnsOnePermutationForSingleElement() {
        int[] input = {7};

        List<int[]> permutations = generator.findAllPermutations(input);

        assertEquals(1, permutations.size());
        assertArrayEquals(new int[] {7}, permutations.get(0));
    }

    @Test
    void findAllPermutations() {
    }
}