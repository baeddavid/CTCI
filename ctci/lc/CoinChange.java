public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(amount == 0) { return 0; }
        int minCoins = Integer.MAX_VALUE;

        for(int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount) {
                int subResult = coinChange(coins, amount - coins[i]);
                if(subResult + 1 < minCoins) {
                    minCoins = subResult + 1;
                }
            }
        }
        return minCoins;
    }

    // Cached DP
    public static int coinChange(int[] coins, int amount) {
        int[] cache = new int[amount + 1];
        cache[0] = 0;
        Arrays.fill(cache, Integer.MAX_VALUE);

        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                cache[i] = Math.min(cache[i], cache[i - coins[j]] + 1);
            }
        }
        return coins[amount];
    }
}
