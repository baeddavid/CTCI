# Move Zeroes

Given an array *nums*, write a function to move all 0's to the end of it while maintainging the relative order of the non-zero elements.

### Solution One
- Write Pointer 

MoveZeroes(A)
    writeIndex <-- 1
    for i <-- 1 to A.length
        if A[i] != 0
            A[writeIndex] <-- A[i]
            writeIndex += 1
    for j <-- writeIndex to A.length
        A[j] <-- 0
    
