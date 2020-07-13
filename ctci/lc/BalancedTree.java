class BalancedTree {
    boolean isBalanced = true;

    boolean isTreeBalanced(TreeNode root) {
        helper(root);
        return isBalanced;
    }

    int helper(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int L = helper(root.left);
        int R = helper(root.right);

        if(Math.abs(L - R) > 1) {
            isBalanced = false;
        }

        return Math.max(L, R) + 1;
    }
}
