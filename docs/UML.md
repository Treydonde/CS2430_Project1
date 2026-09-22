# UML Class Diagram

This is the initial UML design for the project. More details and class relationships will be added as the project develops.

```mermaid
classDiagram
    class ExperimentDriver
    class PermutationGenerator
    class MergeSort
    class QuickSort
    class ShakerSort
    class HeapSort

    ExperimentDriver --> PermutationGenerator : uses
    ExperimentDriver --> MergeSort : runs
    ExperimentDriver --> QuickSort : runs
    ExperimentDriver --> ShakerSort : runs
    ExperimentDriver --> HeapSort : runs
```
