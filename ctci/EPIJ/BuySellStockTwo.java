import java.util.List;
import java.util.ArrayList;

public class BuySellStockTwo {

    public static int getMaxProfit(int[] arr) {
        List<Integer> forwardProfit = new ArrayList<>();
        List<Integer> backwardProfit = new ArrayList<>();
        int minPriceSoFar = Integer.MAX_VALUE, maxProfitSoFar = 0;
        for(int i = 0; i < arr.length; i++) {
            minPriceSoFar = Math.min(minPriceSoFar, arr[i]);
            maxProfitSoFar = Math.max(maxProfitSoFar, arr[i] - minPriceSoFar);
            forwardProfit.add(maxProfitSoFar);
        }

        int maxPriceSoFar = Integer.MIN_VALUE;
        maxProfitSoFar = 0;
   

        for(int i = arr.length - 1; i >= 0; i--) {
            maxPriceSoFar = Math.max(maxPriceSoFar, arr[i]);
            maxProfitSoFar = Math.max(maxProfitSoFar, maxPriceSoFar - arr[i]);
            backwardProfit.add(0, maxProfitSoFar);
        }

        for(int i = 0; i < backwardProfit.size(); i++) {
            System.out.print(backwardProfit.get(i) + " ");
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11, 13, 9, 12, 8, 14 ,13 , 15 };
        System.out.println(getMaxProfit(arr));
    }
}
