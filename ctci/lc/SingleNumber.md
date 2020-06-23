# Single Number
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

*Your algoirthm should have a linear runtime complexity. Could you implement it without using extra memory?*

### Solution 1
- Hashmap
SingleNumber(A)
    map <-- HashMap
    for i <-- 1 to A.length
        if map(A[i])
            map(A[i], map(a[i]) + 1)
        else
            map(A[i], 1)
        
    for j <-- to A.length
        if map(A[j]) = 1
            return A[j]

    return null;
