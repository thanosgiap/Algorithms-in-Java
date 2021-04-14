## Algorithms-in-Java

### In this repository I will be sharing common sort algorithms in Java.

### Merge Sort:

Merge sort is a divide and conquer algorithm that divides the given array into two sub-arrays, sorting them and then merging
back to the initial. The array is recursively divided into to halves until it becomes a 1-index array. Once this is done then the merging 
proccess begins till the complete array is merged.

#### Time complexity:
Best case comlpexity: Ω(nlog(n)) <br>
Average case complexity: Θ(nlog(n)) <br>
Worst case complexity: O(nlog(n))

### Quick Sort:
Quick sort is a divide and conquer algorithm that picks a random element as the pivot, then places it in its corresponding
spot and then sorts the rest of the array around it. In this implementation the last element of the array is being chosen as the
pivot

#### Time complexity:
Best case comlpexity: Ω(nlog(n)) <br>
Average case complexity: Θ(nlog(n)) <br>
Worst case complexity: O(n^2)

### Selection Sort:
Selection sort sorts the array by repeadetly searching for the minimum element and placing it at the begging.
The algorith maintains two arrays, one with the sorted elements and one with the elements that are about to be sorted. 

#### Time complexity:
Best case comlpexity: Ω(n^2) <br>
Average case complexity: Θ(n^2) <br>
Worst case complexity: O(n^2)





