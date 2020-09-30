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

    // Memoized Solution
    public static int rodCutting(int[] prices, int length) {
        int[] cache = new int[length + 1];
        Arrays.fill(cache, Integer.MIN_VALUE);
        return rodHelper(prices, length, cache);
    }

    private static int rodHelper(int[] prices, int length, int[] cache) {
        if(cache[length] >= 0) { return cache[length]; }
        if(length == 0) { return 0; }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++) {
            max = Math.max(max, prices[i] + rodHelper(prices, length - i - 1, cacher));
        }
        return max;
    }
}
