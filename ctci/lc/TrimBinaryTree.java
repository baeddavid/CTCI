public class TrimBinaryTree {
    public TreeNode trimBST(TreeNode node, int L, int R) {
        if(root == null) {
            return root;
        }

        if(root.val < L) return trimBST(node.right, L, R);
        if(root.val > R) return trimBST(node.left, L, R);

        root.left = trimBST(node.left, L, R);
        root.right = trimBST(node.right, L, R);
        return root;
    }
}
