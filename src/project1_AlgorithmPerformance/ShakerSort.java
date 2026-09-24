package project1_AlgorithmPerformance;

/**
 * ShakerSort implements the shaker sort algorithm
 * 
 * @author Benjamin Shaw
 */
public class ShakerSort {

	/*
	 * the sort function takes in the parameter of a which is an array and
	 * follows through with the shaker sort algorithm
	 */
	void sort(int a[]) {
		boolean swapped = true;
		int start = 0;
		int end = a.length;

		
		while (swapped) {
			swapped = false;

			// looping through the arraw and looking at the elements and swapping
			for (int i = start; i < end - 1; ++i) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}

			// checking to see if swapped is false
			if (!swapped)
				break;
			swapped = false;

			end = end - 1;

			// going from the other side
			for (int i = end - 1; i >= start; i--) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}

			start = start + 1;
		}
	}
}