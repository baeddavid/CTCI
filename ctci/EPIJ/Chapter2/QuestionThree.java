// Write a program which takes an array of n integers, where A[i] denotes the maximum you can advance from index i
// and returns whether it is possible to advance to the last index starting from the beginning of the array.
// A: <3,3,1,0,2,0,1> Output: True
// A: <3,2,0,0,2,0,1> Output: False

public class QuestionThree {
    public static boolean advanceArray(int[] arr) {
        int furthestSoFar = 0;
        for(int i = 0; i <= furthestSoFar && furthestSoFar < arr.length; i++) {
            furthestSoFar = Math.max(furthestSoFar, arr[i] + i);
        }
        return furthestSoFar > arr.length - 1;
    }
}
