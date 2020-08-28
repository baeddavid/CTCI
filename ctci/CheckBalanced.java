class Solution {
    public boolean isBalanced;
    public boolean checkBalanced(TreeNode root) {
        dfsHeight(root);
        return isBalanced;
    }

    public int dfsHeight(TreeNode root) {
        if(root == null) return 0;
        int left = dfsHeight(root.left);
        int right = dfsHeight(root.right);

        if(Math.abs(left - right) > 1) {
            isBalanced = fasle;
        }

        return Math.max(left, right) + 1;
    }
}
