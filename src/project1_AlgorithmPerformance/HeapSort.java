package project1_AlgorithmPerformance;

/**
 * ShakerSort implements the Heap sort algorithm
 * 
 * @author Benjamin Shaw
 */
public class HeapSort {

	/*
	 * the sort function takes in the parameter of a which is an array and
	 * follows through with the Heap sort algorithm
	 */
	public void sort(int arr[]) {
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
	}

	// heapify makes the given array into a heap
	void heapify(int arr[], int n, int i) {
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