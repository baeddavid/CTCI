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

    public static void main(String[] args) {
        int[] A = new int[] {2,1,-3,4,-1,2,1,-5,4};
        System.out.print(kadane(A));
    }
}
