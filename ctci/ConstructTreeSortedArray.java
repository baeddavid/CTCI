class Solution {
    public TreeNode constructTree(int[] arr, int left, int right) {
        if(arr.length == 0 || arr == null) return null;
        int median = (right - left) + left / 2;
        TreeNode root = new TreeNode(arr[median]);
        root.left = constructTree(arr, left, median - 1);
        root.right = constructTree(arr, median + 1, right);
        return root;
    }
}
