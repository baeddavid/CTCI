public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode A, TreeNode B) {
        if(A == null && B == null) {
            return true;
        }
        if(A != null && B != null) {
            return (A.val == B.val) && helper(A.left, B.right) && helper(A.right, B.left);
        }
        return false;
    }
}
