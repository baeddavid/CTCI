public class TreeSymmetric {
    public boolean isTreeSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode L, TreeNode R) {
        if(L == null && R == null) {
            return true;
        } else if(L != null && R != null) {
            return L.data == R.data && helper(L.left, R.right) && helper(L.right, R.left);
        }
    }
}
