class KnapSack {
    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int knapSack(int bagWeight, int[] weights, int[] values, int n) {
        if(n == 0 || bagWeight == 0) { return 0; }

        if(weights[n - 1] > bagWeight) { return knapSack(bagWeight, weights, values, n - 1); }
        else {
            // If the item is included
            // If the item is not included
            return max(values[n - 1] + knapSack(bagWeight - weights[n - 1], weights, values, n - 1),
                       knapSack(bagWeight, weights, values, n - 1));
        }
    }

    // DP Solution
    public static int knapSack(int bagWeight, int[] weights, int[] values, int n) {
        int[][] cache = new int[n + 1][bagWeight + 1];
        for(int i = 0; i <= n; i++) {
            for(int w = 0; w <= bagWeight, w++) {
                if(i == 0 || w == 0) { cache[i][w] = 0; }
                else if(weights[i - 1] <= bagWeight) {
                    cache[i][w] = max(
                                      values[i - 1] + cache[i - 1][bagWeight - weights[i - 1]],
                                      cache[i - 1][w]);
                }
                else { cache[i][w] = cache[i - 1][w]; }
            }
        }
        return cache[n][bagWeight];
    }
}
