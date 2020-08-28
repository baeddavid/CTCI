class Solution {
    public boolean validateBST(TreeNode root) {
        return helperValidate(root, null, null);
    }

    private boolean helperValidate(TreeNode root, Integer lower, Integer upper) {
        if(root == null) return true;
        if(lower != null && root.val <= lower) return false;
        if(upper != null && root.val >= upper) return false;

        if(!helper(node.right, root.val, upper)) return false;
        if(!helper(node.left, lower, root.val)) return false;

        return true;
    }
}
