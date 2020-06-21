# Increment List By One

Write a program which takes as input an array of digits encoding a nonnegative decimal integer D and updates the array to represent the integer D + 1.
For example if the is <1,2,9> then you should update the array to <1,3,0>.

- We need to obviously start from the back of the array to increment the D by 1.
- Our primary concern is that we need to worry about the carry if the digit to be incremented by one is 9.

Pseudocode

// Pseudocode before writing code
IncrementListByOne(A)
    carry <-- 0
    for i <-- A.length to 1
        A[i] = A[i] + 1 + carry
	carry <-- 0
	if A[i] = 10
	    carry <-- 1
	    A[i] <-- 0
	break
    if A[1] = 10
       A[1] = 1
       A append 0

// PseudoCode after writing code
IncremenyListByOne(A)
    carry <-- 1
    for i <-- A.length to 1
    A[i] <-- A[i] + carry
    carry <-- 0
    
    if A[i] = 10
        carry <-- 1
	A[i] <-- 0
    else
        break

    if A[0] = 0
        A[0] <-- 1
	A append 0