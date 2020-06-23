public class ComputeMaxProfit {
    public int computeMaxProfit(int[] A) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for(int num : A) {
            maxProfit = Math.max(maxProfit, num - min);
            min = Math.min(num, min);
        }
        return maxProfit;
    }
}
