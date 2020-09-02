class Solution {
    public boolean advanceBySoluton(int[] arr) {
        int maxSoFar = 0;
        int lastIndex = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, i + arr[i]);
        }

        return maxSoFar >= lastIndex;
    }
}
