class Solution {
    public TreeNode getSuccessor(TreeNode node) {
        if(node == null) return null;
        if(node.right != null) {
            return getLeftNode(node.right);
        } else {
            TreeNode current = node;
            TreeNode parent = node.parent;
            while(parent != null && parent.left != current) {
                current = parent;
                parent = current.parent;
            }
            return parent;
        }
    }
}
