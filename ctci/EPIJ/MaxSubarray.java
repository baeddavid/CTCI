class Solution {
    public int maxSubarray(int[] arr) {
        return maxHelper(arr, 0, arr.length - 1);
    }

    private int maxSumCrossingMid(int[] arr, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = mid; i >= 0; i--) {
            sum += arr[i];
            if(sum > leftSum) {
                leftSum = sum;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if(sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum.
    }

    private int maxHelper(int[] arr, int left, int right) {
        if(left == right) {
            retur arr[left];
        }

        int med = (left + right) / 2;
        return Math.max(maxHelper(arr, left, med),
                        Math.max(arr, med + 1, right), maxCrossingMid(arr, left, med, right));
    }
}
