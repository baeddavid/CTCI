# Computing an Alternation

Write a program that takes an Array *A* of n numbers and rearrange A's elements to get a enw array B having the property that
B[0] <= B[1] >= B[2] <= B[3] >= B[4]...

// Brute Force Solution
- Sort the array and swap at pairs for indices 1 to A.length

rearrange(A)
    Sort(A)
    for i <-- 1 to A.length - 1
        swap(i, i + 1)

// Optimized One Pass Solution
- Take advantage of the property that odd indices are "peaks". If the elment at an odd index is smaller than the element to the left of it, swap the 
elements. If an element at an even index is larger than an odd index then swap.

rearrange(A)
    for i <-- 1 to A.length
        if A[i] % 2 == 0 AND A[i] > A[i - 1] OR A[i] % 2 == 1 AND A[i] < A[i - 1]
            swap(i, i - 1)


