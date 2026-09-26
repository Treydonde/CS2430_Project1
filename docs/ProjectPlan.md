# Programming Project 1 - Project Plan

## Project Information

- **Course:** CS 2430, Section 002 - Fall 2026
- **Project:** Programming Project 1 - Sorting Algorithms, Efficiency, and Performance
- **Team:** Group 2
- **Start Date:** 2026-09-14
- **Due Date:** 2026-10-02
- **Checkpoint Date:** 2026-09-25

---

## Team Members and Roles

| Team Member | Role | Main Responsibilities |
|---|---|---|
| Gustavo Cabral | Implementation Lead | Core implementation, integration, and main branch health |
| Benjamin Shaw | Verification Lead | Test plan, edge cases, testing, and verification evidence |
| Paulina Cruz | Communications Lead | Report assembly, run instructions, documentation, and deliverable packaging |
| Camilla Feitosa Nunes | TBD | TBD |

---

## Project Goal

The goal of this project is to implement and compare four sorting algorithms:

- Merge Sort
- Quick Sort
- Shaker Sort
- Heap Sort

The program will generate all possible permutations of the integers from 0 through n -1 for n = 4, 6, and 8.

Each sorting algorithm will run on every permutation and count the number of element-to-element comparisons performed. 

The collected data will be used to determine:

- Best 10 cases
- Worst 10 cases
- Average number of comparisons
- Big-O estimates
- Big-Omega estimates
- Big-Theta estimates

### Comparison Counting Rules

Only element-to-element comparisons that determine ordering will be counted. Loop conditions, index comparisons, assignments, and swaps will not be included in the comparison count. 

---

## Planned Java Classes

| Class | Purpose |
|---|---|
| `PermutationGenerator.java` | Generates all permutations of the integers from 0 through n - 1 |
| `MergeSort.java` | Implements Merge Sort and counts element-to-element comparisons |
| `QuickSort.java` | Implements Quick Sort and counts element-to-element comparisons |
| `ShakerSort.java` | Implements Shaker Sort and counts element-to-element comparisons |
| `HeapSort.java` | Implements Heap Sort and counts element-to-element comparisons |
| `ExperimentDriver.java` | Runs each sorting algorithm on the generated permutations and records the comparison results |
| `TBD` | TBD |

---

# Task Plan

## Project Setup

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Create GitHub repository | Gustavo | Done | Repository |
| Add all team members to repository | Team | Done | Repository |
| Confirm instructor repository access | Gustavo | Done | Invite confirmed |
| Assign team roles | Team | In Progress | `docs/ProjectPlan.md` |
| Create `/docs` folder | Gustavo | Done | `docs/` |
| Create Project Plan | Paulina | In Progress | `docs/ProjectPlan.md` |
| Create design artifacts | Gustavo / Paulina | In Progress | `docs/Sequence_PseudoCode.md`, `docs/UML.md` |
| Create `README.md` | Gustavo | Done | `README.md` |
| Create `CONTRIBUTIONS.md` | Team | In Progress | `docs/CONTRIBUTIONS.md` |

---

## Data Generation and Experiment Driver

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Implement `PermutationGenerator.java` | Gustavo | Done | [Commit 7af7d97](https://github.com/Treydonde/CS2430_Project1/commit/7af7d97ba53b429345baa05449c902fff64eebef) |
| Implement `ExperimentDriver.java` | TBD | Not Started | - |
| Integrate permutation generator with sorting algorithms | TBD | Not Started | - |
| Record algorithm name, input array, and comparison count | TBD | Not Started | - |
| TBD | TBD | Not Started | - |

---

## Sorting Algorithms

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Implement `MergeSort.java` | Paulina | Done | [Commit e8c6694](https://github.com/Treydonde/CS2430_Project1/commit/e8c669461130dad2c5918c2a55ea8312b8152a5b) |
| Implement `QuickSort.java` | Paulina | Done | [Commit 6400ffa](https://github.com/Treydonde/CS2430_Project1/commit/6400ffa13d7ce08d1b1c17de855959ba5931bc49) |
| Implement `ShakerSort.java` | Ben | Done | [Commit b5cbab1](https://github.com/Treydonde/CS2430_Project1/commit/b5cbab1a4b7eaa470bf5a8d9e0df858442091a4f) |
| Implement `HeapSort.java` | Ben | Done | [Commit b5cbab1](https://github.com/Treydonde/CS2430_Project1/commit/b5cbab1a4b7eaa470bf5a8d9e0df858442091a4f) |

---

## Testing

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Create test plan | Ben | Not Started | - |
| Test permutation generator | Ben / Team? | Not Started | - |
| Test Merge Sort | Paulina | In Progress | Tests written and passing; awaiting verification review |
| Test Quick Sort | Paulina | In Progress | Tests written and passing; awaiting verification review |
| Test Shaker Sort | Ben / Team? | Not Started | - |
| Test Heap Sort | Ben / Team? | Not Started | - |
| TBD | TBD | Not Started | - |

---

## Report and Final Deliverables

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Write introduction | Team | Not Started | - |
| Write algorithm summaries | Team | Not Started | - |
| Write methods section | Team | Not Started | - |
| Create results tables | Team | Not Started | - |
| Complete Big-O / Big-Omega / Big-Theta analysis | Team | Not Started | - |
| Write conclusion | Team | Not Started | - |
| Assemble final report | Paulina | Not Started | - |
| Complete `README.md` | Paulina | Not Started | - |
| Complete `CONTRIBUTIONS.md` | Team | Not Started | - |
| Record team screencast | Team | Not Started | - |
| Review final submission package | Team | Not Started | - |

---

# Milestones

## Milestone 1 - Project Setup and Checkpoint - Target: 09-25-2026

- Repository created
- Team members added
- Instructor access confirmed
- Team roles assigned
- Project Plan updated
- 2 Design artifacts included in `/docs`

**Status:** In Progress

## Milestone 2 - Core Implementation - Target: TBD

- PermutationGenerator completed
- Merge Sort completed
- Quick Sort completed
- Shaker Sort completed
- Heap Sort completed
- ExperimentDriver completed

**Status:** In Progress

## Milestone 3 - Testing and Data Collection - Target: TBD

- Test plan completed
- Sorting algorithms verified
- Permutation generator verified
- Runs completed for n = 4, 6, and 8
- Best 10, worst 10, and average comparison results collected

**Status:** Not Started

## Milestone 4 - Final Report and Submission - Target: 10-02-2026

- Report completed
- README completed
- CONTRIBUTIONS.md completed
- Screencast recorded
- Final submission package reviewed

**Status:** Not Started
