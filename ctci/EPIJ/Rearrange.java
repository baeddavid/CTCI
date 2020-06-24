import java.util.Collections;
import java.util.List;

public class Rearrange {
    // Brute force Solution using sort
    public void rearrangeSort(List <Integer> A) {
        Collections.sort(A);
        for(int i = 1; i < A.size() - 1; i++) {
            Collections.swap(A, i, i + 1);
        }
    }

    public void rearrangeOptimal(List <Integer> A) {
        for(int i = 1; i < A.length; i++) {
            if(A[i] % 2 == 0 && A[i] > A[i - 1] ||
               A[i] % 2 == 1 && A[i] < A[i - 1])
                Collections.swap(A, i, i - 1);
        }
    }
}
