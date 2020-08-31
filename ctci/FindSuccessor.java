public class FindSuccessor {
    // If we have access to parent attribute in node
    public TreeNode getSuccessor(TreeNode root) {
        if(root.right != null) {
            return getMinimum(root.right);
        }

        TreeNode parent = root.parent;
        while(parent.right == root && root != null) {
            root = parent;
            parent = parent.parent;
        }
        return parent;
    }

    // If we do not have a parent attribute
    public TreeNode getSuccessor(TreeNode root, TreeNode node) {
        if(node.right != null) {
            return getMinimum(root.right);
        }

        TreeNode successor = null;
        while(root != null && root.data != node.data) {
            if(root.data > node.data) {
                successor = root;
                root = root.left;
            } else if(root.data < node.data) {
                root = root.right;
            }
        }
        return successor;
    }
}
