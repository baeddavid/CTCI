class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null)
    }

    private boolean helper(TreeNode node, Integer left, Integer right) {
        if(node == null) { return true; }
        if(left != null && node.val <= left) { return false; }
        if(right != null && node.val >= right) { return false; }

        if(!helper(node.left, left, node.val)) { return false; }
        if(!helper(node.right, node.val, right)) { return false; }
        return true;
    }
}
