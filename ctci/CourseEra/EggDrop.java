public class EggDrop {
    // Recursive Solution
    public static int eggDropR(int n, int k) {
        if(k == 0 || k == 1) return k;

        if(n == 1) return k;

        int min = Integer.MAX_VALUE;
        int x, result;

        for(x = 1; x <= k; x++) {
            res = Math.max(eggDropR(n - 1, k - 1), eddDropR(n, k - x));
            if(res < min) {
                min = res;
            }
        }
        return min + 1;
    }

    // DP Solution
    public static int eddDrop(int n, int k) {

    }
}
