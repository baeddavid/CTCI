import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] A) {
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i = 0; i < A.length; i++) {
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        for(int j = 0; j < A.length; j++) {
            if(map.get(A[j]) == 1) {
                return A[j];
            }
        }
        return -1;
    }
}
