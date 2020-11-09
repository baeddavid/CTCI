import java.util.List;
import java.util.ArrayList;

public class QuestionEight {
    public static List<Integer> getPrimes(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] primes = new boolean[n + 1];
        for(int i = 0; i < primes.length; i++) { primes[i] = true; }

        for(int i = 2; i * i <= n; i++) {
            if(primes[i] == true) {
                for(int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(primes[i] == true) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> primes = getPrimes(59);
        for(Integer x : primes) { System.out.print(x + " "); }
    }
}
