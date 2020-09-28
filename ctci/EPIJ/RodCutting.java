public class RodCutting {
    // Recursive Solution
    public static int rodCutting(int[] prices, int length) {
        if(length == 0) { return 0; }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++) {
            max = Math.max(max, prices[i] + rodCutting(prices, length - i - 1));
        }
        return max;
    }
}
