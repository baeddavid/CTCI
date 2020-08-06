public class IncreastingBST {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        TreeNode current = dummy;
        List<Integer> L = new ArrayList<>();
        inorder(root, L);

        for(Integer v : L) {
            current.right = new TreeNode(v);
            current = current.right;
        }
        return dummy.right;
    }

    private void inorder(Treenode root, List<Integer> L) {
        if(root != null) {
            inorder(root.left, L);
            L.add(root.val);
            inorder(root.right, L);
        }
    }
}
