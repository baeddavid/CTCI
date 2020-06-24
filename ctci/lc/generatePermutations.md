# Generate Permutations

Given an array *A* print all possible permutations of the array A.

permute(A, left, right)
for i <-- left to including right
    swap(left, i)
    permute(A, left + 1, right)
    swap(left, i)

if left = right 
    print(A)
    

