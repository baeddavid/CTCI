// The quicksort algorithm for sorting arrays proceeds recursively - it selects an element, reorders the array to make all the elements less than or equal to the pivot
// apprea first, followed by all the elemnts greater than the pivot. The two subarrays are then sorted recursively. Implemeneted naievely, quicksort has a large run
// times and deep function call stacks on arrays with many duplicates because the subarrays may differ greatly in size.
// Write a program that takes an array A and an in i into A, and rearranges the elements such that allelements less than A[i] apprear first, followed by elements equal to the pivot.

public class QuestionOne {
    public static void dutchFlag(int[] A, int i) {
        // We can do this in place in one loop using three pointers to build out the array
        int lessThan = 0, equalTo = 0, greaterThan = A.length - 1;
        int pivot = A[i];
        while(equalTo < greaterThan) {
            if(A[equalTo] < pivot) {
                swap(A, equalTo++, lessThan++);
            } else if(A[equalTo] == pivot) {
                equalTo++;
            } else {
                swap(A, equalTo, greaterThan--);
            }
        }
    }

    private static void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
