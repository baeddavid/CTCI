import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class QuestionSeven {
    public static void applyPermutation(List<Character> A, List<Integer> P) {
        for(int i = 0; i < A.size(); i++) {
            while(i != P.get(i)) {
                Collections.swap(A, i, P.get(i));
                Collections.swap(P, i, P.get(i));
            }
        }
    }

    public static void bruteForce(List<Character> A, List<Integer> P) {
        List<Character> temp = new ArrayList<>();
        // Copy elements from original permutation
        for(Character x : A) { temp.add(x); }
        for(int i = 0; i < A.size(); i++) {
            A.set(P.get(i), temp.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> P = new ArrayList<>();
        P.add(2);
        P.add(0);
        P.add(1);
        P.add(3);

        List<Character> A = new ArrayList<>();
        A.add('a');
        A.add('b');
        A.add('c');
        A.add('d');

        bruteForce(A, P);
        for(Character c : A) {
            System.out.print(c + " ");
        }
    }
}
