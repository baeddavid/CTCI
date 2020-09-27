public class BestTimeBuySellStock {

    public static int maxProfit(int[] arr) {
        // Essentially we are being asked to find local deltas for peaks and valleys
        int minPrice = arr[0], currentProfit = 0, totalProfit = 0;
        for(int i = 1; i < arr.length; i++) {
            int currentPrice = arr[i];
            currentProfit = currentPrice - minPrice;
            if(currentProfit > 0) {
                totalProfit += currentProfit;
                minPrice = currentPrice;
            }
            minPrice = Math.min(minPrice, currentPrice);
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11,13 ,9, 12, 8, 14, 13, 15 };
        // Expected output is 13
        System.out.print(maxProfit(arr));
    }
}
