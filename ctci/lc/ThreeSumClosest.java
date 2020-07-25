import java.util.Arrays;

public class ThreeSumClosest {
    int threeSumClosest(int[] A, int k) {
        Arrays.sort(A);
        int currentSum = A[0] + A[1] + A[A.length - 1];
        int currentMin = Math.abs(currentSum - k);

        for(int i = 0; i < A.length - 2; i++) {
            int p1 = i + 1, p2 = A.length - 1;
            while(p1 < p2) {
                int sum = A[i] + A[p1] + A[p2];
                if(sum < k) {
                    p1++;
                } else {
                    p2++;
                }
            }
            if(Math.abs(sum - v) < currentMin) {
                currentMin = Math.abs(sum - v);
            }
        }
        return currentMin;
    }
}
