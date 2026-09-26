# Programming Project 1 - Algorithm Performance

## Overview

This project compares the performance of several sorting algorithms by counting
the number of element-to-element comparisons on different permutations of integer arrays. 

The sorting algorithms included in the project are:

- MergeSort
- QuickSort
- ShakerSort
- HeapSort

This project also includes a permutation generator and an experiment driver used
to run the sorting algorithms on generated input arrays.

## Comparison Counting 

The project counts only element-to-element comparisons used to determine ordering. 

Loop conditions, index comparisons, assignments, swaps, and other operations are not included in the comparison count.

## Running the Project

1. TBD
2. TBD
3. TBD
4. TBD

Detailed experiment instructions will be updated once the experiment driver and output format are finalized.

The final experiment will run all four sorting algorithms for:

- `n = 4`
- `n = 6`
- `n = 8`

The program will generate the comparison data needed for the project report, including the best 10 cases, worst 10 cases, 
and average comparison count for each algorithm and value of `n`.  

## Project Structure 

```text
src/
└── project1_AlgorithmPerformance/
    ├── MergeSort.java
    ├── QuickSort.java
    ├── ShakerSort.java
    ├── HeapSort.java
    ├── PermutationGenerator.java
    ├── ExperimentDriver.java
    │
    └── tests/
        ├── MergeSortTest.java
        └── QuickSortTest.java

docs/
├── ProjectPlan.md
├── UML.md
├── Sequence_PseudoCode.md
└── CONTRIBUTIONS.md
```

## Testing 

JUnit 5 is used for automated testing of the sorting algorithms, comparison counting, permutation generation, 
and other components of the experiment workflow.

To run the tests in Eclipse: 

1. Open a test class.
2. Right-click the test file.
3. Select **Run As → JUnit Test**.

## Documentation 

Additional project documentation is located in the `docs` folder:

- `ProjectPlan.md` - project tasks, ownership, milestones, and progress
- `UML.md` - current class design
- `Sequence_PseudoCode.md` - algorithm and design psuedocode
- `CONTRIBUTIONS.md` - team member contributions and evidence

## Contributors

**Group 2**

- Benjamin Shaw
- Camilla Feitosa Nunes
- Gustavo Cabral
- Paulina Cruz

**Course:** CS 2430, Section 002 - Fall 2026
