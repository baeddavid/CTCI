public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(Treenode root, Integer lower, Integer upper) {
        if(root == null) return true;

        if(lower != null && root.val <= lower) return false;
        if(upper != null && root.val >= upper) return false;

        boolean left = helper(root.left, lower, root.val);
        boolean right = helper(root.right, root.val, upper);

        return (left == right) ? true : false;
    }
}
