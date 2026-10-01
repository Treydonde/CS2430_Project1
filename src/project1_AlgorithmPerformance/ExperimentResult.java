package project1_AlgorithmPerformance;

/**
 * TODO
 * 
 * Team Name: Group 2
 * Team Members: Benjamin Shaw, Camilla Feitosa Nunes, Gustavo Cabral, Paulina Cruz
 * Course: CS 2430, Section 002
 * Project: Programming Project 1 - Fall 2026
 *
 * Primary Author: Paulina Cruz
 */
public class ExperimentResult {

	private final String algorithm;
	private final int[] inputArray;
	private final int comparisons;
	
	/**
	 * Creates a result for one sorting algorithm run.
	 *
	 * @param algorithm the name of the sorting algorithm
	 * @param inputArray the original unsorted input array
	 * @param comparisons the number of element-to-element comparisons made
	 */
	public ExperimentResult(String algorithm, int[] inputArray, int comparisons) {
		this.algorithm = algorithm;
		this.inputArray = inputArray;
		this.comparisons = comparisons;
	}
	
	public String getAlgorithm() {
		return algorithm;
	}

	public int[] getInputArray() {
		return inputArray;
	}

	public int getComparisons() {
		return comparisons;
	}
	
}
