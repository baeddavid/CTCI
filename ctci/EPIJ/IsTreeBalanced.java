public class IsTreeBalanced {
    boolean isBalanced;

    public boolean isTreeBalanced(TreeNode root) {
        isBalanced = true;
        maxDepth(root);
        return isBalanced;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) { return 0; }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(Math.abs(left - right) > 1) { isBalanced = false; }
        return Math.max(left, right) + 1;
    }
}
