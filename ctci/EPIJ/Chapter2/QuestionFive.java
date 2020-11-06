public class QuestionFive {
    // Brute foce
    public static int f(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++) {
            for(int j = i + 1; j < A.length; j++) {
                maxSum = Math.max(maxSum, A[j] - A[i]);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] A = new int[] { 310, 315, 275, 295, 260, 270, 290, 230, 255, 250 };
        System.out.println(f(A));
    }
}
