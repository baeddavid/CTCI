public class MaximumSubarray {
    // Divide and Conquer
    private int getCrossSum(int[] A, int start, int mid, int end) {
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;

        int currentSum = 0;
        for(int i = mid; i <= end; i++) {
            currentSum += A[i];
            if(currentSum > rightSum) {
                rightSum = currentSum;
            }
        }

        currentSum = 0;
        for(int i = mid - 1; i >= start; i--) {
            currentSum += A[i];
            if(currentSum > leftSum) {
                leftSum = currentSum;
            }
        }

        return leftSum + rightSum;
    }

    public int helper(int[] A, int start, int end) {
        if(start == end) return A[start];
        int mid = start + (end - start) / 2;
        return Math.max(helper(A, start, mid), Math.max(helper(A, mid + 1, end), getCrossSum(A, start, mid, end)));
    }
}
