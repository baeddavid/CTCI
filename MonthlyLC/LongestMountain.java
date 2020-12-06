class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int end = 0, base = 0, ans = 0;
        while(base < n) {
            if(end + 1 < n && arr[end] < arr[end + 1]) {
                while(end + 1 < n && arr[end] < arr[end + 1]) {
                    end++;
                }
                if(end + 1 < n && arr[end] > arr[end + 1]) {
                    while(end + 1 < n && arr[end] < arr[end + 1]) {
                        end++;
                    }
                    ans = Math.max(ans, end);
                }
            }
            base = Math.max(end, base + 1);
        }
        return ans;
    }
}
