// Write a program which takes as input an array of digits encoding a decimal number D and updates the array to represent the number D + 1.
// For example, if the input is <1,2,9> then you should update the array to <1,3,0>. Your  algorithm should work even if it is implemented in a language
// that has finite-precision arithmetic.

import java.util.List;
import java.util.ArrayList;

public class QuestionTwo {
    public static void increment(List<Integer> A) {
        A.set(A.size() - 1, A.get(A.size() - 1) + 1);
        for(int i = A.size() - 1, i > 0 && A.get(i) == 10; i--) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
        }
        if(A.get(0) == 10) {
            A.set(0, 0);
            A.add(0, 1);
        }
    }
}
