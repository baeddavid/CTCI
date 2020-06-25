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
}
