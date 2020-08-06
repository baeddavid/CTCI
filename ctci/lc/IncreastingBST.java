public class IncreastingBST {
    TreeNode curr;
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

    public TreeNode increastBSTR(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        curr = dummy;
        inorderHelper(root);
        return dummy.right;
    }

   private void inorderHelper(TreeNode root) {
       if(root != null) {
           inorderHelper(root.left);
           root.left = null;
           curr.right = node;
           curr = node;
           inorderHelper(root.right);
       }
   }
}
