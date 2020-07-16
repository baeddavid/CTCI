public class FindSuccessor {
    public TreeNode getSucessor(TreeNode k) {
        if(k.right != null) {
            return getMinium(k.right);
        } else {
            TreeNode y = k.parent;
            while(y != null && k == y.right) {
                k = y;
                y = y.parent;
            }
            return y;
        }
    }

    private TreeNode getMinimum(TreeNode k) {
        TreeNode current = k;
        while(current.left != null) {
            current = current.left;
        }
        return current;
    }
}
