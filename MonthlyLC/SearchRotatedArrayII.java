// Suppose an array sorted in ascending order is rotated at some pivot unkown to you beforehand.
// [0,0,1,2,2,5,6] -> [2,5,6,0,0,1,2]
// You are given a target valuen to search. If found in the array return true, otherwise return false.

class SearchRotatedArrayII {
    // BS to find the pivot?
    public static boolean search(int[] nums, int left, int right, int target) {
        if(left > right) { return false; }

        int mid = left + (right - left) / 2;
        if(nums[mid] == target) { return true; }

        if(nums[left] < nums[mid]) {
            if(target >= nums[left] && target < nums[mid]) {
                return search(nums, left, mid - 1, target);
            }
            return search(nums, mid + 1, right, target);
        } else if(nums[left] > nums[mid]) {
            if(target > nums[mid] && target <= nums[right]) {
                return search(nums, mid + 1, right, target);
            }
            return search(nums, left, mid - 1, target);
        } else {
            return search(nums, left + 1, right, target);
        }
    }
}
