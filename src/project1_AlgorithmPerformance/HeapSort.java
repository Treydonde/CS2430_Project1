package project1_AlgorithmPerformance;

/**
 * HeapSort implements the Heap sort algorithm to sort an array. It has 4 methods
 * two of them are public and another two is private there is also a constructor that
 * calls one of the two methods.  The public methods are getComparisonCount and getArr
 * which gets the comparison count and the other is to get the sorted array.  The
 * private methods are sort and heapify.  The sort method sorts the array given and
 * it does that by the help of the heapify method that it calls a few times to help
 * sort.
 * 
 * @author Benjamin Shaw
 */
public class HeapSort {

	private int arr[];
	private int comparisonCount;

	/**
	 * HeapSort is the constructor that hands off the array that is given to be sorted
	 * it then assigns that sorted array to this arr value
	 * 
	 * @param arr the array given
	 */
	public HeapSort(int[] arr, int comparisonCount) {
		this.arr = sort(arr);
	}

	/**
	 * returns the comparison count
	 * 
	 * @return comparisonCount
	 */
	public int getComparisonCount() {
		return comparisonCount;
	}

	/**
	 * returns the sorted array
	 * 
	 * @return arr
	 */
	public int[] getArr() {
		return arr;
	}

	/*
	 * the sort function takes in the parameter of a which is an array and follows
	 * through with the Heap sort algorithm
	 */
	public int[] sort(int arr[]) {

		comparisonCount = 0;
		int n = arr.length;

		// initially setting up the array
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// actually sorting the array
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
		
		return arr;
	}

	/**
	 * heapify makes the given array into a heap.
	 * 
	 * @param arr the array
	 * @param n array length
	 * @param i what part of the array we are in
	 */
	private void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// checking to see if we have a larger value on the left
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// checking to see if there is a larger value on the right
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// checking to see if i is already the largest
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// recursion through the heapify method
			heapify(arr, n, largest);
		}
	}
}