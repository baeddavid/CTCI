public class BuySellStockTwoVariant {
    // < 12, 11, 13, 9, 12, 8, 14, 13, 15>
    public static int maxProfit(int[] arr) {
        if(arr.length == 0) { return 0; }

        int minPrice = arr[0];
        int maxProfitAfterFirstSell = 0;
        int maxProfitLeftAfterSecondBuy = Integer.MIN_VALUE;
        int maxProfitAfterSecondSell = 0;

        for(int i = 1; i < arr.length; i++) {
            final int p = arr[i];
            maxProfitAfterFirstSell = Math.max(p - minPrice, maxProfitAfterFirstSell);
            minPrice = Math.min(p, minPrice);
            maxProfitLeftAfterSecondBuy = Math.max(maxProfitLeftAfterSecondBuy, maxProfitAfterFirstSell - p);
            maxProfitAfterSecondSell = Math.max(p + maxProfitLeftAfterSecondBuy, maxProfitAfterSecondSell);
        }
        return maxProfitAfterSecondSell;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11, 13, 9, 12, 8, 14, 13, 15 };
        System.out.println(maxProfit(arr));
    }
}
