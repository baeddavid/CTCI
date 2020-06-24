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
}
