import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
    public List <List <Integer>> threeSum(int[] A, int k) {
       Arrays.sort(A);
       List <List <Integer>> result = new ArrayList <>();
       for(int i = 0; i < A.length - 2; i++){
           if(i == 0 || i > 0 && A[i] > A[i - 1]) {
               int p1 = i + 1;
               int p2 = A.length - 1;
               int target = k - A[i];

               while(p1 < p2) {
                   if(A[p1] + A[p2] == target) {
                       result.add(Arrays.asList(num[i], num[p1], num[p2]));
                       while(p1 < p2 && A[p1] == A[p1 + 1]) {
                           p1++;
                       }
                       while(p1 < p2 && A[p2] == A[p2 - 1]) {
                           p2--;
                       }
                       p1++;
                       p2--;
                   } else if(A[p1] + A[p2] > k) {
                       p2--;
                   } else {
                       p1++;
                   }
               }
           }
       }
       return result;
    }
}
