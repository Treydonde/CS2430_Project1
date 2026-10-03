# Programming Project 1 - Algorithm Performance

## Overview

This project compares the performance of several sorting algorithms by counting
the number of element-to-element comparisons on different permutations of integer arrays. 

The sorting algorithms included in the project are:

- MergeSort
- QuickSort
- ShakerSort
- HeapSort

This project also includes a permutation generator, experiment driver, and result
class used to generate inputs, run the sorting algorithms, and record comparison data.

## Comparison Counting 

The project counts only element-to-element comparisons used to determine ordering. 

Loop conditions, index comparisons, assignments, swaps, and other operations are not included in the comparison count.

## Running the Project

The experiment is run from `Main.java`.

To run the project in Eclipse:

1. Open `Main.java` in the `project1_AlgorithmPerformance` package.
2. Right-click anywhere inside the file.
3. Select **Run As → Java Application**.
4. View the experiment results in the Eclipse Console.

`Main.java` runs the experiment for:

- `n = 4`
- `n = 6`
- `n = 8`

For each value of `n`, the program generates every permutation of the integers from `0` through `n - 1`.

Each sorting algorithm receives a separate copy of every permutation so that all four algorithms
are tested using the same original input.

The program records and displays:

- Best 10 cases for each sorting algorithm
- Worst 10 cases for each sorting algorithm
- Average comparison count for each sorting algorithm

The generated comparison data is used to analyze and compare the performance of the four sorting algorithms. 

## Project Structure 

```text
Project1_AlgorithmPerformance/
│
├── src/
│   ├── project1_AlgorithmPerformance/
│   │   ├── Main.java
│   │   ├── ExperimentDriver.java
│   │   ├── ExperimentResult.java
│   │   ├── PermutationGenerator.java
│   │   ├── MergeSort.java
│   │   ├── QuickSort.java
│   │   ├── ShakerSort.java
│   │   └── HeapSort.java
│   │
│   └── project1_AlgorithmPerformance.tests/
│       ├── MergeSortTest.java
│       ├── QuickSortTest.java
│       ├── ShakerSortTest.java
│       ├── HeapSortTest.java
│       └── PermutationGeneratorTest.java
│
├── docs/
│   ├── ProjectPlan.md
│   ├── UML.md
│   ├── Sequence_PseudoCode.md
│   └── CONTRIBUTIONS.md
│
└── README.md
```

## Testing 

JUnit 5 is used for automated testing of the sorting algorithms, comparison counting, permutation generation, 
and other components of the experiment workflow.

The project includes tests for:

- MergeSort
- QuickSort
- ShakerSort
- HeapSort
- PermutationGenerator

To run the tests in Eclipse: 

1. Open a test class.
2. Right-click the test file.
3. Select **Run As → JUnit Test**.

## Documentation 

Additional project documentation is located in the `docs` folder:

- `ProjectPlan.md` - project tasks, ownership, milestones, and progress
- `UML.md` - current class design
- `Sequence_PseudoCode.md` - algorithm and design pseudocode
- `CONTRIBUTIONS.md` - team member contributions and evidence

## Contributors

**Group 2**

- Benjamin Shaw
- Camilla Feitosa Nunes
- Gustavo Cabral
- Paulina Cruz

**Course:** CS 2430, Section 002 - Fall 2026
