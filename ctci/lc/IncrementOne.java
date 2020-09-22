import java.util.List;
import java.util.ArrayList;

public class IncrementOne {
    public static void incrementOne(List<Integer> number){
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);

        for(int i = n; i > 0 && number.get(i) == 10; i--) {
            number.set(i, 0);
            number.set(i - 1, number.get(i - 1) + 1);
        }

        if(number.get(0) == 10) {
            number.set(0, 0);
            number.add(0, 1);
        }

        return number;
    }
}
