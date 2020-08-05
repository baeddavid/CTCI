public class SearchBinarySearchTree {
    // Recursive
    public TreeNode searchBST(TreeNode root, int val) {
        if(root != null) {
            if(root.data == val) {
                return root;
            } else if(val > root.data) {
                searchBST(root.right, val);
            } else {
                searchBST(root.left, val);
            }
        }
        return null;
    }

    // Iterative
    public TreeNode searchBSTI(TreeNode root, int val) {
        TreeNode current = root;
        while(current != null) {
            if(current.val == val) {
                return current;
            } else if(val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
