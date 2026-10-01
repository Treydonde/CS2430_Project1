# UML Class Diagram

This is the initial UML design for the project. More details and class relationships will be added as the project develops.

```mermaid
classDiagram

    class ExperimentDriver

    class PermutationGenerator {
        +int[] createBaseArray(int n)
        ~boolean nextPermutation(int[] nArray)
        ~void reverse(int[] n, int left, int right)
        +List~int[]~ findAllPermutations(int[] nArray)
    }

    class MergeSort {
        -int comparisons
        +int sort(int[] array)
        -void mergeSort(int[] array, int left, int right)
        -void merge(int[] array, int left, int mid, int right)
    }

    class QuickSort {
        -int comparisons
        +int sort(int[] array)
        -void quickSort(int[] array, int lowIndex, int highIndex)
        -int partition(int[] array, int lowIndex, int highIndex)
    }

    class ShakerSort {
        ~void sort(int[] a)
    }

    class HeapSort {
        +void sort(int[] arr)
        ~void heapify(int[] arr, int n, int i)
    }

    ExperimentDriver --> PermutationGenerator : generates permutations
    ExperimentDriver --> MergeSort : runs
    ExperimentDriver --> QuickSort : runs
    ExperimentDriver --> ShakerSort : runs
    ExperimentDriver --> HeapSort : runs
```
