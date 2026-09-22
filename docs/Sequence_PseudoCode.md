Sequence / Pseudo Code



Driver program asks user for a small *n* type int



Driver calls Permutation Generator and passes it *n*



Permutation Generator generates all permutations for given *n* and passes the permutations back to Driver as an array of int arrays



Driver then passes all the permutations to each algorithm class



Each Algorithm then does the following

for each permutation:

* Sort the array
* count and store the number of comparisons performed
* return the sorted array
* check if there are any more permutations to sort
* if yes, repeat
* if no, return sorted arrays with corresponding comparison count



Driver then collates best 10, worst 10, and average of all permutations

prints to console

