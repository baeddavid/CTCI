class Solution {
    public String tree2str(TreeNode t) {
        // This case handles our edge case where we must print parenthesis
        // to denote NIL
        if(t == null) return "";
        // If the current root is a leaf we can just print the value
        if(t.left == null && t.right == null) return t.val + "";
        // In the case where the right child is null and the left child is not
        if(t.right == null) return t.val + "(" + tree2str(t.left) + ")";
        // In all other cases
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }
}
