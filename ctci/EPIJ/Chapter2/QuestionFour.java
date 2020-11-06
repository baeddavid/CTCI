// Write a program which takes as input a sorted array and updates it so that all duplicates have been removed and the remaining elements
// have been shifted left to fill the emptied indices. Return the number of valid elements. Many languages have library functions for performing this operation

public class QuestionFour {
    public static int deleteDupes(int[] arr) {
        int writeIndex = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[writeIndex - 1]) {
                arr[writeIndex++] = arr[i];
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2,3,5,5,7,11,11,11,13 };
        System.out.println(deleteDupes(arr));
    }
}
