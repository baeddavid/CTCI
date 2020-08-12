public class ConvertSortedArrayBST {
    public TreeNode sortedArrayToBST(int[] nums) {
       return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if(low > high) {
            return null;
        }
        int med = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[med]);
        root.left = helper(nums, low, med - 1);
        root.right = helper(nums, med + 1, high);

        return root;
    }
}
