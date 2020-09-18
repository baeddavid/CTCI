public class RemoveDuplicatesArray {
    public static int removeDuplicates(int[] nums) {
        int writeIndex = 1;
        for(int = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[writeIndex++] = nums[i];
            }
        }
        return writeIndex;
    }
}

// [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
