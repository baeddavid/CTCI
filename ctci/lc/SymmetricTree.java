class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) { return true; }
        return treeHelper(root.left, root.right);
    }

    private boolean treeHelper(TreeNode left, TreeNode right) {
        if(left == null && right == null) { return true; }
        if(left == null || right == null) { return false; }
        if(left.val == right.val) {
            boolean leftTree = treeHelper(left.left, right.right);
            boolean rightTree = treeHelper(left.right, right.left);
            return leftTree && rightTree;
        }
        return false;
    }
}
