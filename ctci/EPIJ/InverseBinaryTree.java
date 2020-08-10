public class InverseBinaryTree {
    public TreeNode inverseTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode right = root.right;
        TreeNode left= root.left;

        root.left = inverseTree(right);
        root.right = inverseTree(left);
        return root;
    }
}
