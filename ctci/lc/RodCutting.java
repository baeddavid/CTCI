public class RodCutting {
    // Top Down Recursive
    public static int rodCutting(int[] prices, int length) {
        if(length == 0) { return 0; }
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 1; i <= length; i++) {
           maxProfit = Math.max(maxProfit, prices[i] + rodCutting(prices, length - i - 1));
        }
        return maxProfit;
    }


    // Cached Solution
    public static int rodCutting(int[] prices, int length) {
        int[] cache = new int[length + 1];
        cache[0] = 0;
        int max = Integer.MIN_VALUE:

        for(int i = 1; i <= length; i++) {
            for(int j = 0; j < i; j++) {
                max = Math.max(max, prices[j] + cache[i - j - 1]);
            }
            cache[i] = max;
        }
        return cache[length];
    }

    public static void main(String[] args) {
        int[] prices = new int[] { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
        System.out.println(rodCutting(prices, 4));
    }
}
