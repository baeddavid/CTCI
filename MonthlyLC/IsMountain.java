class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) { return false; }
        int arrIdx = 0;

        // Iterate through the array as long as the idx pointer is less than the length of the array and we are incrementing
        while(arrIdx < arr.length - 1 && arr[arrIdx] < arr[arrIdx + 1]) {
            arrIdx++;
        }

        // If we reached the end of the array then return false;
        if(arrIdx + 1 == arr.length || arrIdx == 0) { return false; }

        // Iterate through the array as long as the idx pointer is less than the length of the array and we are decrementing
        while(arrIdx < arr.length - 1 && arr[arrIdx] > arr[arrIdx + 1]) {
            arrIdx++;
        }

        // If the idx pointer is not at the end of the array then we return false;
        if(arrIdx + 1 != arr.length) { return false; }

        // Return true if we pass all checks.
        return true;
    }
}
