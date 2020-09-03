class MaxSubarray {
    // Brute Force
    public static int maxSubarrayNaieve(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    // Kadane's Algorithm
    public static int kadane(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxSoFar = 0;
        for(int i = 0; i < arr.length; i++) {
            maxSoFar += arr[i];
            if(maxSoFar > max) {
                    max = maxSoFar;
            }
            if(maxSoFar < 0) {
                maxSoFar = 0;
            }
        }
        return max;
    }

    // Divide and Conquer
    public static int divideConquer(int[] arr) {
        return divideHelper(arr, 0, arr.length - 1);
    }

    private static int findCrossingSum(int[] arr, int left, int med, int right) {
        int leftSum = 0, rightSum = 0, sum = 0;
        for(int i = med; i >= 0; i--) {
            sum += arr[i];
            if(sum > leftSum) leftSum = sum;
        }

        sum = 0;
        for(int i = med + 1; i <= right; i++) {
            sum += arr[i];
            if(sum > rightSum) rightSum = sum;
        }

        return leftSum + rightSum;
    }

    private static int divideHelper(int[] arr, int left, int right) {
        if(left == right) return arr[left];
        int med = (left + right) / 2;
        return Math.max(divideHelper(arr, left, med),
                        Math.max(divideHelper(arr, med + 1 , right), findCrossingSum(arr, left, med, right)));
    }

    public static void main(String[] args) {
        int[] A = new int[] {2,1,-3,4,-1,2,1,-5,4};
        System.out.print(divideConquer(A));
    }
}
