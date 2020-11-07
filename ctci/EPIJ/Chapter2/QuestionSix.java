import java.util.List;
import java.util.ArrayList;

public class QuestionSix {
    public static int buySellTwo(int[] A) {
        List<Integer> list = new ArrayList<>();
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++) {
            minPrice = Math.min(minPrice, A[i]);
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
            list.add(maxProfit);
        }

        int maxPrice = Integer.MIN_VALUE;
        for(int i = A.length - 1; i > 0; i--) {
            maxPrice = Math.max(maxPrice, A[i]);
            maxProfit = Math.max(maxProfit ,
                                 maxPrice - A[i] + list.get(i));

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] A = new int[] { 12, 11, 13, 9, 12 , 8, 14, 13, 15 };
        System.out.println(buySellTwo(A));
    }
}
