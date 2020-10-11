class Solution {
    public boolean isValidBST(TreeNode root) {
        return f(root, null, null);
    }

    private boolean f(TreeNode root, Integer left, Integer right) {
        if(root == null) { return true; }
        if(left != null && root.val <= left) { return false; }
        if(right != null && root.val >= right) { return false; }

        return f(root.left, left, root.val) && f(root.right, root.val, right);
    }
}
