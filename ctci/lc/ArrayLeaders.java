import java.util.List;
import java.util.ArrayList;

public class ArrayLeaders {
    public static List <Integer> arrayLeaders(List <Integer> A) {
        List <Integer> leaders = new ArrayList <>();
        int maximum = A.get(A.size() - 1);
        leaders.add(maximum);

        for(int i = A.size() - 2; i >= 0; i--) {
            if(A.get(i) > maximum) {
                maximum = A.get(i);
                leaders.add(maximum);
            }
        }

        return leaders;
    }

    public static List <Integer> arrayLeadersBruteforce(List <Integer> A) {
        List <Integer> leaders = new ArrayList <>();
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.size(); j++) {
                if(A[j] >= A[i]) {
                    break;
                }

                if(j == A.size()) {
                    leaders.add(A.get(j));
                }
            }
        }
    }
}
