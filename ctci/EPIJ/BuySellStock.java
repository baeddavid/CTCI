public class BuySellStock {
    // [310, 315, 275, 295, 260, 270, 290, 230, 255, 250]
    public static int findMaxProfit(int[] nums) {
        int minPriceSoFar = Integer.MAX_VALUE, maxProfitSoFar = 0;
        for(int i = 0; i < nums.length; i++) {
            maxProfitSoFar = Math.max(maxProfitSoFar, nums[i] - minPriceSoFar);
            minPriceSoFar = Math.min(minPriceSoFar, nums[i]);
        }
        return maxProfitSoFar;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
        System.out.println(findMaxProfit(arr));
    }
}
