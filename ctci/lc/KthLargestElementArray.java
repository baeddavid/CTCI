class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] A, int left, int right, int k) {
        int p = partition(A, left, right);
        if(p == k) return A[p];
        if(p < k) return quickSelect(A, p + 1, right, k);
        else return quickSelect(A, left, p - 1, k);
    }

    private int partition(int[] A, int left, int right) {
        int lessThanPivot = left;
        int pivot = A[right];
        for(int i = left; i <= right; i++) {
            if(A[i] < pivot) {
                swap(A, lessThanPivot++, i);
            }
        }
        swap(A, lessThanPivot, right);
        return lessThanPivot;
    }

    private void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
